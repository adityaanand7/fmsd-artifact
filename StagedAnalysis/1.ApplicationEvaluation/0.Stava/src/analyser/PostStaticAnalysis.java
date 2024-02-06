package analyser;

import es.ConditionalValue;
import es.EscapeState;
import es.EscapeStatus;
import ptg.ObjectNode;
import ptg.ObjectType;
import soot.*;
import soot.util.Chain;
import soot.util.HashChain;
import utils.CallbackObject;

import java.util.*;

public class PostStaticAnalysis extends SceneTransformer {

    public static Set<SootMethod> LibOverriddenMethods = new HashSet<>();
    public static HashMap<SootMethod, Set<ObjectNode>> BadObjectsInBadMethods = new HashMap<>();
    public List<SootMethod> worklist = new ArrayList<>();
    public List<SootMethod> tmpworklist = new ArrayList<>();
    public static HashMap<SootMethod, HashMap<ObjectNode, Set<CallbackObject>>> ListofObjects = new HashMap<>();
    public static HashMap<SootMethod, HashMap<ObjectNode, Set<CallbackObject>>> tmpListofObjects = new HashMap<>();
    public static HashMap<SootMethod, Set<Integer>> BadParameters = new HashMap<>();
    public static HashMap<SootMethod, Set<Integer>> CBadParameters = new HashMap<>();
    public static HashMap<SootMethod, HashMap<ObjectNode, ConditionalValue>> CallBackCV = new HashMap<>();
    boolean debug = false;
    int BadObjectSize = 0;
    int BadParameterSize = 0;
    public static int totalbadobjects = 0;
    public static int totalbadmethods = 0;

    public PostStaticAnalysis() {
        super();
    }

