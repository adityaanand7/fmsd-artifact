//
// Generated by JTB 1.3.2
//

package syntaxtree;

import visitor.GJVisitor;

/**
 * Grammar production:
 * f0 -> IfthenElseifStatement()
 *       | IfthenelseStatement()
 *       | IfthenStatement()
 */
public class FieldAssignmentStatement implements Node {
   public NodeChoice f0;

   public FieldAssignmentStatement(NodeChoice n0) {
      f0 = n0;
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
