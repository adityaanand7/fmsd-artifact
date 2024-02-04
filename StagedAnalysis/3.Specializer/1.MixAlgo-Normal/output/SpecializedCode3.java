import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;
 
public class SpecializedCode3 {
  public static void main(String args[]) { 
  String res = ""; 
   boolean tmpflag = true;
      // Reading Partial Result from file
     PE pobj = new PE();
     System.out.print("  For Program Element = <Static,Main:main,local1,37,<null>>");
     CV tcvobj = CV.createCV();
     Map<PE,String> dynamicval = new HashMap<>();

     BufferedReader br = null;
     // Reading the Dynamic Result
     try {
         File file = new File("DynamicOut.txt"); // java.io.File
         FileReader fr = new FileReader(file); // java.io.FileReader
         br = new BufferedReader(fr); // java.io.BufferedReader
         String line;
         while ((line = br.readLine()) != null) {
            StringTokenizer multiTokenizer = new StringTokenizer(line, "^,<<,>,>;=: ");
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

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "size";
      dep1.p.ClassName = "java.util.ArrayList";
      dep1.p.TypeTag = "argmnt";
      dep1.p.ParmNumber = "1";
      dep1.p.FieldList = "null";
      dep1.DependencyValue = "D";
      dep1.ResolvedValue = "D";
      for(PE p : dynamicval.keySet()){
          if(p.ClassName.equals(dep1.p.ClassName)
          && p.MethodName.equals(dep1.p.MethodName)
          && p.ParmNumber.equals(dep1.p.ParmNumber)
          && p.TypeTag.equals(dep1.p.TypeTag)) {
              if(dynamicval.get(p).equals("E")){
                  System.out.print("Evaluated Result is : E");
                  tmpflag = false;
                  System.exit(0);
                  break;
              } else if(dynamicval.get(p).equals("D")) {
                  res += "D";
                  tmpflag = true;
              } else {
                  res += "D";
                  tmpflag = true;
              }
          }
      }
      Dependency dep2= new Dependency(); 
      dep2.p.EvalStatus = "Dynamic";
      dep2.p.MethodName = "init";
      dep2.p.ClassName = "java.util.ArrayList";
      dep2.p.TypeTag = "argmnt";
      dep2.p.ParmNumber = "1";
      dep2.p.FieldList = "null";
      dep2.DependencyValue = "D";
      dep2.ResolvedValue = "D";
      for(PE p : dynamicval.keySet()){
          if(p.ClassName.equals(dep2.p.ClassName)
          && p.MethodName.equals(dep2.p.MethodName)
          && p.ParmNumber.equals(dep2.p.ParmNumber)
          && p.TypeTag.equals(dep2.p.TypeTag)) {
              if(dynamicval.get(p).equals("E")){
                  System.out.print("Evaluated Result is : E");
                  tmpflag = false;
                  System.exit(0);
                  break;
              } else if(dynamicval.get(p).equals("D")) {
                  res += "D";
                  tmpflag = true;
              } else {
                  res += "D";
                  tmpflag = true;
              }
          }
      }  
       if(tmpflag) {
            System.out.println("   Evaluated Result is : D");
      } 
   } 
 } 