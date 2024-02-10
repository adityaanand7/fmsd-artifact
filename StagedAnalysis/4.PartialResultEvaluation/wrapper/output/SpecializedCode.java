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
    System.out.print("  For Program Element = <Static,jgfutil.JGFTimer:start,local1,21,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
    System.out.print("  For Program Element = <Static,moldyn.mdRunner:run,local1,1547,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval3(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFTimer:init,parmtr,1,<null>>");

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
    System.out.print("  For Program Element = <Static,jgfutil.JGFTimer:longprint,local1,78,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
    System.out.print("  For Program Element = <Static,moldyn.random:update,parmtr,1,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval6(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.mdRunner:run,local1,1011,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval7(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.particle:domove,local1,192,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval8(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.mdRunner:run,local1,496,<null>>");

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
    System.out.print("  For Program Element = <Static,moldyn.md:init,local1,8,<null>>");

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
    System.out.print("  For Program Element = <Static,moldyn.mdRunner:init,parmtr,5,<null>>");

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
    System.out.print("  For Program Element = <Static,moldyn.particle:force,local1,500,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval12(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.md:runiters,local1,134,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "start";
      dep1.p.ClassName = "java.lang.Thread";
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
    System.out.print("  For Program Element = <Static,jgfutil.JGFInstrumentor:printHeader,local1,90,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "init";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
      dep2.p.MethodName = "append";
      dep2.p.ClassName = "java.lang.StringBuilder";
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
    System.out.print("  For Program Element = <Static,moldyn.Barrier:init,parmtr,1,<null>>");

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
    System.out.print("  For Program Element = <Static,jgfutil.JGFTimer:print,local1,253,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval16(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFTimer:print,local1,28,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval17(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.mdRunner:init,parmtr,6,<null>>");

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
 public void eval18(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.mdRunner:run,local1,2084,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval19(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.particle:force,local1,330,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval20(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFInstrumentor:addOpsToTimer,local1,45,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval21(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.particle:force,local1,539,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval22(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFTimer:print,local1,241,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval23(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.mdRunner:run,local1,1989,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval24(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.mdRunner:run,local1,680,<null>>");

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
 public void eval25(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFTimer:print,local1,225,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
      dep2.p.MethodName = "init";
      dep2.p.ClassName = "java.lang.StringBuilder";
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
 public void eval26(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.particle:force,local1,44,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval27(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFInstrumentor:printHeader,local1,138,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
      dep2.p.MethodName = "init";
      dep2.p.ClassName = "java.lang.StringBuilder";
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
 public void eval28(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFTimer:print,local1,142,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "toString";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval29(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFTimer:print,local1,180,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval30(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFInstrumentor:printHeader,local1,301,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "toString";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval31(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.particle:init,parmtr,9,<null>>");

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
 public void eval32(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFTimer:longprint,local1,73,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval33(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFInstrumentor:addTimer,local1,24,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval34(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.JGFMolDynBench:JGFvalidate,local1,75,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval35(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.mdRunner:run,local1,1277,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval36(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFInstrumentor:resetTimer,local1,49,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "toString";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval37(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFInstrumentor:stopTimer,local1,44,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval38(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFTimer:print,local1,130,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval39(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFInstrumentor:printHeader,local1,214,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
      dep2.p.MethodName = "init";
      dep2.p.ClassName = "java.lang.StringBuilder";
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
 public void eval40(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFInstrumentor:addTimeToTimer,local1,45,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval41(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.particle:force,local1,49,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval42(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.mdRunner:run,local1,1070,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval43(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.mdRunner:run,local1,2089,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval44(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFInstrumentor:printHeader,local1,223,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval45(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFTimer:printperf,local1,42,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
      dep2.p.MethodName = "init";
      dep2.p.ClassName = "java.lang.StringBuilder";
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
 public void eval46(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.particle:force,local1,464,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval47(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.md:runiters,local1,165,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "run";
      dep1.p.ClassName = "java.lang.Runnable";
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
 public void eval48(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.mdRunner:run,local1,1556,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval49(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.mdRunner:init,parmtr,1,<null>>");

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
 public void eval50(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.particle:domove,parmtr,1,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval51(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.mdRunner:run,local1,2080,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval52(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.particle:force,local1,477,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval53(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFTimer:print,local1,117,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval54(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFTimer:print,local1,17,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
      dep2.p.MethodName = "init";
      dep2.p.ClassName = "java.lang.StringBuilder";
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
 public void eval55(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.mdRunner:run,local1,1333,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval56(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.mdRunner:run,local1,1585,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval57(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.JGFMolDynBench:JGFvalidate,local1,91,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "toString";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval58(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFTimer:print,local1,40,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval59(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.mdRunner:run,local1,1689,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval60(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.mdRunner:run,local1,1079,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval61(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFTimer:print,local1,278,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "toString";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval62(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.particle:force,local1,531,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval63(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.mdRunner:run,local1,1240,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval64(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFInstrumentor:resetTimer,local1,44,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval65(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFInstrumentor:addTimer,local1,24,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval66(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFTimer:longprint,local1,85,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "toString";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval67(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFTimer:print,local1,266,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval68(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFTimer:stop,local1,43,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval69(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.particle:force,local1,325,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval70(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFTimer:longprint,local1,66,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval71(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFInstrumentor:printperfTimer,local1,40,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval72(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.md:runiters,local1,70,<null>>");

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
 public void eval73(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFTimer:print,local1,321,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval74(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.mdRunner:run,local1,1392,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval75(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFTimer:print,local1,193,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval76(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFTimer:print,local1,3,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "equals";
      dep1.p.ClassName = "java.lang.String";
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
 public void eval77(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFTimer:print,local1,205,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval78(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFTimer:print,local1,329,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval79(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.mdRunner:run,parmtr,1,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval80(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.particle:force,local1,338,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval81(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.mdRunner:run,local1,1265,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval82(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.mdRunner:init,parmtr,4,<null>>");

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
 public void eval83(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFInstrumentor:printTimer,local1,49,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "toString";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval84(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFTimer:print,local1,45,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "toString";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval85(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.particle:init,parmtr,1,<null>>");

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
 public void eval86(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFTimer:print,local1,173,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval87(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.mdRunner:run,local1,1973,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval88(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFInstrumentor:printHeader,local1,104,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "toString";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval89(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.mdRunner:run,local1,1977,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval90(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.particle:force,local1,375,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval91(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFTimer:printperf,local1,16,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "init";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
      dep2.p.MethodName = "append";
      dep2.p.ClassName = "java.lang.StringBuilder";
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
 public void eval92(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.particle:force,local1,69,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval93(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.mdRunner:run,local1,853,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval94(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFTimer:stop,local1,34,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "init";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
      dep2.p.MethodName = "append";
      dep2.p.ClassName = "java.lang.StringBuilder";
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
 public void eval95(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.md:init,parmtr,1,<null>>");

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
 public void eval96(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFTimer:print,local1,157,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
      dep2.p.MethodName = "init";
      dep2.p.ClassName = "java.lang.StringBuilder";
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
 public void eval97(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFTimer:init,parmtr,2,<null>>");

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
 public void eval98(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.particle:force,local1,41,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval99(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFTimer:print,local1,261,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval100(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.particle:force,local1,460,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval101(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.particle:force,local1,469,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval102(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFTimer:print,local1,168,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval103(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.md:runiters,local1,186,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "join";
      dep1.p.ClassName = "java.lang.Thread";
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
 public void eval104(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.particle:mkekin,local1,49,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval105(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.particle:mkekin,local1,15,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval106(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFTimer:print,local1,198,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval107(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFInstrumentor:addTimer,local1,33,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "toString";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval108(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.JGFMolDynBench:JGFvalidate,local1,84,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval109(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.mdRunner:run,local1,272,<null>>");

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
 public void eval110(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFInstrumentor:printHeader,local1,123,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval111(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFInstrumentor:printHeader,local1,199,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval112(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFInstrumentor:printHeader,local1,99,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval113(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.JGFMolDynBench:JGFvalidate,local1,53,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "init";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
      dep2.p.MethodName = "append";
      dep2.p.ClassName = "java.lang.StringBuilder";
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
 public void eval114(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFTimer:print,local1,89,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "init";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
      dep2.p.MethodName = "append";
      dep2.p.ClassName = "java.lang.StringBuilder";
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
 public void eval115(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFTimer:print,local1,316,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval116(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFInstrumentor:printHeader,local1,283,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "init";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
      dep2.p.MethodName = "append";
      dep2.p.ClassName = "java.lang.StringBuilder";
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
 public void eval117(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFTimer:printperf,local1,63,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval118(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFInstrumentor:addTimer,local1,33,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "toString";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval119(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFTimer:print,local1,248,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval120(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFInstrumentor:printHeader,local1,268,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "toString";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval121(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFInstrumentor:printHeader,local1,259,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval122(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFInstrumentor:printHeader,local1,47,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval123(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.particle:force,local1,526,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval124(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFInstrumentor:addTimeToTimer,local1,41,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval125(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.mdRunner:run,local1,586,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval126(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.particle:mkekin,local1,32,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval127(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.TournamentBarrier:init,parmtr,1,<null>>");

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
 public void eval128(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFTimer:longprint,local1,26,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "toString";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval129(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFTimer:printperf,local1,29,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "toString";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval130(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFTimer:print,local1,236,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval131(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFTimer:longprint,local1,49,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval132(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFInstrumentor:printHeader,local1,114,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "init";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
      dep2.p.MethodName = "append";
      dep2.p.ClassName = "java.lang.StringBuilder";
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
 public void eval133(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,JGFMolDynBenchSizeA:init,parmtr,1,<null>>");

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
 public void eval134(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFTimer:printperf,local1,6,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "length";
      dep1.p.ClassName = "java.lang.String";
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
 public void eval135(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.particle:force,local1,508,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval136(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFInstrumentor:addTimer,local1,15,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
      dep2.p.MethodName = "init";
      dep2.p.ClassName = "java.lang.StringBuilder";
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
 public void eval137(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFInstrumentor:printHeader,local1,296,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval138(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,JGFMolDynBenchSizeA:main,local1,9,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "parseInt";
      dep1.p.ClassName = "java.lang.Integer";
      dep1.p.TypeTag = "argmnt";
      dep1.p.ParmNumber = "2";
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
 public void eval139(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.mdRunner:run,local1,1231,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval140(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFTimer:init,parmtr,1,<null>>");

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
 public void eval141(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFInstrumentor:addTimer,local1,15,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
      dep2.p.MethodName = "init";
      dep2.p.ClassName = "java.lang.StringBuilder";
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
 public void eval142(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFInstrumentor:printHeader,local1,147,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval143(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFInstrumentor:printHeader,local1,228,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "toString";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval144(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFInstrumentor:addTimer,local1,49,<null>>");

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
 public void eval145(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.particle:force,parmtr,1,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval146(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFInstrumentor:addOpsToTimer,local1,50,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "toString";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval147(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFTimer:printperf,local1,75,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval148(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFInstrumentor:resetTimer,local1,31,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "init";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
      dep2.p.MethodName = "append";
      dep2.p.ClassName = "java.lang.StringBuilder";
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
 public void eval149(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.mdRunner:run,local1,2340,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval150(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.particle:domove,local1,13,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval151(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.particle:velavg,parmtr,1,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval152(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFTimer:print,local1,341,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval153(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFInstrumentor:printHeader,local1,204,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "toString";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval154(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.mdRunner:run,local1,353,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval155(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.mdRunner:run,local1,827,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval156(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.mdRunner:run,local1,1401,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval157(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFInstrumentor:stopTimer,local1,49,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "toString";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval158(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.mdRunner:run,local1,349,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval159(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.mdRunner:run,local1,1116,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval160(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFInstrumentor:readTimer,local1,45,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval161(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFTimer:print,local1,137,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval162(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.mdRunner:run,local1,2666,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval163(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.particle:force,local1,420,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval164(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.mdRunner:run,local1,943,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval165(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFInstrumentor:printTimer,local1,40,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval166(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.particle:force,local1,388,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval167(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFInstrumentor:addOpsToTimer,local1,41,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval168(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFTimer:init,parmtr,3,<null>>");

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
 public void eval169(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.particle:dscal,parmtr,1,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval170(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFTimer:print,local1,112,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval171(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFInstrumentor:startTimer,local1,44,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval172(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.particle:force,local1,383,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval173(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFTimer:printperf,local1,55,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval174(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFTimer:init,parmtr,2,<null>>");

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
 public void eval175(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFInstrumentor:printHeader,local1,152,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "toString";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval176(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFInstrumentor:init,parmtr,1,<null>>");

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
 public void eval177(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFInstrumentor:startTimer,local1,49,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "toString";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval178(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.mdRunner:run,local1,1611,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval179(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFInstrumentor:addTimer,local1,28,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval180(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFInstrumentor:printperfTimer,local1,31,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "init";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
      dep2.p.MethodName = "append";
      dep2.p.ClassName = "java.lang.StringBuilder";
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
 public void eval181(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFTimer:start,local1,12,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "init";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
      dep2.p.MethodName = "append";
      dep2.p.ClassName = "java.lang.StringBuilder";
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
 public void eval182(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.mdRunner:run,local1,1518,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval183(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.random:init,parmtr,1,<null>>");

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
 public void eval184(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFInstrumentor:addTimer,local1,28,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval185(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.mdRunner:run,local1,1994,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval186(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.mdRunner:run,local1,2520,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval187(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.particle:force,local1,321,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval188(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.particle:init,parmtr,8,<null>>");

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
 public void eval189(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.JGFMolDynBench:JGFvalidate,local1,70,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval190(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.particle:force,local1,482,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval191(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFTimer:print,local1,304,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval192(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFInstrumentor:addTimer,local1,49,<null>>");

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
 public void eval193(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.particle:mkekin,parmtr,1,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval194(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.mdRunner:run,local1,2347,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval195(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFTimer:print,local1,100,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval196(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.particle:domove,local1,226,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval197(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFTimer:init,parmtr,1,<null>>");

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
 public void eval198(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFInstrumentor:readTimer,local1,32,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "init";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
      dep2.p.MethodName = "append";
      dep2.p.ClassName = "java.lang.StringBuilder";
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
 public void eval199(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.JGFMolDynBench:JGFvalidate,local1,79,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval200(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.mdRunner:run,local1,1426,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval201(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFInstrumentor:startTimer,local1,40,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval202(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFInstrumentor:stopTimer,local1,40,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval203(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFInstrumentor:addTimer,local1,49,<null>>");

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
 public void eval204(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFInstrumentor:printHeader,local1,52,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "toString";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval205(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.JGFMolDynBench:JGFvalidate,local1,62,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval206(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFInstrumentor:printTimer,local1,44,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval207(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.particle:force,local1,513,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval208(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFInstrumentor:printHeader,local1,292,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval209(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFTimer:printperf,local1,50,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval210(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFInstrumentor:printHeader,local1,263,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval211(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.particle:domove,local1,39,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval212(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFTimer:init,parmtr,2,<null>>");

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
 public void eval213(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFTimer:print,local1,105,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval214(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.particle:mkekin,local1,11,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval215(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFInstrumentor:printHeader,local1,128,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "toString";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval216(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFInstrumentor:stopTimer,local1,31,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "init";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
      dep2.p.MethodName = "append";
      dep2.p.ClassName = "java.lang.StringBuilder";
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
 public void eval217(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFTimer:printperf,local1,68,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval218(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFTimer:print,local1,185,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval219(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFInstrumentor:addTimeToTimer,local1,32,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "init";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
      dep2.p.MethodName = "append";
      dep2.p.ClassName = "java.lang.StringBuilder";
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
 public void eval220(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.mdRunner:run,local1,1762,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval221(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFInstrumentor:printHeader,local1,250,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
      dep2.p.MethodName = "init";
      dep2.p.ClassName = "java.lang.StringBuilder";
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
 public void eval222(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.mdRunner:run,local1,737,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval223(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFInstrumentor:resetTimer,local1,40,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval224(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.mdRunner:run,local1,1576,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval225(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.mdRunner:run,local1,1869,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval226(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFTimer:init,parmtr,3,<null>>");

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
 public void eval227(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.mdRunner:run,local1,2443,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval228(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.mdRunner:run,local1,917,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval229(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.mdRunner:run,local1,1527,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval230(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.particle:domove,local1,61,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval231(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFInstrumentor:readTimer,local1,50,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "toString";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval232(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.mdRunner:run,local1,590,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval233(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFTimer:longprint,local1,21,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval234(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFInstrumentor:addTimer,local1,33,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "toString";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval235(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFInstrumentor:printHeader,local1,190,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "init";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
      dep2.p.MethodName = "append";
      dep2.p.ClassName = "java.lang.StringBuilder";
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
 public void eval236(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFInstrumentor:addTimer,local1,15,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
      dep2.p.MethodName = "init";
      dep2.p.ClassName = "java.lang.StringBuilder";
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
 public void eval237(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,JGFMolDynBenchSizeA:main,local1,47,<null>>");

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
 public void eval238(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFTimer:longprint,local1,14,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval239(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.mdRunner:run,local1,14,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval240(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.particle:force,local1,544,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval241(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.mdRunner:run,local1,1172,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval242(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.mdRunner:run,local1,1438,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval243(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.particle:force,local1,415,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval244(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.particle:domove,local1,17,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval245(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFTimer:stop,local1,50,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval246(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.mdRunner:run,local1,1769,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval247(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.mdRunner:run,local1,763,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval248(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFTimer:print,local1,273,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval249(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFTimer:printperf,local1,80,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "toString";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval250(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.particle:force,local1,495,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval251(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.random:seed,parmtr,1,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval252(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFTimer:print,local1,309,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval253(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFInstrumentor:addTimeToTimer,local1,50,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "toString";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval254(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFInstrumentor:startTimer,local1,31,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
      dep2.p.MethodName = "init";
      dep2.p.ClassName = "java.lang.StringBuilder";
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
 public void eval255(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFTimer:stop,local1,55,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "toString";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval256(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFInstrumentor:printperfTimer,local1,49,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "toString";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval257(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFTimer:print,local1,346,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "toString";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval258(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.particle:domove,local1,209,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval259(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFTimer:start,local1,33,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "toString";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval260(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.mdRunner:run,local1,2360,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval261(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFInstrumentor:readTimer,local1,41,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval262(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.mdRunner:run,local1,1104,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval263(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.particle:force,local1,370,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval264(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.particle:force,local1,428,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval265(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFTimer:print,local1,334,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval266(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.particle:force,local1,343,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval267(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.particle:force,local1,89,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval268(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFInstrumentor:printperfTimer,local1,44,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval269(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFTimer:printperf,local1,24,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval270(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFTimer:start,local1,28,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval271(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFInstrumentor:printHeader,local1,38,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
      dep2.p.MethodName = "init";
      dep2.p.ClassName = "java.lang.StringBuilder";
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
 public void eval272(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFTimer:longprint,local1,5,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "init";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
      dep2.p.MethodName = "append";
      dep2.p.ClassName = "java.lang.StringBuilder";
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
 public void eval273(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFTimer:longprint,local1,54,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval274(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFTimer:longprint,local1,38,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "init";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
      dep2.p.MethodName = "append";
      dep2.p.ClassName = "java.lang.StringBuilder";
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
 public void eval275(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFTimer:print,local1,125,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval276(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.particle:force,local1,433,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval277(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.mdRunner:run,local1,1985,<null>>");

      if(tmpflag) { 
           System.out.println("   The Evaluated result is : D ");
      }
} 
 public void eval278(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFTimer:print,local1,293,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
      dep2.p.MethodName = "init";
      dep2.p.ClassName = "java.lang.StringBuilder";
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
 public void eval279(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.JGFMolDynBench:init,parmtr,1,<null>>");

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
 public void eval280(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFInstrumentor:printTimer,local1,31,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
      dep2.p.MethodName = "init";
      dep2.p.ClassName = "java.lang.StringBuilder";
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
 public void eval281(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFInstrumentor:addTimer,local1,28,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval282(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFTimer:print,local1,33,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval283(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFTimer:print,local1,210,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "toString";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval284(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFInstrumentor:addTimer,local1,24,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval285(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFInstrumentor:addOpsToTimer,local1,32,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "init";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
      dep2.p.MethodName = "append";
      dep2.p.ClassName = "java.lang.StringBuilder";
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
 public void eval286(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,jgfutil.JGFTimer:longprint,local1,61,<null>>");

      Dependency dep1= new Dependency(); 
      dep1.p.EvalStatus = "Dynamic";
      dep1.p.MethodName = "append";
      dep1.p.ClassName = "java.lang.StringBuilder";
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
 public void eval287(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.particle:init,parmtr,11,<null>>");

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
 public void eval288(Map<PE,String> dynamicval) {  
 String res = ""; 
   boolean tmpflag = true;
    System.out.print("  For Program Element = <Static,moldyn.TournamentBarrier:init,local1,17,<null>>");

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