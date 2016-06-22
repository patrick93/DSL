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
		ID=10, PACKAGE_NAME=11, LOWER_ID=12, WS=13;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"ID", "PACKAGE_NAME", "LOWER_ID", "ID_LETTER", "LOWER_ID_LETTER", "DIGIT", 
		"WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "':'", "','", "';'", "'package'", "'fields'", "'['", "']'", "'all'", 
		"'none'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "ID", "PACKAGE_NAME", 
		"LOWER_ID", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\17j\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\7\13I\n\13\f\13\16\13L\13\13\3\f\3\f\3\f\7\fQ\n\f\f\f\16\fT\13\f\3\r"+
		"\3\r\3\r\7\rY\n\r\f\r\16\r\\\13\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\6"+
		"\21e\n\21\r\21\16\21f\3\21\3\21\2\2\22\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\2\35\2\37\2!\17\3\2\6\5\2C\\aac|\4\2aac|\3"+
		"\2\62;\5\2\13\f\17\17\"\"l\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2!\3\2\2\2\3#\3\2\2\2\5%\3\2\2\2"+
		"\7\'\3\2\2\2\t)\3\2\2\2\13\61\3\2\2\2\r8\3\2\2\2\17:\3\2\2\2\21<\3\2\2"+
		"\2\23@\3\2\2\2\25E\3\2\2\2\27M\3\2\2\2\31U\3\2\2\2\33]\3\2\2\2\35_\3\2"+
		"\2\2\37a\3\2\2\2!d\3\2\2\2#$\7<\2\2$\4\3\2\2\2%&\7.\2\2&\6\3\2\2\2\'("+
		"\7=\2\2(\b\3\2\2\2)*\7r\2\2*+\7c\2\2+,\7e\2\2,-\7m\2\2-.\7c\2\2./\7i\2"+
		"\2/\60\7g\2\2\60\n\3\2\2\2\61\62\7h\2\2\62\63\7k\2\2\63\64\7g\2\2\64\65"+
		"\7n\2\2\65\66\7f\2\2\66\67\7u\2\2\67\f\3\2\2\289\7]\2\29\16\3\2\2\2:;"+
		"\7_\2\2;\20\3\2\2\2<=\7c\2\2=>\7n\2\2>?\7n\2\2?\22\3\2\2\2@A\7p\2\2AB"+
		"\7q\2\2BC\7p\2\2CD\7g\2\2D\24\3\2\2\2EJ\5\33\16\2FI\5\33\16\2GI\5\37\20"+
		"\2HF\3\2\2\2HG\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2K\26\3\2\2\2LJ\3\2"+
		"\2\2MR\5\31\r\2NO\7\60\2\2OQ\5\31\r\2PN\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS"+
		"\3\2\2\2S\30\3\2\2\2TR\3\2\2\2UZ\5\35\17\2VY\5\35\17\2WY\5\37\20\2XV\3"+
		"\2\2\2XW\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\32\3\2\2\2\\Z\3\2\2\2"+
		"]^\t\2\2\2^\34\3\2\2\2_`\t\3\2\2`\36\3\2\2\2ab\t\4\2\2b \3\2\2\2ce\t\5"+
		"\2\2dc\3\2\2\2ef\3\2\2\2fd\3\2\2\2fg\3\2\2\2gh\3\2\2\2hi\b\21\2\2i\"\3"+
		"\2\2\2\t\2HJRXZf\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}