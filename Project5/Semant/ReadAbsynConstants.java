/* Generated By:JavaCC: Do not edit this line. ReadAbsynConstants.java */
package Semant;


/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface ReadAbsynConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int SINGLE_LINE_COMMENT = 71;
  /** RegularExpression Id. */
  int FORMAL_COMMENT = 72;
  /** RegularExpression Id. */
  int MULTI_LINE_COMMENT = 73;
  /** RegularExpression Id. */
  int INT = 75;
  /** RegularExpression Id. */
  int OCT = 76;
  /** RegularExpression Id. */
  int HEX = 77;
  /** RegularExpression Id. */
  int STRING = 78;
  /** RegularExpression Id. */
  int ID = 79;
  /** RegularExpression Id. */
  int LETTER = 80;
  /** RegularExpression Id. */
  int DIGIT = 81;

  /** Lexical state. */
  int DEFAULT = 0;
  /** Lexical state. */
  int IN_SINGLE_LINE_COMMENT = 1;
  /** Lexical state. */
  int IN_FORMAL_COMMENT = 2;
  /** Lexical state. */
  int IN_MULTI_LINE_COMMENT = 3;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\t\"",
    "\"\\n\"",
    "\"\\r\"",
    "\"\\f\"",
    "\"(\"",
    "\")\"",
    "\"Absyn\"",
    "\"AddExpr\"",
    "\"AndExpr\"",
    "\"ArrayExpr\"",
    "\"ArrayType\"",
    "\"AssignableExpr\"",
    "\"AssignStmt\"",
    "\"BinOpExpr\"",
    "\"BlockStmt\"",
    "\"BooleanType\"",
    "\"CallExpr\"",
    "\"ClassDecl\"",
    "\"DivExpr\"",
    "\"EqualExpr\"",
    "\"Expr\"",
    "\"FalseExpr\"",
    "\"FieldExpr\"",
    "\"Formal\"",
    "\"GreaterExpr\"",
    "\"IdentifierExpr\"",
    "\"IdentifierType\"",
    "\"IfStmt\"",
    "\"IntegerLiteral\"",
    "\"IntegerType\"",
    "\"LesserExpr\"",
    "\"MethodDecl\"",
    "\"MulExpr\"",
    "\"NegExpr\"",
    "\"NewArrayExpr\"",
    "\"NewObjectExpr\"",
    "\"NotEqExpr\"",
    "\"NotExpr\"",
    "\"NullExpr\"",
    "\"OrExpr\"",
    "\"Program\"",
    "\"Stmt\"",
    "\"StringLiteral\"",
    "\"SubExpr\"",
    "\"ThisExpr\"",
    "\"ThreadDecl\"",
    "\"TrueExpr\"",
    "\"Type\"",
    "\"VarDecl\"",
    "\"VoidDecl\"",
    "\"WhileStmt\"",
    "\"XinuCallExpr\"",
    "\"XinuCallStmt\"",
    "\"public_static_void\"",
    "\"Thread\"",
    "\"synchronized\"",
    "\"AbstractList\"",
    "\"null\"",
    "\"INT\"",
    "\"FIELD\"",
    "\"CLASS\"",
    "\"ARRAY\"",
    "\"RECORD\"",
    "\"OBJECT\"",
    "\"BOOLEAN\"",
    "\"FUNCTION\"",
    "\"//\"",
    "<token of kind 69>",
    "\"/*\"",
    "<SINGLE_LINE_COMMENT>",
    "\"*/\"",
    "\"*/\"",
    "<token of kind 74>",
    "<INT>",
    "<OCT>",
    "<HEX>",
    "<STRING>",
    "<ID>",
    "<LETTER>",
    "<DIGIT>",
    "<token of kind 82>",
  };

}
