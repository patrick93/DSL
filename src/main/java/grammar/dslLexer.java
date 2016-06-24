// Generated from dsl.g4 by ANTLR 4.5

    package grammar;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class dslLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, ID=12, PACKAGE_NAME=13, LOWER_ID=14, WS=15;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "ID", "PACKAGE_NAME", "LOWER_ID", "ID_LETTER", "LOWER_ID_LETTER", 
		"DIGIT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "':'", "','", "'package'", "'->'", "'properties'", "'['", "']'", 
		"'constructor'", "'all'", "'none'", "'getterSetter'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"ID", "PACKAGE_NAME", "LOWER_ID", "WS"
	};
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


	public dslLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "dsl.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\21\u008c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\r\3\r\3\r\7\rk\n\r\f\r\16\rn\13\r\3\16\3\16\3\16\7\16s\n\16\f\16\16\16"+
		"v\13\16\3\17\3\17\3\17\7\17{\n\17\f\17\16\17~\13\17\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\3\23\6\23\u0087\n\23\r\23\16\23\u0088\3\23\3\23\2\2\24\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\2"+
		"!\2#\2%\21\3\2\6\5\2C\\aac|\4\2aac|\3\2\62;\5\2\13\f\17\17\"\"\u008e\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2%\3\2\2\2\3\'\3\2\2\2\5)\3\2\2"+
		"\2\7+\3\2\2\2\t\63\3\2\2\2\13\66\3\2\2\2\rA\3\2\2\2\17C\3\2\2\2\21E\3"+
		"\2\2\2\23Q\3\2\2\2\25U\3\2\2\2\27Z\3\2\2\2\31g\3\2\2\2\33o\3\2\2\2\35"+
		"w\3\2\2\2\37\177\3\2\2\2!\u0081\3\2\2\2#\u0083\3\2\2\2%\u0086\3\2\2\2"+
		"\'(\7<\2\2(\4\3\2\2\2)*\7.\2\2*\6\3\2\2\2+,\7r\2\2,-\7c\2\2-.\7e\2\2."+
		"/\7m\2\2/\60\7c\2\2\60\61\7i\2\2\61\62\7g\2\2\62\b\3\2\2\2\63\64\7/\2"+
		"\2\64\65\7@\2\2\65\n\3\2\2\2\66\67\7r\2\2\678\7t\2\289\7q\2\29:\7r\2\2"+
		":;\7g\2\2;<\7t\2\2<=\7v\2\2=>\7k\2\2>?\7g\2\2?@\7u\2\2@\f\3\2\2\2AB\7"+
		"]\2\2B\16\3\2\2\2CD\7_\2\2D\20\3\2\2\2EF\7e\2\2FG\7q\2\2GH\7p\2\2HI\7"+
		"u\2\2IJ\7v\2\2JK\7t\2\2KL\7w\2\2LM\7e\2\2MN\7v\2\2NO\7q\2\2OP\7t\2\2P"+
		"\22\3\2\2\2QR\7c\2\2RS\7n\2\2ST\7n\2\2T\24\3\2\2\2UV\7p\2\2VW\7q\2\2W"+
		"X\7p\2\2XY\7g\2\2Y\26\3\2\2\2Z[\7i\2\2[\\\7g\2\2\\]\7v\2\2]^\7v\2\2^_"+
		"\7g\2\2_`\7t\2\2`a\7U\2\2ab\7g\2\2bc\7v\2\2cd\7v\2\2de\7g\2\2ef\7t\2\2"+
		"f\30\3\2\2\2gl\5\37\20\2hk\5\37\20\2ik\5#\22\2jh\3\2\2\2ji\3\2\2\2kn\3"+
		"\2\2\2lj\3\2\2\2lm\3\2\2\2m\32\3\2\2\2nl\3\2\2\2ot\5\35\17\2pq\7\60\2"+
		"\2qs\5\35\17\2rp\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2u\34\3\2\2\2vt\3"+
		"\2\2\2w|\5!\21\2x{\5!\21\2y{\5#\22\2zx\3\2\2\2zy\3\2\2\2{~\3\2\2\2|z\3"+
		"\2\2\2|}\3\2\2\2}\36\3\2\2\2~|\3\2\2\2\177\u0080\t\2\2\2\u0080 \3\2\2"+
		"\2\u0081\u0082\t\3\2\2\u0082\"\3\2\2\2\u0083\u0084\t\4\2\2\u0084$\3\2"+
		"\2\2\u0085\u0087\t\5\2\2\u0086\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088"+
		"\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\b\23"+
		"\2\2\u008b&\3\2\2\2\t\2jltz|\u0088\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}