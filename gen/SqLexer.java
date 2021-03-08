// Generated from D:/Job/Code/Java/Antlr/src\Sq.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SqLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OR=1, AND=2, EQ=3, SAND=4, NEQ=5, GT=6, LT=7, GTEQ=8, LTEQ=9, PLUS=10, 
		MINUS=11, MULT=12, DIV=13, MOD=14, POW=15, NOT=16, DOT=17, POW2=18, SHIFTLEFT=19, 
		SHIFTRIGHT=20, REV=21, PLUSPLUS=22, MINUSMINUS=23, ASSIGN=24, COLON=25, 
		SCOLON=26, OPAR=27, CPAR=28, OBRACE=29, CBRACE=30, SEP=31, SCI=32, RES=33, 
		INIT=34, TRUE=35, FALSE=36, NIL=37, IF=38, ELSE=39, WHILE=40, FOR=41, 
		PRINT=42, VAR=43, DEF=44, IMPORT=45, AS=46, RETURN=47, NEW=48, STEP=49, 
		CLASS=50, IMPLEMENTS=51, EXTEND=52, MATCH=53, CASE=54, BREAK=55, INTEGER=56, 
		DOUBLE=57, STR=58, ARRAY_DEC=59, ARRAY_INIT=60, ID=61, INT=62, FLOAT=63, 
		STRING=64, SINGLE_COMMENT=65, MULTI_COMMENT=66, SPACE=67, OTHER=68;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"OR", "AND", "EQ", "SAND", "NEQ", "GT", "LT", "GTEQ", "LTEQ", "PLUS", 
			"MINUS", "MULT", "DIV", "MOD", "POW", "NOT", "DOT", "POW2", "SHIFTLEFT", 
			"SHIFTRIGHT", "REV", "PLUSPLUS", "MINUSMINUS", "ASSIGN", "COLON", "SCOLON", 
			"OPAR", "CPAR", "OBRACE", "CBRACE", "SEP", "SCI", "RES", "INIT", "TRUE", 
			"FALSE", "NIL", "IF", "ELSE", "WHILE", "FOR", "PRINT", "VAR", "DEF", 
			"IMPORT", "AS", "RETURN", "NEW", "STEP", "CLASS", "IMPLEMENTS", "EXTEND", 
			"MATCH", "CASE", "BREAK", "INTEGER", "DOUBLE", "STR", "ARRAY_DEC", "ARRAY_INIT", 
			"ID", "INT", "FLOAT", "STRING", "SINGLE_COMMENT", "MULTI_COMMENT", "SPACE", 
			"OTHER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'=='", "'&'", "'!='", "'>'", "'<'", "'>='", "'<='", 
			"'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'!'", "'.'", "'**'", "'<<'", 
			"'>>'", "'~'", "'++'", "'--'", "'='", "':'", "';'", "'('", "')'", "'{'", 
			"'}'", "','", "'e'", "'=>'", "'<-'", "'true'", "'false'", "'nil'", "'if'", 
			"'else'", "'while'", "'for'", "'print'", "'var'", "'def'", "'import'", 
			"'as'", "'return'", "'new'", "'step'", "'class'", "'implements'", "'extend'", 
			"'match'", "'case'", "'break'", "'int'", "'double'", "'string'", null, 
			"'Array'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OR", "AND", "EQ", "SAND", "NEQ", "GT", "LT", "GTEQ", "LTEQ", "PLUS", 
			"MINUS", "MULT", "DIV", "MOD", "POW", "NOT", "DOT", "POW2", "SHIFTLEFT", 
			"SHIFTRIGHT", "REV", "PLUSPLUS", "MINUSMINUS", "ASSIGN", "COLON", "SCOLON", 
			"OPAR", "CPAR", "OBRACE", "CBRACE", "SEP", "SCI", "RES", "INIT", "TRUE", 
			"FALSE", "NIL", "IF", "ELSE", "WHILE", "FOR", "PRINT", "VAR", "DEF", 
			"IMPORT", "AS", "RETURN", "NEW", "STEP", "CLASS", "IMPLEMENTS", "EXTEND", 
			"MATCH", "CASE", "BREAK", "INTEGER", "DOUBLE", "STR", "ARRAY_DEC", "ARRAY_INIT", 
			"ID", "INT", "FLOAT", "STRING", "SINGLE_COMMENT", "MULTI_COMMENT", "SPACE", 
			"OTHER"
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


	public SqLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Sq.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2F\u01f8\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\3\2\3\2\3\2\3\2\5\2\u0090"+
		"\n\2\3\3\3\3\3\3\3\3\3\3\5\3\u0097\n\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6"+
		"\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!"+
		"\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&"+
		"\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3+\3+\3+\3+"+
		"\3+\3+\3,\3,\3,\3,\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\38\39\39\39\39\3:\3"+
		":\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3"+
		"<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3"+
		"<\3<\3<\5<\u018c\n<\3=\3=\3=\3=\3=\3=\3>\3>\7>\u0196\n>\f>\16>\u0199\13"+
		">\3?\6?\u019c\n?\r?\16?\u019d\3@\6@\u01a1\n@\r@\16@\u01a2\3@\3@\7@\u01a7"+
		"\n@\f@\16@\u01aa\13@\3@\3@\6@\u01ae\n@\r@\16@\u01af\3@\3@\3@\7@\u01b5"+
		"\n@\f@\16@\u01b8\13@\3@\3@\6@\u01bc\n@\r@\16@\u01bd\3@\3@\3@\7@\u01c3"+
		"\n@\f@\16@\u01c6\13@\3@\3@\3@\6@\u01cb\n@\r@\16@\u01cc\5@\u01cf\n@\3A"+
		"\3A\3A\3A\7A\u01d5\nA\fA\16A\u01d8\13A\3A\3A\3B\3B\7B\u01de\nB\fB\16B"+
		"\u01e1\13B\3B\3B\3C\3C\3C\3C\7C\u01e9\nC\fC\16C\u01ec\13C\3C\3C\3C\3C"+
		"\3C\3D\3D\3D\3D\3E\3E\3\u01ea\2F\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60"+
		"_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085"+
		"D\u0087E\u0089F\3\2\t\6\2&&C\\aac|\7\2&&\62;C\\aac|\3\2\62;\3\2\63;\5"+
		"\2\f\f\17\17$$\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u020b\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3"+
		"\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2"+
		"\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2"+
		"q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3"+
		"\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2"+
		"\u0087\3\2\2\2\2\u0089\3\2\2\2\3\u008f\3\2\2\2\5\u0096\3\2\2\2\7\u0098"+
		"\3\2\2\2\t\u009b\3\2\2\2\13\u009d\3\2\2\2\r\u00a0\3\2\2\2\17\u00a2\3\2"+
		"\2\2\21\u00a4\3\2\2\2\23\u00a7\3\2\2\2\25\u00aa\3\2\2\2\27\u00ac\3\2\2"+
		"\2\31\u00ae\3\2\2\2\33\u00b0\3\2\2\2\35\u00b2\3\2\2\2\37\u00b4\3\2\2\2"+
		"!\u00b6\3\2\2\2#\u00b8\3\2\2\2%\u00ba\3\2\2\2\'\u00bd\3\2\2\2)\u00c0\3"+
		"\2\2\2+\u00c3\3\2\2\2-\u00c5\3\2\2\2/\u00c8\3\2\2\2\61\u00cb\3\2\2\2\63"+
		"\u00cd\3\2\2\2\65\u00cf\3\2\2\2\67\u00d1\3\2\2\29\u00d3\3\2\2\2;\u00d5"+
		"\3\2\2\2=\u00d7\3\2\2\2?\u00d9\3\2\2\2A\u00db\3\2\2\2C\u00dd\3\2\2\2E"+
		"\u00e0\3\2\2\2G\u00e3\3\2\2\2I\u00e8\3\2\2\2K\u00ee\3\2\2\2M\u00f2\3\2"+
		"\2\2O\u00f5\3\2\2\2Q\u00fa\3\2\2\2S\u0100\3\2\2\2U\u0104\3\2\2\2W\u010a"+
		"\3\2\2\2Y\u010e\3\2\2\2[\u0112\3\2\2\2]\u0119\3\2\2\2_\u011c\3\2\2\2a"+
		"\u0123\3\2\2\2c\u0127\3\2\2\2e\u012c\3\2\2\2g\u0132\3\2\2\2i\u013d\3\2"+
		"\2\2k\u0144\3\2\2\2m\u014a\3\2\2\2o\u014f\3\2\2\2q\u0155\3\2\2\2s\u0159"+
		"\3\2\2\2u\u0160\3\2\2\2w\u018b\3\2\2\2y\u018d\3\2\2\2{\u0193\3\2\2\2}"+
		"\u019b\3\2\2\2\177\u01ce\3\2\2\2\u0081\u01d0\3\2\2\2\u0083\u01db\3\2\2"+
		"\2\u0085\u01e4\3\2\2\2\u0087\u01f2\3\2\2\2\u0089\u01f6\3\2\2\2\u008b\u008c"+
		"\7~\2\2\u008c\u0090\7~\2\2\u008d\u008e\7q\2\2\u008e\u0090\7t\2\2\u008f"+
		"\u008b\3\2\2\2\u008f\u008d\3\2\2\2\u0090\4\3\2\2\2\u0091\u0092\7(\2\2"+
		"\u0092\u0097\7(\2\2\u0093\u0094\7c\2\2\u0094\u0095\7p\2\2\u0095\u0097"+
		"\7f\2\2\u0096\u0091\3\2\2\2\u0096\u0093\3\2\2\2\u0097\6\3\2\2\2\u0098"+
		"\u0099\7?\2\2\u0099\u009a\7?\2\2\u009a\b\3\2\2\2\u009b\u009c\7(\2\2\u009c"+
		"\n\3\2\2\2\u009d\u009e\7#\2\2\u009e\u009f\7?\2\2\u009f\f\3\2\2\2\u00a0"+
		"\u00a1\7@\2\2\u00a1\16\3\2\2\2\u00a2\u00a3\7>\2\2\u00a3\20\3\2\2\2\u00a4"+
		"\u00a5\7@\2\2\u00a5\u00a6\7?\2\2\u00a6\22\3\2\2\2\u00a7\u00a8\7>\2\2\u00a8"+
		"\u00a9\7?\2\2\u00a9\24\3\2\2\2\u00aa\u00ab\7-\2\2\u00ab\26\3\2\2\2\u00ac"+
		"\u00ad\7/\2\2\u00ad\30\3\2\2\2\u00ae\u00af\7,\2\2\u00af\32\3\2\2\2\u00b0"+
		"\u00b1\7\61\2\2\u00b1\34\3\2\2\2\u00b2\u00b3\7\'\2\2\u00b3\36\3\2\2\2"+
		"\u00b4\u00b5\7`\2\2\u00b5 \3\2\2\2\u00b6\u00b7\7#\2\2\u00b7\"\3\2\2\2"+
		"\u00b8\u00b9\7\60\2\2\u00b9$\3\2\2\2\u00ba\u00bb\7,\2\2\u00bb\u00bc\7"+
		",\2\2\u00bc&\3\2\2\2\u00bd\u00be\7>\2\2\u00be\u00bf\7>\2\2\u00bf(\3\2"+
		"\2\2\u00c0\u00c1\7@\2\2\u00c1\u00c2\7@\2\2\u00c2*\3\2\2\2\u00c3\u00c4"+
		"\7\u0080\2\2\u00c4,\3\2\2\2\u00c5\u00c6\7-\2\2\u00c6\u00c7\7-\2\2\u00c7"+
		".\3\2\2\2\u00c8\u00c9\7/\2\2\u00c9\u00ca\7/\2\2\u00ca\60\3\2\2\2\u00cb"+
		"\u00cc\7?\2\2\u00cc\62\3\2\2\2\u00cd\u00ce\7<\2\2\u00ce\64\3\2\2\2\u00cf"+
		"\u00d0\7=\2\2\u00d0\66\3\2\2\2\u00d1\u00d2\7*\2\2\u00d28\3\2\2\2\u00d3"+
		"\u00d4\7+\2\2\u00d4:\3\2\2\2\u00d5\u00d6\7}\2\2\u00d6<\3\2\2\2\u00d7\u00d8"+
		"\7\177\2\2\u00d8>\3\2\2\2\u00d9\u00da\7.\2\2\u00da@\3\2\2\2\u00db\u00dc"+
		"\7g\2\2\u00dcB\3\2\2\2\u00dd\u00de\7?\2\2\u00de\u00df\7@\2\2\u00dfD\3"+
		"\2\2\2\u00e0\u00e1\7>\2\2\u00e1\u00e2\7/\2\2\u00e2F\3\2\2\2\u00e3\u00e4"+
		"\7v\2\2\u00e4\u00e5\7t\2\2\u00e5\u00e6\7w\2\2\u00e6\u00e7\7g\2\2\u00e7"+
		"H\3\2\2\2\u00e8\u00e9\7h\2\2\u00e9\u00ea\7c\2\2\u00ea\u00eb\7n\2\2\u00eb"+
		"\u00ec\7u\2\2\u00ec\u00ed\7g\2\2\u00edJ\3\2\2\2\u00ee\u00ef\7p\2\2\u00ef"+
		"\u00f0\7k\2\2\u00f0\u00f1\7n\2\2\u00f1L\3\2\2\2\u00f2\u00f3\7k\2\2\u00f3"+
		"\u00f4\7h\2\2\u00f4N\3\2\2\2\u00f5\u00f6\7g\2\2\u00f6\u00f7\7n\2\2\u00f7"+
		"\u00f8\7u\2\2\u00f8\u00f9\7g\2\2\u00f9P\3\2\2\2\u00fa\u00fb\7y\2\2\u00fb"+
		"\u00fc\7j\2\2\u00fc\u00fd\7k\2\2\u00fd\u00fe\7n\2\2\u00fe\u00ff\7g\2\2"+
		"\u00ffR\3\2\2\2\u0100\u0101\7h\2\2\u0101\u0102\7q\2\2\u0102\u0103\7t\2"+
		"\2\u0103T\3\2\2\2\u0104\u0105\7r\2\2\u0105\u0106\7t\2\2\u0106\u0107\7"+
		"k\2\2\u0107\u0108\7p\2\2\u0108\u0109\7v\2\2\u0109V\3\2\2\2\u010a\u010b"+
		"\7x\2\2\u010b\u010c\7c\2\2\u010c\u010d\7t\2\2\u010dX\3\2\2\2\u010e\u010f"+
		"\7f\2\2\u010f\u0110\7g\2\2\u0110\u0111\7h\2\2\u0111Z\3\2\2\2\u0112\u0113"+
		"\7k\2\2\u0113\u0114\7o\2\2\u0114\u0115\7r\2\2\u0115\u0116\7q\2\2\u0116"+
		"\u0117\7t\2\2\u0117\u0118\7v\2\2\u0118\\\3\2\2\2\u0119\u011a\7c\2\2\u011a"+
		"\u011b\7u\2\2\u011b^\3\2\2\2\u011c\u011d\7t\2\2\u011d\u011e\7g\2\2\u011e"+
		"\u011f\7v\2\2\u011f\u0120\7w\2\2\u0120\u0121\7t\2\2\u0121\u0122\7p\2\2"+
		"\u0122`\3\2\2\2\u0123\u0124\7p\2\2\u0124\u0125\7g\2\2\u0125\u0126\7y\2"+
		"\2\u0126b\3\2\2\2\u0127\u0128\7u\2\2\u0128\u0129\7v\2\2\u0129\u012a\7"+
		"g\2\2\u012a\u012b\7r\2\2\u012bd\3\2\2\2\u012c\u012d\7e\2\2\u012d\u012e"+
		"\7n\2\2\u012e\u012f\7c\2\2\u012f\u0130\7u\2\2\u0130\u0131\7u\2\2\u0131"+
		"f\3\2\2\2\u0132\u0133\7k\2\2\u0133\u0134\7o\2\2\u0134\u0135\7r\2\2\u0135"+
		"\u0136\7n\2\2\u0136\u0137\7g\2\2\u0137\u0138\7o\2\2\u0138\u0139\7g\2\2"+
		"\u0139\u013a\7p\2\2\u013a\u013b\7v\2\2\u013b\u013c\7u\2\2\u013ch\3\2\2"+
		"\2\u013d\u013e\7g\2\2\u013e\u013f\7z\2\2\u013f\u0140\7v\2\2\u0140\u0141"+
		"\7g\2\2\u0141\u0142\7p\2\2\u0142\u0143\7f\2\2\u0143j\3\2\2\2\u0144\u0145"+
		"\7o\2\2\u0145\u0146\7c\2\2\u0146\u0147\7v\2\2\u0147\u0148\7e\2\2\u0148"+
		"\u0149\7j\2\2\u0149l\3\2\2\2\u014a\u014b\7e\2\2\u014b\u014c\7c\2\2\u014c"+
		"\u014d\7u\2\2\u014d\u014e\7g\2\2\u014en\3\2\2\2\u014f\u0150\7d\2\2\u0150"+
		"\u0151\7t\2\2\u0151\u0152\7g\2\2\u0152\u0153\7c\2\2\u0153\u0154\7m\2\2"+
		"\u0154p\3\2\2\2\u0155\u0156\7k\2\2\u0156\u0157\7p\2\2\u0157\u0158\7v\2"+
		"\2\u0158r\3\2\2\2\u0159\u015a\7f\2\2\u015a\u015b\7q\2\2\u015b\u015c\7"+
		"w\2\2\u015c\u015d\7d\2\2\u015d\u015e\7n\2\2\u015e\u015f\7g\2\2\u015ft"+
		"\3\2\2\2\u0160\u0161\7u\2\2\u0161\u0162\7v\2\2\u0162\u0163\7t\2\2\u0163"+
		"\u0164\7k\2\2\u0164\u0165\7p\2\2\u0165\u0166\7i\2\2\u0166v\3\2\2\2\u0167"+
		"\u0168\7C\2\2\u0168\u0169\7t\2\2\u0169\u016a\7t\2\2\u016a\u016b\7c\2\2"+
		"\u016b\u016c\7{\2\2\u016c\u016d\7]\2\2\u016d\u016e\7f\2\2\u016e\u016f"+
		"\7q\2\2\u016f\u0170\7w\2\2\u0170\u0171\7d\2\2\u0171\u0172\7n\2\2\u0172"+
		"\u0173\7g\2\2\u0173\u018c\7_\2\2\u0174\u0175\7C\2\2\u0175\u0176\7t\2\2"+
		"\u0176\u0177\7t\2\2\u0177\u0178\7c\2\2\u0178\u0179\7{\2\2\u0179\u017a"+
		"\7]\2\2\u017a\u017b\7k\2\2\u017b\u017c\7p\2\2\u017c\u017d\7v\2\2\u017d"+
		"\u018c\7_\2\2\u017e\u017f\7C\2\2\u017f\u0180\7t\2\2\u0180\u0181\7t\2\2"+
		"\u0181\u0182\7c\2\2\u0182\u0183\7{\2\2\u0183\u0184\7]\2\2\u0184\u0185"+
		"\7u\2\2\u0185\u0186\7v\2\2\u0186\u0187\7t\2\2\u0187\u0188\7k\2\2\u0188"+
		"\u0189\7p\2\2\u0189\u018a\7i\2\2\u018a\u018c\7_\2\2\u018b\u0167\3\2\2"+
		"\2\u018b\u0174\3\2\2\2\u018b\u017e\3\2\2\2\u018cx\3\2\2\2\u018d\u018e"+
		"\7C\2\2\u018e\u018f\7t\2\2\u018f\u0190\7t\2\2\u0190\u0191\7c\2\2\u0191"+
		"\u0192\7{\2\2\u0192z\3\2\2\2\u0193\u0197\t\2\2\2\u0194\u0196\t\3\2\2\u0195"+
		"\u0194\3\2\2\2\u0196\u0199\3\2\2\2\u0197\u0195\3\2\2\2\u0197\u0198\3\2"+
		"\2\2\u0198|\3\2\2\2\u0199\u0197\3\2\2\2\u019a\u019c\t\4\2\2\u019b\u019a"+
		"\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019b\3\2\2\2\u019d\u019e\3\2\2\2\u019e"+
		"~\3\2\2\2\u019f\u01a1\t\4\2\2\u01a0\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2"+
		"\u01a2\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a8"+
		"\7\60\2\2\u01a5\u01a7\t\4\2\2\u01a6\u01a5\3\2\2\2\u01a7\u01aa\3\2\2\2"+
		"\u01a8\u01a6\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01cf\3\2\2\2\u01aa\u01a8"+
		"\3\2\2\2\u01ab\u01ad\7\60\2\2\u01ac\u01ae\t\4\2\2\u01ad\u01ac\3\2\2\2"+
		"\u01ae\u01af\3\2\2\2\u01af\u01ad\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01cf"+
		"\3\2\2\2\u01b1\u01b2\t\5\2\2\u01b2\u01b6\7\60\2\2\u01b3\u01b5\t\4\2\2"+
		"\u01b4\u01b3\3\2\2\2\u01b5\u01b8\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b6\u01b7"+
		"\3\2\2\2\u01b7\u01b9\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b9\u01bb\5A!\2\u01ba"+
		"\u01bc\t\4\2\2\u01bb\u01ba\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01bb\3\2"+
		"\2\2\u01bd\u01be\3\2\2\2\u01be\u01cf\3\2\2\2\u01bf\u01c0\t\5\2\2\u01c0"+
		"\u01c4\7\60\2\2\u01c1\u01c3\t\4\2\2\u01c2\u01c1\3\2\2\2\u01c3\u01c6\3"+
		"\2\2\2\u01c4\u01c2\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c7\3\2\2\2\u01c6"+
		"\u01c4\3\2\2\2\u01c7\u01c8\5A!\2\u01c8\u01ca\7/\2\2\u01c9\u01cb\t\4\2"+
		"\2\u01ca\u01c9\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cc\u01cd"+
		"\3\2\2\2\u01cd\u01cf\3\2\2\2\u01ce\u01a0\3\2\2\2\u01ce\u01ab\3\2\2\2\u01ce"+
		"\u01b1\3\2\2\2\u01ce\u01bf\3\2\2\2\u01cf\u0080\3\2\2\2\u01d0\u01d6\7$"+
		"\2\2\u01d1\u01d5\n\6\2\2\u01d2\u01d3\7$\2\2\u01d3\u01d5\7$\2\2\u01d4\u01d1"+
		"\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d5\u01d8\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d6"+
		"\u01d7\3\2\2\2\u01d7\u01d9\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d9\u01da\7$"+
		"\2\2\u01da\u0082\3\2\2\2\u01db\u01df\7%\2\2\u01dc\u01de\n\7\2\2\u01dd"+
		"\u01dc\3\2\2\2\u01de\u01e1\3\2\2\2\u01df\u01dd\3\2\2\2\u01df\u01e0\3\2"+
		"\2\2\u01e0\u01e2\3\2\2\2\u01e1\u01df\3\2\2\2\u01e2\u01e3\bB\2\2\u01e3"+
		"\u0084\3\2\2\2\u01e4\u01e5\7\61\2\2\u01e5\u01e6\7,\2\2\u01e6\u01ea\3\2"+
		"\2\2\u01e7\u01e9\13\2\2\2\u01e8\u01e7\3\2\2\2\u01e9\u01ec\3\2\2\2\u01ea"+
		"\u01eb\3\2\2\2\u01ea\u01e8\3\2\2\2\u01eb\u01ed\3\2\2\2\u01ec\u01ea\3\2"+
		"\2\2\u01ed\u01ee\7,\2\2\u01ee\u01ef\7\61\2\2\u01ef\u01f0\3\2\2\2\u01f0"+
		"\u01f1\bC\2\2\u01f1\u0086\3\2\2\2\u01f2\u01f3\t\b\2\2\u01f3\u01f4\3\2"+
		"\2\2\u01f4\u01f5\bD\2\2\u01f5\u0088\3\2\2\2\u01f6\u01f7\13\2\2\2\u01f7"+
		"\u008a\3\2\2\2\24\2\u008f\u0096\u018b\u0197\u019d\u01a2\u01a8\u01af\u01b6"+
		"\u01bd\u01c4\u01cc\u01ce\u01d4\u01d6\u01df\u01ea\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}