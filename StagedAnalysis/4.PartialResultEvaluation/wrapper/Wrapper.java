import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Wrapper {
    public static void main(String args[]) {
        Map<PE,String> dynamicval = new HashMap<>();

        // Reading the Dynamic Result
        try {
            File file = new File("DynamicOut.txt"); // java.io.File
            FileReader fr = new FileReader(file); // java.io.FileReader
            BufferedReader br = new BufferedReader(fr); // java.io.BufferedReader
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

//        for(PE p :dynamicval.keySet()) {
//            System.out.println("PE value :"+ p.EvalStatus + ","+ p.ClassName + ":" + p.MethodName + ","+ p.TypeTag + ","+ p.ParmNumber);
//        }
        try {
            SpecializedCode s = new SpecializedCode();
            Class cls = s.getClass();
            Method[] methods = cls.getDeclaredMethods();
            for (Method m : methods) {
                m.invoke(s, dynamicval);
            }
        } catch (Exception e) {e.printStackTrace();}
    }
}
