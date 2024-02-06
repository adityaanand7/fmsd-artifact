package main;

import analyser.StaticAnalyser;
import es.ConditionalValue;
import es.EscapeState;
import ptg.ObjectNode;
import ptg.ObjectType;
import soot.*;
import soot.jimple.toolkits.callgraph.CallGraph;
import soot.jimple.toolkits.callgraph.Edge;
import soot.options.Options;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.*;
import analyser.PostStaticAnalysis;
import utils.CallbackObject;

import static analyser.PostStaticAnalysis.*;

public class Main {


	public static void main(String[] args) {

		//1. Get the Soot args
		GetSootArgs g = new GetSootArgs();
		String[] sootArgs = g.get(args);
		if (sootArgs == null) {
			System.out.println("Unable to generate args for soot!");
			return;
		}

		//2. Call the static analysis
		StaticAnalyser staticAnalyser = new StaticAnalyser();
		PackManager.v().getPack("jtp").add(new Transform("jtp.sample", staticAnalyser));
		long analysis_start = System.currentTimeMillis();
		Options.v().parse(sootArgs);
		Scene.v().loadNecessaryClasses();
		Scene.v().loadDynamicClasses();
		SootClass s = Scene.v().getSootClass("org.xml.sax.helpers.SecuritySupport");
		System.err.println(s.getMethods());
		PackManager.v().runPacks();
		PostStaticAnalysis post = new PostStaticAnalysis();
		PackManager.v().getPack("wjtp").add(new Transform("wjtp.sample", post));
		PackManager.v().runPacks();

		Map<SootMethod, HashMap<ObjectNode, String>> division = new HashMap<>();
		Map<PE, List<Dependency>> CV = new HashMap<>();

		int totalmethod = 0;
		int totalobject = 0;

		for(SootMethod sm : StaticAnalyser.summaries.keySet()) {
			for (ObjectNode obj : StaticAnalyser.summaries.get(sm).keySet()){
				totalobject++;
			}
			totalmethod++;
		}
//		System.out.println("\n=== Statistics ===");
//		System.out.println("1. Objects out of total objects having callback dependency");
//		System.out.println("    i). Total Badcase Objects : "+ totalbadobjects);
//		System.out.println("   ii). Total Objects : "+ totalobject);
//		System.out.println("  iii). Percent Badcase = "+ String.format("%.2f", (((float) totalbadobjects)/totalobject) *100)+ "%");
//		System.out.println("------------------------------------------------------------");
//		System.out.println("2. Methods out of total methods having callback dependency");
//		System.out.println("    i). Total affected methods : "+ totalbadmethods);
//		System.out.println("   ii). Total methods : "+ totalmethod);
//		System.out.println("  iii). Percent Badcase = "+ String.format("%.2f", (((float) totalbadmethods)/totalmethod) *100) + "%");
//		System.out.println("------------------------------------------------------------");

		for(SootMethod sm : CallBackCV.keySet()) {
			for(ObjectNode o : CallBackCV.get(sm).keySet()) {
				staticAnalyser.summaries.get(sm).get(o).status.add(CallBackCV.get(sm).get(o));
			}
		}

		boolean flag = false;
        for (SootMethod S : staticAnalyser.summaries.keySet()) {
		for (ObjectNode o1 : staticAnalyser.summaries.get(S).keySet()) {
			List<Dependency> dep = new ArrayList<>();
			PE p1 = new PE();
			p1.ClassName = S.getDeclaringClass();
			if (S.getName().equals("<init>")) {
				p1.MethodName = "init";
			} else if (S.getName().equals("<clinit>")) {
				p1.MethodName = "clinit";
			} else {
				p1.MethodName = S.getName();
			}
			if (o1.type == ObjectType.internal) {
				p1.TypeTag = "local1";
			} else if (o1.type == ObjectType.parameter) {
				p1.TypeTag = "parmtr";
			} else if (o1.type == ObjectType.argument) {
				p1.TypeTag = "argmt";
			} else if (o1.type == ObjectType.external) {
				p1.TypeTag = "local1";
			} else if (o1.type == ObjectType.returnValue) {
				p1.TypeTag = "retrn";
			}
			p1.ParmNumber = o1.ref + 2;
			Iterator<EscapeState> it = staticAnalyser.summaries.get(S).get(o1).status.iterator();
			while (it.hasNext()) {
				flag = false;
				List<Dependency> deplist = new ArrayList<>();
				Dependency d1 = new Dependency();
				EscapeState es = it.next();
				if (es instanceof ConditionalValue) {
					boolean parmflag = false;
					if ((((ConditionalValue) es).getMethod() == null)) {
						d1.p.ClassName = S.getDeclaringClass();
						d1.p.MethodName = S.getName();
						parmflag = true;

					} else {
						d1.p.ClassName = ((ConditionalValue) es).getMethod().getDeclaringClass();
						d1.p.MethodName = ((ConditionalValue) es).getMethod().getName();
					}
					if (d1.p.MethodName.equals("<init>")) {
						d1.p.MethodName = "init";
					}
					if(d1.p.MethodName.equals("<clinit>")) {
						d1.p.MethodName = "clinit";
					}
					if (((ConditionalValue) es).object.type == ObjectType.internal ) {
						d1.p.TypeTag = "local1";
					} else if (((ConditionalValue) es).object.type == ObjectType.parameter) {
						d1.p.TypeTag = "argmnt";
					} else if (((ConditionalValue) es).object.type == ObjectType.argument) {
						if(parmflag){
							// Stava prints correctly for param dependency but not for otheres.
							d1.p.TypeTag = "argmnt";
						} else {
							if (d1.p.MethodName.equals("main")) {
								d1.p.TypeTag = "argmnt";
							} else {
								d1.p.TypeTag = "parmtr";
							}
						}
					}else if (((ConditionalValue) es).object.type  == ObjectType.callback) {
						d1.p.TypeTag = "callback";
					} else if (((ConditionalValue) es).object.type  == ObjectType.external) {
						p1.TypeTag = "local1";
					} else if (((ConditionalValue) es).object.type  == ObjectType.returnValue) {
						p1.TypeTag = "retrn";
					}

					d1.p.ParmNumber = ((ConditionalValue) es).object.ref + 2;
					d1.DependencyValue = "D";
					d1.ResolvedValue = "D";
				} else if (es.toString().equals("Escape")) {
					d1.p.ClassName = S.getDeclaringClass();
					if (S.getName().equals("<init>" )) {
						d1.p.MethodName = "init";
					} else if (S.getName().equals("<clinit>")) {
						d1.p.MethodName = "clinit";
					} else {
						d1.p.MethodName = S.getName();
					}
					if (o1.type == ObjectType.internal) {
						d1.p.TypeTag = "local1";
					} else if (o1.type == ObjectType.parameter) {
						d1.p.TypeTag = "argmnt";
					} else if (o1.type == ObjectType.argument) {
						d1.p.TypeTag = "parmtr";
					} else if (o1.type == ObjectType.external) {
						d1.p.TypeTag = "local1";
					} else if (o1.type == ObjectType.returnValue) {
						d1.p.TypeTag = "retrn";
					}
					d1.p.ParmNumber = o1.ref + 2;
					d1.DependencyValue = "E";
					d1.ResolvedValue = "E";
					//System.out.println("hello");
				} else if (es.toString().equals("NoEscape")){
					//System.out.println("Inside Else : "+   es);
					d1.p.ClassName = S.getDeclaringClass();
					//System.out.println("Class : "+ d1.p.ClassName + " method : "+ S.getName());
					if (S.getName().equals("<init>" )) {
						d1.p.MethodName = "init";
					} else if (S.getName().equals("<clinit>")) {
						d1.p.MethodName = "clinit";
					} else {
						d1.p.MethodName = S.getName();
					}
					if (o1.type == ObjectType.internal) {
						d1.p.TypeTag = "local1";
					} else if (o1.type == ObjectType.parameter) {
						d1.p.TypeTag = "argmnt";
					} else if (o1.type == ObjectType.argument) {
						d1.p.TypeTag = "parmtr";
					} else if (o1.type == ObjectType.external) {
						d1.p.TypeTag = "local1";
					} else if (o1.type == ObjectType.returnValue) {
						d1.p.TypeTag = "retrn";
					}
					d1.p.ParmNumber = o1.ref + 2;
					d1.DependencyValue = "D";
					d1.ResolvedValue = "D";
				}  else {
					System.out.println("***************************** Inside Else : "+   es);
				}
				if (flag) {
					for (Dependency dtemp : deplist) {
						dep.add(dtemp);
					}
				} else {
					dep.add(d1);
				}
			}
			CV.put(p1, dep);
		}
		try {
			// Create file
			FileWriter myWriter = new FileWriter("CVOUT.txt");
			BufferedWriter out = new BufferedWriter(myWriter);
			for (PE p1 : CV.keySet()) {
				out.write("<" + p1.ClassName + ":" + p1.MethodName + "," + p1.TypeTag + "," + p1.ParmNumber + ",<>> = ");
//				System.out.println(" PE VALUE : <<" + p1.ClassName + ":" + p1.MethodName + "," + p1.TypeTag + "," + p1.ParmNumber + "<>> = " );
				for (Dependency d1 : CV.get(p1)) {
					if(d1.p.TypeTag != null) {
						out.write("<<" + d1.p.ClassName + ":" + d1.p.MethodName + "," + d1.p.TypeTag + "," + d1.p.ParmNumber + ",<" + d1.p.FieldList + ">>," + d1.DependencyValue + "," + d1.ResolvedValue + ">;");
					} else {
						out.write("<<" + p1.ClassName + ":" + p1.MethodName + "," + p1.TypeTag + "," + p1.ParmNumber + ",<" + d1.p.FieldList + ">>," + d1.DependencyValue + "," + d1.ResolvedValue + ">;");
					}
//					System.out.println(" DEPENDENCY : <<"+ d1.p.ClassName + "," + d1.p.MethodName + "," + d1.p.TypeTag + "," + d1.p.ParmNumber + ",<" +d1.p.FieldList +  ">>," + d1.DependencyValue + "," + d1.ResolvedValue +">" );
				}
				out.write("\n");
			}
			//Close the output stream
			out.close();
		} catch (Exception e) {//Catch exception if any
			System.err.println("Error: " + e.getMessage());
		}
	}
	long analysis_end = System.currentTimeMillis();
	System.out.println(" Application methods (App Methods): " + Scene.v().getApplicationClasses().size());
    //System.out.println(" Time Taken: " + (analysis_end - analysis_start) / 1000F + " seconds");
	boolean useNewResolver = true;
	long res_start = System.currentTimeMillis();
}
}
