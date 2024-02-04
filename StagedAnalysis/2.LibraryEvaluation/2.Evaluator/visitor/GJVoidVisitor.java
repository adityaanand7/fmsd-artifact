//
// Generated by JTB 1.3.2
//

package visitor;
import syntaxtree.*;
import java.util.*;

/**
 * All GJ void visitors must implement this interface.
 */

public interface GJVoidVisitor<A> {

   //
   // GJ void Auto class visitors
   //

   public void visit(NodeList n, A argu);
   public void visit(NodeListOptional n, A argu);
   public void visit(NodeOptional n, A argu);
   public void visit(NodeSequence n, A argu);
   public void visit(NodeToken n, A argu);

   //
   // User-generated visitor methods below
   //

   /**
    * f0 -> ( CompleteConditionalValues() )*
    * f1 -> <EOF>
    */
   public void visit(Goal n, A argu);

   /**
    * f0 -> ProgramElement()
    * f1 -> " = "
    * f2 -> ( ConditionalValues() )*
    */
   public void visit(CompleteConditionalValues n, A argu);

   /**
    * f0 -> "<"
    * f1 -> EvalStatus()
    * f2 -> ","
    * f3 -> ClassName()
    * f4 -> ":"
    * f5 -> MethodName()
    * f6 -> ","
    * f7 -> TypeTag()
    * f8 -> ","
    * f9 -> ParmNumber()
    * f10 -> ","
    * f11 -> FieldList()
    * f12 -> ">"
    */
   public void visit(ProgramElement n, A argu);

   /**
    * f0 -> LocalType()
    *       | ParameterType()
    *       | ReturnType()
    *       | ArgumentType()
    *       | FieldType()
    */
   public void visit(ConditionalValues n, A argu);

   /**
    * f0 -> "<<"
    * f1 -> EvalStatus()
    * f2 -> ","
    * f3 -> ClassName()
    * f4 -> ":"
    * f5 -> MethodName()
    * f6 -> ","
    * f7 -> TypeTag()
    * f8 -> ","
    * f9 -> ParmNumber()
    * f10 -> ","
    * f11 -> FieldList()
    * f12 -> ">,"
    * f13 -> DependencyValue()
    * f14 -> ","
    * f15 -> ResolvedValue()
    * f16 -> ">;"
    */
   public void visit(LocalType n, A argu);

   /**
    * f0 -> "<<"
    * f1 -> EvalStatus()
    * f2 -> ","
    * f3 -> ClassName()
    * f4 -> ":"
    * f5 -> MethodName()
    * f6 -> ","
    * f7 -> TypeTag()
    * f8 -> ","
    * f9 -> ParmNumber()
    * f10 -> ","
    * f11 -> FieldList()
    * f12 -> ">,"
    * f13 -> DependencyValue()
    * f14 -> ","
    * f15 -> ResolvedValue()
    * f16 -> ">;"
    */
   public void visit(ParameterType n, A argu);

   /**
    * f0 -> "<<"
    * f1 -> EvalStatus()
    * f2 -> ","
    * f3 -> ClassName()
    * f4 -> ":"
    * f5 -> MethodName()
    * f6 -> ","
    * f7 -> TypeTag()
    * f8 -> ","
    * f9 -> ParmNumber()
    * f10 -> ","
    * f11 -> FieldList()
    * f12 -> ">,"
    * f13 -> DependencyValue()
    * f14 -> ","
    * f15 -> ResolvedValue()
    * f16 -> ">;"
    */
   public void visit(ReturnType n, A argu);

   /**
    * f0 -> "<<"
    * f1 -> EvalStatus()
    * f2 -> ","
    * f3 -> ClassName()
    * f4 -> ":"
    * f5 -> MethodName()
    * f6 -> ","
    * f7 -> TypeTag()
    * f8 -> ","
    * f9 -> ArgNumber()
    * f10 -> ","
    * f11 -> FieldList()
    * f12 -> ">,"
    * f13 -> DependencyValue()
    * f14 -> ","
    * f15 -> ResolvedValue()
    * f16 -> ">;"
    */
   public void visit(ArgumentType n, A argu);

   /**
    * f0 -> "<<"
    * f1 -> EvalStatus()
    * f2 -> ","
    * f3 -> ClassName()
    * f4 -> ":"
    * f5 -> MethodName()
    * f6 -> ","
    * f7 -> TypeTag()
    * f8 -> ","
    * f9 -> ArgNumber()
    * f10 -> ","
    * f11 -> FieldList()
    * f12 -> ">,"
    * f13 -> DependencyValue()
    * f14 -> ","
    * f15 -> ResolvedValue()
    * f16 -> ">;"
    */
   public void visit(FieldType n, A argu);

   /**
    * f0 -> "Static"
    *       | "Dynamic"
    */
   public void visit(EvalStatus n, A argu);

   /**
    * f0 -> Identifier()
    * f1 -> ( ClassNameRest() )*
    */
   public void visit(ClassName n, A argu);

   /**
    * f0 -> "."
    * f1 -> Identifier()
    */
   public void visit(ClassNameRest n, A argu);

   /**
    * f0 -> Identifier()
    */
   public void visit(MethodName n, A argu);

   /**
    * f0 -> "local1"
    *       | "argmnt"
    *       | "parmtr"
    *       | "retrn"
    *       | "field5"
    */
   public void visit(TypeTag n, A argu);

   /**
    * f0 -> <INTEGER_LITERAL>
    */
   public void visit(ArgNumber n, A argu);

   /**
    * f0 -> <INTEGER_LITERAL>
    */
   public void visit(ParmNumber n, A argu);

   /**
    * f0 -> "<"
    * f1 -> Identifier()
    * f2 -> ">"
    */
   public void visit(FieldList n, A argu);

   /**
    * f0 -> <IDENTIFIER>
    */
   public void visit(Identifier n, A argu);

   /**
    * f0 -> "D"
    *       | "E"
    */
   public void visit(DependencyValue n, A argu);

   /**
    * f0 -> "D"
    *       | "E"
    */
   public void visit(ResolvedValue n, A argu);

}
