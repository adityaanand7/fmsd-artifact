package resolver;

import es.*;
import javafx.util.Pair;
import ptg.ObjectNode;
import ptg.ObjectType;
import ptg.PointsToGraph;
import soot.*;
import soot.jimple.Stmt;
import soot.jimple.toolkits.callgraph.CallGraph;
import soot.jimple.toolkits.callgraph.Edge;

import java.util.*;
/*
 *
 * Some notes:
 * 1. We just need to mark object in the function returned as escaping and nothing more, if some object is coming from
 *      callee then it should be marked as escaping in the callee. It is not the responsiblity of caller.
 * 
 */

class StandardObject {
    private SootMethod method;
    private ObjectNode obj;
    
    public StandardObject(SootMethod m, ObjectNode o){
        this.method = m;
        this.obj = o;
    }
    public SootMethod getMethod() {
        return this.method;
    }
    public ObjectNode getObject() {
        return this.obj;
    }
    public String toString() {
        return "("+method+","+obj+")";
    }
}

public class ReworkedResolver{
    public Map<SootMethod, HashMap<ObjectNode, EscapeStatus>> existingSummaries;
    public Map<SootMethod, HashMap<ObjectNode, EscapeStatus>> solvedSummaries;
    public Map<SootMethod, HashMap<ObjectNode, StandardObject>> objMap;
    HashMap<SootMethod, HashMap<ObjectNode, ResolutionStatus>> resolutionStatus;
    Map<SootMethod, PointsToGraph> ptgs;
    Map<StandardObject, Set<StandardObject> > graph;
    Map<StandardObject, Set<StandardObject> > revgraph;

    List<SootMethod> noBCIMethods;

    List<StandardObject> reverseTopoOrder;
    
    public ReworkedResolver(Map<SootMethod, HashMap<ObjectNode, EscapeStatus>> existingSummaries,
            Map<SootMethod, PointsToGraph> ptgs,
            List<SootMethod> escapingMethods) {
        /*
            Here we got:
            1. For Each Soot Method --> Object and their escape status as exiting summaries
            2. Points to Graph as --> Soot Method name and its points to grpah
            3. List of esacping methods ie those methods whose bci can't be determined.
         */

        this.existingSummaries = existingSummaries;
        this.ptgs = ptgs;
        this.noBCIMethods = escapingMethods;

//      ---------- Debug Code ---------------------
//       System.out.println("1. "+this.existingSummaries);
//        System.out.println();
//        for (SootMethod method: this.ptgs.keySet())
//        {
//            System.out.println("Method name is: "+method+": "+this.ptgs.get(method));
//            System.out.println();
//        }
//        System.out.println("Escaping Methods: "+ noBCIMethods);
//        System.out.println("This is done");
        //---------------------------------------------

        this.objMap = new HashMap<> ();
        this.solvedSummaries = new HashMap<> ();
        this.resolutionStatus = new HashMap<> ();

        this.graph = new HashMap<>();
        this.reverseTopoOrder = new ArrayList<>();
        this.revgraph = new HashMap<>();
        /*
            The first loop is for getting the Soot Method name
         */
        for (Map.Entry<SootMethod, HashMap<ObjectNode, EscapeStatus>> entry : existingSummaries.entrySet()) {
			SootMethod method = entry.getKey();  // Got the method name --> stored in method
			HashMap<ObjectNode, EscapeStatus> map = entry.getValue();  // Got the map of objects and escape status
            HashMap<ObjectNode, ResolutionStatus> q = new HashMap<> ();
            HashMap<ObjectNode, StandardObject> tobj = new HashMap<> ();
			for (Map.Entry<ObjectNode, EscapeStatus> e : map.entrySet()) {
				ObjectNode obj = e.getKey(); // Name of the object
                q.put(obj, ResolutionStatus.UnAttempted); // q contains all list of object per method and its current status.
                StandardObject x = new StandardObject(method, obj);
                tobj.put(obj,x);
                this.graph.put(x, new HashSet<>());
                this.revgraph.put(x, new HashSet<>());
			}
            resolutionStatus.put(method, q); // Storing the Map between method and status of object list
            this.objMap.put(method, tobj);
			this.solvedSummaries.put(method, new HashMap<>());
        }
        /*
         * Next, we traverse all function calls and add mapping from caller to the 
         * objects passed. We are just moving towards inter-procedural resolution :P
         * 
         */
        AddCallerSummaries();
        GenerateGraphFromSummary();
        FindSCC();
        System.out.println("Done form Resolution");
        // findCondesedGraph();
    }

