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
    * f0 -> "class"
    * f1 -> Identifier()
    * f2 -> "{"
    * f3 -> "public"
    * f4 -> "static"
    * f5 -> "void"
    * f6 -> "main"
    * f7 -> "("
    * f8 -> "String"
    * f9 -> "["
    * f10 -> "]"
    * f11 -> Identifier()
    * f12 -> ")"
    * f13 -> Statement()
    * f14 -> "}"
    * f15 -> <EOF>
    */
   public void visit(Goal n, A argu);

   /**
    * f0 -> Block()
    *       | AssignmentStatement()
    *       | DeclaredAssignmentStatement()
    *       | IfStatement()
    *       | WhileStatement()
    *       | PrintStatement()
    *       | ForStatement()
    *       | MessageSendStmt()
    */
   public void visit(Statement n, A argu);

   /**
    * f0 -> "{"
    * f1 -> ( Statement() )*
    * f2 -> "}"
    */
   public void visit(Block n, A argu);

   /**
    * f0 -> Identifier()
    * f1 -> "="
    * f2 -> Expression()
    * f3 -> ";"
    */
   public void visit(AssignmentStatement n, A argu);

   /**
    * f0 -> Type()
    * f1 -> Identifier()
    * f2 -> "="
    * f3 -> Expression()
    * f4 -> ";"
    */
   public void visit(DeclaredAssignmentStatement n, A argu);

   /**
    * f0 -> IfthenElseifStatement()
    *       | IfthenelseStatement()
    *       | IfthenStatement()
    */
   public void visit(IfStatement n, A argu);

   /**
    * f0 -> "if"
    * f1 -> "("
    * f2 -> Identifier()
    * f3 -> ")"
    * f4 -> Statement()
    * f5 -> "else"
    * f6 -> Statement()
    */
   public void visit(IfthenelseStatement n, A argu);

   /**
    * f0 -> "if"
    * f1 -> "("
    * f2 -> Identifier()
    * f3 -> ")"
    * f4 -> Statement()
    */
   public void visit(IfthenStatement n, A argu);

   /**
    * f0 -> "if"
    * f1 -> "("
    * f2 -> Identifier()
    * f3 -> ")"
    * f4 -> Statement()
    * f5 -> ( "else if" "(" Identifier() ")" Statement() )*
    * f6 -> "else"
    * f7 -> Statement()
    */
   public void visit(IfthenElseifStatement n, A argu);

   /**
    * f0 -> "while"
    * f1 -> "("
    * f2 -> Expression()
    * f3 -> ")"
    * f4 -> Statement()
    */
   public void visit(WhileStatement n, A argu);

   /**
    * f0 -> "System.out.println"
    * f1 -> "("
    * f2 -> Expression()
    * f3 -> ")"
    * f4 -> ";"
    */
   public void visit(PrintStatement n, A argu);

   /**
    * f0 -> "for"
    * f1 -> "("
    * f2 -> Type()
    * f3 -> Identifier()
    * f4 -> ":"
    * f5 -> Identifier()
    * f6 -> "."
    * f7 -> Identifier()
    * f8 -> ( "(" ")" )*
    * f9 -> ")"
    * f10 -> Statement()
    */
   public void visit(ForStatement n, A argu);

   /**
    * f0 -> Type()
    * f1 -> Identifier()
    * f2 -> ";"
    */
   public void visit(VarDeclaration n, A argu);

   /**
    * f0 -> BooleanType()
    *       | IntegerType()
    *       | StringType()
    *       | Identifier()
    */
   public void visit(Type n, A argu);

   /**
    * f0 -> "boolean"
    */
   public void visit(BooleanType n, A argu);

   /**
    * f0 -> "int"
    */
   public void visit(IntegerType n, A argu);

   /**
    * f0 -> "String"
    */
   public void visit(StringType n, A argu);

   /**
    * f0 -> MessageSend()
    * f1 -> ";"
    */
   public void visit(MessageSendStmt n, A argu);

   /**
    * f0 -> OrExpression()
    *       | AndExpression()
    *       | CompareExpression()
    *       | neqExpression()
    *       | PlusExpression()
    *       | MinusExpression()
    *       | TimesExpression()
    *       | DivExpression()
    *       | ArrayLookup()
    *       | ArrayLength()
    *       | MessageSend()
    *       | FieldLookup()
    *       | PrimaryExpression()
    */
   public void visit(Expression n, A argu);

   /**
    * f0 -> PrimaryExpression()
    * f1 -> "&&"
    * f2 -> PrimaryExpression()
    */
   public void visit(AndExpression n, A argu);

   /**
    * f0 -> PrimaryExpression()
    * f1 -> "||"
    * f2 -> PrimaryExpression()
    */
   public void visit(OrExpression n, A argu);

   /**
    * f0 -> PrimaryExpression()
    * f1 -> "<"
    * f2 -> PrimaryExpression()
    */
   public void visit(CompareExpression n, A argu);

   /**
    * f0 -> PrimaryExpression()
    * f1 -> "!="
    * f2 -> PrimaryExpression()
    */
   public void visit(neqExpression n, A argu);

   /**
    * f0 -> PrimaryExpression()
    * f1 -> "+"
    * f2 -> PrimaryExpression()
    */
   public void visit(PlusExpression n, A argu);

   /**
    * f0 -> PrimaryExpression()
    * f1 -> "-"
    * f2 -> PrimaryExpression()
    */
   public void visit(MinusExpression n, A argu);

   /**
    * f0 -> PrimaryExpression()
    * f1 -> "*"
    * f2 -> PrimaryExpression()
    */
   public void visit(TimesExpression n, A argu);

   /**
    * f0 -> PrimaryExpression()
    * f1 -> "/"
    * f2 -> PrimaryExpression()
    */
   public void visit(DivExpression n, A argu);

   /**
    * f0 -> PrimaryExpression()
    * f1 -> "["
    * f2 -> PrimaryExpression()
    * f3 -> "]"
    */
   public void visit(ArrayLookup n, A argu);

   /**
    * f0 -> PrimaryExpression()
    * f1 -> "."
    * f2 -> "length"
    */
   public void visit(ArrayLength n, A argu);

   /**
    * f0 -> PrimaryExpression()
    * f1 -> "."
    * f2 -> Identifier()
    * f3 -> "("
    * f4 -> ( ExpressionList() )?
    * f5 -> ")"
    */
   public void visit(MessageSend n, A argu);

   /**
    * f0 -> Expression()
    * f1 -> ( ExpressionRest() )*
    */
   public void visit(ExpressionList n, A argu);

   /**
    * f0 -> ","
    * f1 -> Expression()
    */
   public void visit(ExpressionRest n, A argu);

   /**
    * f0 -> Identifier()
    * f1 -> "."
    * f2 -> Identifier()
    */
   public void visit(FieldLookup n, A argu);

   /**
    * f0 -> IntegerLiteral()
    *       | StringLiteral()
    *       | TrueLiteral()
    *       | FalseLiteral()
    *       | Identifier()
    *       | ThisExpression()
    *       | ArrayAllocationExpression()
    *       | AllocationExpression()
    *       | NotExpression()
    *       | BracketExpression()
    */
   public void visit(PrimaryExpression n, A argu);

   /**
    * f0 -> <INTEGER_LITERAL>
    */
   public void visit(IntegerLiteral n, A argu);

   /**
    * f0 -> <STRINGLITERAL>
    */
   public void visit(StringLiteral n, A argu);

   /**
    * f0 -> "true"
    */
   public void visit(TrueLiteral n, A argu);

   /**
    * f0 -> "false"
    */
   public void visit(FalseLiteral n, A argu);

   /**
    * f0 -> <IDENTIFIER>
    */
   public void visit(Identifier n, A argu);

   /**
    * f0 -> "this"
    */
   public void visit(ThisExpression n, A argu);

   /**
    * f0 -> "new"
    * f1 -> "int"
    * f2 -> "["
    * f3 -> Expression()
    * f4 -> "]"
    */
   public void visit(ArrayAllocationExpression n, A argu);

   /**
    * f0 -> "new"
    * f1 -> Identifier()
    * f2 -> "("
    * f3 -> ")"
    */
   public void visit(AllocationExpression n, A argu);

   /**
    * f0 -> "!"
    * f1 -> Expression()
    */
   public void visit(NotExpression n, A argu);

   /**
    * f0 -> "("
    * f1 -> Expression()
    * f2 -> ")"
    */
   public void visit(BracketExpression n, A argu);

   /**
    * f0 -> Identifier()
    * f1 -> ( IdentifierRest() )*
    */
   public void visit(IdentifierList n, A argu);

   /**
    * f0 -> ","
    * f1 -> Identifier()
    */
   public void visit(IdentifierRest n, A argu);

}
