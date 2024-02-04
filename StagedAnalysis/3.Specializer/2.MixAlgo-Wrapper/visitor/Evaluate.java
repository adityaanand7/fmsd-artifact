package visitor;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.*;

import syntaxtree.*;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class Evaluate {
    public void Eval(DeclaredAssignmentStatement p1, GJDepthFirst vis, Map<Dependency, String> worklist, Result r, Env e) {
        //System.out.println("Reached Here : " + p1.f0.accept(vis, null) + " " + p1.f1.accept(vis, null) + " " + p1.f3.accept(vis, null));
        String var = (String) p1.f1.accept(vis, null);
        String type = (String) p1.f0.accept(vis, null);
        String iden = (String) p1.f1.accept(vis, null);
        if (p1.f3.f0.choice instanceof MessageSend) {
            //System.out.println("It is a message send statement");
            Object name = ((MessageSend) p1.f3.f0.choice).f0.accept(vis, null);
            Object func = ((MessageSend) p1.f3.f0.choice).f2.accept(vis, null);
            Object parm = ((MessageSend) p1.f3.f0.choice).f4.accept(vis, null);
            if (func.equals("get")) {
                if (name.toString().equals("worklist")) {
                    String temp = worklist.get(parm);
                    //System.out.println("Parm value : "+ temp );
                    e.localvar.put(var, temp);
                }
            } else if (func.equals("equals")) {
                //System.out.println("Name : " + name + "Parameter : " +parm);
                //System.out.println("Name : " + e.localvar.get(name) + "Parameter : " + r.globalvariable.get(parm));
                if (e.localvar.get(name).equals(r.globalvariable.get(parm))) {
                    e.localvar.put(iden, true);
                    //System.out.println("Value found in globalstack: stored as " + iden + " with value :" + true);
                } else if (e.localvar.get(name).equals(e.localvar.get(parm))) {
                    e.localvar.put(iden, true);
                    //System.out.println("Value found in localstack: stored as " + iden + "with value " + true);
                } else {
                    e.localvar.put(iden, false);
                }
            }
            //System.out.println("Object : "+ name +" " +func + "" +parm + " "+ var);
            //String val = name.func(parm);
//            System.out.println(((MessageSend) p1.f3.f0.choice).f0.accept(vis, null));
//            System.out.println(((MessageSend) p1.f3.f0.choice).f2.accept(vis, null));
//            System.out.println(((MessageSend) p1.f3.f0.choice).f4.accept(vis, null));

        } else if (p1.f3.f0.choice instanceof PrimaryExpression) {
            if (((PrimaryExpression) p1.f3.f0.choice).f0.choice instanceof AllocationExpression) {
                //System.out.println("It is an allocation statement");
                //System.out.println("Statement has type :" + type + " and var name: " + iden);
                if (type.equals("CV")) {
                    //System.out.println("CV Object created and stored.");
                    CV tempcv = new CV();
                    e.localvar.put(iden, tempcv);
                }
            }
        } else if (p1.f3.f0.choice instanceof FieldLookup) {
            //System.out.println("It is a Field Lookup statment");
            String tempiden = ((FieldLookup) p1.f3.f0.choice).f0.f0.toString();
            String field = ((FieldLookup) p1.f3.f0.choice).f2.f0.toString();
            //System.out.println("We are looking for Field : " + tempiden);
            //System.out.println("Current table status");
            for (String s : e.localvar.keySet()) {
                //System.out.println("String : " + s + "Value --> " + e.localvar.get(s));
            }
            Object temp2 = e.localvar.get(tempiden);
            //System.out.println("Value from the table :" + temp2);
            if (temp2 instanceof Dependency && field.equals("p")) {
                e.localvar.put(iden, ((Dependency) temp2).p);
                //System.out.println("Putting :" + iden + "with value :" + ((Dependency) temp2).p);
            } else if (temp2 instanceof PE && field.equals("EvalStatus")) {
                e.localvar.put(iden, ((PE) temp2).EvalStatus);
                //System.out.println("Putting :" + iden + "with value :" + ((PE) temp2).EvalStatus);
            } else if (temp2 instanceof PE && field.equals("TypeTag")) {
                e.localvar.put(iden, ((PE) temp2).TypeTag);
                //System.out.println("Putting :" + iden + "with value :" + ((PE) temp2).TypeTag);
            }
        }
    }

    public void Eval(MessageSendStmt p1, GJDepthFirst vis, Map<Dependency, String> wl, Result r, Env e) {
        //System.out.println("Reached Here in Message Send Stmt: " + p1.f0.accept(vis, null) + " " + p1.f1.accept(vis, null));
        //System.out.println("Inside message send");
        Object name = p1.f0.f0.accept(vis, null);
        Object func = p1.f0.f2.accept(vis, null);
        String parm = (String) p1.f0.f4.accept(vis, null);
        String a[] = parm.split(",");
        if (name.toString().equals("worklistnew")) {
            //System.out.println("Hello");
            if (func.equals("put")) {
                String val2 = (String) e.localvar.get(a[1]);
                if (e.localvar.get(a[0]) instanceof Dependency) {
                    wl.put((Dependency) e.localvar.get(a[0]), val2);
                }
//                System.out.println("Parm value : "+ temp );
//                e.localvar.put(var,temp);
            }
        }
        //System.out.println("Object : "+ name +" " +func + " " +parm);
        //String val = name.func(parm);
//            System.out.println(((MessageSend) p1.f3.f0.choice).f0.accept(vis, null));
//            System.out.println(((MessageSend) p1.f3.f0.choice).f2.accept(vis, null));
//            System.out.println(((MessageSend) p1.f3.f0.choice).f4.accept(vis, null));

    }

    public boolean Eval(IfStatement p1, GJDepthFirst vis, Map<Dependency, String> wl, Result r, Env e) {
        //System.out.println("It is an if statement statement");
        String name = (String) p1.f0.choice.accept(vis, null);
        //System.out.println("Condition in  if " + name + " evaluates to : " + e.localvar.get(name));
        if (e.localvar.get(name).toString().equals("true")) {
            //System.out.println("Returned true");
            return true;
        }
        return false;

//    public <R, A> void Eval(R accept, Map<Dependency, String> worklist, Map<String, String> varlist, Dependency d) {
//        if(accept.toString().contains(" = ") && accept.toString().contains("get")) {
//                String ch2 = worklist.get(d);
//                varlist.put("ch2",ch2);
//        } else if(accept.toString().contains(""))
//        System.out.println("Accept "+ accept + " : "+ accept.toString().toCharArray());
//    }
    }

    public void copy(Result r, Dependency d, BufferedWriter bw, int count) {
        //System.out.println("$$$$$$$$$$ Reached in copy");

        String code =
                "\n      Dependency dep"+ count + "= new Dependency(); \n";
        code+=  "      dep"+count+".p.EvalStatus = \""+ d.p.EvalStatus +"\";";
        code+=  "\n      dep"+count+".p.MethodName = \""+ d.p.MethodName +"\";";
        code+=  "\n      dep"+count+".p.ClassName = \""+ d.p.ClassName +"\";";
        code+=  "\n      dep"+count+".p.TypeTag = \""+ d.p.TypeTag +"\";";
        code+=  "\n      dep"+count+".p.ParmNumber = \""+ d.p.ParmNumber +"\";";
        code+=  "\n      dep"+count+".p.FieldList = \""+ d.p.FieldList +"\";";
        code+=  "\n      dep"+count+".DependencyValue = \""+ d.DependencyValue +"\";";
        code+=  "\n      dep"+count+".ResolvedValue = \""+ d.ResolvedValue +"\";";
        code+=        "\n      for(PE p : dynamicval.keySet()){\n" +
                "          if(p.ClassName.equals(dep"+count+ ".p.ClassName)\n" +
                "          && p.MethodName.equals(dep"+count+".p.MethodName)\n" +
                "          && p.ParmNumber.equals(dep"+count+".p.ParmNumber)\n" +
                "          && p.TypeTag.equals(dep"+count++ +".p.TypeTag)) {\n" +
                "              if(dynamicval.get(p).equals(\"E\")){\n" +
                "                  System.out.println(\"Evaluated Result is : E\");\n" +
                "                  tmpflag = false;\n" +
                "                  System.exit(0);\n" +
                "                  break;\n" +
                "              } else if(dynamicval.get(p).equals(\"D\")) {\n" +
                "                  res += \"D\";\n" +
                "                  tmpflag = true;\n" +
                "              } else {\n" +
                "                  res += \"D\";\n" +
                "                  tmpflag = true;\n" +
                "              }\n" +
                "          }\n" +
                "      }";
        r.code.add(code);
        try {
            bw.write(code);
            bw.flush();
        } catch (Exception e) {}
//        if(d.p.TypeTag.equals("local")) {
//            r.code.add(
//            "tmp = getdep(parCV, d1); \n"+
//            "for (Dependency d : tmp.dep) { \n" +
//                "if (d.p.ClassName.equals(d1.p.ClassName) \n"+
//                        "&& d.p.MethodName.equals(d1.p.MethodName) \n" +
//                        "&& d.p.TypeTag.equals(d1.p.TypeTag) \n" +
//                        "&& d.p.ParmNumber.equals(d1.p.ParmNumber)) { \n " +
//                    " tempworklistnew.put(d1, d.ResolvedValue); \n" +
//                " } else if (!worklistcontains(tempworklistnew, d)) { \n " +
//                   " tempworklistnew.put(d, \"null\"); \n " +
//               " } else if (worklistcontains(tempworklistnew, d)) { \n " +
//                   " try { \n " +
//                        " if(getValue(tempworklistnew,d).equals(\"null\")) { \n "+
//                         "   continue; \n" +
//                        " } else if(getValue(tempworklistnew,d).equals(\"D\")) { \n "+
//                          "  if(getValue(tempworklistnew,d1).equals(\"null\")) { \n "+
//                           "     if (d1.ResolvedValue.equals(\"D\")) { \n" +
//                            "        tempworklistnew.put(d1, \"D \"); \n "+
//                            "    } else { \n" +
//                             "       tempworklistnew.put(d1, \"D\"); \n"+
//                        "        } \n" +
//                         "   } else if(getValue(tempworklistnew,d1).equals(\"E\")) { \n" +
//                         "       tempworklistnew.put(d1,\"E\"); \n"+
//                         "   } \n"+
//                    "    } \n"+
//                "  } catch (Exception e) { System.out.println(\"Exception caused 2\"+ e + \"due to :\" + d.p.ClassName + \" \"+ d.p.MethodName + \" \"+ d.p.TypeTag + \" \"+ d.p.ParmNumber) ;} \n"+
//              "  } \n "+
//            "} " );
//            try {
//
//                bw.write(
//                "tmp = getdep(parCV, d1); \n"+
//                        "for (Dependency d : tmp.dep) { \n" +
//                        "if (d.p.ClassName.equals(d1.p.ClassName) \n"+
//                        "&& d.p.MethodName.equals(d1.p.MethodName) \n" +
//                        "&& d.p.TypeTag.equals(d1.p.TypeTag) \n" +
//                        "&& d.p.ParmNumber.equals(d1.p.ParmNumber)) { \n " +
//                        " tempworklistnew.put(d1, d.ResolvedValue); \n" +
//                        " } else if (!worklistcontains(tempworklistnew, d)) { \n " +
//                        " tempworklistnew.put(d, \"null\"); \n " +
//                        " } else if (worklistcontains(tempworklistnew, d)) { \n " +
//                        " try { \n " +
//                        " if(getValue(tempworklistnew,d).equals(\"null\")) { \n "+
//                        "   continue; \n" +
//                        " } else if(getValue(tempworklistnew,d).equals(\"D\")) { \n "+
//                        "  if(getValue(tempworklistnew,d1).equals(\"null\")) { \n "+
//                        "     if (d1.ResolvedValue.equals(\"D\")) { \n" +
//                        "        tempworklistnew.put(d1, \"D \"); \n "+
//                        "    } else { \n" +
//                        "       tempworklistnew.put(d1, \"D\"); \n"+
//                        "        } \n" +
//                        "   } else if(getValue(tempworklistnew,d1).equals(\"E\")) { \n" +
//                        "       tempworklistnew.put(d1,\"E\"); \n"+
//                        "   } \n"+
//                        "    } \n"+
//                        "  } catch (Exception e) { System.out.println(\"Exception caused 2\"+ e + \"due to :\" + d.p.ClassName + \" \"+ d.p.MethodName + \" \"+ d.p.TypeTag + \" \"+ d.p.ParmNumber) ;} \n"+
//                        "  } \n "+
//                        "} "
//                );
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//
//
//        } else if(d.p.TypeTag.equals("arg")) {
//             r.code.add(
//            "  boolean flag = false; \n" +
//          "    for (PE p1 : parCV.keySet()) { \n" +
//          "       flag =false; \n" +
//          "       if(d1.p.ClassName.equals(p1.ClassName) \n" +
//          "               && d1.p.MethodName.equals(p1.MethodName) \n" +
//          "               && p1.TypeTag.equals(\"parm\") \n" +
//          "               && d1.p.ParmNumber.equals(p1.ParmNumber)) { \n" +
//          "          flag =true; \n" +
//          "       } \n" +
//          "       try { \n" +
//          "          if (flag) { \n" +
//          "             for (Dependency tmpd1 : parCV.get(p1).dep) { \n" +
//          "                if (!worklistcontains(tempworklistnew, tmpd1)) { \n" +
//          "                   tempworklistnew.put(tmpd1, \"null\"); \n" +
//          "                } else if (!tmpd1.ResolvedValue.equals(\"null\")) { \n" +
//          "                   if (tempworklistnew.get(tmpd1).equals(\"E\")) { \n" +
//          "                      tempworklistnew.put(d1, \"E\"); \n" +
//          "                   } else if (tempworklistnew.get(tmpd1).equals(\"D\")) { \n" +
//          "                      if (d1.ResolvedValue.equals(\"D\")) { \n" +
//          "                         tempworklistnew.put(d1, \"D\"); \n" +
//          "                      } else { \n" +
//          "                         tempworklistnew.put(d1, \"E\"); \n" +
//          "                      } \n" +
//          "                   } \n" +
//          "                } \n" +
//          "             } \n" +
//          "          } \n" +
//          "       } catch (Exception e) {} \n" +
//          "    } \n"
//                     );
//            try {
//
//            bw.write( "  boolean flag = false; \n" +
//                        "    for (PE p1 : parCV.keySet()) { \n" +
//                        "       flag =false; \n" +
//                        "       if(d1.p.ClassName.equals(p1.ClassName) \n" +
//                        "               && d1.p.MethodName.equals(p1.MethodName) \n" +
//                        "               && p1.TypeTag.equals(\"parm\") \n" +
//                        "               && d1.p.ParmNumber.equals(p1.ParmNumber)) { \n" +
//                        "          flag =true; \n" +
//                        "       } \n" +
//                        "       try { \n" +
//                        "          if (flag) { \n" +
//                        "             for (Dependency tmpd1 : parCV.get(p1).dep) { \n" +
//                        "                if (!worklistcontains(tempworklistnew, tmpd1)) { \n" +
//                        "                   tempworklistnew.put(tmpd1, \"null\"); \n" +
//                        "                } else if (!tmpd1.ResolvedValue.equals(\"null\")) { \n" +
//                        "                   if (tempworklistnew.get(tmpd1).equals(\"E\")) { \n" +
//                        "                      tempworklistnew.put(d1, \"E\"); \n" +
//                        "                   } else if (tempworklistnew.get(tmpd1).equals(\"D\")) { \n" +
//                        "                      if (d1.ResolvedValue.equals(\"D\")) { \n" +
//                        "                         tempworklistnew.put(d1, \"D\"); \n" +
//                        "                      } else { \n" +
//                        "                         tempworklistnew.put(d1, \"E\"); \n" +
//                        "                      } \n" +
//                        "                   } \n" +
//                        "                } \n" +
//                        "             } \n" +
//                        "          } \n" +
//                        "       } catch (Exception e) {} \n" +
//                        "    } \n"
//                );
//
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        } else if(d.p.TypeTag.equals("parm")) {
//            String parmcode =           "    tmp = getdep(parCV, d1); \n" +
//                    "    for (Dependency d : tmp.dep) { \n" +
//                    "       if (d.p.ClassName.equals(d1.p.ClassName) \n" +
//                    "               && d.p.MethodName.equals(d1.p.MethodName) \n" +
//                    "               && d.p.TypeTag.equals(d1.p.TypeTag) \n" +
//                    "               && d.p.ParmNumber.equals(d1.p.ParmNumber)) { \n" +
//                    "          tempworklistnew.put(d1, d.ResolvedValue); \n" +
//                    "       } else if (!worklistcontains(tempworklistnew, d)) { \n" +
//                    "          tempworklistnew.put(d, \"null\"); \n" +
//                    "       } \n" +
//                    "    } \n" +
//                    "    boolean flag = false; \n" +
//                    "    for (PE p1 : parCV.keySet()) { \n" +
//                    "       flag = false; \n" +
//                    "       for (Dependency tmpd1 : parCV.get(p1).dep) { \n" +
//                    "          if (tmpd1.p.ClassName.equals(d1.p.ClassName) \n" +
//                    "                  && tmpd1.p.MethodName.equals(d1.p.MethodName) \n" +
//                    "                  && tmpd1.p.ParmNumber.equals(d1.p.ParmNumber) \n" +
//                    "                  && tmpd1.p.TypeTag.equals(\"arg\")) { \n" +
//                    "             flag = true; \n" +
//                    "             break; \n" +
//                    "          } \n" +
//                    "       } \n" +
//                    "       if (flag) { \n" +
//                    "          for (Dependency tmpd1 : parCV.get(p1).dep) { \n" +
//                    "             if (tmpd1.p.ClassName.equals(d1.p.ClassName) \n" +
//                    "                     && tmpd1.p.MethodName.equals(d1.p.MethodName) \n" +
//                    "                     && tmpd1.p.ParmNumber.equals(d1.p.ParmNumber) \n" +
//                    "                     && tmpd1.p.TypeTag.equals(\"arg\")) { \n" +
//                    "                continue; \n" +
//                    "             } else if (!worklistcontains(tempworklistnew, tmpd1)) { \n" +
//                    "                tempworklistnew.put(tmpd1, \"null\"); \n" +
//                    "             } \n" +
//                    "          } \n" +
//                    "       } \n" +
//                    "    } \n";
//            r.code.add(parmcode);
//
//            try {
//                System.out.println("Reaching Here");
//                bw.write(parmcode);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//
//        } else if(d.p.TypeTag.equals("ret")) {
//            r.code.add(
//           " tmp = getdep(parCV, d1); \n" +
//           "         for (Dependency d : tmp.dep) { \n" +
//           "            if (d.p.ClassName.equals(d1.p.ClassName) \n" +
//           "                    && d.p.MethodName.equals(d1.p.MethodName) \n" +
//           "                    && d.p.TypeTag.equals(d1.p.TypeTag) \n" +
//           "                    && d.p.ParmNumber.equals(d1.p.ParmNumber)) { \n" +
//           "               tempworklistnew.put(d1, d.ResolvedValue); \n" +
//           "            } else if (!worklistcontains(tempworklistnew, d)) { \n" +
//           "               tempworklistnew.put(d, \"null\"); \n" +
//           "            } else if (worklistcontains(tempworklistnew, d)) { \n" +
//           "               try { \n" +
//           "                  if (getValue(tempworklistnew, d).equals(\"null\")) { \n" +
//           "                     continue; \n" +
//           "                  } else if (getValue(tempworklistnew, d).equals(\"D\")) { \n" +
//           "                     if (getValue(tempworklistnew, d1).equals(\"null\")) { \n" +
//           "                        if (d1.ResolvedValue.equals(\"D\")) { \n" +
//           "                           tempworklistnew.put(d1, \"D\"); \n" +
//           "                        } else { \n" +
//           "                           tempworklistnew.put(d1, \"D\"); \n" +
//           "                        } \n" +
//           "                     } else if (getValue(tempworklistnew, d1).equals(\"E\")) { \n" +
//           "                        tempworklistnew.put(d1, \"E\"); \n" +
//           "                     } \n" +
//           "                  } \n" +
//           "               } catch (Exception e) { \n" +
//           "                  System.out.println(\"Exception caused 2\" + e + \"due to :\" + d.p.ClassName + \" \" + d.p.MethodName + \" \" + d.p.TypeTag + \" \" + d.p.ParmNumber); \n" +
//           "               } \n" +
//           "            } \n" +
//           "         } \n"
//                     );
//            try {
//                bw.write(           " tmp = getdep(parCV, d1); \n" +
//                        "         for (Dependency d : tmp.dep) { \n" +
//                        "            if (d.p.ClassName.equals(d1.p.ClassName) \n" +
//                        "                    && d.p.MethodName.equals(d1.p.MethodName) \n" +
//                        "                    && d.p.TypeTag.equals(d1.p.TypeTag) \n" +
//                        "                    && d.p.ParmNumber.equals(d1.p.ParmNumber)) { \n" +
//                        "               tempworklistnew.put(d1, d.ResolvedValue); \n" +
//                        "            } else if (!worklistcontains(tempworklistnew, d)) { \n" +
//                        "               tempworklistnew.put(d, \"null\"); \n" +
//                        "            } else if (worklistcontains(tempworklistnew, d)) { \n" +
//                        "               try { \n" +
//                        "                  if (getValue(tempworklistnew, d).equals(\"null\")) { \n" +
//                        "                     continue; \n" +
//                        "                  } else if (getValue(tempworklistnew, d).equals(\"D\")) { \n" +
//                        "                     if (getValue(tempworklistnew, d1).equals(\"null\")) { \n" +
//                        "                        if (d1.ResolvedValue.equals(\"D\")) { \n" +
//                        "                           tempworklistnew.put(d1, \"D\"); \n" +
//                        "                        } else { \n" +
//                        "                           tempworklistnew.put(d1, \"D\"); \n" +
//                        "                        } \n" +
//                        "                     } else if (getValue(tempworklistnew, d1).equals(\"E\")) { \n" +
//                        "                        tempworklistnew.put(d1, \"E\"); \n" +
//                        "                     } \n" +
//                        "                  } \n" +
//                        "               } catch (Exception e) { \n" +
//                        "                  System.out.println(\"Exception caused 2\" + e + \"due to :\" + d.p.ClassName + \" \" + d.p.MethodName + \" \" + d.p.TypeTag + \" \" + d.p.ParmNumber); \n" +
//                        "               } \n" +
//                        "            } \n" +
//                        "         } \n"
//
//                );
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        } else if(d.p.TypeTag.equals("field")){
//            r.code.add(
//       "       tmp = getdep(parCV, d1); \n" +
//       "       for (Dependency d : tmp.dep) { \n" +
//       "          if (d.p.ClassName.equals(d1.p.ClassName) \n" +
//       "                  && d.p.MethodName.equals(d1.p.MethodName) \n" +
//       "                 && d.p.TypeTag.equals(d1.p.TypeTag) \n" +
//       "                 && d.p.ParmNumber.equals(d1.p.ParmNumber)) { \n" +
//       "             tempworklistnew.put(d1, d.ResolvedValue); \n" +
//       "             //System.out.println(\"Entered 1 arg for : \" + d.p.ClassName + \" \"+ d.p.MethodName); \n"+
//       "          } else if (!worklistcontains(tempworklistnew, d)) { \n" +
//       "             tempworklistnew.put(d, \"null\"); \n" +
//       "             //System.out.println(\"Entered 2 arg for : \"+ d.p.ClassName + \" \"+ d.p.MethodName); \n "+
//       "          } else if (!d.ResolvedValue.equals(\"null\")) { \n" +
//       "             if (tempworklistnew.get(d1).equals(\"null\")) { \n" +
//       "            tempworklistnew.put(d1, d.ResolvedValue); \n" +
//       "         } else if (tempworklistnew.get(d1).equals(\"E\")) { \n" +
//       "             tempworklistnew.put(d1, \"E\"); \n" +
//       "           } else if (tempworklistnew.get(d1).equals(\"D\")) { \n" +
//       "               if (d1.ResolvedValue.equals(\"D\")) { \n" +
//       "                   tempworklistnew.put(d1, \"D\"); \n" +
//       "                 } else { \n" +
//       "               tempworklistnew.put(d1, \"E\"); \n" +
//       "             } \n" +
//       "           } \n" +
//       "         } \n" +
//       "      } \n"
//         );
//            try {
//                bw.write(
//                        "       tmp = getdep(parCV, d1); \n" +
//                                "       for (Dependency d : tmp.dep) { \n" +
//                                "          if (d.p.ClassName.equals(d1.p.ClassName) \n" +
//                                "                  && d.p.MethodName.equals(d1.p.MethodName) \n" +
//                                "                 && d.p.TypeTag.equals(d1.p.TypeTag) \n" +
//                                "                 && d.p.ParmNumber.equals(d1.p.ParmNumber)) { \n" +
//                                "             tempworklistnew.put(d1, d.ResolvedValue); \n" +
//                                "             //System.out.println(\"Entered 1 arg for : \" + d.p.ClassName + \" \"+ d.p.MethodName); \n"+
//                                "          } else if (!worklistcontains(tempworklistnew, d)) { \n" +
//                                "             tempworklistnew.put(d, \"null\"); \n" +
//                                "             //System.out.println(\"Entered 2 arg for : \"+ d.p.ClassName + \" \"+ d.p.MethodName); \n "+
//                                "          } else if (!d.ResolvedValue.equals(\"null\")) { \n" +
//                                "             if (tempworklistnew.get(d1).equals(\"null\")) { \n" +
//                                "            tempworklistnew.put(d1, d.ResolvedValue); \n" +
//                                "         } else if (tempworklistnew.get(d1).equals(\"E\")) { \n" +
//                                "             tempworklistnew.put(d1, \"E\"); \n" +
//                                "           } else if (tempworklistnew.get(d1).equals(\"D\")) { \n" +
//                                "               if (d1.ResolvedValue.equals(\"D\")) { \n" +
//                                "                   tempworklistnew.put(d1, \"D\"); \n" +
//                                "                 } else { \n" +
//                                "               tempworklistnew.put(d1, \"E\"); \n" +
//                                "             } \n" +
//                                "           } \n" +
//                                "         } \n" +
//                                "      } \n"
//                );
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
    }
}
//    }
//        //r.code.add("Hello");
//}
