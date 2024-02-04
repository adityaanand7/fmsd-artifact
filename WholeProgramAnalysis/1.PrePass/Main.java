import syntaxtree.*;
import visitor.*;

public class Main {
   public static void main(String [] args) {
      try {
      
            Node root = new PrePass(System.in).Goal();
            root.accept(new GJDepthFirst(), null); // Your assignment part is invoked here.
      }
      catch (ParseException e) {
         System.out.println(e.toString());
      }
   }
} 
