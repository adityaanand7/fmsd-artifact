import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Test  {
  public static void main(String args[]) { 
   boolean tmpflag = true;
      // Reading Partial Result from file
      PE pobj = new PE();
      CV tcvobj = CV.createCV();

      // Reading the partial Result

      try {
         int flag = 1;
         String estatus = "";
         String cname = "";
         String mname = "";
         String ttype = "";
         String pnumber = "";
         String flist = "";
         String dvalue = "";
         String rvalue = "";

         Scanner s = new Scanner(new File("pr.txt"));
         String dep = s.nextLine();
         StringTokenizer multiTokenizer = new StringTokenizer(dep, "⊓,<<,>,>;=: ");
         multiTokenizer.nextToken();
         pobj.EvalStatus = multiTokenizer.nextToken();
         pobj.ClassName = multiTokenizer.nextToken();
         pobj.MethodName = multiTokenizer.nextToken();
         pobj.TypeTag = multiTokenizer.nextToken();
         pobj.ParmNumber = multiTokenizer.nextToken();
         pobj.FieldList = multiTokenizer.nextToken();

         while (multiTokenizer.hasMoreTokens()) {
            //System.out.println("Value Stored1 :" + multiTokenizer.nextToken());
            if (flag == 1) {
               estatus = multiTokenizer.nextToken();
               System.out.println("Value Stored1 :" + estatus);
               flag++;
            }
            else if (flag == 2) {
               cname = multiTokenizer.nextToken();
               System.out.println("Value Stored1 :" + cname);
               flag++;
            }
            else if(flag == 3) {
               mname = multiTokenizer.nextToken();
               System.out.println("Value Stored1 :" + mname);
               flag++;
            }
            else if(flag == 4) {
               ttype = multiTokenizer.nextToken();
               System.out.println("Value Stored1 :" + ttype);
               flag++;
            }
            else if(flag == 5) {
               pnumber = multiTokenizer.nextToken();
               System.out.println("Value Stored1 :" + pnumber);
               flag++;
            }
            else if(flag == 6) {
               flist = multiTokenizer.nextToken();
               System.out.println("Value Stored1 :" + flist);
               flag++;
            }
            else if(flag == 7) {
               dvalue = multiTokenizer.nextToken();
               System.out.println("Value Stored1 :" + dvalue);
               flag++;
            }
            else if(flag == 8) {
               rvalue = multiTokenizer.nextToken();
               System.out.println("Value Stored in rvalue :" + rvalue);
               flag = 1;
               Dependency dtemp2 = new Dependency();
               dtemp2.p.EvalStatus = estatus;
               dtemp2.p.ClassName = cname;
               dtemp2.p.MethodName = mname;
               dtemp2.p.TypeTag = ttype;
               dtemp2.p.ParmNumber = pnumber;
               dtemp2.p.FieldList = flist;
               dtemp2.DependencyValue= dvalue;
               dtemp2.ResolvedValue = rvalue;
               //System.out.println(" Values : "+ dtemp2.p.EvalStatus + ","+ dtemp2.p.MethodName);
               tcvobj.dep.add(dtemp2);
            }
         }
         //System.out.println("Value Stored : "+ cvobj.classmethodname + " " + cvobj.varname + " " + cvobj.CV);
      } catch (IOException e) {
         System.out.println("Error accessing input file!");
      }
      for(Dependency d: tcvobj.dep){
         System.out.println("Dependency : <<"+ d.p.EvalStatus + "," + d.p.ClassName + ":" + d.p.MethodName +
                 "," + d.p.TypeTag + "," + d.p.ParmNumber + "<" + d.p.FieldList+ ">>," + d.ResolvedValue + "," + d.ResolvedValue +  ">;");
      }
     
     Map<PE,String> dynamicval = new HashMap<>();

     BufferedReader br = null;
     // Reading the Dynamic Result
     try {
         File file = new File("DynamicOut.txt"); // java.io.File
         FileReader fr = new FileReader(file); // java.io.FileReader
         br = new BufferedReader(fr); // java.io.BufferedReader
         String line;
         while ((line = br.readLine()) != null) {
            StringTokenizer multiTokenizer = new StringTokenizer(line, "⊓,<<,>,>;=: ");
            PE ptemp = new PE();
            ptemp.EvalStatus = multiTokenizer.nextToken();
            ptemp.ClassName = multiTokenizer.nextToken();
            ptemp.MethodName = multiTokenizer.nextToken();
            ptemp.TypeTag = multiTokenizer.nextToken();
            ptemp.ParmNumber = multiTokenizer.nextToken();
            ptemp.FieldList = multiTokenizer.nextToken();
            String value = multiTokenizer.nextToken();
            dynamicval.put(ptemp,value);
         //System.out.println("Value Stored : "+ cvobj.classmethodname + " " + cvobj.varname + " " + cvobj.CV);
         }

     } catch (IOException e) {
         System.out.println("Error accessing input file!");
      }
     System.out.println("Dynamic Values");
      for(PE p : dynamicval.keySet()){
         System.out.println("For PE : <<"+ p.EvalStatus + "," + p.ClassName + ":" + p.MethodName +
                 "," + p.TypeTag + "," + p.ParmNumber + "<" + p.FieldList+ ">> = " +  dynamicval.get(p));
      }
     
     try {
        for(Dependency d : tcvobj.dep) {
           for(PE p : dynamicval.keySet()) {
              if(p.ClassName.equals(""))
           }
        }
     }
     Dependency dtemp = new Dependency();
     dtemp.p.EvalStatus =
//     try {
//		if (mp1.get(d).equals("E")) {
//			System.out.println("Evaluated Result is : E");
//				tmpflag = false;
//		} else if (mp1.get(d).equals("D")) {
//        }
//      } catch (Exception e) {}
//     try {
//		if (mp1.get(d).equals("E")) {
//			System.out.println("Evaluated Result is : E");
//				tmpflag = false;
//		} else if (mp1.get(d).equals("D")) {
//        }
//      } catch (Exception e) {}
//       if(tmpflag) {
//            System.out.print("Evaluated Result is : D");
//      }
   }
 }

