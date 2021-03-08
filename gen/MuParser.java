// Generated from D:/Job/Code/Java/Antlr\Mu.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MuParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OR=1, AND=2, EQ=3, NEQ=4, GT=5, LT=6, GTEQ=7, LTEQ=8, PLUS=9, MINUS=10, 
		MULT=11, DIV=12, MOD=13, POW=14, NOT=15, DOT=16, POW2=17, REV=18, PLUSPLUS=19, 
		MINUSMINUS=20, ASSIGN=21, COLON=22, SCOLON=23, OPAR=24, CPAR=25, OBRACE=26, 
		CBRACE=27, SEP=28, SCI=29, RES=30, INIT=31, TRUE=32, FALSE=33, NIL=34, 
		IF=35, ELSE=36, WHILE=37, FOR=38, PRINT=39, VAR=40, DEF=41, IMPORT=42, 
		AS=43, RETURN=44, NEW=45, STEP=46, CLASS=47, IMPLEMENTS=48, EXTEND=49, 
		MATCH=50, CASE=51, BREAK=52, INTEGER=53, DOUBLE=54, STR=55, ARRAY_DEC=56, 
		ARRAY_INIT=57, ID=58, INT=59, FLOAT=60, STRING=61, SINGLE_COMMENT=62, 
		MULTI_COMMENT=63, SPACE=64, OTHER=65;
	public static final int
		RULE_parse = 0, RULE_block = 1, RULE_class = 2, RULE_lib = 3, RULE_func = 4, 
		RULE_var = 5, RULE_stat = 6, RULE_int_var_declaration = 7, RULE_double_var_declaration = 8, 
		RULE_str_var_declaration = 9, RULE_cls_var_declaration = 10, RULE_arr_decl_var_declaration = 11, 
		RULE_arr_init_var_declaration = 12, RULE_series = 13, RULE_assignment = 14, 
		RULE_variable = 15, RULE_if_stat = 16, RULE_condition_block = 17, RULE_stat_block = 18, 
		RULE_comment = 19, RULE_while_stat = 20, RULE_for_stat = 21, RULE_match = 22, 
		RULE_m_series = 23, RULE_expression = 24, RULE_print = 25, RULE_expr = 26, 
		RULE_atom = 27, RULE_data_type = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "block", "class", "lib", "func", "var", "stat", "int_var_declaration", 
			"double_var_declaration", "str_var_declaration", "cls_var_declaration", 
			"arr_decl_var_declaration", "arr_init_var_declaration", "series", "assignment", 
			"variable", "if_stat", "condition_block", "stat_block", "comment", "while_stat", 
			"for_stat", "match", "m_series", "expression", "print", "expr", "atom", 
			"data_type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'||'", "'&&'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'+'", 
			"'-'", "'*'", "'/'", "'%'", "'^'", "'!'", "'.'", "'**'", "'~'", "'++'", 
			"'--'", "'='", "':'", "';'", "'('", "')'", "'{'", "'}'", "','", "'e'", 
			"'=>'", "'<-'", "'true'", "'false'", "'nil'", "'if'", "'else'", "'while'", 
			"'for'", "'print'", "'var'", "'def'", "'import'", "'as'", "'return'", 
			"'new'", "'step'", "'class'", "'implements'", "'extend'", "'match'", 
			"'case'", "'break'", "'int'", "'double'", "'string'", null, "'Array'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OR", "AND", "EQ", "NEQ", "GT", "LT", "GTEQ", "LTEQ", "PLUS", "MINUS", 
			"MULT", "DIV", "MOD", "POW", "NOT", "DOT", "POW2", "REV", "PLUSPLUS", 
			"MINUSMINUS", "ASSIGN", "COLON", "SCOLON", "OPAR", "CPAR", "OBRACE", 
			"CBRACE", "SEP", "SCI", "RES", "INIT", "TRUE", "FALSE", "NIL", "IF", 
			"ELSE", "WHILE", "FOR", "PRINT", "VAR", "DEF", "IMPORT", "AS", "RETURN", 
			"NEW", "STEP", "CLASS", "IMPLEMENTS", "EXTEND", "MATCH", "CASE", "BREAK", 
			"INTEGER", "DOUBLE", "STR", "ARRAY_DEC", "ARRAY_INIT", "ID", "INT", "FLOAT", 
			"STRING", "SINGLE_COMMENT", "MULTI_COMMENT", "SPACE", "OTHER"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Mu.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MuParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ParseContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MuParser.EOF, 0); }
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MuVisitor ) return ((MuVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			block();
			setState(59);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MuVisitor ) return ((MuVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (MINUS - 10)) | (1L << (NOT - 10)) | (1L << (REV - 10)) | (1L << (OPAR - 10)) | (1L << (TRUE - 10)) | (1L << (FALSE - 10)) | (1L << (NIL - 10)) | (1L << (IF - 10)) | (1L << (WHILE - 10)) | (1L << (FOR - 10)) | (1L << (PRINT - 10)) | (1L << (VAR - 10)) | (1L << (DEF - 10)) | (1L << (IMPORT - 10)) | (1L << (CLASS - 10)) | (1L << (ID - 10)) | (1L << (INT - 10)) | (1L << (FLOAT - 10)) | (1L << (STRING - 10)) | (1L << (SINGLE_COMMENT - 10)) | (1L << (MULTI_COMMENT - 10)) | (1L << (OTHER - 10)))) != 0)) {
				{
				{
				setState(61);
				stat();
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(MuParser.CLASS, 0); }
		public TerminalNode ID() { return getToken(MuParser.ID, 0); }
		public TerminalNode OPAR() { return getToken(MuParser.OPAR, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(MuParser.CPAR, 0); }
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public TerminalNode IMPLEMENTS() { return getToken(MuParser.IMPLEMENTS, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> SEP() { return getTokens(MuParser.SEP); }
		public TerminalNode SEP(int i) {
			return getToken(MuParser.SEP, i);
		}
		public TerminalNode EXTEND() { return getToken(MuParser.EXTEND, 0); }
		public ClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).enterClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).exitClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MuVisitor ) return ((MuVisitor<? extends T>)visitor).visitClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassContext class() throws RecognitionException {
		ClassContext _localctx = new ClassContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_class);
		try {
			int _alt;
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				match(CLASS);
				setState(68);
				match(ID);
				setState(69);
				match(OPAR);
				setState(70);
				variable();
				setState(71);
				match(CPAR);
				setState(72);
				stat_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				match(CLASS);
				setState(75);
				match(ID);
				setState(76);
				match(IMPLEMENTS);
				setState(82);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(77);
						expr(0);
						setState(78);
						match(SEP);
						}
						} 
					}
					setState(84);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				}
				setState(85);
				expr(0);
				setState(86);
				match(OPAR);
				setState(87);
				variable();
				setState(88);
				match(CPAR);
				setState(89);
				stat_block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(91);
				match(CLASS);
				setState(92);
				match(ID);
				setState(93);
				match(EXTEND);
				setState(94);
				expr(0);
				setState(95);
				match(OPAR);
				setState(96);
				variable();
				setState(97);
				match(CPAR);
				setState(98);
				stat_block();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(100);
				match(CLASS);
				setState(101);
				match(ID);
				setState(102);
				match(EXTEND);
				setState(103);
				expr(0);
				setState(104);
				match(IMPLEMENTS);
				setState(110);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(105);
						expr(0);
						setState(106);
						match(SEP);
						}
						} 
					}
					setState(112);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				setState(113);
				expr(0);
				setState(114);
				match(OPAR);
				setState(115);
				variable();
				setState(116);
				match(CPAR);
				setState(117);
				stat_block();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LibContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(MuParser.IMPORT, 0); }
		public List<TerminalNode> ID() { return getTokens(MuParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MuParser.ID, i);
		}
		public List<TerminalNode> DOT() { return getTokens(MuParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(MuParser.DOT, i);
		}
		public List<TerminalNode> AS() { return getTokens(MuParser.AS); }
		public TerminalNode AS(int i) {
			return getToken(MuParser.AS, i);
		}
		public TerminalNode OBRACE() { return getToken(MuParser.OBRACE, 0); }
		public TerminalNode CBRACE() { return getToken(MuParser.CBRACE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> SEP() { return getTokens(MuParser.SEP); }
		public TerminalNode SEP(int i) {
			return getToken(MuParser.SEP, i);
		}
		public LibContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lib; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).enterLib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).exitLib(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MuVisitor ) return ((MuVisitor<? extends T>)visitor).visitLib(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LibContext lib() throws RecognitionException {
		LibContext _localctx = new LibContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_lib);
		int _la;
		try {
			int _alt;
			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				match(IMPORT);
				setState(122);
				match(ID);
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(123);
					match(DOT);
					setState(124);
					match(ID);
					}
					}
					setState(129);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AS) {
					{
					{
					setState(130);
					match(AS);
					setState(131);
					match(ID);
					}
					}
					setState(136);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				match(IMPORT);
				setState(138);
				match(ID);
				setState(139);
				match(DOT);
				setState(140);
				match(OBRACE);
				setState(141);
				match(ID);
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(142);
					match(DOT);
					setState(143);
					match(ID);
					}
					}
					setState(148);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AS) {
					{
					{
					setState(149);
					match(AS);
					setState(150);
					match(ID);
					}
					}
					setState(155);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(156);
				match(CBRACE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(157);
				match(IMPORT);
				setState(158);
				match(ID);
				setState(159);
				match(DOT);
				setState(160);
				match(OBRACE);
				setState(179);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(161);
						match(ID);
						setState(166);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==DOT) {
							{
							{
							setState(162);
							match(DOT);
							setState(163);
							match(ID);
							}
							}
							setState(168);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(173);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==AS) {
							{
							{
							setState(169);
							match(AS);
							setState(170);
							match(ID);
							}
							}
							setState(175);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(176);
						match(SEP);
						}
						} 
					}
					setState(181);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				setState(182);
				expr(0);
				setState(183);
				match(CBRACE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(MuParser.DEF, 0); }
		public TerminalNode ID() { return getToken(MuParser.ID, 0); }
		public TerminalNode OPAR() { return getToken(MuParser.OPAR, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(MuParser.CPAR, 0); }
		public TerminalNode RES() { return getToken(MuParser.RES, 0); }
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).exitFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MuVisitor ) return ((MuVisitor<? extends T>)visitor).visitFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(DEF);
			setState(188);
			match(ID);
			setState(189);
			match(OPAR);
			setState(190);
			variable();
			setState(191);
			match(CPAR);
			setState(192);
			match(RES);
			setState(193);
			data_type();
			setState(194);
			stat_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarContext extends ParserRuleContext {
		public Int_var_declarationContext int_var_declaration() {
			return getRuleContext(Int_var_declarationContext.class,0);
		}
		public Double_var_declarationContext double_var_declaration() {
			return getRuleContext(Double_var_declarationContext.class,0);
		}
		public Str_var_declarationContext str_var_declaration() {
			return getRuleContext(Str_var_declarationContext.class,0);
		}
		public Arr_decl_var_declarationContext arr_decl_var_declaration() {
			return getRuleContext(Arr_decl_var_declarationContext.class,0);
		}
		public Arr_init_var_declarationContext arr_init_var_declaration() {
			return getRuleContext(Arr_init_var_declarationContext.class,0);
		}
		public Cls_var_declarationContext cls_var_declaration() {
			return getRuleContext(Cls_var_declarationContext.class,0);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MuVisitor ) return ((MuVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_var);
		try {
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				int_var_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				double_var_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(198);
				str_var_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(199);
				arr_decl_var_declaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(200);
				arr_init_var_declaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(201);
				cls_var_declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatContext extends ParserRuleContext {
		public Token OTHER;
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public If_statContext if_stat() {
			return getRuleContext(If_statContext.class,0);
		}
		public While_statContext while_stat() {
			return getRuleContext(While_statContext.class,0);
		}
		public For_statContext for_stat() {
			return getRuleContext(For_statContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public LibContext lib() {
			return getRuleContext(LibContext.class,0);
		}
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public ClassContext class() {
			return getRuleContext(ClassContext.class,0);
		}
		public MatchContext match() {
			return getRuleContext(MatchContext.class,0);
		}
		public TerminalNode OTHER() { return getToken(MuParser.OTHER, 0); }
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MuVisitor ) return ((MuVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_stat);
		try {
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				var();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(206);
				comment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(207);
				if_stat();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(208);
				while_stat();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(209);
				for_stat();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(210);
				print();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(211);
				lib();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(212);
				func();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(213);
				class();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(214);
				match();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(215);
				((StatContext)_localctx).OTHER = match(OTHER);
				System.err.println("unknown char: " + (((StatContext)_localctx).OTHER!=null?((StatContext)_localctx).OTHER.getText():null));
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Int_var_declarationContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(MuParser.VAR, 0); }
		public TerminalNode ID() { return getToken(MuParser.ID, 0); }
		public TerminalNode COLON() { return getToken(MuParser.COLON, 0); }
		public TerminalNode INTEGER() { return getToken(MuParser.INTEGER, 0); }
		public TerminalNode ASSIGN() { return getToken(MuParser.ASSIGN, 0); }
		public TerminalNode INT() { return getToken(MuParser.INT, 0); }
		public Int_var_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_var_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).enterInt_var_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).exitInt_var_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MuVisitor ) return ((MuVisitor<? extends T>)visitor).visitInt_var_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int_var_declarationContext int_var_declaration() throws RecognitionException {
		Int_var_declarationContext _localctx = new Int_var_declarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_int_var_declaration);
		try {
			setState(229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				match(VAR);
				setState(220);
				match(ID);
				setState(221);
				match(COLON);
				setState(222);
				match(INTEGER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				match(VAR);
				setState(224);
				match(ID);
				setState(225);
				match(COLON);
				setState(226);
				match(INTEGER);
				setState(227);
				match(ASSIGN);
				setState(228);
				match(INT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Double_var_declarationContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(MuParser.VAR, 0); }
		public TerminalNode ID() { return getToken(MuParser.ID, 0); }
		public TerminalNode COLON() { return getToken(MuParser.COLON, 0); }
		public TerminalNode DOUBLE() { return getToken(MuParser.DOUBLE, 0); }
		public TerminalNode ASSIGN() { return getToken(MuParser.ASSIGN, 0); }
		public TerminalNode FLOAT() { return getToken(MuParser.FLOAT, 0); }
		public Double_var_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_double_var_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).enterDouble_var_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).exitDouble_var_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MuVisitor ) return ((MuVisitor<? extends T>)visitor).visitDouble_var_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Double_var_declarationContext double_var_declaration() throws RecognitionException {
		Double_var_declarationContext _localctx = new Double_var_declarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_double_var_declaration);
		try {
			setState(241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				match(VAR);
				setState(232);
				match(ID);
				setState(233);
				match(COLON);
				setState(234);
				match(DOUBLE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
				match(VAR);
				setState(236);
				match(ID);
				setState(237);
				match(COLON);
				setState(238);
				match(DOUBLE);
				setState(239);
				match(ASSIGN);
				setState(240);
				match(FLOAT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Str_var_declarationContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(MuParser.VAR, 0); }
		public TerminalNode ID() { return getToken(MuParser.ID, 0); }
		public TerminalNode COLON() { return getToken(MuParser.COLON, 0); }
		public TerminalNode STR() { return getToken(MuParser.STR, 0); }
		public TerminalNode ASSIGN() { return getToken(MuParser.ASSIGN, 0); }
		public TerminalNode STRING() { return getToken(MuParser.STRING, 0); }
		public Str_var_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_str_var_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).enterStr_var_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).exitStr_var_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MuVisitor ) return ((MuVisitor<? extends T>)visitor).visitStr_var_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Str_var_declarationContext str_var_declaration() throws RecognitionException {
		Str_var_declarationContext _localctx = new Str_var_declarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_str_var_declaration);
		try {
			setState(253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(243);
				match(VAR);
				setState(244);
				match(ID);
				setState(245);
				match(COLON);
				setState(246);
				match(STR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				match(VAR);
				setState(248);
				match(ID);
				setState(249);
				match(COLON);
				setState(250);
				match(STR);
				setState(251);
				match(ASSIGN);
				setState(252);
				match(STRING);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cls_var_declarationContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(MuParser.VAR, 0); }
		public TerminalNode ID() { return getToken(MuParser.ID, 0); }
		public TerminalNode COLON() { return getToken(MuParser.COLON, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(MuParser.ASSIGN, 0); }
		public TerminalNode NEW() { return getToken(MuParser.NEW, 0); }
		public TerminalNode OPAR() { return getToken(MuParser.OPAR, 0); }
		public SeriesContext series() {
			return getRuleContext(SeriesContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(MuParser.CPAR, 0); }
		public Cls_var_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cls_var_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).enterCls_var_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).exitCls_var_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MuVisitor ) return ((MuVisitor<? extends T>)visitor).visitCls_var_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cls_var_declarationContext cls_var_declaration() throws RecognitionException {
		Cls_var_declarationContext _localctx = new Cls_var_declarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cls_var_declaration);
		try {
			setState(292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				match(VAR);
				setState(256);
				match(ID);
				setState(257);
				match(COLON);
				setState(258);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				match(VAR);
				setState(260);
				match(ID);
				setState(261);
				match(COLON);
				setState(262);
				expr(0);
				setState(263);
				match(ASSIGN);
				setState(264);
				match(NEW);
				setState(265);
				expr(0);
				setState(266);
				match(OPAR);
				setState(267);
				series();
				setState(268);
				expr(0);
				setState(269);
				match(CPAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(271);
				match(VAR);
				setState(272);
				match(ID);
				setState(273);
				match(COLON);
				setState(274);
				expr(0);
				setState(275);
				match(ASSIGN);
				setState(276);
				match(NEW);
				setState(277);
				expr(0);
				setState(278);
				match(OPAR);
				setState(279);
				expr(0);
				setState(280);
				match(CPAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(282);
				match(VAR);
				setState(283);
				match(ID);
				setState(284);
				match(COLON);
				setState(285);
				expr(0);
				setState(286);
				match(ASSIGN);
				setState(287);
				match(NEW);
				setState(288);
				expr(0);
				setState(289);
				match(OPAR);
				setState(290);
				match(CPAR);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arr_decl_var_declarationContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(MuParser.VAR, 0); }
		public TerminalNode ID() { return getToken(MuParser.ID, 0); }
		public TerminalNode COLON() { return getToken(MuParser.COLON, 0); }
		public TerminalNode ARRAY_DEC() { return getToken(MuParser.ARRAY_DEC, 0); }
		public TerminalNode OPAR() { return getToken(MuParser.OPAR, 0); }
		public TerminalNode INT() { return getToken(MuParser.INT, 0); }
		public TerminalNode CPAR() { return getToken(MuParser.CPAR, 0); }
		public Arr_decl_var_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arr_decl_var_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).enterArr_decl_var_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).exitArr_decl_var_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MuVisitor ) return ((MuVisitor<? extends T>)visitor).visitArr_decl_var_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arr_decl_var_declarationContext arr_decl_var_declaration() throws RecognitionException {
		Arr_decl_var_declarationContext _localctx = new Arr_decl_var_declarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_arr_decl_var_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(VAR);
			setState(295);
			match(ID);
			setState(296);
			match(COLON);
			setState(297);
			match(ARRAY_DEC);
			setState(298);
			match(OPAR);
			setState(299);
			match(INT);
			setState(300);
			match(CPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arr_init_var_declarationContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(MuParser.VAR, 0); }
		public TerminalNode ID() { return getToken(MuParser.ID, 0); }
		public TerminalNode COLON() { return getToken(MuParser.COLON, 0); }
		public TerminalNode ARRAY_INIT() { return getToken(MuParser.ARRAY_INIT, 0); }
		public TerminalNode OPAR() { return getToken(MuParser.OPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(MuParser.CPAR, 0); }
		public SeriesContext series() {
			return getRuleContext(SeriesContext.class,0);
		}
		public Arr_init_var_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arr_init_var_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).enterArr_init_var_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).exitArr_init_var_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MuVisitor ) return ((MuVisitor<? extends T>)visitor).visitArr_init_var_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arr_init_var_declarationContext arr_init_var_declaration() throws RecognitionException {
		Arr_init_var_declarationContext _localctx = new Arr_init_var_declarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_arr_init_var_declaration);
		try {
			setState(319);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(302);
				match(VAR);
				setState(303);
				match(ID);
				setState(304);
				match(COLON);
				setState(305);
				match(ARRAY_INIT);
				setState(306);
				match(OPAR);
				setState(307);
				expr(0);
				setState(308);
				match(CPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(310);
				match(VAR);
				setState(311);
				match(ID);
				setState(312);
				match(COLON);
				setState(313);
				match(ARRAY_INIT);
				setState(314);
				match(OPAR);
				setState(315);
				series();
				setState(316);
				expr(0);
				setState(317);
				match(CPAR);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SeriesContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> SEP() { return getTokens(MuParser.SEP); }
		public TerminalNode SEP(int i) {
			return getToken(MuParser.SEP, i);
		}
		public SeriesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_series; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).enterSeries(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).exitSeries(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MuVisitor ) return ((MuVisitor<? extends T>)visitor).visitSeries(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeriesContext series() throws RecognitionException {
		SeriesContext _localctx = new SeriesContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_series);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(321);
					expr(0);
					setState(322);
					match(SEP);
					}
					} 
				}
				setState(328);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MuParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(MuParser.ASSIGN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode NEW() { return getToken(MuParser.NEW, 0); }
		public TerminalNode OPAR() { return getToken(MuParser.OPAR, 0); }
		public TerminalNode CPAR() { return getToken(MuParser.CPAR, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MuVisitor ) return ((MuVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_assignment);
		int _la;
		try {
			setState(352);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(329);
				match(ID);
				setState(330);
				match(ASSIGN);
				setState(331);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(332);
				match(ID);
				setState(333);
				match(ASSIGN);
				setState(334);
				match(NEW);
				setState(335);
				expr(0);
				setState(336);
				match(OPAR);
				setState(337);
				match(CPAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(339);
				match(ID);
				setState(340);
				match(ASSIGN);
				setState(341);
				match(NEW);
				setState(342);
				expr(0);
				setState(343);
				match(OPAR);
				setState(347);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << NOT) | (1L << REV) | (1L << OPAR) | (1L << TRUE) | (1L << FALSE) | (1L << NIL) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) {
					{
					{
					setState(344);
					expr(0);
					}
					}
					setState(349);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(350);
				match(CPAR);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MuParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MuParser.ID, i);
		}
		public List<TerminalNode> COLON() { return getTokens(MuParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(MuParser.COLON, i);
		}
		public List<Data_typeContext> data_type() {
			return getRuleContexts(Data_typeContext.class);
		}
		public Data_typeContext data_type(int i) {
			return getRuleContext(Data_typeContext.class,i);
		}
		public List<TerminalNode> SEP() { return getTokens(MuParser.SEP); }
		public TerminalNode SEP(int i) {
			return getToken(MuParser.SEP, i);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MuVisitor ) return ((MuVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_variable);
		int _la;
		try {
			setState(367);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(354);
				match(ID);
				setState(355);
				match(COLON);
				setState(356);
				data_type();
				setState(363);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEP) {
					{
					{
					setState(357);
					match(SEP);
					setState(358);
					match(ID);
					setState(359);
					match(COLON);
					setState(360);
					data_type();
					}
					}
					setState(365);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case CPAR:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_statContext extends ParserRuleContext {
		public List<TerminalNode> IF() { return getTokens(MuParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(MuParser.IF, i);
		}
		public List<Condition_blockContext> condition_block() {
			return getRuleContexts(Condition_blockContext.class);
		}
		public Condition_blockContext condition_block(int i) {
			return getRuleContext(Condition_blockContext.class,i);
		}
		public List<TerminalNode> ELSE() { return getTokens(MuParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(MuParser.ELSE, i);
		}
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public If_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).enterIf_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).exitIf_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MuVisitor ) return ((MuVisitor<? extends T>)visitor).visitIf_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statContext if_stat() throws RecognitionException {
		If_statContext _localctx = new If_statContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_if_stat);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			match(IF);
			setState(370);
			condition_block();
			setState(376);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(371);
					match(ELSE);
					setState(372);
					match(IF);
					setState(373);
					condition_block();
					}
					} 
				}
				setState(378);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			setState(381);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(379);
				match(ELSE);
				setState(380);
				stat_block();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Condition_blockContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public Condition_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).enterCondition_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).exitCondition_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MuVisitor ) return ((MuVisitor<? extends T>)visitor).visitCondition_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_blockContext condition_block() throws RecognitionException {
		Condition_blockContext _localctx = new Condition_blockContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_condition_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			expr(0);
			setState(384);
			stat_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Stat_blockContext extends ParserRuleContext {
		public TerminalNode OBRACE() { return getToken(MuParser.OBRACE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode CBRACE() { return getToken(MuParser.CBRACE, 0); }
		public List<LibContext> lib() {
			return getRuleContexts(LibContext.class);
		}
		public LibContext lib(int i) {
			return getRuleContext(LibContext.class,i);
		}
		public TerminalNode RETURN() { return getToken(MuParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public Stat_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).enterStat_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).exitStat_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MuVisitor ) return ((MuVisitor<? extends T>)visitor).visitStat_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stat_blockContext stat_block() throws RecognitionException {
		Stat_blockContext _localctx = new Stat_blockContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_stat_block);
		try {
			int _alt;
			setState(408);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(386);
				match(OBRACE);
				setState(390);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(387);
						lib();
						}
						} 
					}
					setState(392);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				}
				setState(393);
				block();
				setState(394);
				match(CBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(396);
				match(OBRACE);
				setState(397);
				block();
				setState(398);
				match(CBRACE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(400);
				match(OBRACE);
				setState(401);
				block();
				setState(402);
				match(RETURN);
				setState(403);
				expr(0);
				setState(404);
				match(CBRACE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(406);
				func();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(407);
				stat();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommentContext extends ParserRuleContext {
		public TerminalNode SINGLE_COMMENT() { return getToken(MuParser.SINGLE_COMMENT, 0); }
		public TerminalNode MULTI_COMMENT() { return getToken(MuParser.MULTI_COMMENT, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).exitComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MuVisitor ) return ((MuVisitor<? extends T>)visitor).visitComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_comment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			_la = _input.LA(1);
			if ( !(_la==SINGLE_COMMENT || _la==MULTI_COMMENT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_statContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(MuParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public While_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).enterWhile_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).exitWhile_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MuVisitor ) return ((MuVisitor<? extends T>)visitor).visitWhile_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statContext while_stat() throws RecognitionException {
		While_statContext _localctx = new While_statContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_while_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			match(WHILE);
			setState(413);
			expr(0);
			setState(414);
			stat_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_statContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(MuParser.FOR, 0); }
		public TerminalNode OPAR() { return getToken(MuParser.OPAR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> INIT() { return getTokens(MuParser.INIT); }
		public TerminalNode INIT(int i) {
			return getToken(MuParser.INIT, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> STEP() { return getTokens(MuParser.STEP); }
		public TerminalNode STEP(int i) {
			return getToken(MuParser.STEP, i);
		}
		public List<TerminalNode> SCOLON() { return getTokens(MuParser.SCOLON); }
		public TerminalNode SCOLON(int i) {
			return getToken(MuParser.SCOLON, i);
		}
		public List<TerminalNode> CPAR() { return getTokens(MuParser.CPAR); }
		public TerminalNode CPAR(int i) {
			return getToken(MuParser.CPAR, i);
		}
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public For_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).enterFor_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).exitFor_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MuVisitor ) return ((MuVisitor<? extends T>)visitor).visitFor_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_statContext for_stat() throws RecognitionException {
		For_statContext _localctx = new For_statContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_for_stat);
		int _la;
		try {
			setState(452);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(416);
				match(FOR);
				setState(417);
				match(OPAR);
				setState(418);
				expr(0);
				setState(419);
				match(INIT);
				setState(420);
				expression();
				setState(421);
				match(STEP);
				setState(422);
				expr(0);
				setState(423);
				match(SCOLON);
				setState(424);
				match(CPAR);
				setState(425);
				stat_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(427);
				match(FOR);
				setState(428);
				match(OPAR);
				setState(439);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << NOT) | (1L << REV) | (1L << OPAR) | (1L << TRUE) | (1L << FALSE) | (1L << NIL) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) {
					{
					{
					setState(429);
					expr(0);
					setState(430);
					match(INIT);
					setState(431);
					expression();
					setState(432);
					match(STEP);
					setState(433);
					expr(0);
					setState(434);
					match(SCOLON);
					setState(435);
					match(CPAR);
					}
					}
					setState(441);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(442);
				match(CPAR);
				setState(443);
				stat_block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(444);
				match(FOR);
				setState(445);
				match(OPAR);
				setState(446);
				expr(0);
				setState(447);
				match(INIT);
				setState(448);
				expr(0);
				setState(449);
				match(CPAR);
				setState(450);
				stat_block();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MatchContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode MATCH() { return getToken(MuParser.MATCH, 0); }
		public TerminalNode OBRACE() { return getToken(MuParser.OBRACE, 0); }
		public TerminalNode CBRACE() { return getToken(MuParser.CBRACE, 0); }
		public List<M_seriesContext> m_series() {
			return getRuleContexts(M_seriesContext.class);
		}
		public M_seriesContext m_series(int i) {
			return getRuleContext(M_seriesContext.class,i);
		}
		public MatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_match; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).enterMatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).exitMatch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MuVisitor ) return ((MuVisitor<? extends T>)visitor).visitMatch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchContext match() throws RecognitionException {
		MatchContext _localctx = new MatchContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_match);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			expr(0);
			setState(455);
			match(MATCH);
			setState(456);
			match(OBRACE);
			setState(458); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(457);
				m_series();
				}
				}
				setState(460); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE );
			setState(462);
			match(CBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class M_seriesContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(MuParser.CASE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RES() { return getToken(MuParser.RES, 0); }
		public TerminalNode BREAK() { return getToken(MuParser.BREAK, 0); }
		public M_seriesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_m_series; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).enterM_series(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).exitM_series(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MuVisitor ) return ((MuVisitor<? extends T>)visitor).visitM_series(this);
			else return visitor.visitChildren(this);
		}
	}

	public final M_seriesContext m_series() throws RecognitionException {
		M_seriesContext _localctx = new M_seriesContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_m_series);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			match(CASE);
			setState(465);
			expr(0);
			setState(466);
			match(RES);
			setState(467);
			expr(0);
			setState(469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BREAK) {
				{
				setState(468);
				match(BREAK);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode OPAR() { return getToken(MuParser.OPAR, 0); }
		public List<TerminalNode> INT() { return getTokens(MuParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(MuParser.INT, i);
		}
		public TerminalNode SEP() { return getToken(MuParser.SEP, 0); }
		public TerminalNode CPAR() { return getToken(MuParser.CPAR, 0); }
		public TerminalNode FLOAT() { return getToken(MuParser.FLOAT, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MuVisitor ) return ((MuVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_expression);
		try {
			setState(482);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(471);
				match(OPAR);
				setState(472);
				match(INT);
				setState(473);
				match(SEP);
				setState(474);
				match(INT);
				setState(475);
				match(CPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(476);
				match(OPAR);
				setState(477);
				match(INT);
				setState(478);
				match(CPAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(479);
				match(OPAR);
				setState(480);
				match(FLOAT);
				setState(481);
				match(CPAR);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(MuParser.PRINT, 0); }
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MuVisitor ) return ((MuVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_print);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			match(PRINT);
			setState(488);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(485);
					atom();
					}
					} 
				}
				setState(490);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnaryExprContext extends ExprContext {
		public TerminalNode REV() { return getToken(MuParser.REV, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public UnaryExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).enterUnaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).exitUnaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MuVisitor ) return ((MuVisitor<? extends T>)visitor).visitUnaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotExprContext extends ExprContext {
		public TerminalNode NOT() { return getToken(MuParser.NOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).enterNotExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).exitNotExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MuVisitor ) return ((MuVisitor<? extends T>)visitor).visitNotExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PowerExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode POW2() { return getToken(MuParser.POW2, 0); }
		public PowerExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).enterPowerExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).exitPowerExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MuVisitor ) return ((MuVisitor<? extends T>)visitor).visitPowerExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryMinusExprContext extends ExprContext {
		public TerminalNode MINUS() { return getToken(MuParser.MINUS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public UnaryMinusExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).enterUnaryMinusExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).exitUnaryMinusExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MuVisitor ) return ((MuVisitor<? extends T>)visitor).visitUnaryMinusExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplicationExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MULT() { return getToken(MuParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(MuParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(MuParser.MOD, 0); }
		public MultiplicationExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).enterMultiplicationExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).exitMultiplicationExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MuVisitor ) return ((MuVisitor<? extends T>)visitor).visitMultiplicationExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtomExprContext extends ExprContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public AtomExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).enterAtomExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).exitAtomExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MuVisitor ) return ((MuVisitor<? extends T>)visitor).visitAtomExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OR() { return getToken(MuParser.OR, 0); }
		public OrExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).enterOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).exitOrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MuVisitor ) return ((MuVisitor<? extends T>)visitor).visitOrExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AdditiveExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(MuParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(MuParser.MINUS, 0); }
		public AdditiveExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).enterAdditiveExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).exitAdditiveExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MuVisitor ) return ((MuVisitor<? extends T>)visitor).visitAdditiveExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelationalExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LTEQ() { return getToken(MuParser.LTEQ, 0); }
		public TerminalNode GTEQ() { return getToken(MuParser.GTEQ, 0); }
		public TerminalNode LT() { return getToken(MuParser.LT, 0); }
		public TerminalNode GT() { return getToken(MuParser.GT, 0); }
		public RelationalExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).enterRelationalExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).exitRelationalExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MuVisitor ) return ((MuVisitor<? extends T>)visitor).visitRelationalExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualityExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQ() { return getToken(MuParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(MuParser.NEQ, 0); }
		public EqualityExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).enterEqualityExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).exitEqualityExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MuVisitor ) return ((MuVisitor<? extends T>)visitor).visitEqualityExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(MuParser.AND, 0); }
		public AndExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).enterAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).exitAndExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MuVisitor ) return ((MuVisitor<? extends T>)visitor).visitAndExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REV:
				{
				_localctx = new UnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(492);
				match(REV);
				setState(493);
				expr(10);
				}
				break;
			case MINUS:
				{
				_localctx = new UnaryMinusExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(494);
				match(MINUS);
				setState(495);
				expr(9);
				}
				break;
			case NOT:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(496);
				match(NOT);
				setState(497);
				expr(8);
				}
				break;
			case OPAR:
			case TRUE:
			case FALSE:
			case NIL:
			case ID:
			case INT:
			case FLOAT:
			case STRING:
				{
				_localctx = new AtomExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(498);
				atom();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(524);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(522);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
					case 1:
						{
						_localctx = new PowerExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(501);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(502);
						match(POW2);
						setState(503);
						expr(12);
						}
						break;
					case 2:
						{
						_localctx = new MultiplicationExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(504);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(505);
						((MultiplicationExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((MultiplicationExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(506);
						expr(8);
						}
						break;
					case 3:
						{
						_localctx = new AdditiveExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(507);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(508);
						((AdditiveExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((AdditiveExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(509);
						expr(7);
						}
						break;
					case 4:
						{
						_localctx = new RelationalExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(510);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(511);
						((RelationalExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << GTEQ) | (1L << LTEQ))) != 0)) ) {
							((RelationalExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(512);
						expr(6);
						}
						break;
					case 5:
						{
						_localctx = new EqualityExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(513);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(514);
						((EqualityExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQ || _la==NEQ) ) {
							((EqualityExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(515);
						expr(5);
						}
						break;
					case 6:
						{
						_localctx = new AndExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(516);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(517);
						match(AND);
						setState(518);
						expr(4);
						}
						break;
					case 7:
						{
						_localctx = new OrExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(519);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(520);
						match(OR);
						setState(521);
						expr(3);
						}
						break;
					}
					} 
				}
				setState(526);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AtomContext extends ParserRuleContext {
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	 
		public AtomContext() { }
		public void copyFrom(AtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParExprContext extends AtomContext {
		public TerminalNode OPAR() { return getToken(MuParser.OPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(MuParser.CPAR, 0); }
		public ParExprContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).enterParExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).exitParExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MuVisitor ) return ((MuVisitor<? extends T>)visitor).visitParExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanAtomContext extends AtomContext {
		public TerminalNode TRUE() { return getToken(MuParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(MuParser.FALSE, 0); }
		public BooleanAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).enterBooleanAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).exitBooleanAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MuVisitor ) return ((MuVisitor<? extends T>)visitor).visitBooleanAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdAtomContext extends AtomContext {
		public TerminalNode ID() { return getToken(MuParser.ID, 0); }
		public IdAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).enterIdAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).exitIdAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MuVisitor ) return ((MuVisitor<? extends T>)visitor).visitIdAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringAtomContext extends AtomContext {
		public TerminalNode STRING() { return getToken(MuParser.STRING, 0); }
		public StringAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).enterStringAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).exitStringAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MuVisitor ) return ((MuVisitor<? extends T>)visitor).visitStringAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NilAtomContext extends AtomContext {
		public TerminalNode NIL() { return getToken(MuParser.NIL, 0); }
		public NilAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).enterNilAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).exitNilAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MuVisitor ) return ((MuVisitor<? extends T>)visitor).visitNilAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberAtomContext extends AtomContext {
		public TerminalNode INT() { return getToken(MuParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(MuParser.FLOAT, 0); }
		public NumberAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).enterNumberAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).exitNumberAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MuVisitor ) return ((MuVisitor<? extends T>)visitor).visitNumberAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_atom);
		int _la;
		try {
			setState(536);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPAR:
				_localctx = new ParExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(527);
				match(OPAR);
				setState(528);
				expr(0);
				setState(529);
				match(CPAR);
				}
				break;
			case INT:
			case FLOAT:
				_localctx = new NumberAtomContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(531);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==FLOAT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case TRUE:
			case FALSE:
				_localctx = new BooleanAtomContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(532);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case ID:
				_localctx = new IdAtomContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(533);
				match(ID);
				}
				break;
			case STRING:
				_localctx = new StringAtomContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(534);
				match(STRING);
				}
				break;
			case NIL:
				_localctx = new NilAtomContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(535);
				match(NIL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Data_typeContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(MuParser.INTEGER, 0); }
		public TerminalNode STR() { return getToken(MuParser.STR, 0); }
		public TerminalNode DOUBLE() { return getToken(MuParser.DOUBLE, 0); }
		public TerminalNode ARRAY_DEC() { return getToken(MuParser.ARRAY_DEC, 0); }
		public TerminalNode ID() { return getToken(MuParser.ID, 0); }
		public Data_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).enterData_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).exitData_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MuVisitor ) return ((MuVisitor<? extends T>)visitor).visitData_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Data_typeContext data_type() throws RecognitionException {
		Data_typeContext _localctx = new Data_typeContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_data_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << DOUBLE) | (1L << STR) | (1L << ARRAY_DEC) | (1L << ID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 26:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3C\u021f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3\3\7\3"+
		"A\n\3\f\3\16\3D\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\7\4S\n\4\f\4\16\4V\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4o\n\4\f\4\16\4r\13"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4z\n\4\3\5\3\5\3\5\3\5\7\5\u0080\n\5\f\5"+
		"\16\5\u0083\13\5\3\5\3\5\7\5\u0087\n\5\f\5\16\5\u008a\13\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\7\5\u0093\n\5\f\5\16\5\u0096\13\5\3\5\3\5\7\5\u009a\n"+
		"\5\f\5\16\5\u009d\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u00a7\n\5\f"+
		"\5\16\5\u00aa\13\5\3\5\3\5\7\5\u00ae\n\5\f\5\16\5\u00b1\13\5\3\5\7\5\u00b4"+
		"\n\5\f\5\16\5\u00b7\13\5\3\5\3\5\3\5\5\5\u00bc\n\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00cd\n\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00dc\n\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\5\t\u00e8\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\5\n\u00f4\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5"+
		"\13\u0100\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\5\f\u0127\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\5\16\u0142\n\16\3\17\3\17\3\17\7\17\u0147\n\17\f\17\16\17"+
		"\u014a\13\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\7\20\u015c\n\20\f\20\16\20\u015f\13\20\3\20\3"+
		"\20\5\20\u0163\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u016c\n\21"+
		"\f\21\16\21\u016f\13\21\3\21\5\21\u0172\n\21\3\22\3\22\3\22\3\22\3\22"+
		"\7\22\u0179\n\22\f\22\16\22\u017c\13\22\3\22\3\22\5\22\u0180\n\22\3\23"+
		"\3\23\3\23\3\24\3\24\7\24\u0187\n\24\f\24\16\24\u018a\13\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24"+
		"\u019b\n\24\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\7\27\u01b8\n\27\f\27\16\27\u01bb\13\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\5\27\u01c7\n\27\3\30\3\30\3\30\3\30\6\30\u01cd"+
		"\n\30\r\30\16\30\u01ce\3\30\3\30\3\31\3\31\3\31\3\31\3\31\5\31\u01d8\n"+
		"\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u01e5"+
		"\n\32\3\33\3\33\7\33\u01e9\n\33\f\33\16\33\u01ec\13\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\5\34\u01f6\n\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\7\34\u020d\n\34\f\34\16\34\u0210\13\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\5\35\u021b\n\35\3\36\3\36\3\36\2\3\66\37\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:\2\n\3\2@A\3\2\r"+
		"\17\3\2\13\f\3\2\7\n\3\2\5\6\3\2=>\3\2\"#\4\2\67:<<\2\u024b\2<\3\2\2\2"+
		"\4B\3\2\2\2\6y\3\2\2\2\b\u00bb\3\2\2\2\n\u00bd\3\2\2\2\f\u00cc\3\2\2\2"+
		"\16\u00db\3\2\2\2\20\u00e7\3\2\2\2\22\u00f3\3\2\2\2\24\u00ff\3\2\2\2\26"+
		"\u0126\3\2\2\2\30\u0128\3\2\2\2\32\u0141\3\2\2\2\34\u0148\3\2\2\2\36\u0162"+
		"\3\2\2\2 \u0171\3\2\2\2\"\u0173\3\2\2\2$\u0181\3\2\2\2&\u019a\3\2\2\2"+
		"(\u019c\3\2\2\2*\u019e\3\2\2\2,\u01c6\3\2\2\2.\u01c8\3\2\2\2\60\u01d2"+
		"\3\2\2\2\62\u01e4\3\2\2\2\64\u01e6\3\2\2\2\66\u01f5\3\2\2\28\u021a\3\2"+
		"\2\2:\u021c\3\2\2\2<=\5\4\3\2=>\7\2\2\3>\3\3\2\2\2?A\5\16\b\2@?\3\2\2"+
		"\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2C\5\3\2\2\2DB\3\2\2\2EF\7\61\2\2FG\7<"+
		"\2\2GH\7\32\2\2HI\5 \21\2IJ\7\33\2\2JK\5&\24\2Kz\3\2\2\2LM\7\61\2\2MN"+
		"\7<\2\2NT\7\62\2\2OP\5\66\34\2PQ\7\36\2\2QS\3\2\2\2RO\3\2\2\2SV\3\2\2"+
		"\2TR\3\2\2\2TU\3\2\2\2UW\3\2\2\2VT\3\2\2\2WX\5\66\34\2XY\7\32\2\2YZ\5"+
		" \21\2Z[\7\33\2\2[\\\5&\24\2\\z\3\2\2\2]^\7\61\2\2^_\7<\2\2_`\7\63\2\2"+
		"`a\5\66\34\2ab\7\32\2\2bc\5 \21\2cd\7\33\2\2de\5&\24\2ez\3\2\2\2fg\7\61"+
		"\2\2gh\7<\2\2hi\7\63\2\2ij\5\66\34\2jp\7\62\2\2kl\5\66\34\2lm\7\36\2\2"+
		"mo\3\2\2\2nk\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2qs\3\2\2\2rp\3\2\2\2"+
		"st\5\66\34\2tu\7\32\2\2uv\5 \21\2vw\7\33\2\2wx\5&\24\2xz\3\2\2\2yE\3\2"+
		"\2\2yL\3\2\2\2y]\3\2\2\2yf\3\2\2\2z\7\3\2\2\2{|\7,\2\2|\u0081\7<\2\2}"+
		"~\7\22\2\2~\u0080\7<\2\2\177}\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3"+
		"\2\2\2\u0081\u0082\3\2\2\2\u0082\u0088\3\2\2\2\u0083\u0081\3\2\2\2\u0084"+
		"\u0085\7-\2\2\u0085\u0087\7<\2\2\u0086\u0084\3\2\2\2\u0087\u008a\3\2\2"+
		"\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u00bc\3\2\2\2\u008a\u0088"+
		"\3\2\2\2\u008b\u008c\7,\2\2\u008c\u008d\7<\2\2\u008d\u008e\7\22\2\2\u008e"+
		"\u008f\7\34\2\2\u008f\u0094\7<\2\2\u0090\u0091\7\22\2\2\u0091\u0093\7"+
		"<\2\2\u0092\u0090\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094"+
		"\u0095\3\2\2\2\u0095\u009b\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u0098\7-"+
		"\2\2\u0098\u009a\7<\2\2\u0099\u0097\3\2\2\2\u009a\u009d\3\2\2\2\u009b"+
		"\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009e\3\2\2\2\u009d\u009b\3\2"+
		"\2\2\u009e\u00bc\7\35\2\2\u009f\u00a0\7,\2\2\u00a0\u00a1\7<\2\2\u00a1"+
		"\u00a2\7\22\2\2\u00a2\u00b5\7\34\2\2\u00a3\u00a8\7<\2\2\u00a4\u00a5\7"+
		"\22\2\2\u00a5\u00a7\7<\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8"+
		"\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00af\3\2\2\2\u00aa\u00a8\3\2"+
		"\2\2\u00ab\u00ac\7-\2\2\u00ac\u00ae\7<\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00b1"+
		"\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1"+
		"\u00af\3\2\2\2\u00b2\u00b4\7\36\2\2\u00b3\u00a3\3\2\2\2\u00b4\u00b7\3"+
		"\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b8\3\2\2\2\u00b7"+
		"\u00b5\3\2\2\2\u00b8\u00b9\5\66\34\2\u00b9\u00ba\7\35\2\2\u00ba\u00bc"+
		"\3\2\2\2\u00bb{\3\2\2\2\u00bb\u008b\3\2\2\2\u00bb\u009f\3\2\2\2\u00bc"+
		"\t\3\2\2\2\u00bd\u00be\7+\2\2\u00be\u00bf\7<\2\2\u00bf\u00c0\7\32\2\2"+
		"\u00c0\u00c1\5 \21\2\u00c1\u00c2\7\33\2\2\u00c2\u00c3\7 \2\2\u00c3\u00c4"+
		"\5:\36\2\u00c4\u00c5\5&\24\2\u00c5\13\3\2\2\2\u00c6\u00cd\5\20\t\2\u00c7"+
		"\u00cd\5\22\n\2\u00c8\u00cd\5\24\13\2\u00c9\u00cd\5\30\r\2\u00ca\u00cd"+
		"\5\32\16\2\u00cb\u00cd\5\26\f\2\u00cc\u00c6\3\2\2\2\u00cc\u00c7\3\2\2"+
		"\2\u00cc\u00c8\3\2\2\2\u00cc\u00c9\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cb"+
		"\3\2\2\2\u00cd\r\3\2\2\2\u00ce\u00dc\5\36\20\2\u00cf\u00dc\5\f\7\2\u00d0"+
		"\u00dc\5(\25\2\u00d1\u00dc\5\"\22\2\u00d2\u00dc\5*\26\2\u00d3\u00dc\5"+
		",\27\2\u00d4\u00dc\5\64\33\2\u00d5\u00dc\5\b\5\2\u00d6\u00dc\5\n\6\2\u00d7"+
		"\u00dc\5\6\4\2\u00d8\u00dc\5.\30\2\u00d9\u00da\7C\2\2\u00da\u00dc\b\b"+
		"\1\2\u00db\u00ce\3\2\2\2\u00db\u00cf\3\2\2\2\u00db\u00d0\3\2\2\2\u00db"+
		"\u00d1\3\2\2\2\u00db\u00d2\3\2\2\2\u00db\u00d3\3\2\2\2\u00db\u00d4\3\2"+
		"\2\2\u00db\u00d5\3\2\2\2\u00db\u00d6\3\2\2\2\u00db\u00d7\3\2\2\2\u00db"+
		"\u00d8\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\17\3\2\2\2\u00dd\u00de\7*\2\2"+
		"\u00de\u00df\7<\2\2\u00df\u00e0\7\30\2\2\u00e0\u00e8\7\67\2\2\u00e1\u00e2"+
		"\7*\2\2\u00e2\u00e3\7<\2\2\u00e3\u00e4\7\30\2\2\u00e4\u00e5\7\67\2\2\u00e5"+
		"\u00e6\7\27\2\2\u00e6\u00e8\7=\2\2\u00e7\u00dd\3\2\2\2\u00e7\u00e1\3\2"+
		"\2\2\u00e8\21\3\2\2\2\u00e9\u00ea\7*\2\2\u00ea\u00eb\7<\2\2\u00eb\u00ec"+
		"\7\30\2\2\u00ec\u00f4\78\2\2\u00ed\u00ee\7*\2\2\u00ee\u00ef\7<\2\2\u00ef"+
		"\u00f0\7\30\2\2\u00f0\u00f1\78\2\2\u00f1\u00f2\7\27\2\2\u00f2\u00f4\7"+
		">\2\2\u00f3\u00e9\3\2\2\2\u00f3\u00ed\3\2\2\2\u00f4\23\3\2\2\2\u00f5\u00f6"+
		"\7*\2\2\u00f6\u00f7\7<\2\2\u00f7\u00f8\7\30\2\2\u00f8\u0100\79\2\2\u00f9"+
		"\u00fa\7*\2\2\u00fa\u00fb\7<\2\2\u00fb\u00fc\7\30\2\2\u00fc\u00fd\79\2"+
		"\2\u00fd\u00fe\7\27\2\2\u00fe\u0100\7?\2\2\u00ff\u00f5\3\2\2\2\u00ff\u00f9"+
		"\3\2\2\2\u0100\25\3\2\2\2\u0101\u0102\7*\2\2\u0102\u0103\7<\2\2\u0103"+
		"\u0104\7\30\2\2\u0104\u0127\5\66\34\2\u0105\u0106\7*\2\2\u0106\u0107\7"+
		"<\2\2\u0107\u0108\7\30\2\2\u0108\u0109\5\66\34\2\u0109\u010a\7\27\2\2"+
		"\u010a\u010b\7/\2\2\u010b\u010c\5\66\34\2\u010c\u010d\7\32\2\2\u010d\u010e"+
		"\5\34\17\2\u010e\u010f\5\66\34\2\u010f\u0110\7\33\2\2\u0110\u0127\3\2"+
		"\2\2\u0111\u0112\7*\2\2\u0112\u0113\7<\2\2\u0113\u0114\7\30\2\2\u0114"+
		"\u0115\5\66\34\2\u0115\u0116\7\27\2\2\u0116\u0117\7/\2\2\u0117\u0118\5"+
		"\66\34\2\u0118\u0119\7\32\2\2\u0119\u011a\5\66\34\2\u011a\u011b\7\33\2"+
		"\2\u011b\u0127\3\2\2\2\u011c\u011d\7*\2\2\u011d\u011e\7<\2\2\u011e\u011f"+
		"\7\30\2\2\u011f\u0120\5\66\34\2\u0120\u0121\7\27\2\2\u0121\u0122\7/\2"+
		"\2\u0122\u0123\5\66\34\2\u0123\u0124\7\32\2\2\u0124\u0125\7\33\2\2\u0125"+
		"\u0127\3\2\2\2\u0126\u0101\3\2\2\2\u0126\u0105\3\2\2\2\u0126\u0111\3\2"+
		"\2\2\u0126\u011c\3\2\2\2\u0127\27\3\2\2\2\u0128\u0129\7*\2\2\u0129\u012a"+
		"\7<\2\2\u012a\u012b\7\30\2\2\u012b\u012c\7:\2\2\u012c\u012d\7\32\2\2\u012d"+
		"\u012e\7=\2\2\u012e\u012f\7\33\2\2\u012f\31\3\2\2\2\u0130\u0131\7*\2\2"+
		"\u0131\u0132\7<\2\2\u0132\u0133\7\30\2\2\u0133\u0134\7;\2\2\u0134\u0135"+
		"\7\32\2\2\u0135\u0136\5\66\34\2\u0136\u0137\7\33\2\2\u0137\u0142\3\2\2"+
		"\2\u0138\u0139\7*\2\2\u0139\u013a\7<\2\2\u013a\u013b\7\30\2\2\u013b\u013c"+
		"\7;\2\2\u013c\u013d\7\32\2\2\u013d\u013e\5\34\17\2\u013e\u013f\5\66\34"+
		"\2\u013f\u0140\7\33\2\2\u0140\u0142\3\2\2\2\u0141\u0130\3\2\2\2\u0141"+
		"\u0138\3\2\2\2\u0142\33\3\2\2\2\u0143\u0144\5\66\34\2\u0144\u0145\7\36"+
		"\2\2\u0145\u0147\3\2\2\2\u0146\u0143\3\2\2\2\u0147\u014a\3\2\2\2\u0148"+
		"\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\35\3\2\2\2\u014a\u0148\3\2\2"+
		"\2\u014b\u014c\7<\2\2\u014c\u014d\7\27\2\2\u014d\u0163\5\66\34\2\u014e"+
		"\u014f\7<\2\2\u014f\u0150\7\27\2\2\u0150\u0151\7/\2\2\u0151\u0152\5\66"+
		"\34\2\u0152\u0153\7\32\2\2\u0153\u0154\7\33\2\2\u0154\u0163\3\2\2\2\u0155"+
		"\u0156\7<\2\2\u0156\u0157\7\27\2\2\u0157\u0158\7/\2\2\u0158\u0159\5\66"+
		"\34\2\u0159\u015d\7\32\2\2\u015a\u015c\5\66\34\2\u015b\u015a\3\2\2\2\u015c"+
		"\u015f\3\2\2\2\u015d\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u0160\3\2"+
		"\2\2\u015f\u015d\3\2\2\2\u0160\u0161\7\33\2\2\u0161\u0163\3\2\2\2\u0162"+
		"\u014b\3\2\2\2\u0162\u014e\3\2\2\2\u0162\u0155\3\2\2\2\u0163\37\3\2\2"+
		"\2\u0164\u0165\7<\2\2\u0165\u0166\7\30\2\2\u0166\u016d\5:\36\2\u0167\u0168"+
		"\7\36\2\2\u0168\u0169\7<\2\2\u0169\u016a\7\30\2\2\u016a\u016c\5:\36\2"+
		"\u016b\u0167\3\2\2\2\u016c\u016f\3\2\2\2\u016d\u016b\3\2\2\2\u016d\u016e"+
		"\3\2\2\2\u016e\u0172\3\2\2\2\u016f\u016d\3\2\2\2\u0170\u0172\3\2\2\2\u0171"+
		"\u0164\3\2\2\2\u0171\u0170\3\2\2\2\u0172!\3\2\2\2\u0173\u0174\7%\2\2\u0174"+
		"\u017a\5$\23\2\u0175\u0176\7&\2\2\u0176\u0177\7%\2\2\u0177\u0179\5$\23"+
		"\2\u0178\u0175\3\2\2\2\u0179\u017c\3\2\2\2\u017a\u0178\3\2\2\2\u017a\u017b"+
		"\3\2\2\2\u017b\u017f\3\2\2\2\u017c\u017a\3\2\2\2\u017d\u017e\7&\2\2\u017e"+
		"\u0180\5&\24\2\u017f\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180#\3\2\2\2"+
		"\u0181\u0182\5\66\34\2\u0182\u0183\5&\24\2\u0183%\3\2\2\2\u0184\u0188"+
		"\7\34\2\2\u0185\u0187\5\b\5\2\u0186\u0185\3\2\2\2\u0187\u018a\3\2\2\2"+
		"\u0188\u0186\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u018b\3\2\2\2\u018a\u0188"+
		"\3\2\2\2\u018b\u018c\5\4\3\2\u018c\u018d\7\35\2\2\u018d\u019b\3\2\2\2"+
		"\u018e\u018f\7\34\2\2\u018f\u0190\5\4\3\2\u0190\u0191\7\35\2\2\u0191\u019b"+
		"\3\2\2\2\u0192\u0193\7\34\2\2\u0193\u0194\5\4\3\2\u0194\u0195\7.\2\2\u0195"+
		"\u0196\5\66\34\2\u0196\u0197\7\35\2\2\u0197\u019b\3\2\2\2\u0198\u019b"+
		"\5\n\6\2\u0199\u019b\5\16\b\2\u019a\u0184\3\2\2\2\u019a\u018e\3\2\2\2"+
		"\u019a\u0192\3\2\2\2\u019a\u0198\3\2\2\2\u019a\u0199\3\2\2\2\u019b\'\3"+
		"\2\2\2\u019c\u019d\t\2\2\2\u019d)\3\2\2\2\u019e\u019f\7\'\2\2\u019f\u01a0"+
		"\5\66\34\2\u01a0\u01a1\5&\24\2\u01a1+\3\2\2\2\u01a2\u01a3\7(\2\2\u01a3"+
		"\u01a4\7\32\2\2\u01a4\u01a5\5\66\34\2\u01a5\u01a6\7!\2\2\u01a6\u01a7\5"+
		"\62\32\2\u01a7\u01a8\7\60\2\2\u01a8\u01a9\5\66\34\2\u01a9\u01aa\7\31\2"+
		"\2\u01aa\u01ab\7\33\2\2\u01ab\u01ac\5&\24\2\u01ac\u01c7\3\2\2\2\u01ad"+
		"\u01ae\7(\2\2\u01ae\u01b9\7\32\2\2\u01af\u01b0\5\66\34\2\u01b0\u01b1\7"+
		"!\2\2\u01b1\u01b2\5\62\32\2\u01b2\u01b3\7\60\2\2\u01b3\u01b4\5\66\34\2"+
		"\u01b4\u01b5\7\31\2\2\u01b5\u01b6\7\33\2\2\u01b6\u01b8\3\2\2\2\u01b7\u01af"+
		"\3\2\2\2\u01b8\u01bb\3\2\2\2\u01b9\u01b7\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba"+
		"\u01bc\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bc\u01bd\7\33\2\2\u01bd\u01c7\5"+
		"&\24\2\u01be\u01bf\7(\2\2\u01bf\u01c0\7\32\2\2\u01c0\u01c1\5\66\34\2\u01c1"+
		"\u01c2\7!\2\2\u01c2\u01c3\5\66\34\2\u01c3\u01c4\7\33\2\2\u01c4\u01c5\5"+
		"&\24\2\u01c5\u01c7\3\2\2\2\u01c6\u01a2\3\2\2\2\u01c6\u01ad\3\2\2\2\u01c6"+
		"\u01be\3\2\2\2\u01c7-\3\2\2\2\u01c8\u01c9\5\66\34\2\u01c9\u01ca\7\64\2"+
		"\2\u01ca\u01cc\7\34\2\2\u01cb\u01cd\5\60\31\2\u01cc\u01cb\3\2\2\2\u01cd"+
		"\u01ce\3\2\2\2\u01ce\u01cc\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d0\3\2"+
		"\2\2\u01d0\u01d1\7\35\2\2\u01d1/\3\2\2\2\u01d2\u01d3\7\65\2\2\u01d3\u01d4"+
		"\5\66\34\2\u01d4\u01d5\7 \2\2\u01d5\u01d7\5\66\34\2\u01d6\u01d8\7\66\2"+
		"\2\u01d7\u01d6\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\61\3\2\2\2\u01d9\u01da"+
		"\7\32\2\2\u01da\u01db\7=\2\2\u01db\u01dc\7\36\2\2\u01dc\u01dd\7=\2\2\u01dd"+
		"\u01e5\7\33\2\2\u01de\u01df\7\32\2\2\u01df\u01e0\7=\2\2\u01e0\u01e5\7"+
		"\33\2\2\u01e1\u01e2\7\32\2\2\u01e2\u01e3\7>\2\2\u01e3\u01e5\7\33\2\2\u01e4"+
		"\u01d9\3\2\2\2\u01e4\u01de\3\2\2\2\u01e4\u01e1\3\2\2\2\u01e5\63\3\2\2"+
		"\2\u01e6\u01ea\7)\2\2\u01e7\u01e9\58\35\2\u01e8\u01e7\3\2\2\2\u01e9\u01ec"+
		"\3\2\2\2\u01ea\u01e8\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\65\3\2\2\2\u01ec"+
		"\u01ea\3\2\2\2\u01ed\u01ee\b\34\1\2\u01ee\u01ef\7\24\2\2\u01ef\u01f6\5"+
		"\66\34\f\u01f0\u01f1\7\f\2\2\u01f1\u01f6\5\66\34\13\u01f2\u01f3\7\21\2"+
		"\2\u01f3\u01f6\5\66\34\n\u01f4\u01f6\58\35\2\u01f5\u01ed\3\2\2\2\u01f5"+
		"\u01f0\3\2\2\2\u01f5\u01f2\3\2\2\2\u01f5\u01f4\3\2\2\2\u01f6\u020e\3\2"+
		"\2\2\u01f7\u01f8\f\r\2\2\u01f8\u01f9\7\23\2\2\u01f9\u020d\5\66\34\16\u01fa"+
		"\u01fb\f\t\2\2\u01fb\u01fc\t\3\2\2\u01fc\u020d\5\66\34\n\u01fd\u01fe\f"+
		"\b\2\2\u01fe\u01ff\t\4\2\2\u01ff\u020d\5\66\34\t\u0200\u0201\f\7\2\2\u0201"+
		"\u0202\t\5\2\2\u0202\u020d\5\66\34\b\u0203\u0204\f\6\2\2\u0204\u0205\t"+
		"\6\2\2\u0205\u020d\5\66\34\7\u0206\u0207\f\5\2\2\u0207\u0208\7\4\2\2\u0208"+
		"\u020d\5\66\34\6\u0209\u020a\f\4\2\2\u020a\u020b\7\3\2\2\u020b\u020d\5"+
		"\66\34\5\u020c\u01f7\3\2\2\2\u020c\u01fa\3\2\2\2\u020c\u01fd\3\2\2\2\u020c"+
		"\u0200\3\2\2\2\u020c\u0203\3\2\2\2\u020c\u0206\3\2\2\2\u020c\u0209\3\2"+
		"\2\2\u020d\u0210\3\2\2\2\u020e\u020c\3\2\2\2\u020e\u020f\3\2\2\2\u020f"+
		"\67\3\2\2\2\u0210\u020e\3\2\2\2\u0211\u0212\7\32\2\2\u0212\u0213\5\66"+
		"\34\2\u0213\u0214\7\33\2\2\u0214\u021b\3\2\2\2\u0215\u021b\t\7\2\2\u0216"+
		"\u021b\t\b\2\2\u0217\u021b\7<\2\2\u0218\u021b\7?\2\2\u0219\u021b\7$\2"+
		"\2\u021a\u0211\3\2\2\2\u021a\u0215\3\2\2\2\u021a\u0216\3\2\2\2\u021a\u0217"+
		"\3\2\2\2\u021a\u0218\3\2\2\2\u021a\u0219\3\2\2\2\u021b9\3\2\2\2\u021c"+
		"\u021d\t\t\2\2\u021d;\3\2\2\2(BTpy\u0081\u0088\u0094\u009b\u00a8\u00af"+
		"\u00b5\u00bb\u00cc\u00db\u00e7\u00f3\u00ff\u0126\u0141\u0148\u015d\u0162"+
		"\u016d\u0171\u017a\u017f\u0188\u019a\u01b9\u01c6\u01ce\u01d7\u01e4\u01ea"+
		"\u01f5\u020c\u020e\u021a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}