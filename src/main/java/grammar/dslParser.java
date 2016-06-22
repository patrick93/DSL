// Generated from dsl.g4 by ANTLR 4.5

    package grammar;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class dslParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		ID=10, PACKAGE_NAME=11, LOWER_ID=12, WS=13;
	public static final int
		RULE_class_stmt = 0, RULE_package_stmt = 1, RULE_properties_stmt = 2, 
		RULE_property_stmt = 3, RULE_constructor_stmt = 4, RULE_getset_stmt = 5;
	public static final String[] ruleNames = {
		"class_stmt", "package_stmt", "properties_stmt", "property_stmt", "constructor_stmt", 
		"getset_stmt"
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

	@Override
	public String getGrammarFileName() { return "dsl.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public dslParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Class_stmtContext extends ParserRuleContext {
		public Class_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_stmt; }
	 
		public Class_stmtContext() { }
		public void copyFrom(Class_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ClassContext extends Class_stmtContext {
		public TerminalNode ID() { return getToken(dslParser.ID, 0); }
		public Package_stmtContext package_stmt() {
			return getRuleContext(Package_stmtContext.class,0);
		}
		public Properties_stmtContext properties_stmt() {
			return getRuleContext(Properties_stmtContext.class,0);
		}
		public Constructor_stmtContext constructor_stmt() {
			return getRuleContext(Constructor_stmtContext.class,0);
		}
		public Getset_stmtContext getset_stmt() {
			return getRuleContext(Getset_stmtContext.class,0);
		}
		public ClassContext(Class_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dslListener ) ((dslListener)listener).enterClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dslListener ) ((dslListener)listener).exitClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dslVisitor ) return ((dslVisitor<? extends T>)visitor).visitClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_stmtContext class_stmt() throws RecognitionException {
		Class_stmtContext _localctx = new Class_stmtContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_class_stmt);
		try {
			_localctx = new ClassContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			match(ID);
			setState(13);
			match(T__0);
			setState(14);
			package_stmt();
			setState(15);
			match(T__1);
			setState(16);
			properties_stmt();
			setState(17);
			match(T__1);
			setState(18);
			constructor_stmt();
			setState(19);
			match(T__1);
			setState(20);
			getset_stmt();
			setState(21);
			match(T__2);
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

	public static class Package_stmtContext extends ParserRuleContext {
		public Package_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_stmt; }
	 
		public Package_stmtContext() { }
		public void copyFrom(Package_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PackageContext extends Package_stmtContext {
		public TerminalNode PACKAGE_NAME() { return getToken(dslParser.PACKAGE_NAME, 0); }
		public PackageContext(Package_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dslListener ) ((dslListener)listener).enterPackage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dslListener ) ((dslListener)listener).exitPackage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dslVisitor ) return ((dslVisitor<? extends T>)visitor).visitPackage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Package_stmtContext package_stmt() throws RecognitionException {
		Package_stmtContext _localctx = new Package_stmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_package_stmt);
		try {
			_localctx = new PackageContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			match(T__3);
			setState(24);
			match(T__0);
			setState(25);
			match(PACKAGE_NAME);
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

	public static class Properties_stmtContext extends ParserRuleContext {
		public Properties_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_properties_stmt; }
	 
		public Properties_stmtContext() { }
		public void copyFrom(Properties_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PropertiesContext extends Properties_stmtContext {
		public List<Property_stmtContext> property_stmt() {
			return getRuleContexts(Property_stmtContext.class);
		}
		public Property_stmtContext property_stmt(int i) {
			return getRuleContext(Property_stmtContext.class,i);
		}
		public PropertiesContext(Properties_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dslListener ) ((dslListener)listener).enterProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dslListener ) ((dslListener)listener).exitProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dslVisitor ) return ((dslVisitor<? extends T>)visitor).visitProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Properties_stmtContext properties_stmt() throws RecognitionException {
		Properties_stmtContext _localctx = new Properties_stmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_properties_stmt);
		int _la;
		try {
			_localctx = new PropertiesContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			match(T__4);
			setState(28);
			match(T__0);
			setState(29);
			match(T__5);
			setState(30);
			property_stmt();
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(31);
				match(T__1);
				setState(32);
				property_stmt();
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(38);
			match(T__6);
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

	public static class Property_stmtContext extends ParserRuleContext {
		public Property_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property_stmt; }
	 
		public Property_stmtContext() { }
		public void copyFrom(Property_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PropertyContext extends Property_stmtContext {
		public List<TerminalNode> ID() { return getTokens(dslParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(dslParser.ID, i);
		}
		public PropertyContext(Property_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dslListener ) ((dslListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dslListener ) ((dslListener)listener).exitProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dslVisitor ) return ((dslVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Property_stmtContext property_stmt() throws RecognitionException {
		Property_stmtContext _localctx = new Property_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_property_stmt);
		try {
			_localctx = new PropertyContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(ID);
			setState(41);
			match(T__0);
			setState(42);
			match(ID);
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

	public static class Constructor_stmtContext extends ParserRuleContext {
		public Constructor_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor_stmt; }
	 
		public Constructor_stmtContext() { }
		public void copyFrom(Constructor_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Constructor_arrayContext extends Constructor_stmtContext {
		public List<TerminalNode> ID() { return getTokens(dslParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(dslParser.ID, i);
		}
		public Constructor_arrayContext(Constructor_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dslListener ) ((dslListener)listener).enterConstructor_array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dslListener ) ((dslListener)listener).exitConstructor_array(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dslVisitor ) return ((dslVisitor<? extends T>)visitor).visitConstructor_array(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Constructor_noneContext extends Constructor_stmtContext {
		public Constructor_noneContext(Constructor_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dslListener ) ((dslListener)listener).enterConstructor_none(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dslListener ) ((dslListener)listener).exitConstructor_none(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dslVisitor ) return ((dslVisitor<? extends T>)visitor).visitConstructor_none(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Constructor_allContext extends Constructor_stmtContext {
		public Constructor_allContext(Constructor_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dslListener ) ((dslListener)listener).enterConstructor_all(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dslListener ) ((dslListener)listener).exitConstructor_all(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dslVisitor ) return ((dslVisitor<? extends T>)visitor).visitConstructor_all(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constructor_stmtContext constructor_stmt() throws RecognitionException {
		Constructor_stmtContext _localctx = new Constructor_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_constructor_stmt);
		int _la;
		try {
			setState(56);
			switch (_input.LA(1)) {
			case T__7:
				_localctx = new Constructor_allContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				match(T__7);
				}
				break;
			case T__5:
				_localctx = new Constructor_arrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				match(T__5);
				setState(46);
				match(ID);
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(47);
					match(T__1);
					setState(48);
					match(ID);
					}
					}
					setState(53);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(54);
				match(T__6);
				}
				break;
			case T__8:
				_localctx = new Constructor_noneContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(55);
				match(T__8);
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

	public static class Getset_stmtContext extends ParserRuleContext {
		public Getset_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getset_stmt; }
	 
		public Getset_stmtContext() { }
		public void copyFrom(Getset_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Getset_noneContext extends Getset_stmtContext {
		public Getset_noneContext(Getset_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dslListener ) ((dslListener)listener).enterGetset_none(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dslListener ) ((dslListener)listener).exitGetset_none(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dslVisitor ) return ((dslVisitor<? extends T>)visitor).visitGetset_none(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Getset_arrayContext extends Getset_stmtContext {
		public List<TerminalNode> ID() { return getTokens(dslParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(dslParser.ID, i);
		}
		public Getset_arrayContext(Getset_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dslListener ) ((dslListener)listener).enterGetset_array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dslListener ) ((dslListener)listener).exitGetset_array(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dslVisitor ) return ((dslVisitor<? extends T>)visitor).visitGetset_array(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Getset_allContext extends Getset_stmtContext {
		public Getset_allContext(Getset_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dslListener ) ((dslListener)listener).enterGetset_all(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dslListener ) ((dslListener)listener).exitGetset_all(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dslVisitor ) return ((dslVisitor<? extends T>)visitor).visitGetset_all(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Getset_stmtContext getset_stmt() throws RecognitionException {
		Getset_stmtContext _localctx = new Getset_stmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_getset_stmt);
		int _la;
		try {
			setState(70);
			switch (_input.LA(1)) {
			case T__7:
				_localctx = new Getset_allContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				match(T__7);
				}
				break;
			case T__5:
				_localctx = new Getset_arrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				match(T__5);
				setState(60);
				match(ID);
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(61);
					match(T__1);
					setState(62);
					match(ID);
					}
					}
					setState(67);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(68);
				match(T__6);
				}
				break;
			case T__8:
				_localctx = new Getset_noneContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(69);
				match(T__8);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\17K\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4$\n\4\f\4\16\4\'\13"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\7\6\64\n\6\f\6\16\6\67"+
		"\13\6\3\6\3\6\5\6;\n\6\3\7\3\7\3\7\3\7\3\7\7\7B\n\7\f\7\16\7E\13\7\3\7"+
		"\3\7\5\7I\n\7\3\7\2\2\b\2\4\6\b\n\f\2\2K\2\16\3\2\2\2\4\31\3\2\2\2\6\35"+
		"\3\2\2\2\b*\3\2\2\2\n:\3\2\2\2\fH\3\2\2\2\16\17\7\f\2\2\17\20\7\3\2\2"+
		"\20\21\5\4\3\2\21\22\7\4\2\2\22\23\5\6\4\2\23\24\7\4\2\2\24\25\5\n\6\2"+
		"\25\26\7\4\2\2\26\27\5\f\7\2\27\30\7\5\2\2\30\3\3\2\2\2\31\32\7\6\2\2"+
		"\32\33\7\3\2\2\33\34\7\r\2\2\34\5\3\2\2\2\35\36\7\7\2\2\36\37\7\3\2\2"+
		"\37 \7\b\2\2 %\5\b\5\2!\"\7\4\2\2\"$\5\b\5\2#!\3\2\2\2$\'\3\2\2\2%#\3"+
		"\2\2\2%&\3\2\2\2&(\3\2\2\2\'%\3\2\2\2()\7\t\2\2)\7\3\2\2\2*+\7\f\2\2+"+
		",\7\3\2\2,-\7\f\2\2-\t\3\2\2\2.;\7\n\2\2/\60\7\b\2\2\60\65\7\f\2\2\61"+
		"\62\7\4\2\2\62\64\7\f\2\2\63\61\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65"+
		"\66\3\2\2\2\668\3\2\2\2\67\65\3\2\2\28;\7\t\2\29;\7\13\2\2:.\3\2\2\2:"+
		"/\3\2\2\2:9\3\2\2\2;\13\3\2\2\2<I\7\n\2\2=>\7\b\2\2>C\7\f\2\2?@\7\4\2"+
		"\2@B\7\f\2\2A?\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2DF\3\2\2\2EC\3\2\2"+
		"\2FI\7\t\2\2GI\7\13\2\2H<\3\2\2\2H=\3\2\2\2HG\3\2\2\2I\r\3\2\2\2\7%\65"+
		":CH";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}