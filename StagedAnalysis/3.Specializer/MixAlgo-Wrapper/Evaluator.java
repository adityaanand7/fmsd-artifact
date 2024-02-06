class Evaluator {
	public static void main(String []args) {
	
		while(this.comparehashmaps(worklist,worklistnew)) {
		     String NULL = "null";
		     String STATIC = "Static";
		     String LOCAL = "local";
		     String ARG = "arg";
		     String FIELD = "field";
		     String RETURN = "ret";
		     String PARAMETER = "parm";
		     String D = "D";
		     String E = "E";
		     
		     for (Dependency ch1 : worklist.keySet()) {
		     	String ch2 = worklist.get(ch1);
		        worklistnew.put(ch1, ch2);
		     }

		     for (Dependency d1 : worklist.keySet()) {
		        CV tmp = new CV();
		        PE tmp1 = d1.p;
		        String tmp2 = tmp1.EvalStatus;
		        boolean tmp100 = tmp2.equals(STATIC);
		        if (tmp100) {
//		           String tmp4 = tmp1.TypeTag;
//				   boolean tmp101 = tmp4.equals(LOCAL);
//		           if (tmp101) {
//		              tmp = this.getdep(parCV, d1);
//		              for (Dependency d : tmp.dep) {
//		                PE tmp6 = d.p;
//		                String tmp7 = tmp6.ClassName;
//		                String tmp8 = tmp6.MethodName;
//		                String tmp9 = tmp6.TypeTag;
//		                String tmp10 = tmp6.ParmNumber;
//		                String tmp11 = tmp1.ClassName;
//		                String tmp12 = tmp1.MethodName;
//		                String tmp13 = tmp1.TypeTag;
//		                String tmp14 = tmp1.ParmNumber;
//		                boolean tmp15 = this.worklistcontains(tempworklistnew, d);
//		                 if (tmp6.equals(tmp10)
//		                         && tmp7.equals(tmp11)
//		                         && tmp8.equals(tmp12)
//		                         && tmp9.equals(tmp13)) {
//		                    tempworklistnew.put(d1, d.ResolvedValue);
//		                 } else if (!tmp15) {
//		                    tempworklistnew.put(d, NULL);
//		                 } else if (tmp15) {
//		                    try {
//		                       String tmp16 = this.getValue(tempworklistnew,d);
//		                       if(tmp16.equals(NULL)) {
//		                          continue;
//		                       } else if(tmp16.equals(D)) {
//		                          String tmp17 = this.getValue(tempworklistnew,d1);
//		                          if(tmp17.equals(NULL)) {
//		                             String tmp18 = d1.DependencyValue;
//		                             if (tmp18.equals(D)) {
//		                                tempworklistnew.put(d1, D);
//		                             } else {
//		                                tempworklistnew.put(d1, D);
//		                             }
//		                          } else if(tmp17.equals(E)) {
//		                             tempworklistnew.put(d1,E);
//		                          }
//		                       }
//		                    } catch (Exception e) { }
//		                 }
//		              }
//		           } else if (tmp4.equals(ARG)) {
//		              boolean flag = false;
//		              for (PE p1 : parCV.keySet()) {
//		                 flag =false;
//		                 PE tmp19 = d1.p;
//		                 String tmp20 = tmp19.ClassName;
//		                 String tmp21 = tmp19.MethodName;
//		                 String tmp22 = tmp19.TypeTag;
//		                 String tmp23 = tmp19.ParmNumber;
//		                 String tmp24 = p1.ClassName;
//		                 String tmp25 = p1.MethodName;
//		                 String tmp26 = p1.ParmNumber;
//		                 if(tmp20.equals(tmp24)
//		                         && tmp21.equals(tmp25)
//		                         && tmp22.equals(PARAMETER)
//		                         && tmp23.equals(tmp26)) {
//		                    flag =true;
//		                 }
//		                 try {
//		                    if (flag) {
//		                       CV tmp27 = parCV.get(p1);
//		                       for (Dependency tmpd1 : tmp27.dep) {
//		                          boolean tmp28 = this.worklistcontains(tempworklistnew, tmpd1) ;
//		                          String tmp29 = tmpd1.ResolvedValue;
//		                          if (!tmp28) {
//		                             tempworklistnew.put(tmpd1, NULL);
//		                          } else if (!tmp29.equals(NULL)) {
//		                             String tmp30 = tempworklistnew.get(tmpd1);
//		                             if (tmp30.equals(E)) {
//		                                tempworklistnew.put(d1, E);
//		                             } else if (tmp30.equals(D)) {
//		                                if (tmp29.equals(D)) {
//		                                   tempworklistnew.put(d1, D);
//		                                } else {
//		                                   tempworklistnew.put(d1, E);
//		                                }
//		                             }
//		                          }
//
//		                       }
//		                    }
//		                 } catch (Exception e) {}
//		              }
//		           } else if (tmp4.equals(PARAMETER)) {
//		              tmp = getdep(parCV, d1);
//		              for (Dependency d : tmp.dep) {
//		                 PE tmp31 = d1.p;
//		                 String tmp32 = tmp31.ClassName;
//		                 String tmp33 = tmp31.MethodName;
//		                 String tmp34 = tmp31.TypeTag;
//		                 String tmp35 = tmp31.ParmNumber;
//		                 PE tmp36 = d.p;
//		                 String tmp37 = tmp36.ClassName;
//		                 String tmp38 = tmp36.MethodName;
//		                 String tmp39 = tmp36.TypeTag;
//		                 String tmp40 = tmp36.ParmNumber;
//		                 boolean tmp41 = this.worklistcontains(tempworklistnew, d);
//		                 if (tmp37.equals(tmp32)
//		                         && tmp38.equals(tmp33)
//		                         && tmp39.equals(tmp34)
//		                         && tmp40.equals(tmp35)) {
//		                    tempworklistnew.put(d1, d.ResolvedValue);
//		                 } else if (!tmp41) {
//		                    tempworklistnew.put(d, NULL);
//		                 }
//		              }
//		              boolean flag = false;
//		              for (PE p1 : parCV.keySet()) {
//		                 flag = false;
//		                 CV tmp51 = parCV.get(p1);
//		                 for (Dependency d2 : tmp51.dep) {
//		                    PE tmp42 = d1.p;
//		                    String tmp43 = tmp42.ClassName;
//		                    String tmp44 = tmp42.MethodName;
//		                    String tmp45 = tmp42.ParmNumber;
//		                    PE tmp46 = d2.p;
//		                    String tmp47 = tmp46.ClassName;
//		                    String tmp48 = tmp46.MethodName;
//		                    String tmp49 = tmp46.TypeTag;
//		                    String tmp50 = tmp46.ParmNumber;
//		                    if (tmp47.equals(tmp43)
//		                            && tmp48.equals(tmp44)
//		                            && tmp50.equals(tmp45)
//		                            && tmp49.equals(ARG)) {
//		                       flag = true;
//		                       break;
//		                    }
//		                 }
//		                 if (flag) {
//		                    for (Dependency tmpd1 : tmp51.dep) {
//		                       PE tmp52 = d1.p;
//		                       String tmp53 = tmp52.ClassName;
//		                       String tmp54 = tmp52.MethodName;
//		                       String tmp55 = tmp52.ParmNumber;
//		                       PE tmp56 = tmpd1.p;
//		                       String tmp57 = tmp56.ClassName;
//		                       String tmp58 = tmp56.MethodName;
//		                       String tmp59 = tmp56.TypeTag;
//		                       String tmp60 = tmp56.ParmNumber;
//		                       boolean tmp61 = this.worklistcontains(tempworklistnew, tmpd1);
//		                       if (tmp57.equals(tmp53)
//		                               && tmp58.equals(tmp54)
//		                               && tmp60.equals(tmp55)
//		                               && tmp59.equals(ARG)) {
//		                          continue;
//		                       } else if (!tmp61) {
//		                          tempworklistnew.put(tmpd1, NULL);
//		                       }
//		                    }
//		                 }
//		              }
//		           } else if (tmp4.equals(FIELD)) {
//		              tmp = getdep(parCV, d1);
//		              for (Dependency d : tmp.dep) {
//		                 PE tmp62 = d.p;
//		                 String tmp63 = tmp62.ClassName;
//		                 String tmp64 = tmp62.MethodName;
//		                 String tmp65 = tmp62.TypeTag;
//		                 String tmp66 = tmp62.ParmNumber;
//		                 PE tmp67 = d1.p;
//		                 String tmp68 = tmp67.ClassName;
//		                 String tmp69 = tmp67.MethodName;
//		                 String tmp70 = tmp67.TypeTag;
//		                 String tmp71 = tmp67.ParmNumber;
//		                 boolean tmp72 = this.worklistcontains(tempworklistnew, d);
//		                 String tmp73 = d.ResolvedValue;
//		                 if (tmp63.equals(tmp68)
//		                         && tmp64.equals(tmp69)
//		                         && tmp65.equals(tmp70)
//		                         && tmp66.equals(tmp71)) {
//		                    tempworklistnew.put(d1, d.ResolvedValue);
//		                 } else if (!tmp72) {
//		                    tempworklistnew.put(d, NULL);
//		                 } else if (!tmp73.equals(NULL)) {
//		                    String tmp74 = tempworklistnew.get(d1);
//		                    if (tmp74.equals(NULL)) {
//		                       tempworklistnew.put(d1, d.ResolvedValue);
//		                    } else if (tmp74.equals(E)) {
//		                       tempworklistnew.put(d1, E);
//		                    } else if (tmp74.equals(D)) {
//		                       if (tmp73.equals(D)) {
//		                          tempworklistnew.put(d1, D);
//		                       } else {
//		                          tempworklistnew.put(d1, E);
//		                       }
//		                    }
//		                 }
//		              }
//		           } else if (tmp4.equals(RETURN)) {
//		              tmp = getdep(parCV, d1);
//		              for (Dependency d : tmp.dep) {
//		                 PE tmp75 = d.p;
//		                 String tmp76 = tmp75.ClassName;
//		                 String tmp77 = tmp75.MethodName;
//		                 String tmp78 = tmp75.TypeTag;
//		                 String tmp79 = tmp75.ParmNumber;
//		                 PE tmp80 = d1.p;
//		                 String tmp81 = tmp80.ClassName;
//		                 String tmp82 = tmp80.MethodName;
//		                 String tmp83 = tmp80.TypeTag;
//		                 String tmp84 = tmp80.ParmNumber;
//		                 boolean tmp85 = this.worklistcontains(tempworklistnew, d);
//		                 String tmp86 = d.ResolvedValue;
//		                 if (tmp76.equals(tmp81)
//		                         && tmp77.equals(tmp82)
//		                         && tmp78.equals(tmp83)
//		                         && tmp79.equals(tmp84)) {
//		                    tempworklistnew.put(d1, d.ResolvedValue);
//		                 } else if (!tmp85) {
//		                    tempworklistnew.put(d, NULL);
//		                 } else if (tmp85) {
//		                    try {
//		                       String tmp87 = this.getValue(tempworklistnew, d);
//		                       if (tmp87.equals(NULL)) {
//		                          continue;
//		                       } else if (tmp87.equals(D)) {
//		                          String tmp88 = this.getValue(tempworklistnew, d1);
//		                          String tmp89 = d1.ResolvedValue;
//		                          String tmp90 = this.getValue(tempworklistnew, d1);
//		                          if (tmp88.equals(NULL)) {
//		                             if (tmp89.equals(D)) {
//		                                tempworklistnew.put(d1, D);
//		                             } else {
//		                                tempworklistnew.put(d1, D);
//		                             }
//		                          } else if (tmp90.equals(E)) {
//		                             tempworklistnew.put(d1, E);
//		                          }
//		                       }
//		                    } catch (Exception e) {}
//		                 }
//		              }
		           }
		        }
	     }
//         for (Dependency ch1 : tempworklistnew.keySet()) {
//            worklist.put(ch1, tempworklistnew.get(ch1));
//         }
   }
}
