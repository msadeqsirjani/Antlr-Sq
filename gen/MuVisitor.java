// Generated from D:/Job/Code/Java/Antlr\Mu.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MuParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MuVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MuParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(MuParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MuParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(MuParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MuParser#class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass(MuParser.ClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link MuParser#lib}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLib(MuParser.LibContext ctx);
	/**
	 * Visit a parse tree produced by {@link MuParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(MuParser.FuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link MuParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(MuParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link MuParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(MuParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link MuParser#int_var_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_var_declaration(MuParser.Int_var_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MuParser#double_var_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble_var_declaration(MuParser.Double_var_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MuParser#str_var_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStr_var_declaration(MuParser.Str_var_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MuParser#cls_var_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCls_var_declaration(MuParser.Cls_var_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MuParser#arr_decl_var_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArr_decl_var_declaration(MuParser.Arr_decl_var_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MuParser#arr_init_var_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArr_init_var_declaration(MuParser.Arr_init_var_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MuParser#series}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeries(MuParser.SeriesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MuParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(MuParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MuParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(MuParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link MuParser#if_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stat(MuParser.If_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link MuParser#condition_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_block(MuParser.Condition_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MuParser#stat_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat_block(MuParser.Stat_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MuParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(MuParser.CommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MuParser#while_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stat(MuParser.While_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link MuParser#for_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_stat(MuParser.For_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link MuParser#match}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatch(MuParser.MatchContext ctx);
	/**
	 * Visit a parse tree produced by {@link MuParser#m_series}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitM_series(MuParser.M_seriesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MuParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(MuParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MuParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(MuParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpr(MuParser.UnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpr(MuParser.NotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code powerExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowerExpr(MuParser.PowerExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryMinusExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryMinusExpr(MuParser.UnaryMinusExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicationExpr(MuParser.MultiplicationExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomExpr(MuParser.AtomExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(MuParser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpr(MuParser.AdditiveExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpr(MuParser.RelationalExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpr(MuParser.EqualityExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(MuParser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link MuParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpr(MuParser.ParExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link MuParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberAtom(MuParser.NumberAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link MuParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanAtom(MuParser.BooleanAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link MuParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdAtom(MuParser.IdAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link MuParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAtom(MuParser.StringAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nilAtom}
	 * labeled alternative in {@link MuParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNilAtom(MuParser.NilAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link MuParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_type(MuParser.Data_typeContext ctx);
}