// Generated from /Users/riccardo_corsini/Desktop/università/terzo anno/secondo semestre/linguaggi/laboratorio/ArnoldC/src/ArnoldC.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ArnoldCParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ArnoldCVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ArnoldCParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(ArnoldCParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code voidMethod}
	 * labeled alternative in {@link ArnoldCParser#meth_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidMethod(ArnoldCParser.VoidMethodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nonVoidMethod}
	 * labeled alternative in {@link ArnoldCParser#meth_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonVoidMethod(ArnoldCParser.NonVoidMethodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printstring}
	 * labeled alternative in {@link ArnoldCParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintstring(ArnoldCParser.PrintstringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printid}
	 * labeled alternative in {@link ArnoldCParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintid(ArnoldCParser.PrintidContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmt_concat}
	 * labeled alternative in {@link ArnoldCParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_concat(ArnoldCParser.Stmt_concatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code var_assign}
	 * labeled alternative in {@link ArnoldCParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_assign(ArnoldCParser.Var_assignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code var_decl}
	 * labeled alternative in {@link ArnoldCParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_decl(ArnoldCParser.Var_declContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cond}
	 * labeled alternative in {@link ArnoldCParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(ArnoldCParser.CondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code while}
	 * labeled alternative in {@link ArnoldCParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(ArnoldCParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code meth_call}
	 * labeled alternative in {@link ArnoldCParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMeth_call(ArnoldCParser.Meth_callContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nat}
	 * labeled alternative in {@link ArnoldCParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNat(ArnoldCParser.NatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bool}
	 * labeled alternative in {@link ArnoldCParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(ArnoldCParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link ArnoldCParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(ArnoldCParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code divMulMod}
	 * labeled alternative in {@link ArnoldCParser#ops}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivMulMod(ArnoldCParser.DivMulModContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plusMinus}
	 * labeled alternative in {@link ArnoldCParser#ops}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusMinus(ArnoldCParser.PlusMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code gt}
	 * labeled alternative in {@link ArnoldCParser#ops}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGt(ArnoldCParser.GtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eq}
	 * labeled alternative in {@link ArnoldCParser#ops}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEq(ArnoldCParser.EqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logic}
	 * labeled alternative in {@link ArnoldCParser#ops}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic(ArnoldCParser.LogicContext ctx);
}