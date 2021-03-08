// Generated from D:/Job/Code/Java/Antlr/src\Sq.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SqParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SqVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SqParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(SqParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(SqParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqParser#class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass(SqParser.ClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqParser#lib}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLib(SqParser.LibContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(SqParser.FuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(SqParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(SqParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqParser#int_var_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_var_declaration(SqParser.Int_var_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqParser#double_var_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble_var_declaration(SqParser.Double_var_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqParser#str_var_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStr_var_declaration(SqParser.Str_var_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqParser#cls_var_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCls_var_declaration(SqParser.Cls_var_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqParser#arr_decl_var_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArr_decl_var_declaration(SqParser.Arr_decl_var_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqParser#arr_init_var_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArr_init_var_declaration(SqParser.Arr_init_var_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqParser#series}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeries(SqParser.SeriesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(SqParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(SqParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqParser#if_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stat(SqParser.If_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqParser#condition_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_block(SqParser.Condition_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqParser#stat_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat_block(SqParser.Stat_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(SqParser.CommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqParser#while_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stat(SqParser.While_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqParser#for_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_stat(SqParser.For_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqParser#match}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatch(SqParser.MatchContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqParser#m_series}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitM_series(SqParser.M_seriesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SqParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(SqParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code powerExpr}
	 * labeled alternative in {@link SqParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowerExpr(SqParser.PowerExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link SqParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomExpr(SqParser.AtomExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link SqParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(SqParser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link SqParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpr(SqParser.AdditiveExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link SqParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpr(SqParser.RelationalExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code leftshiftExpr}
	 * labeled alternative in {@link SqParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftshiftExpr(SqParser.LeftshiftExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ampersandExpr}
	 * labeled alternative in {@link SqParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAmpersandExpr(SqParser.AmpersandExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryExpr}
	 * labeled alternative in {@link SqParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpr(SqParser.UnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link SqParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpr(SqParser.NotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryMinusExpr}
	 * labeled alternative in {@link SqParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryMinusExpr(SqParser.UnaryMinusExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link SqParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicationExpr(SqParser.MultiplicationExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rightshiftExpr}
	 * labeled alternative in {@link SqParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRightshiftExpr(SqParser.RightshiftExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link SqParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpr(SqParser.EqualityExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link SqParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(SqParser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link SqParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpr(SqParser.ParExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link SqParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberAtom(SqParser.NumberAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link SqParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanAtom(SqParser.BooleanAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link SqParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdAtom(SqParser.IdAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link SqParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAtom(SqParser.StringAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nilAtom}
	 * labeled alternative in {@link SqParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNilAtom(SqParser.NilAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_type(SqParser.Data_typeContext ctx);
}