//
// Generated by JTB 1.3.2
//

package visitor;
import syntaxtree.*;
import java.util.*;

/**
 * All GJ visitors with no argument must implement this interface.
 */

public interface GJNoArguVisitor<R> {

   //
   // GJ Auto class visitors with no argument
   //

   public R visit(NodeList n);
   public R visit(NodeListOptional n);
   public R visit(NodeOptional n);
   public R visit(NodeSequence n);
   public R visit(NodeToken n);

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
   public R visit(Goal n);

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
   public R visit(Statement n);

   /**
    * f0 -> "{"
    * f1 -> ( Statement() )*
    * f2 -> "}"
    */
   public R visit(Block n);

   /**
    * f0 -> Identifier()
    * f1 -> "="
    * f2 -> Expression()
    * f3 -> ";"
    */
   public R visit(AssignmentStatement n);

   /**
    * f0 -> Type()
    * f1 -> Identifier()
    * f2 -> "="
    * f3 -> Expression()
    * f4 -> ";"
    */
   public R visit(DeclaredAssignmentStatement n);

   /**
    * f0 -> IfthenElseifStatement()
    *       | IfthenelseStatement()
    *       | IfthenStatement()
    */
   public R visit(IfStatement n);

   /**
    * f0 -> "if"
    * f1 -> "("
    * f2 -> Identifier()
    * f3 -> ")"
    * f4 -> Statement()
    * f5 -> "else"
    * f6 -> Statement()
    */
   public R visit(IfthenelseStatement n);

   /**
    * f0 -> "if"
    * f1 -> "("
    * f2 -> Identifier()
    * f3 -> ")"
    * f4 -> Statement()
    */
   public R visit(IfthenStatement n);

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
   public R visit(IfthenElseifStatement n);

   /**
    * f0 -> "while"
    * f1 -> "("
    * f2 -> Expression()
    * f3 -> ")"
    * f4 -> Statement()
    */
   public R visit(WhileStatement n);

   /**
    * f0 -> "System.out.println"
    * f1 -> "("
    * f2 -> Expression()
    * f3 -> ")"
    * f4 -> ";"
    */
   public R visit(PrintStatement n);

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
   public R visit(ForStatement n);

   /**
    * f0 -> Type()
    * f1 -> Identifier()
    * f2 -> ";"
    */
   public R visit(VarDeclaration n);

   /**
    * f0 -> BooleanType()
    *       | IntegerType()
    *       | StringType()
    *       | Identifier()
    */
   public R visit(Type n);

   /**
    * f0 -> "boolean"
    */
   public R visit(BooleanType n);

   /**
    * f0 -> "int"
    */
   public R visit(IntegerType n);

   /**
    * f0 -> "String"
    */
   public R visit(StringType n);

   /**
    * f0 -> MessageSend()
    * f1 -> ";"
    */
   public R visit(MessageSendStmt n);

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
   public R visit(Expression n);

   /**
    * f0 -> PrimaryExpression()
    * f1 -> "&&"
    * f2 -> PrimaryExpression()
    */
   public R visit(AndExpression n);

   /**
    * f0 -> PrimaryExpression()
    * f1 -> "||"
    * f2 -> PrimaryExpression()
    */
   public R visit(OrExpression n);

   /**
    * f0 -> PrimaryExpression()
    * f1 -> "<"
    * f2 -> PrimaryExpression()
    */
   public R visit(CompareExpression n);

   /**
    * f0 -> PrimaryExpression()
    * f1 -> "!="
    * f2 -> PrimaryExpression()
    */
   public R visit(neqExpression n);

   /**
    * f0 -> PrimaryExpression()
    * f1 -> "+"
    * f2 -> PrimaryExpression()
    */
   public R visit(PlusExpression n);

   /**
    * f0 -> PrimaryExpression()
    * f1 -> "-"
    * f2 -> PrimaryExpression()
    */
   public R visit(MinusExpression n);

   /**
    * f0 -> PrimaryExpression()
    * f1 -> "*"
    * f2 -> PrimaryExpression()
    */
   public R visit(TimesExpression n);

   /**
    * f0 -> PrimaryExpression()
    * f1 -> "/"
    * f2 -> PrimaryExpression()
    */
   public R visit(DivExpression n);

   /**
    * f0 -> PrimaryExpression()
    * f1 -> "["
    * f2 -> PrimaryExpression()
    * f3 -> "]"
    */
   public R visit(ArrayLookup n);

   /**
    * f0 -> PrimaryExpression()
    * f1 -> "."
    * f2 -> "length"
    */
   public R visit(ArrayLength n);

   /**
    * f0 -> PrimaryExpression()
    * f1 -> "."
    * f2 -> Identifier()
    * f3 -> "("
    * f4 -> ( ExpressionList() )?
    * f5 -> ")"
    */
   public R visit(MessageSend n);

   /**
    * f0 -> Expression()
    * f1 -> ( ExpressionRest() )*
    */
   public R visit(ExpressionList n);

   /**
    * f0 -> ","
    * f1 -> Expression()
    */
   public R visit(ExpressionRest n);

   /**
    * f0 -> Identifier()
    * f1 -> "."
    * f2 -> Identifier()
    */
   public R visit(FieldLookup n);

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
   public R visit(PrimaryExpression n);

   /**
    * f0 -> <INTEGER_LITERAL>
    */
   public R visit(IntegerLiteral n);

   /**
    * f0 -> <STRINGLITERAL>
    */
   public R visit(StringLiteral n);

   /**
    * f0 -> "true"
    */
   public R visit(TrueLiteral n);

   /**
    * f0 -> "false"
    */
   public R visit(FalseLiteral n);

   /**
    * f0 -> <IDENTIFIER>
    */
   public R visit(Identifier n);

   /**
    * f0 -> "this"
    */
   public R visit(ThisExpression n);

   /**
    * f0 -> "new"
    * f1 -> "int"
    * f2 -> "["
    * f3 -> Expression()
    * f4 -> "]"
    */
   public R visit(ArrayAllocationExpression n);

   /**
    * f0 -> "new"
    * f1 -> Identifier()
    * f2 -> "("
    * f3 -> ")"
    */
   public R visit(AllocationExpression n);

   /**
    * f0 -> "!"
    * f1 -> Expression()
    */
   public R visit(NotExpression n);

   /**
    * f0 -> "("
    * f1 -> Expression()
    * f2 -> ")"
    */
   public R visit(BracketExpression n);

   /**
    * f0 -> Identifier()
    * f1 -> ( IdentifierRest() )*
    */
   public R visit(IdentifierList n);

   /**
    * f0 -> ","
    * f1 -> Identifier()
    */
   public R visit(IdentifierRest n);

}