    void printGraph(Map<StandardObject, Set<StandardObject> > graph) {
        System.out.println("Printing graph: ");
        for (StandardObject u: graph.keySet()) {
            System.out.print(u+": ");
            for (StandardObject v: graph.get(u)) {
                System.out.print(v+",");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Convert all <caller,<argument,x>> statements to the actual caller functions and replace <argument,x> 
    // to parameter passed.

    void AddCallerSummaries() {
        Map<SootMethod, List<SootMethod>> CallGraphMap = new HashMap<>();
        List<SootMethod> tdcallgrpah = new ArrayList<SootMethod>();

        CallGraph cg = Scene.v().getCallGraph(); // Get the call graph
        int methodcount = 0;
        //System.out.println(cg.sourceMethods().toString());
        /*
            Sorting the call Grpah in top down order
        */
        for (SootClass item : Scene.v().getApplicationClasses()) {
            for (SootMethod currmet : item.getMethods()) {
                Iterator<Edge> edges = cg.edgesOutOf(currmet);
                List<SootMethod> values = new ArrayList<SootMethod>();
                while (edges.hasNext()) {
                    Edge edge = edges.next();
                    SootMethod tarmet = (SootMethod) edge.getTgt();

                    if (!tarmet.isJavaLibraryMethod()) {
                        //System.out.println(currmet.getSignature() + "\t calls --->  " + tarmet.getSignature());
                        //System.out.println(currmet.getName() + "\t calls   " + tarmet.getName());
                        if (!tarmet.getName().equals("<init>")) {
                            values.add(tarmet);
                        }
                    }
                }
                if (!currmet.isJavaLibraryMethod()) {
                    if (!currmet.getName().equals("<init>")) {
                        CallGraphMap.put(currmet, values);
                    }
                }
            }
        }
        for (SootMethod m : CallGraphMap.keySet()) {
            methodcount++;
        }
        for (SootMethod m1 : CallGraphMap.keySet()) {
            if (m1.getName().toString().equals("main")) {
                //System.out.println("Main Added");
                tdcallgrpah.add(m1);
                List<SootMethod> values1 = new ArrayList<SootMethod>();
                values1 = CallGraphMap.get(m1);
                for (SootMethod met : values1) {
                    //System.out.println("Values added are : " + met.toString());
                    tdcallgrpah.add(met);
                }
            }
        }
        for (SootMethod m2 : tdcallgrpah) {
            System.out.println("Methods in top down order : " + m2);
        }
        System.out.println("**********************************************************************");
        for (SootMethod key : tdcallgrpah) {
            HashMap<ObjectNode, EscapeStatus> methodInfo = this.existingSummaries.get(key);
//            for (ObjectNode o : methodInfo.keySet()) {
//                System.out.println("Method : " + key);
//                System.out.println("***************************");
//                System.out.println(" object --> " + o);
//                System.out.println("Status : " + methodInfo.get(o));
//                System.out.println("***************************");
//            }
            HashMap<ObjectNode, EscapeStatus> solvedMethodInfo = this.solvedSummaries.get(key);
            //System.out.println(" -------- The current method operating is : -------------- " + key);
            Body body = key.retrieveActiveBody();
            PatchingChain<Unit> units = body.getUnits();
            for (Unit u : units) {
                if (((soot.jimple.Stmt) u).containsInvokeExpr()) {
                    List<Value> arglist = ((Stmt) u).getInvokeExpr().getArgs();
                    //System.out.println("*******Arg list ******* "+arglist);
                    //System.out.println(((Stmt) u).getInvokeExpr());
                    for (Value v : arglist) {
                        //System.out.println("Object in pts: "+ this.ptgs.get(key).vars.get(v));
                        //ObjectNode arg = (ObjectNode) this.ptgs.get(key).vars.get(v);
                        try {
                            Set<ObjectNode> argsobj = this.ptgs.get(key).vars.get(v);
                            //System.out.println("Object "+ obj + "In summary" +arg);
                            for (ObjectNode o1 : argsobj) {
                                EscapeStatus status = methodInfo.get(o1);
                                HashSet<EscapeState> newStates = new HashSet<>(); // Used to store the unsolved values
                                for (EscapeState state : status.status) {
                                    //System.out.println("Outside Printing state: "+ state);
                                    if (state instanceof ConditionalValue) {
                                        ConditionalValue cstate = (ConditionalValue) state;
                                        //System.out.println(" Conditional values Found");
                                        //System.out.println("-- >Cstate :" + cstate + " --> object Type: " + cstate.object.type + " --> Parameter number is" + cstate.object.ref);
                                        if (cstate.object.type != ObjectType.parameter) { // if it is of type argument then add in the pending list
                                            newStates.add(state);
                                            //System.out.println("1. Came here");
                                            continue;
                                        }
                                        int parameternumber = cstate.object.ref;
                                        if (parameternumber < 0) {  // If the parameter is this pointer then add in the pending list
                                            newStates.add(state);
                                            //System.out.println("2. Came here");
                                            continue;
                                        }
                                        Iterator<Edge> iter = cg.edgesOutOf(u); // Key is the name of the method
                                        //System.out.println("Method : "+ key +"isempty:"+iter.hasNext()+": "+key);
                                        newStates.add(state);
                                        int count = 0;
                                        while (iter.hasNext()) {
                                            count++;
                                            System.out.println("Method: " + key + " Target: " + iter.next().tgt());
                                        }
                                        while (iter.hasNext()) {
                                            //System.out.println(" **************************** Entering here ****************************");
                                            //parameternumber = cstate.object.ref;
                                            Edge edge = iter.next();
                                            //System.out.println(key+" "+obj+" "+cstate+" " + +parameternumber + " "+edge.src() );
                                            //System.out.println("Edge type:" + edge.kind() + " key: " + key+ " "+edge.srcUnit()+" Decalration: "+edge.tgt().getDeclaration() +"Signature: "+ iter.next().getSrc());
                                            if (edge.kind() == Kind.REFL_CONSTR_NEWINSTANCE) {
                                                parameternumber = 0;
                                            } else if (edge.kind() == Kind.REFL_INVOKE) {
                                                parameternumber = 1;
                                            }
                                            try {
                                                SootMethod m = edge.tgt();
                                                PointsToGraph p = this.ptgs.get(m);
                                                Value val = m.getActiveBody().getParameterLocal(parameternumber);
                                                Set<ObjectNode> objnodes = p.vars.get(val);
                                                for (ObjectNode obj2 : objnodes) {
                                                    newStates.add(CreateNewEscapeState(obj2, cstate, edge.src()));
                                                }
                                            } catch (Exception e) {
                                                System.err.println("Cond: " + cstate + " " + cstate.object + " " + cstate.object.ref + " " + parameternumber);
                                                throw e;
                                            }
                                        }
                                    } else {
                                        newStates.add(state); // If not conditional value just store in the map
                                        //System.out.println("State values in else part: " + state);
                                        if (state instanceof Escape) { // if status is Escape store as solved
                                            this.solvedSummaries.get(key).put(o1, new EscapeStatus(Escape.getInstance()));
                                        }
                                    }
                                }
                                // System.out.println(key+" "+obj+"From: ********"+ status.status);
                                // status.status = newStates;
                                solvedMethodInfo.put(o1, new EscapeStatus());
                                solvedMethodInfo.get(o1).status = newStates;
                                // System.out.println(key+" "+obj+"TO: "+ newStates);
                            }

                        } catch (Exception e) {
                        }
                    }
                } else {
                    for (ObjectNode o1 : methodInfo.keySet()) {
                        EscapeStatus status = methodInfo.get(o1);
                        HashSet<EscapeState> newStates = new HashSet<>(); // Used to store the unsolved values
                        for (EscapeState state : status.status) {
                            //System.out.println("Outside Printing state: "+ state);
                            if (state instanceof ConditionalValue) {
                                ConditionalValue cstate = (ConditionalValue) state;
                                //System.out.println(" Conditional values Found");
                                //System.out.println("-- >Cstate :" + cstate + " --> object Type: " + cstate.object.type + " --> Parameter number is" + cstate.object.ref);
                                if (cstate.object.type != ObjectType.parameter) { // if it is of type argument then add in the pending list
                                    newStates.add(state);
                                    //System.out.println("1. Came here");
                                    continue;
                                }
                                int parameternumber = cstate.object.ref;
                                if (parameternumber < 0) {  // If the parameter is this pointer then add in the pending list
                                    newStates.add(state);
                                    //System.out.println("2. Came here");
                                    continue;
                                }
                                Iterator<Edge> iter = cg.edgesOutOf(u); // Key is the name of the method
                                //System.out.println("Method : "+ key +"isempty:"+iter.hasNext()+": "+key);
                                newStates.add(state);
                                while (iter.hasNext()) {
                                    //System.out.println(" **************************** Entering here ****************************");
                                    //parameternumber = cstate.object.ref;
                                    Edge edge = iter.next();
                                    //System.out.println(key+" "+obj+" "+cstate+" " + +parameternumber + " "+edge.src() );
                                    //System.out.println("Edge type:" + edge.kind() + " key: " + key+ " "+edge.srcUnit()+" Decalration: "+edge.tgt().getDeclaration() +"Signature: "+ iter.next().getSrc());
                                    if (edge.kind() == Kind.REFL_CONSTR_NEWINSTANCE) {
                                        parameternumber = 0;
                                    } else if (edge.kind() == Kind.REFL_INVOKE) {
                                        parameternumber = 1;
                                    }
                                    try {
                                        SootMethod m = edge.tgt();
                                        PointsToGraph p = this.ptgs.get(m);
                                        Value val = m.getActiveBody().getParameterLocal(parameternumber);
                                        Set<ObjectNode> objnodes = p.vars.get(val);
                                        for (ObjectNode obj2 : objnodes) {
                                            newStates.add(CreateNewEscapeState(obj2, cstate, edge.src()));
                                        }
                                    } catch (Exception e) {
                                        System.err.println("Cond: " + cstate + " " + cstate.object + " " + cstate.object.ref + " " + parameternumber);
                                        throw e;
                                    }
                                }
                            } else {
                                newStates.add(state); // If not conditional value just store in the map
                                //System.out.println("State values in else part: " + state);
                                if (state instanceof Escape) { // if status is Escape store as solved
                                    this.solvedSummaries.get(key).put(o1, new EscapeStatus(Escape.getInstance()));
                                }
                            }
                        }
                        // System.out.println(key+" "+obj+"From: ********"+ status.status);
                        // status.status = newStates;
                        solvedMethodInfo.put(o1, new EscapeStatus());
                        solvedMethodInfo.get(o1).status = newStates;
                        // System.out.println(key+" "+obj+"TO: "+ newStates);

                    }
                }
//                for (ObjectNode o : solvedMethodInfo.keySet()) {
//                    System.out.println("Object:" + o + "Status :" + solvedMethodInfo.get(o));
//                }
            }
        }
    }
    EscapeState CreateNewEscapeState(ObjectNode obj, ConditionalValue state, SootMethod src) {
        return new ConditionalValue(src, obj, state.fieldList, state.isReal);
    }
// Standard Object
    StandardObject getSObj(SootMethod method, ObjectNode obj) {
        if (objMap.get(method) == null) {
            objMap.put(method,new HashMap<>());
        }
        StandardObject objx = objMap.get(method).get(obj);
        if (objx == null)
            objMap.get(method).put(obj, new StandardObject(method, obj));

        return objMap.get(method).get(obj);
    }
    void GenerateGraphFromSummary() {
        System.out.println("******** Solved Summaries **********");
        for (SootMethod key: this.solvedSummaries.keySet() ) {
            HashMap<ObjectNode, EscapeStatus> methodInfo = this.solvedSummaries.get(key);

            for (ObjectNode obj: methodInfo.keySet()) {
                EscapeStatus status = methodInfo.get(obj);
                //System.out.println("******** Solved Summaries **********");
                System.out.println("Object: "+ obj + "Status : "+ status);
                Set <StandardObject> target = new HashSet<>();
                for (EscapeState state : status.status ) {
                    if ( state instanceof ConditionalValue) {
                        ConditionalValue cstate = (ConditionalValue)state;
                        // if ( cstate.object.equals(new ObjectNode(0, ObjectType.returnValue)) 
                        //     && cstate.method == null) {
                        //         cstate.method = key;
                        // }

                        if ( cstate.method != null ) {
                            try {
                                // StandardObject objx = getSObj(cstate.method,cstate.object);
                                // target.add(objx);
                                // Actually figure out, if above code is sufficient or not.
                                // If not, use the below one.
                                // getObjs() actually find all the objects pointed by obj along with
                                // its fields of obj pointed by conditional value.
                                Set<StandardObject> objx = getObjs(cstate);  // Getting all the object on which current object depends on.
                                //System.out.println("Object received is :" + objx);
                                target.addAll(objx);
                                for (StandardObject x: objx) {
                                    if (this.graph.get(x) == null) {
                                        this.graph.put(x, new HashSet<>());
                                    }
                                }
                            } catch(Exception e) {
                                // System.err.println(cstate.method+" "+cstate.object);
                                // System.err.println(e);
                                continue;
                            }
                        }
                        else {
                            // System.err.println(key+" "+obj+" Method NULL: "+cstate);
                        }
                    }
                }
                this.graph.put(objMap.get(key).get(obj), target);
            }
        }
        /*
            2. Adding the field dependencies.
               In A.f = B, if A escapes, then B also escapes.
         */
        for (SootMethod method: this.ptgs.keySet()) {
            Map<ObjectNode, Map<SootField, Set<ObjectNode>>> fieldMap = this.ptgs.get(method).fields;
            for (ObjectNode obj: fieldMap.keySet()) {
                StandardObject sobj = getSObj(method, obj);

                for (SootField field: fieldMap.get(obj).keySet()) {
                    for (ObjectNode tobj: fieldMap.get(obj).get(field)) {
                        StandardObject tsobj = getSObj(method, tobj);
                        this.graph.get(tsobj).add(sobj);
                    }
                }
            }
        }

        List<Pair<StandardObject, StandardObject> > toAlter = new ArrayList<>();
        for (StandardObject obj1: this.graph.keySet()) {
            for (StandardObject obj2: this.graph.get(obj1)) {
                if (obj2.getObject().type == ObjectType.parameter) {
                    toAlter.add(new Pair<StandardObject,StandardObject>(obj1, obj2));
                }
            }
        }
        /*
            3. A is dependent on a parameter p. Then, A.f is dependent on p.f.
         */
        for (Pair<StandardObject, StandardObject> obj :toAlter)
        {
            matchObjs(obj.getKey(), obj.getValue());
        }

        for (StandardObject key: this.graph.keySet()) {
            for (StandardObject val: this.graph.get(key)) {
                if ( ! this.revgraph.containsKey(val))
                    this.revgraph.put(val, new HashSet<>());
                this.revgraph.get(val).add(key);
            }
        }
        //printGraph(this.graph);
        //printGraph(this.revgraph);
    }
    /*
        3. A is dependent on a parameter p. Then, A.f is dependent on p.f.
        matchObjs methods adds the dependence
     */
    private void matchObjs(StandardObject obj1, StandardObject obj2) {
        try {
            Map<SootField, Set<ObjectNode> > fieldMap1 = this.ptgs.get(obj1.getMethod()).fields.get(obj1.getObject()); // fieldMap of obj1.
            Map<SootField, Set<ObjectNode> > fieldMap2 = this.ptgs.get(obj2.getMethod()).fields.get(obj2.getObject()); // fieldMap of obj2.
            
            if (fieldMap1 == null || fieldMap2 == null)
                return;


            for (SootField f: fieldMap1.keySet() )
            {
                if (fieldMap1.get(f) == null || fieldMap2.get(f) == null) {
                    continue;
                }
                for (ObjectNode o1s: fieldMap1.get(f)) {
                    for (ObjectNode o2s: fieldMap2.get(f)) {
                        StandardObject sobj1 = getSObj(obj1.getMethod(), o1s);
                        StandardObject sobj2 = getSObj(obj2.getMethod(), o2s);
                        System.err.println(sobj1+"-><-"+sobj2);
                        if(this.graph.get(sobj1).contains(sobj2))
                            continue;
                        else {
                            this.graph.get(sobj1).add(sobj2);
                            this.graph.get(sobj2).add(sobj1);
                            matchObjs(sobj1, sobj2);
                        }
                    }
                }
            }
        }
        catch(Exception e) {
            System.err.println(e);
            System.out.println(obj1+" "+obj2);
        }
        
    }
    /*
        This method returns all the object related to a particular object
     */
    private Set<StandardObject> getObjs(ConditionalValue cv) {
		Iterable<ObjectNode> _ret = new LinkedHashSet<ObjectNode>();
		Collection<ObjectNode> c = (Collection<ObjectNode>) _ret;
		// <m, <parameter,0>.f.g> or <m,<returnValue,0>.f.g>
		LinkedList<ObjectNode> workList = new LinkedList<ObjectNode>();
		PointsToGraph ptg;
		ptg = this.ptgs.get(cv.getMethod());
		if (ptg == null || cv.object.equals(new ObjectNode(0, ObjectType.returnValue))) {
//			System.out.println("the method of "+ cv.toString() + " doesn't have a ptg defined!");
            HashSet<StandardObject> x = new HashSet<>();
            x.add(getSObj(cv.getMethod(), cv.object));
            return x;
//			throw new IllegalArgumentException("the method of "+ cv.toString() + " doesn't have a ptg defined!");
		}
		// if (cv.object.equals(new ObjectNode(0, ObjectType.returnValue))) {
		// 	if (ptg.vars.get(RetLocal.getInstance()) != null)
		// 		c.addAll(ptg.vars.get(RetLocal.getInstance()));
		// } else {
		// 	c.add(cv.object);
        // }
        c.add (cv.object);

        workList.addAll(c);

		LinkedList<ObjectNode> temp;
		LinkedList<ObjectNode> workListNext = new LinkedList<ObjectNode>();
		if (cv.fieldList != null) {
            Iterator<SootField> i = cv.fieldList.iterator();
			while (i.hasNext()) {
				SootField f = i.next();
				Iterator<ObjectNode> itr = workList.iterator();
				while (itr.hasNext()) {
					ObjectNode o = itr.next();
					if (ptg.fields.containsKey(o) && ptg.fields.get(o).containsKey(f)) {
						for (ObjectNode obj : ptg.fields.get(o).get(f)) {
							if (!c.contains(obj)) c.add(obj);
						}
						workListNext.addAll(ptg.fields.get(o).get(f));
					}
				}
				workList.clear();
				temp = workListNext;
				workListNext = workList;
				workList = temp;
			}
		}
        // return _ret;
        Set<StandardObject> fnobjs = new HashSet<>();
        for (ObjectNode x: c) {
            fnobjs.add(getSObj(cv.getMethod(), x));
        }
        return fnobjs;
	}

    void FindSCC() {
        HashMap<StandardObject, Boolean> used = new HashMap<>();
        List<List<StandardObject> > components = new ArrayList<>();

        for (StandardObject u: this.graph.keySet()) {
            if (used.containsKey(u) && used.get(u) == true)
                continue;
            dfs1(u, used);
        }

        used = new HashMap<>();

        // System.out.println("Topo Order: "+this.reverseTopoOrder);
        for (int i= 0 ;i<this.reverseTopoOrder.size();i++) {
            StandardObject u = this.reverseTopoOrder.get(this.reverseTopoOrder.size() -1 -i);
            if (used.containsKey(u) && used.get(u) == true)
                continue;
            List<StandardObject> component = new ArrayList<>();
            dfs2(u, used, component);
            components.add(component);
            // System.out.println("Compo:" + component);
            resolve(component);
        }
    }

    void dfs1 (StandardObject u, HashMap<StandardObject, Boolean> used) {
        used.put(u, true);
        if (this.revgraph.get(u) != null) {    
            for (StandardObject v: this.revgraph.get(u)) {
                if (used.containsKey(v) && used.get(v) == true)
                    continue;
                dfs1(v,used);
            }
        }
        this.reverseTopoOrder.add(u);
    }


    void dfs2 (StandardObject u, HashMap<StandardObject, Boolean> used, List<StandardObject> component) {
        used.put(u, true);
        component.add(u);
        
        if (this.graph.get(u) != null) {
            for (StandardObject v: this.graph.get(u)) {
                if (used.containsKey(v) && used.get(v) == true)
                    continue;
                dfs2(v,used,component);
            }
        }
    }

    boolean isReturnObject(StandardObject s) {
        if (s.getObject().equals(new ObjectNode(0, ObjectType.returnValue)))
            return true;
        return false;
    }
    /*
     *  Two issues: First return statements have a function name as
     *  null. and this code simply ignores such statements. - Resolved
     * 
     *  How to check code with mutiple return statements.
     * 
     *  Second, return statements should be marked as escaping iff object
     *  returned is allocated in that function.
     */
    boolean isEscapingObject( StandardObject sobj) {

        HashMap<ObjectNode, EscapeStatus> ess = this.solvedSummaries.get(sobj.getMethod());
        
        if (ess == null)
            return false;

        EscapeStatus es = ess.get(sobj.getObject());
        if (es != null && es.doesEscape()) {
            System.err.println("es is escaping.");
            // SetComponent(component, Escape.getInstance());
            return true;
        }
        if (this.noBCIMethods.contains(sobj.getMethod())) {
            return true;
        }
        return isAssignedToThis(sobj);
    }

    boolean isAssignedToThis(StandardObject sobj) { // Is assigned to this or parameter.
        HashMap<ObjectNode, EscapeStatus> objEs = this.solvedSummaries.get(sobj.getMethod());
        if (objEs == null)
            return false;
        EscapeStatus es = objEs.get(sobj.getObject());

        if (es == null)
            return false;

        if (sobj.getObject().type == ObjectType.parameter || sobj.getObject().type == ObjectType.argument)
            return false;

        // if (sobj.getObject().type != ObjectType.internal)
        //     return false;
        
        // If any internal object is assigned to the parameter then it is escaping.
        // Whereas, same argument is not valid for external object,
        // But if any external object is assigned to static variable, 
        // then it is escaping.


        if (sobj.getObject().type == ObjectType.internal) {
            for (EscapeState e : es.status) {
                if (e instanceof ConditionalValue) {
                    ConditionalValue cv = (ConditionalValue) e;
                    if (cv.method == null && cv.object.type == ObjectType.argument )//&& cv.object.ref == -1)
                        return true;
                }
            }
        }
        else {
            for (EscapeState e : es.status) {
                if (e instanceof ConditionalValue) {
                    ConditionalValue cv = (ConditionalValue) e;
                    if (cv.method == null && cv.object.type == ObjectType.argument && cv.object.ref == -1)
                        return true;
                }
            }
        }
        return false;
    }
    void resolve(List<StandardObject> component) {
        List<EscapeState> conds = new ArrayList<>();
        for (StandardObject sobj : component) {
            // try {
            //     System.err.println(sobj.getMethod()+" "+sobj.getObject());
            //     System.err.println(this.graph.get(sobj));
            //     System.err.println(" "+this.solvedSummaries.get(sobj.getMethod()).get(sobj.getObject()));
            // }
            // catch (Exception e) {
            //     System.err.println("Error");
            // }
            if (isReturnObject(sobj)) 
            {
                System.err.println("Identified as return obj: "+sobj);
                SetComponent(component, Escape.getInstance());
                return;
            }
            if (isEscapingObject(sobj)) {
                System.err.println("Identified as escaping obj: "+sobj);
                SetComponent(component, Escape.getInstance());
                return;
            }
            // if (isAssignedToThis(sobj)) {
            //     SetComponent(component, Escape.getInstance());
            // }

            for (StandardObject nxt: this.graph.get(sobj)) {
                // if (nxt.getMethod().isJavaLibraryMethod()){
                //     System.err.println("Escaping obj: "+nxt);
                //     SetComponent(component, Escape.getInstance());
                //     return;
                //     // continue;
                // }
                try {
                    if (isEscapingObject(nxt)) {
                        System.err.println("Escaping obj: "+nxt);
                        SetComponent(component, Escape.getInstance());
                        return;
                    }
                }
                catch(Exception e) {
                    // System.err.println(this.solvedSummaries.get(nxt.getMethod())+" "+nxt.getMethod()+" "+nxt.getObject());
                    // System.err.println(e);
                    // throw e;
                }
                
            }
        }
        SetComponent(component, NoEscape.getInstance());
    }

    void SetComponent ( List<StandardObject> comp, EscapeState es) {
        System.err.println("comp:"+comp+" : "+es);
        for (StandardObject s: comp) {
            if (this.solvedSummaries.get(s.getMethod()) != null)
                this.solvedSummaries.get(s.getMethod()).put(s.getObject(), new EscapeStatus(es));
        }
    }
}