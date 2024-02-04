import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;
 
public class SpecializedCode {
 public void eval1(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,Main:foo,local1,10,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "init";
      dep1.p.ClassName = "java.lang.Object";
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
                  System.out.println("Evaluated Result is : E");
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
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval2(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,Main:foo,local1,18,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "init";
      dep1.p.ClassName = "java.lang.Object";
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
                  System.out.println("Evaluated Result is : E");
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
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval3(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,Main:foo,local1,2,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "init";
      dep1.p.ClassName = "java.lang.Object";
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
                  System.out.println("Evaluated Result is : E");
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
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval4(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,Main:foobar,local1,16,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "init";
      dep1.p.ClassName = "java.lang.Object";
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
                  System.out.println("Evaluated Result is : E");
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
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval5(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,Main:init,parmtr,1,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "init";
      dep1.p.ClassName = "java.lang.Object";
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
                  System.out.println("Evaluated Result is : E");
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
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval6(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,Main:main,local1,18,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "init";
      dep1.p.ClassName = "java.lang.Object";
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
                  System.out.println("Evaluated Result is : E");
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
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval7(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,B:init,parmtr,1,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "init";
      dep1.p.ClassName = "java.lang.Object";
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
                  System.out.println("Evaluated Result is : E");
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
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval8(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,Main:main,local1,10,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "init";
      dep1.p.ClassName = "java.lang.Object";
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
                  System.out.println("Evaluated Result is : E");
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
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval9(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,Main:foobar,local1,7,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "init";
      dep1.p.ClassName = "java.lang.Object";
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
                  System.out.println("Evaluated Result is : E");
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
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval10(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,Main:init,local1,7,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "init";
      dep1.p.ClassName = "java.lang.Object";
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
                  System.out.println("Evaluated Result is : E");
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
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval11(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,B:bar,local1,2,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "init";
      dep1.p.ClassName = "java.lang.Object";
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
                  System.out.println("Evaluated Result is : E");
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
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval12(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,Main:main,local1,2,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "init";
      dep1.p.ClassName = "java.lang.Object";
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
                  System.out.println("Evaluated Result is : E");
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
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval13(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,Main:main,local1,37,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "init";
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
                  System.out.println("Evaluated Result is : E");
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
      dep2.p.MethodName = "size";
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
                  System.out.println("Evaluated Result is : E");
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
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval14(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,C:init,parmtr,1,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "init";
      dep1.p.ClassName = "java.lang.Object";
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
                  System.out.println("Evaluated Result is : E");
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
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval15(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,Main:foo,local1,33,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "init";
      dep1.p.ClassName = "java.lang.Object";
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
                  System.out.println("Evaluated Result is : E");
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
           System.out.println("   The Evaluated result is : D ");
      }
} 
}