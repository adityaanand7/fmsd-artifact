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


public class Main {

	private static ObjectNode fieldList;

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
		SootClass s = Scene.v().getSootClass("org.xml.sax.helpers.SecuritySupport");
		System.err.println(s.getMethods());
		System.out.println("Application Classes: " + Scene.v().getApplicationClasses().size());
		PackManager.v().runPacks();
		Map<SootMethod, HashMap<ObjectNode, String>> division = new HashMap<>();
		Map<PE, List<Dependency>> CV = new HashMap<>();

		// soot.Main.main(sootArgs);
		//System.out.println("All the conditional values: "+ staticAnalyser.summaries);
		boolean flag = false;
		for (SootMethod S : staticAnalyser.summaries.keySet()) {
			//System.out.println(" *********** The Method is : " + S);
			//HashMap<ObjectNode, String> dsummary = new HashMap<>();
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
				//p1.FieldList.add("null");

				//p1.FieldList = "null";
				//System.out.println("Object : " + o1 + " Status: " + staticAnalyser.summaries.get(S).get(o1));
				Iterator<EscapeState> it = staticAnalyser.summaries.get(S).get(o1).status.iterator();
				while (it.hasNext()) {
					flag = false;
					List<Dependency> deplist = new ArrayList<>();
					Dependency d1 = new Dependency();
					EscapeState es = it.next();
					if (es instanceof ConditionalValue) {
							//System.out.println("Method : "+ S + "Object : "+ o1.ref +  " " + ((ConditionalValue) es).object.type);
							//System.out.println("Inside loop 1: "+ ((ConditionalValue) es).getMethod());
							//System.out.println("Inside loop 2: "+ ((ConditionalValue) es).object);
							boolean parmflag = false;
							if ((((ConditionalValue) es).getMethod() == null)) {
							// Here we come for parameter dependency
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
							}  else if (((ConditionalValue) es).object.type  == ObjectType.external) {
								p1.TypeTag = "local1";
							} else if (((ConditionalValue) es).object.type  == ObjectType.returnValue) {
								p1.TypeTag = "retrn";
							}

							d1.p.ParmNumber = ((ConditionalValue) es).object.ref + 2;
//							if(((ConditionalValue) es).fieldList != null) {
//								//System.out.println("Field value : "+ ((ConditionalValue) es).fieldList.toString());
//								d1.p.FieldList =new ArrayList<String>();
//								for(SootField f : ((ConditionalValue) es).fieldList){
//									d1.p.FieldList.add(f.toString());
//								}
//							}

							d1.DependencyValue = "D";
							d1.ResolvedValue = "D";
//						} else {
//							System.out.println("$$$$$$$$$$$$$$$$ Escape :" + ((ConditionalValue) es).object.ref + " " + ((ConditionalValue) es).object.type);
//							//assert ((ConditionalValue) es).object.type == ObjectType.parameter;
//							System.out.println("Method : "+ S + "Object : "+ o1.ref);
//							CallGraph cg = Scene.v().getCallGraph();
//							Iterator<Edge> edges = cg.edgesInto(S.method());
//							while (edges.hasNext()) {
//								Dependency d2 = new Dependency();
//								Edge edge = edges.next();
//								//System.out.println("Edge value : "+edge);
//								System.out.println(""+ edge.getSrc().method().getName());
//								d2.p.ClassName = edge.getSrc().method().getDeclaringClass();
//								if(edge.getSrc().method().getDeclaringClass().equals("null")) {
//									System.out.println("***********");
//									System.out.println("Edge value : "+edge);
//									System.out.println(""+ edge.getSrc().method().getName());
//								}
//								if(edge.getSrc().method().getName().equals("<init>")) {
//									d2.p.MethodName = "init";
//								} else {
//									d2.p.MethodName = edge.getSrc().method().getName();
//								}
//								//d2.p.TypeTag = ((ConditionalValue) es).object.type;
//								if (((ConditionalValue) es).object.type == ObjectType.internal) {
//									d2.p.TypeTag = "local";
//								} else if (((ConditionalValue) es).object.type == ObjectType.parameter) {
//									d2.p.TypeTag = "parm";
//								} else if (((ConditionalValue) es).object.type == ObjectType.argument) {
//									d2.p.TypeTag = "arg";
//								} else if (((ConditionalValue) es).object.type  == ObjectType.external) {
//									p1.TypeTag = "local";
//								} else if (((ConditionalValue) es).object.type  == ObjectType.returnValue) {
//									p1.TypeTag = "ret";
//								}
//								d2.p.ParmNumber = ((ConditionalValue) es).object.ref + 1;
//								try {
//									d2.p.FieldList.add(((ConditionalValue) es).fieldList.toString());
//								} catch (Exception e) {
//								}
//								d2.DependencyValue = "D";
//								d2.ResolvedValue = "D";
//								//System.out.println("Edges value : "+ edge);
//								deplist.add(d2);
//								flag = true;
//								//System.out.println("Edge Source : "+ edge.getSrc().method().getName()  + " " + edge.getSrc().method().getDeclaringClass() + "edge target 1:  "+ edge.tgt() + "edge target 2:  " + edge.getTgt());
//								//SootMethod method = edge.tgt();
//							}
//						}
					} else if (es.toString().equals("Escape")) {
						d1.p.ClassName = S.getDeclaringClass();
						if (S.getName().equals("<init>" )) {
							d1.p.MethodName = "init";
						} else if (S.getName().equals("<clinit>")) {
							d1.p.MethodName = "clinit";
				}		else {
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
				}		else {
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
					//System.out.println(" PE VALUE : <<"+ p1.EvalStatus + "," + p1.ClassName + ":" + p1.MethodName + "," + p1.TypeTag + "," + p1.ParmNumber + "<>> = " );
					for (Dependency d1 : CV.get(p1)) {
						if(d1.p.TypeTag != null) {
							out.write("<<" + d1.p.ClassName + ":" + d1.p.MethodName + "," + d1.p.TypeTag + "," + d1.p.ParmNumber + ",<" + d1.p.FieldList + ">>," + d1.DependencyValue + "," + d1.ResolvedValue + ">;");
						} else {
							out.write("<<" + p1.ClassName + ":" + p1.MethodName + "," + p1.TypeTag + "," + p1.ParmNumber + ",<" + d1.p.FieldList + ">>," + d1.DependencyValue + "," + d1.ResolvedValue + ">;");	
						}
						//System.out.println(" DEPENDENCY : <<"+ d1.p.EvalStatus + "," + d1.p.ClassName + "," + d1.p.MethodName + "," + d1.p.TypeTag + "," + d1.p.ParmNumber + ",<" +d1.p.FieldList +  ">>," + d1.DependencyValue + "," + d1.ResolvedValue +">" );
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
			System.out.println("Static Analysis is done!");
			System.out.println("Time Taken: " + (analysis_end - analysis_start) / 1000F + " seconds");
			System.out.println("**********************************************************************");
			boolean useNewResolver = true;
			long res_start = System.currentTimeMillis();

	}
}
