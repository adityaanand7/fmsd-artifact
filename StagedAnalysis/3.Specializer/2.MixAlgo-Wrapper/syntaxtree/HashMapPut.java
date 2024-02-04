//
// Generated by JTB 1.3.2
//

package syntaxtree;

import visitor.GJVisitor;

/**
 * Grammar production:
 * f0 -> Identifier()
 * f1 -> "."
 * f2 -> "put"
 * f3 -> "("
 * f4 -> Identifier()
 * f5 -> ","
 * f6 -> ( Identifier() "." Identifier() | Identifier() "." "get" "(" Identifier() ")" )
 * f7 -> ")"
 * f8 -> ";"
 */
public class HashMapPut implements Node {
   public Identifier f0;
   public NodeToken f1;
   public NodeToken f2;
   public NodeToken f3;
   public Identifier f4;
   public NodeToken f5;
   public NodeChoice f6;
   public NodeToken f7;
   public NodeToken f8;

   public HashMapPut(Identifier n0, NodeToken n1, NodeToken n2, NodeToken n3, Identifier n4, NodeToken n5, NodeChoice n6, NodeToken n7, NodeToken n8) {
      f0 = n0;
      f1 = n1;
      f2 = n2;
      f3 = n3;
      f4 = n4;
      f5 = n5;
      f6 = n6;
      f7 = n7;
      f8 = n8;
   }

   public HashMapPut(Identifier n0, Identifier n1, NodeChoice n2) {
      f0 = n0;
      f1 = new NodeToken(".");
      f2 = new NodeToken("put");
      f3 = new NodeToken("(");
      f4 = n1;
      f5 = new NodeToken(",");
      f6 = n2;
      f7 = new NodeToken(")");
      f8 = new NodeToken(";");
   }

   public void accept(visitor.Visitor v) {
      v.visit(this);
   }
   public <R,A> String accept(GJVisitor<R,A> v, A argu) {
      return v.visit(this,argu);
   }
   public <R> R accept(visitor.GJNoArguVisitor<R> v) {
      return v.visit(this);
   }
   public <A> void accept(visitor.GJVoidVisitor<A> v, A argu) {
      v.visit(this,argu);
   }
}
