// Generated from D:/Job/Code/Java/Antlr\Mu.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MuParser}.
 */
public interface MuListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MuParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(MuParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(MuParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MuParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(MuParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(MuParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MuParser#class}.
	 * @param ctx the parse tree
	 */
	void enterClass(MuParser.ClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuParser#class}.
	 * @param ctx the parse tree
	 */
	void exitClass(MuParser.ClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link MuParser#lib}.
	 * @param ctx the parse tree
	 */
	void enterLib(MuParser.LibContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuParser#lib}.
	 * @param ctx the parse tree
	 */
	void exitLib(MuParser.LibContext ctx);
	/**
	 * Enter a parse tree produced by {@link MuParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(MuParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(MuParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link MuParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(MuParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(MuParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link MuParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(MuParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(MuParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link MuParser#int_var_declaration}.
	 * @param ctx the parse tree
	 */
	void enterInt_var_declaration(MuParser.Int_var_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuParser#int_var_declaration}.
	 * @param ctx the parse tree
	 */
	void exitInt_var_declaration(MuParser.Int_var_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MuParser#double_var_declaration}.
	 * @param ctx the parse tree
	 */
	void enterDouble_var_declaration(MuParser.Double_var_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuParser#double_var_declaration}.
	 * @param ctx the parse tree
	 */
	void exitDouble_var_declaration(MuParser.Double_var_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MuParser#str_var_declaration}.
	 * @param ctx the parse tree
	 */
	void enterStr_var_declaration(MuParser.Str_var_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuParser#str_var_declaration}.
	 * @param ctx the parse tree
	 */
	void exitStr_var_declaration(MuParser.Str_var_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MuParser#cls_var_declaration}.
	 * @param ctx the parse tree
	 */
	void enterCls_var_declaration(MuParser.Cls_var_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuParser#cls_var_declaration}.
	 * @param ctx the parse tree
	 */
	void exitCls_var_declaration(MuParser.Cls_var_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MuParser#arr_decl_var_declaration}.
	 * @param ctx the parse tree
	 */
	void enterArr_decl_var_declaration(MuParser.Arr_decl_var_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuParser#arr_decl_var_declaration}.
	 * @param ctx the parse tree
	 */
	void exitArr_decl_var_declaration(MuParser.Arr_decl_var_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MuParser#arr_init_var_declaration}.
	 * @param ctx the parse tree
	 */
	void enterArr_init_var_declaration(MuParser.Arr_init_var_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuParser#arr_init_var_declaration}.
	 * @param ctx the parse tree
	 */
	void exitArr_init_var_declaration(MuParser.Arr_init_var_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MuParser#series}.
	 * @param ctx the parse tree
	 */
	void enterSeries(MuParser.SeriesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuParser#series}.
	 * @param ctx the parse tree
	 */
	void exitSeries(MuParser.SeriesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MuParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(MuParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(MuParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MuParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(MuParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(MuParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MuParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void enterIf_stat(MuParser.If_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void exitIf_stat(MuParser.If_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link MuParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void enterCondition_block(MuParser.Condition_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void exitCondition_block(MuParser.Condition_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MuParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void enterStat_block(MuParser.Stat_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void exitStat_block(MuParser.Stat_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MuParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(MuParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(MuParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MuParser#while_stat}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stat(MuParser.While_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuParser#while_stat}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stat(MuParser.While_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link MuParser#for_stat}.
	 * @param ctx the parse tree
	 */
	void enterFor_stat(MuParser.For_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuParser#for_stat}.
	 * @param ctx the parse tree
	 */
	void exitFor_stat(MuParser.For_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link MuParser#match}.
	 * @param ctx the parse tree
	 */
	void enterMatch(MuParser.MatchContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuParser#match}.
	 * @param ctx the parse tree
	 */
	void exitMatch(MuParser.MatchContext ctx);
	/**
	 * Enter a parse tree produced by {@link MuParser#m_series}.
	 * @param ctx the parse tree
	 */
	void enterM_series(MuParser.M_seriesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuParser#m_series}.
	 * @param ctx the parse tree
	 */
	void exitM_series(MuParser.M_seriesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MuParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(MuParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(MuParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MuParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(MuParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(MuParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(MuParser.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(MuParser.UnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(MuParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(MuParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code powerExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPowerExpr(MuParser.PowerExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code powerExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPowerExpr(MuParser.PowerExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryMinusExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinusExpr(MuParser.UnaryMinusExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryMinusExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinusExpr(MuParser.UnaryMinusExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicationExpr(MuParser.MultiplicationExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicationExpr(MuParser.MultiplicationExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpr(MuParser.AtomExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpr(MuParser.AtomExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(MuParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(MuParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpr(MuParser.AdditiveExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpr(MuParser.AdditiveExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpr(MuParser.RelationalExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpr(MuParser.RelationalExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpr(MuParser.EqualityExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpr(MuParser.EqualityExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(MuParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(MuParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link MuParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterParExpr(MuParser.ParExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link MuParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitParExpr(MuParser.ParExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link MuParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNumberAtom(MuParser.NumberAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link MuParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNumberAtom(MuParser.NumberAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link MuParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterBooleanAtom(MuParser.BooleanAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link MuParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitBooleanAtom(MuParser.BooleanAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link MuParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterIdAtom(MuParser.IdAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link MuParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitIdAtom(MuParser.IdAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link MuParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterStringAtom(MuParser.StringAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link MuParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitStringAtom(MuParser.StringAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nilAtom}
	 * labeled alternative in {@link MuParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNilAtom(MuParser.NilAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nilAtom}
	 * labeled alternative in {@link MuParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNilAtom(MuParser.NilAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link MuParser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterData_type(MuParser.Data_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuParser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitData_type(MuParser.Data_typeContext ctx);
}