    @Override
    protected void internalTransform(String s, Map<String, String> map) {
        // Get all the classes
        Chain<SootClass> classes = Scene.v().getClasses();
        Set<SootClass> list = new HashSet<>();
        Set<SootClass> tmplist = new HashSet<>();
        for (SootClass c : classes) {
            Set<SootClass> ansclasses = new HashSet<SootClass>();

            if (!c.isApplicationClass() || c.getName().startsWith("java.") || c.getName().startsWith("jdk.") || c.getName().startsWith("sun.") || c.isJavaLibraryClass()) {
                continue;
            }
            // Proceed after this for all the application classes
            // If not library class
            SootClass klass = c.getSuperclass();
            Chain<SootClass> i = c.getInterfaces();// Get the parent class
            // Add if Java library
            if (klass.isJavaLibraryClass()) {
                ansclasses.add(klass);
                //ansclasses.addAll(i);
            }
            list.addAll(i);
            //System.out.println("1. list "+ list.toString());
            while (!list.isEmpty()) {
                //System.out.println("2. List : "+ list + "and tmplist : "+ tmplist);
                for (SootClass sc : list) {
                    if (sc.isJavaLibraryClass()) {
                        ansclasses.add(sc);
                        //System.out.println("Count : "+ sc.getInterfaceCount());
                        Collection<SootClass> tmp = sc.getInterfaces();
                        //System.out.println("Inside : "+ tmp);
                        tmplist.addAll(tmp);
                    }
                }
                //System.out.println("3. List : "+ list + "and tmplist : "+ tmplist);
                list.clear();
                list.addAll(tmplist);
                tmplist.clear();
                //System.out.println("4. List : "+ list + "and tmplist : "+ tmplist);
            }


            /* Add the all the parent classes of the parent class (klass)
             ** Only add those parents which are library
             ** Further check if they have declared any abstract method which is defined in the application class
             */
            while (klass.hasSuperclass()) {
                klass = klass.getSuperclass();
                if (klass.isJavaLibraryClass()) {
                    ansclasses.add(klass);
                }
            }

            // lm contains all the methods which is defined by the class c (where class c is an application class)
            List<SootMethod> lm = c.getMethods();

            /*  Check for all the methods defined in this particular class if any method has same name and parameters in any of the parent classes.
             **  If Yes then mark/store it as "callback-method" -- as it may have a callback.
             */
            for (SootMethod m : lm) {
                if (m.isConstructor() || m.isStatic() || m.isStaticInitializer()) {
                    continue;
                }
                for (SootClass sc : ansclasses) {
                    //System.out.println("Trying to find :" + m.getName() + " "+ m.getDeclaringClass());
                    boolean sm = sc.declaresMethod(m.getName(), m.getParameterTypes());
                    if (sm) {
                        LibOverriddenMethods.add(m);
                    }
                }
            }
        }
        // Debug Code
        if (debug) {
            System.out.println("Direct Methods found as callback affected : \n");
            int i = 1;
            for (SootMethod s1 : LibOverriddenMethods) {
                System.out.println(" " + i++ + " Methods : " + s1.toString());
            }
        }

        /*   Got all the methods which can cause callback at first level
         **   Add all the methods and parameters as the affected Callback
         **   Assuming here now that all the parameters from these first level method are generic/Object type and can be callback affected
         */
        for (SootMethod m : LibOverriddenMethods) {
            int count = m.getParameterCount();
            Set<Integer> temp = new HashSet<>();
            //System.out.println("Count : " + count);
            while (count > 0) {
                temp.add(--count);
            }
            temp.add(-1);
            BadParameters.put(m, temp);
            CBadParameters.put(m, temp);
        }

        if (debug) {
            for (SootMethod m : BadParameters.keySet()) {
                System.out.println("Method : " + m);
                for (Integer i : BadParameters.get(m)) {
                    System.out.println(i);

                }
            }
        }
        int i = 0;
        while (BadParameters.size() != BadParameterSize || BadObjectsInBadMethods.size() != BadObjectSize) {
            //System.out.println("Iteration : "+ ++i);
            BadParameterSize = BadParameters.size();
            BadObjectSize = BadObjectsInBadMethods.size();
            for (SootMethod sm : BadParameters.keySet()) {
                // 1. Add all the object having dependencies <caller,<argument, i>, where i should be there in BadParameters of this method (sm)
                CallBackCV.put(sm, new HashMap<>());
                if (StaticAnalyser.summaries.containsKey(sm)) {
                    Set<ObjectNode> stemp = new HashSet<>();
                    for (ObjectNode o : StaticAnalyser.summaries.get(sm).keySet()) {
                        EscapeStatus es = StaticAnalyser.summaries.get(sm).get(o);
                        for (EscapeState e : es.status) {
                            if (e instanceof ConditionalValue) {
                                if (((ConditionalValue) e).object.type == ObjectType.argument
                                        && (BadParameters.get(sm).contains(((ConditionalValue) e).object.ref))) {
                                    //System.out.println("Object : "+ o.type.toString() + " "+ o.ref);
                                    stemp.add(o);
                                    ObjectNode obj = new ObjectNode(((ConditionalValue) e).object.ref, ObjectType.callback);
//                                    System.out.println("Object is: "+ o.toString()+ "CV will have object as: "+ obj.toString());
                                    ConditionalValue cv = new ConditionalValue(sm, obj, null,true);
//                                    System.out.println("CV: "+ cv.toString());
                                    CallBackCV.get(sm).put(o,cv);
                                }
                            }
                        }
                    }
                    if (!stemp.isEmpty())
                        BadObjectsInBadMethods.put(sm, stemp);
                }
                // 2. Find the methods that are called from the current method and check if any of the argument (Object) is already there in the BadObjectInBadMethods
                if (BadObjectsInBadMethods.containsKey(sm)) {
                    for (ObjectNode o : BadObjectsInBadMethods.get(sm)) {
                        EscapeStatus es = StaticAnalyser.summaries.get(sm).get(o);
                        for (EscapeState e : es.status) {
                            if (e instanceof ConditionalValue) {
                                if (((ConditionalValue) e).object.type == ObjectType.parameter) {
                                    SootMethod stemp = ((ConditionalValue) e).getMethod();
                                    Integer itemp = ((ConditionalValue) e).object.ref;
                                    if (BadParameters.containsKey(stemp)) {
                                        CBadParameters.get(stemp).add(itemp);
                                    } else {
                                        Set<Integer> stemp2 = new HashSet<>();
                                        stemp2.add(itemp);
                                        CBadParameters.put(stemp, stemp2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            for (SootMethod sm : CBadParameters.keySet()) {
                BadParameters.put(sm, CBadParameters.get(sm));
            }
        }
        //System.out.println("======= Final Results ==========");
        for (SootMethod sm : BadObjectsInBadMethods.keySet()) {
            //System.out.println("Method is : " + sm.getName().toString());
            for (ObjectNode o : BadObjectsInBadMethods.get(sm)) {
                //System.out.println(" Object is : "+ o.toString());
                totalbadobjects++;
            }
            totalbadmethods++;
        }
        if (debug) {
            for (SootMethod sm : BadObjectsInBadMethods.keySet()) {
//                System.out.println("2. For Method : " + sm.getName().toString());
                for (ObjectNode im : BadObjectsInBadMethods.get(sm)) {
//                    System.out.println(" Object is : " + im);
//                    ObjectNode obj = new ObjectNode(im.ref, ObjectType.argument);
//                    ConditionalValue cv = new ConditionalValue(getCallbackMethod(), obj, true);
                }
            }
        }
        worklist.addAll(BadObjectsInBadMethods.keySet());
        //System.out.println("Worklist Value : " + worklist.toString());
        while (!worklist.isEmpty()) {
            for (SootMethod sm : worklist) {
                //System.out.println(" For Method : "+ sm.getName().toString());
                ListofObjects.put(sm, new HashMap<>());
                for (ObjectNode ob : BadObjectsInBadMethods.get(sm)) {
                    //System.out.println(" Object is : "+ ob);
                    EscapeStatus es = StaticAnalyser.summaries.get(sm).get(ob);
                    if (!ListofObjects.get(sm).containsKey(ob))
                        ListofObjects.get(sm).put(ob, new HashSet<>());
                    for (EscapeState e : es.status) {
                        if (e instanceof ConditionalValue) {
                            if(((ConditionalValue) e).getMethod() != null){
                            if (((ConditionalValue) e).getMethod().getName().contains("<init>")) {
                                continue;
                            }
                            //System.out.println("Status : " + e.toString());
                            if (((ConditionalValue) e).object.type == ObjectType.parameter) {
                                if (ListofObjects.containsKey(((ConditionalValue) e).getMethod())) {
                                    if (ListofObjects.get(((ConditionalValue) e).getMethod()).containsKey(((ConditionalValue) e).object)) {
                                        ListofObjects.get(sm).get(ob).addAll(ListofObjects.get(((ConditionalValue) e).getMethod()).get(((ConditionalValue) e).object));
                                    }
                                } else {
                                    if (BadObjectsInBadMethods.containsKey(((ConditionalValue) e).getMethod()))
                                        tmpworklist.add(sm);
                                }
                            } else if (((ConditionalValue) e).object.type == ObjectType.argument) {
                                for (ObjectNode obj : BadObjectsInBadMethods.get(sm)) {
                                    if (obj.type == ObjectType.parameter && obj.ref == ((ConditionalValue) e).object.ref) {
                                        CallbackObject c = new CallbackObject(sm, ob);
                                        boolean b = !(ob.type == obj.type && ob.ref == obj.ref);
                                        if (!ListofObjects.get(sm).containsKey(obj)) {
                                            if (b) {
                                                ListofObjects.get(sm).put(obj, new HashSet<>());
                                                ListofObjects.get(sm).get(obj).add(c);
                                            }
                                        } else {
                                            if (b) {
                                                ListofObjects.get(sm).get(obj).add(c);
                                            }

                                        }
                                    }
                                }
                            }
                            }
                        } else {
                            System.out.println("***** \" Hello!! Why Here?? Something Wrong :( \" *****" + e.toString());
                        }
                    }
                }
            }
            //System.out.println("TmpWorkList : "+ tmpworklist.toString());
            worklist.clear();
            worklist.addAll(tmpworklist);
            tmpworklist.clear();
            //System.out.println("New WorkList : "+ worklist.toString());

        }
        //System.out.println("\n New WorkList 1 : " + ListofObjects.toString());
        while (!ListofObjects.equals(tmpListofObjects)) {
            copyMap(ListofObjects, tmpListofObjects);
            //System.out.println("\n Tmp WorkList2 : " + tmpListofObjects.toString());
            for (SootMethod m : tmpListofObjects.keySet()) {
                for (ObjectNode o : tmpListofObjects.get(m).keySet()) {
                    for (CallbackObject cb : tmpListofObjects.get(m).get(o)) {
                        Set<CallbackObject> received_obj = tmpListofObjects.get(cb.sm).get(cb.ob);
                        for (CallbackObject cbo : received_obj) {
                            if (!tmpListofObjects.get(m).get(o).contains(cbo)) {
                                ListofObjects.get(m).get(o).add(cbo);
                            }
                        }
                    }
                }
            }
            //System.out.println("\n Tmp WorkList2 : " + tmpListofObjects.toString());
        }
    }

    public void copyMap(HashMap<SootMethod, HashMap<ObjectNode, Set<CallbackObject>>> m1,
                                 HashMap<SootMethod, HashMap<ObjectNode, Set<CallbackObject>>> m2) {
        for (Map.Entry<SootMethod, HashMap<ObjectNode, Set<CallbackObject>>> ent : m1.entrySet()) {
            m2.put(ent.getKey(), new HashMap<>());
            for (Map.Entry<ObjectNode, Set<CallbackObject>> entry : m1.get(ent.getKey()).entrySet()) {
                m2.get(ent.getKey()).put(entry.getKey(), new HashSet<>());
                for (CallbackObject e : m1.get(ent.getKey()).get(entry.getKey())) {
                    m2.get(ent.getKey()).get(entry.getKey()).add(e);
                }
            }
        }
    }
    public static SootMethod getCallbackMethod() {
        List<Type> mylist = Collections.<Type>emptyList();
        Type t = new Type() {
            @Override
            public String toString() {
                return null;
            }
        };
        SootMethod s = new SootMethod("CALLBACK", mylist, t);
        return s;
    }
}
