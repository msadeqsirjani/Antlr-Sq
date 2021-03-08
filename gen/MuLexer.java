// Generated from D:/Job/Code/Java/Antlr\Mu.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MuLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"OR", "AND", "EQ", "NEQ", "GT", "LT", "GTEQ", "LTEQ", "PLUS", "MINUS", 
			"MULT", "DIV", "MOD", "POW", "NOT", "DOT", "POW2", "REV", "PLUSPLUS", 
			"MINUSMINUS", "ASSIGN", "COLON", "SCOLON", "OPAR", "CPAR", "OBRACE", 
			"CBRACE", "SEP", "SCI", "RES", "INIT", "TRUE", "FALSE", "NIL", "IF", 
			"ELSE", "WHILE", "FOR", "PRINT", "VAR", "DEF", "IMPORT", "AS", "RETURN", 
			"NEW", "STEP", "CLASS", "IMPLEMENTS", "EXTEND", "MATCH", "CASE", "BREAK", 
			"INTEGER", "DOUBLE", "STR", "ARRAY_DEC", "ARRAY_INIT", "ID", "INT", "FLOAT", 
			"STRING", "SINGLE_COMMENT", "MULTI_COMMENT", "SPACE", "OTHER"
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


	public MuLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Mu.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2C\u01e3\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f"+
		"\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3"+
		"\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3"+
		"\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3"+
		"\37\3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$"+
		"\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3"+
		"(\3)\3)\3)\3)\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3-\3-\3-\3-\3"+
		"-\3-\3-\3.\3.\3.\3.\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\38\38\38\38\38\38\38\39\39\39\39\39\39\39\39\39\39\39"+
		"\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39"+
		"\39\39\59\u0177\n9\3:\3:\3:\3:\3:\3:\3;\3;\7;\u0181\n;\f;\16;\u0184\13"+
		";\3<\6<\u0187\n<\r<\16<\u0188\3=\6=\u018c\n=\r=\16=\u018d\3=\3=\7=\u0192"+
		"\n=\f=\16=\u0195\13=\3=\3=\6=\u0199\n=\r=\16=\u019a\3=\3=\3=\7=\u01a0"+
		"\n=\f=\16=\u01a3\13=\3=\3=\6=\u01a7\n=\r=\16=\u01a8\3=\3=\3=\7=\u01ae"+
		"\n=\f=\16=\u01b1\13=\3=\3=\3=\6=\u01b6\n=\r=\16=\u01b7\5=\u01ba\n=\3>"+
		"\3>\3>\3>\7>\u01c0\n>\f>\16>\u01c3\13>\3>\3>\3?\3?\7?\u01c9\n?\f?\16?"+
		"\u01cc\13?\3?\3?\3@\3@\3@\3@\7@\u01d4\n@\f@\16@\u01d7\13@\3@\3@\3@\3@"+
		"\3@\3A\3A\3A\3A\3B\3B\3\u01d5\2C\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60"+
		"_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\3\2"+
		"\t\6\2&&C\\aac|\7\2&&\62;C\\aac|\3\2\62;\3\2\63;\5\2\f\f\17\17$$\4\2\f"+
		"\f\17\17\5\2\13\f\17\17\"\"\2\u01f4\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2"+
		"\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2["+
		"\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2"+
		"\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2"+
		"\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2"+
		"\2\u0081\3\2\2\2\2\u0083\3\2\2\2\3\u0085\3\2\2\2\5\u0088\3\2\2\2\7\u008b"+
		"\3\2\2\2\t\u008e\3\2\2\2\13\u0091\3\2\2\2\r\u0093\3\2\2\2\17\u0095\3\2"+
		"\2\2\21\u0098\3\2\2\2\23\u009b\3\2\2\2\25\u009d\3\2\2\2\27\u009f\3\2\2"+
		"\2\31\u00a1\3\2\2\2\33\u00a3\3\2\2\2\35\u00a5\3\2\2\2\37\u00a7\3\2\2\2"+
		"!\u00a9\3\2\2\2#\u00ab\3\2\2\2%\u00ae\3\2\2\2\'\u00b0\3\2\2\2)\u00b3\3"+
		"\2\2\2+\u00b6\3\2\2\2-\u00b8\3\2\2\2/\u00ba\3\2\2\2\61\u00bc\3\2\2\2\63"+
		"\u00be\3\2\2\2\65\u00c0\3\2\2\2\67\u00c2\3\2\2\29\u00c4\3\2\2\2;\u00c6"+
		"\3\2\2\2=\u00c8\3\2\2\2?\u00cb\3\2\2\2A\u00ce\3\2\2\2C\u00d3\3\2\2\2E"+
		"\u00d9\3\2\2\2G\u00dd\3\2\2\2I\u00e0\3\2\2\2K\u00e5\3\2\2\2M\u00eb\3\2"+
		"\2\2O\u00ef\3\2\2\2Q\u00f5\3\2\2\2S\u00f9\3\2\2\2U\u00fd\3\2\2\2W\u0104"+
		"\3\2\2\2Y\u0107\3\2\2\2[\u010e\3\2\2\2]\u0112\3\2\2\2_\u0117\3\2\2\2a"+
		"\u011d\3\2\2\2c\u0128\3\2\2\2e\u012f\3\2\2\2g\u0135\3\2\2\2i\u013a\3\2"+
		"\2\2k\u0140\3\2\2\2m\u0144\3\2\2\2o\u014b\3\2\2\2q\u0176\3\2\2\2s\u0178"+
		"\3\2\2\2u\u017e\3\2\2\2w\u0186\3\2\2\2y\u01b9\3\2\2\2{\u01bb\3\2\2\2}"+
		"\u01c6\3\2\2\2\177\u01cf\3\2\2\2\u0081\u01dd\3\2\2\2\u0083\u01e1\3\2\2"+
		"\2\u0085\u0086\7~\2\2\u0086\u0087\7~\2\2\u0087\4\3\2\2\2\u0088\u0089\7"+
		"(\2\2\u0089\u008a\7(\2\2\u008a\6\3\2\2\2\u008b\u008c\7?\2\2\u008c\u008d"+
		"\7?\2\2\u008d\b\3\2\2\2\u008e\u008f\7#\2\2\u008f\u0090\7?\2\2\u0090\n"+
		"\3\2\2\2\u0091\u0092\7@\2\2\u0092\f\3\2\2\2\u0093\u0094\7>\2\2\u0094\16"+
		"\3\2\2\2\u0095\u0096\7@\2\2\u0096\u0097\7?\2\2\u0097\20\3\2\2\2\u0098"+
		"\u0099\7>\2\2\u0099\u009a\7?\2\2\u009a\22\3\2\2\2\u009b\u009c\7-\2\2\u009c"+
		"\24\3\2\2\2\u009d\u009e\7/\2\2\u009e\26\3\2\2\2\u009f\u00a0\7,\2\2\u00a0"+
		"\30\3\2\2\2\u00a1\u00a2\7\61\2\2\u00a2\32\3\2\2\2\u00a3\u00a4\7\'\2\2"+
		"\u00a4\34\3\2\2\2\u00a5\u00a6\7`\2\2\u00a6\36\3\2\2\2\u00a7\u00a8\7#\2"+
		"\2\u00a8 \3\2\2\2\u00a9\u00aa\7\60\2\2\u00aa\"\3\2\2\2\u00ab\u00ac\7,"+
		"\2\2\u00ac\u00ad\7,\2\2\u00ad$\3\2\2\2\u00ae\u00af\7\u0080\2\2\u00af&"+
		"\3\2\2\2\u00b0\u00b1\7-\2\2\u00b1\u00b2\7-\2\2\u00b2(\3\2\2\2\u00b3\u00b4"+
		"\7/\2\2\u00b4\u00b5\7/\2\2\u00b5*\3\2\2\2\u00b6\u00b7\7?\2\2\u00b7,\3"+
		"\2\2\2\u00b8\u00b9\7<\2\2\u00b9.\3\2\2\2\u00ba\u00bb\7=\2\2\u00bb\60\3"+
		"\2\2\2\u00bc\u00bd\7*\2\2\u00bd\62\3\2\2\2\u00be\u00bf\7+\2\2\u00bf\64"+
		"\3\2\2\2\u00c0\u00c1\7}\2\2\u00c1\66\3\2\2\2\u00c2\u00c3\7\177\2\2\u00c3"+
		"8\3\2\2\2\u00c4\u00c5\7.\2\2\u00c5:\3\2\2\2\u00c6\u00c7\7g\2\2\u00c7<"+
		"\3\2\2\2\u00c8\u00c9\7?\2\2\u00c9\u00ca\7@\2\2\u00ca>\3\2\2\2\u00cb\u00cc"+
		"\7>\2\2\u00cc\u00cd\7/\2\2\u00cd@\3\2\2\2\u00ce\u00cf\7v\2\2\u00cf\u00d0"+
		"\7t\2\2\u00d0\u00d1\7w\2\2\u00d1\u00d2\7g\2\2\u00d2B\3\2\2\2\u00d3\u00d4"+
		"\7h\2\2\u00d4\u00d5\7c\2\2\u00d5\u00d6\7n\2\2\u00d6\u00d7\7u\2\2\u00d7"+
		"\u00d8\7g\2\2\u00d8D\3\2\2\2\u00d9\u00da\7p\2\2\u00da\u00db\7k\2\2\u00db"+
		"\u00dc\7n\2\2\u00dcF\3\2\2\2\u00dd\u00de\7k\2\2\u00de\u00df\7h\2\2\u00df"+
		"H\3\2\2\2\u00e0\u00e1\7g\2\2\u00e1\u00e2\7n\2\2\u00e2\u00e3\7u\2\2\u00e3"+
		"\u00e4\7g\2\2\u00e4J\3\2\2\2\u00e5\u00e6\7y\2\2\u00e6\u00e7\7j\2\2\u00e7"+
		"\u00e8\7k\2\2\u00e8\u00e9\7n\2\2\u00e9\u00ea\7g\2\2\u00eaL\3\2\2\2\u00eb"+
		"\u00ec\7h\2\2\u00ec\u00ed\7q\2\2\u00ed\u00ee\7t\2\2\u00eeN\3\2\2\2\u00ef"+
		"\u00f0\7r\2\2\u00f0\u00f1\7t\2\2\u00f1\u00f2\7k\2\2\u00f2\u00f3\7p\2\2"+
		"\u00f3\u00f4\7v\2\2\u00f4P\3\2\2\2\u00f5\u00f6\7x\2\2\u00f6\u00f7\7c\2"+
		"\2\u00f7\u00f8\7t\2\2\u00f8R\3\2\2\2\u00f9\u00fa\7f\2\2\u00fa\u00fb\7"+
		"g\2\2\u00fb\u00fc\7h\2\2\u00fcT\3\2\2\2\u00fd\u00fe\7k\2\2\u00fe\u00ff"+
		"\7o\2\2\u00ff\u0100\7r\2\2\u0100\u0101\7q\2\2\u0101\u0102\7t\2\2\u0102"+
		"\u0103\7v\2\2\u0103V\3\2\2\2\u0104\u0105\7c\2\2\u0105\u0106\7u\2\2\u0106"+
		"X\3\2\2\2\u0107\u0108\7t\2\2\u0108\u0109\7g\2\2\u0109\u010a\7v\2\2\u010a"+
		"\u010b\7w\2\2\u010b\u010c\7t\2\2\u010c\u010d\7p\2\2\u010dZ\3\2\2\2\u010e"+
		"\u010f\7p\2\2\u010f\u0110\7g\2\2\u0110\u0111\7y\2\2\u0111\\\3\2\2\2\u0112"+
		"\u0113\7u\2\2\u0113\u0114\7v\2\2\u0114\u0115\7g\2\2\u0115\u0116\7r\2\2"+
		"\u0116^\3\2\2\2\u0117\u0118\7e\2\2\u0118\u0119\7n\2\2\u0119\u011a\7c\2"+
		"\2\u011a\u011b\7u\2\2\u011b\u011c\7u\2\2\u011c`\3\2\2\2\u011d\u011e\7"+
		"k\2\2\u011e\u011f\7o\2\2\u011f\u0120\7r\2\2\u0120\u0121\7n\2\2\u0121\u0122"+
		"\7g\2\2\u0122\u0123\7o\2\2\u0123\u0124\7g\2\2\u0124\u0125\7p\2\2\u0125"+
		"\u0126\7v\2\2\u0126\u0127\7u\2\2\u0127b\3\2\2\2\u0128\u0129\7g\2\2\u0129"+
		"\u012a\7z\2\2\u012a\u012b\7v\2\2\u012b\u012c\7g\2\2\u012c\u012d\7p\2\2"+
		"\u012d\u012e\7f\2\2\u012ed\3\2\2\2\u012f\u0130\7o\2\2\u0130\u0131\7c\2"+
		"\2\u0131\u0132\7v\2\2\u0132\u0133\7e\2\2\u0133\u0134\7j\2\2\u0134f\3\2"+
		"\2\2\u0135\u0136\7e\2\2\u0136\u0137\7c\2\2\u0137\u0138\7u\2\2\u0138\u0139"+
		"\7g\2\2\u0139h\3\2\2\2\u013a\u013b\7d\2\2\u013b\u013c\7t\2\2\u013c\u013d"+
		"\7g\2\2\u013d\u013e\7c\2\2\u013e\u013f\7m\2\2\u013fj\3\2\2\2\u0140\u0141"+
		"\7k\2\2\u0141\u0142\7p\2\2\u0142\u0143\7v\2\2\u0143l\3\2\2\2\u0144\u0145"+
		"\7f\2\2\u0145\u0146\7q\2\2\u0146\u0147\7w\2\2\u0147\u0148\7d\2\2\u0148"+
		"\u0149\7n\2\2\u0149\u014a\7g\2\2\u014an\3\2\2\2\u014b\u014c\7u\2\2\u014c"+
		"\u014d\7v\2\2\u014d\u014e\7t\2\2\u014e\u014f\7k\2\2\u014f\u0150\7p\2\2"+
		"\u0150\u0151\7i\2\2\u0151p\3\2\2\2\u0152\u0153\7C\2\2\u0153\u0154\7t\2"+
		"\2\u0154\u0155\7t\2\2\u0155\u0156\7c\2\2\u0156\u0157\7{\2\2\u0157\u0158"+
		"\7]\2\2\u0158\u0159\7f\2\2\u0159\u015a\7q\2\2\u015a\u015b\7w\2\2\u015b"+
		"\u015c\7d\2\2\u015c\u015d\7n\2\2\u015d\u015e\7g\2\2\u015e\u0177\7_\2\2"+
		"\u015f\u0160\7C\2\2\u0160\u0161\7t\2\2\u0161\u0162\7t\2\2\u0162\u0163"+
		"\7c\2\2\u0163\u0164\7{\2\2\u0164\u0165\7]\2\2\u0165\u0166\7k\2\2\u0166"+
		"\u0167\7p\2\2\u0167\u0168\7v\2\2\u0168\u0177\7_\2\2\u0169\u016a\7C\2\2"+
		"\u016a\u016b\7t\2\2\u016b\u016c\7t\2\2\u016c\u016d\7c\2\2\u016d\u016e"+
		"\7{\2\2\u016e\u016f\7]\2\2\u016f\u0170\7u\2\2\u0170\u0171\7v\2\2\u0171"+
		"\u0172\7t\2\2\u0172\u0173\7k\2\2\u0173\u0174\7p\2\2\u0174\u0175\7i\2\2"+
		"\u0175\u0177\7_\2\2\u0176\u0152\3\2\2\2\u0176\u015f\3\2\2\2\u0176\u0169"+
		"\3\2\2\2\u0177r\3\2\2\2\u0178\u0179\7C\2\2\u0179\u017a\7t\2\2\u017a\u017b"+
		"\7t\2\2\u017b\u017c\7c\2\2\u017c\u017d\7{\2\2\u017dt\3\2\2\2\u017e\u0182"+
		"\t\2\2\2\u017f\u0181\t\3\2\2\u0180\u017f\3\2\2\2\u0181\u0184\3\2\2\2\u0182"+
		"\u0180\3\2\2\2\u0182\u0183\3\2\2\2\u0183v\3\2\2\2\u0184\u0182\3\2\2\2"+
		"\u0185\u0187\t\4\2\2\u0186\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u0186"+
		"\3\2\2\2\u0188\u0189\3\2\2\2\u0189x\3\2\2\2\u018a\u018c\t\4\2\2\u018b"+
		"\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018b\3\2\2\2\u018d\u018e\3\2"+
		"\2\2\u018e\u018f\3\2\2\2\u018f\u0193\7\60\2\2\u0190\u0192\t\4\2\2\u0191"+
		"\u0190\3\2\2\2\u0192\u0195\3\2\2\2\u0193\u0191\3\2\2\2\u0193\u0194\3\2"+
		"\2\2\u0194\u01ba\3\2\2\2\u0195\u0193\3\2\2\2\u0196\u0198\7\60\2\2\u0197"+
		"\u0199\t\4\2\2\u0198\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u0198\3\2"+
		"\2\2\u019a\u019b\3\2\2\2\u019b\u01ba\3\2\2\2\u019c\u019d\t\5\2\2\u019d"+
		"\u01a1\7\60\2\2\u019e\u01a0\t\4\2\2\u019f\u019e\3\2\2\2\u01a0\u01a3\3"+
		"\2\2\2\u01a1\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a4\3\2\2\2\u01a3"+
		"\u01a1\3\2\2\2\u01a4\u01a6\5;\36\2\u01a5\u01a7\t\4\2\2\u01a6\u01a5\3\2"+
		"\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9"+
		"\u01ba\3\2\2\2\u01aa\u01ab\t\5\2\2\u01ab\u01af\7\60\2\2\u01ac\u01ae\t"+
		"\4\2\2\u01ad\u01ac\3\2\2\2\u01ae\u01b1\3\2\2\2\u01af\u01ad\3\2\2\2\u01af"+
		"\u01b0\3\2\2\2\u01b0\u01b2\3\2\2\2\u01b1\u01af\3\2\2\2\u01b2\u01b3\5;"+
		"\36\2\u01b3\u01b5\7/\2\2\u01b4\u01b6\t\4\2\2\u01b5\u01b4\3\2\2\2\u01b6"+
		"\u01b7\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01ba\3\2"+
		"\2\2\u01b9\u018b\3\2\2\2\u01b9\u0196\3\2\2\2\u01b9\u019c\3\2\2\2\u01b9"+
		"\u01aa\3\2\2\2\u01baz\3\2\2\2\u01bb\u01c1\7$\2\2\u01bc\u01c0\n\6\2\2\u01bd"+
		"\u01be\7$\2\2\u01be\u01c0\7$\2\2\u01bf\u01bc\3\2\2\2\u01bf\u01bd\3\2\2"+
		"\2\u01c0\u01c3\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c4"+
		"\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c4\u01c5\7$\2\2\u01c5|\3\2\2\2\u01c6\u01ca"+
		"\7%\2\2\u01c7\u01c9\n\7\2\2\u01c8\u01c7\3\2\2\2\u01c9\u01cc\3\2\2\2\u01ca"+
		"\u01c8\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cd\3\2\2\2\u01cc\u01ca\3\2"+
		"\2\2\u01cd\u01ce\b?\2\2\u01ce~\3\2\2\2\u01cf\u01d0\7\61\2\2\u01d0\u01d1"+
		"\7,\2\2\u01d1\u01d5\3\2\2\2\u01d2\u01d4\13\2\2\2\u01d3\u01d2\3\2\2\2\u01d4"+
		"\u01d7\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d6\u01d8\3\2"+
		"\2\2\u01d7\u01d5\3\2\2\2\u01d8\u01d9\7,\2\2\u01d9\u01da\7\61\2\2\u01da"+
		"\u01db\3\2\2\2\u01db\u01dc\b@\2\2\u01dc\u0080\3\2\2\2\u01dd\u01de\t\b"+
		"\2\2\u01de\u01df\3\2\2\2\u01df\u01e0\bA\2\2\u01e0\u0082\3\2\2\2\u01e1"+
		"\u01e2\13\2\2\2\u01e2\u0084\3\2\2\2\22\2\u0176\u0182\u0188\u018d\u0193"+
		"\u019a\u01a1\u01a8\u01af\u01b7\u01b9\u01bf\u01c1\u01ca\u01d5\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}