import syntaxtree.*;
import visitor.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class Main {
   public static void main(String [] args) {
      try {
            Node root = new Mix(System.in).Goal();
            //String str = "String NULL = \"null\";";
            //InputStream is = new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_8));
            //DeclaredAssignmentStatement d = new Mix(is).DeclaredAssignmentStatement();
            //d.accept(new GJDepthFirst(), null);
            root.accept(new GJDepthFirst(), null); // Your assignment part is invoked here.
      }
      catch (ParseException e) {
         System.out.println(e.toString());
      }
   }
} 
