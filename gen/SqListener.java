// Generated from D:/Job/Code/Java/Antlr/src\Sq.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SqParser}.
 */
public interface SqListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SqParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(SqParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(SqParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(SqParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(SqParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqParser#class}.
	 * @param ctx the parse tree
	 */
	void enterClass(SqParser.ClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqParser#class}.
	 * @param ctx the parse tree
	 */
	void exitClass(SqParser.ClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqParser#lib}.
	 * @param ctx the parse tree
	 */
	void enterLib(SqParser.LibContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqParser#lib}.
	 * @param ctx the parse tree
	 */
	void exitLib(SqParser.LibContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(SqParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(SqParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(SqParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(SqParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(SqParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(SqParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqParser#int_var_declaration}.
	 * @param ctx the parse tree
	 */
	void enterInt_var_declaration(SqParser.Int_var_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqParser#int_var_declaration}.
	 * @param ctx the parse tree
	 */
	void exitInt_var_declaration(SqParser.Int_var_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqParser#double_var_declaration}.
	 * @param ctx the parse tree
	 */
	void enterDouble_var_declaration(SqParser.Double_var_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqParser#double_var_declaration}.
	 * @param ctx the parse tree
	 */
	void exitDouble_var_declaration(SqParser.Double_var_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqParser#str_var_declaration}.
	 * @param ctx the parse tree
	 */
	void enterStr_var_declaration(SqParser.Str_var_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqParser#str_var_declaration}.
	 * @param ctx the parse tree
	 */
	void exitStr_var_declaration(SqParser.Str_var_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqParser#cls_var_declaration}.
	 * @param ctx the parse tree
	 */
	void enterCls_var_declaration(SqParser.Cls_var_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqParser#cls_var_declaration}.
	 * @param ctx the parse tree
	 */
	void exitCls_var_declaration(SqParser.Cls_var_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqParser#arr_decl_var_declaration}.
	 * @param ctx the parse tree
	 */
	void enterArr_decl_var_declaration(SqParser.Arr_decl_var_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqParser#arr_decl_var_declaration}.
	 * @param ctx the parse tree
	 */
	void exitArr_decl_var_declaration(SqParser.Arr_decl_var_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqParser#arr_init_var_declaration}.
	 * @param ctx the parse tree
	 */
	void enterArr_init_var_declaration(SqParser.Arr_init_var_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqParser#arr_init_var_declaration}.
	 * @param ctx the parse tree
	 */
	void exitArr_init_var_declaration(SqParser.Arr_init_var_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqParser#series}.
	 * @param ctx the parse tree
	 */
	void enterSeries(SqParser.SeriesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqParser#series}.
	 * @param ctx the parse tree
	 */
	void exitSeries(SqParser.SeriesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(SqParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(SqParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(SqParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(SqParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void enterIf_stat(SqParser.If_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void exitIf_stat(SqParser.If_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void enterCondition_block(SqParser.Condition_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void exitCondition_block(SqParser.Condition_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void enterStat_block(SqParser.Stat_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void exitStat_block(SqParser.Stat_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(SqParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(SqParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqParser#while_stat}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stat(SqParser.While_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqParser#while_stat}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stat(SqParser.While_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqParser#for_stat}.
	 * @param ctx the parse tree
	 */
	void enterFor_stat(SqParser.For_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqParser#for_stat}.
	 * @param ctx the parse tree
	 */
	void exitFor_stat(SqParser.For_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqParser#match}.
	 * @param ctx the parse tree
	 */
	void enterMatch(SqParser.MatchContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqParser#match}.
	 * @param ctx the parse tree
	 */
	void exitMatch(SqParser.MatchContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqParser#m_series}.
	 * @param ctx the parse tree
	 */
	void enterM_series(SqParser.M_seriesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqParser#m_series}.
	 * @param ctx the parse tree
	 */
	void exitM_series(SqParser.M_seriesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SqParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SqParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(SqParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(SqParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code powerExpr}
	 * labeled alternative in {@link SqParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPowerExpr(SqParser.PowerExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code powerExpr}
	 * labeled alternative in {@link SqParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPowerExpr(SqParser.PowerExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link SqParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpr(SqParser.AtomExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link SqParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpr(SqParser.AtomExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link SqParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(SqParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link SqParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(SqParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link SqParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpr(SqParser.AdditiveExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link SqParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpr(SqParser.AdditiveExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link SqParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpr(SqParser.RelationalExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link SqParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpr(SqParser.RelationalExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code leftshiftExpr}
	 * labeled alternative in {@link SqParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLeftshiftExpr(SqParser.LeftshiftExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code leftshiftExpr}
	 * labeled alternative in {@link SqParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLeftshiftExpr(SqParser.LeftshiftExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ampersandExpr}
	 * labeled alternative in {@link SqParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAmpersandExpr(SqParser.AmpersandExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ampersandExpr}
	 * labeled alternative in {@link SqParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAmpersandExpr(SqParser.AmpersandExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryExpr}
	 * labeled alternative in {@link SqParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(SqParser.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryExpr}
	 * labeled alternative in {@link SqParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(SqParser.UnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link SqParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(SqParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link SqParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(SqParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryMinusExpr}
	 * labeled alternative in {@link SqParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinusExpr(SqParser.UnaryMinusExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryMinusExpr}
	 * labeled alternative in {@link SqParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinusExpr(SqParser.UnaryMinusExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link SqParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicationExpr(SqParser.MultiplicationExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link SqParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicationExpr(SqParser.MultiplicationExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rightshiftExpr}
	 * labeled alternative in {@link SqParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRightshiftExpr(SqParser.RightshiftExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rightshiftExpr}
	 * labeled alternative in {@link SqParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRightshiftExpr(SqParser.RightshiftExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link SqParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpr(SqParser.EqualityExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link SqParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpr(SqParser.EqualityExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link SqParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(SqParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link SqParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(SqParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link SqParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterParExpr(SqParser.ParExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link SqParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitParExpr(SqParser.ParExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link SqParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNumberAtom(SqParser.NumberAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link SqParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNumberAtom(SqParser.NumberAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link SqParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterBooleanAtom(SqParser.BooleanAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link SqParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitBooleanAtom(SqParser.BooleanAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link SqParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterIdAtom(SqParser.IdAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link SqParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitIdAtom(SqParser.IdAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link SqParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterStringAtom(SqParser.StringAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link SqParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitStringAtom(SqParser.StringAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nilAtom}
	 * labeled alternative in {@link SqParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNilAtom(SqParser.NilAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nilAtom}
	 * labeled alternative in {@link SqParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNilAtom(SqParser.NilAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqParser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterData_type(SqParser.Data_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqParser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitData_type(SqParser.Data_typeContext ctx);
}