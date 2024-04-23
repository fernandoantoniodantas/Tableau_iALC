// Generated from iALCGrammarModal.g4 by ANTLR 4.8

   package iALC.grammar_modal;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class iALCGrammarModalParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, BOL=2, LPAREN=3, RPAREN=4, FORALL=5, EXISTS=6, NOT=7, CONJ=8, 
		DISJ=9, IMPL=10, Role=11, Concept=12, CHARACTER=13, RELATION=14, ENDLINE=15, 
		WHITESPACE=16;
	public static final int
		RULE_s = 0, RULE_formula = 1, RULE_modal = 2, RULE_bin_connective = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "formula", "modal", "bin_connective"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", null, "'('", "')'", "'\u2200'", "'\u018E'", "'~'", "'\u2293'", 
			"'\u2294'", "'\u226B'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "BOL", "LPAREN", "RPAREN", "FORALL", "EXISTS", "NOT", "CONJ", 
			"DISJ", "IMPL", "Role", "Concept", "CHARACTER", "RELATION", "ENDLINE", 
			"WHITESPACE"
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
	public String getGrammarFileName() { return "iALCGrammarModal.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public iALCGrammarModalParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SContext extends ParserRuleContext {
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public TerminalNode EOF() { return getToken(iALCGrammarModalParser.EOF, 0); }
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iALCGrammarModalListener ) ((iALCGrammarModalListener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iALCGrammarModalListener ) ((iALCGrammarModalListener)listener).exitS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof iALCGrammarModalVisitor ) return ((iALCGrammarModalVisitor<? extends T>)visitor).visitS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			formula();
			setState(9);
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

	public static class FormulaContext extends ParserRuleContext {
		public ModalContext modal() {
			return getRuleContext(ModalContext.class,0);
		}
		public TerminalNode Role() { return getToken(iALCGrammarModalParser.Role, 0); }
		public TerminalNode LPAREN() { return getToken(iALCGrammarModalParser.LPAREN, 0); }
		public List<TerminalNode> Concept() { return getTokens(iALCGrammarModalParser.Concept); }
		public TerminalNode Concept(int i) {
			return getToken(iALCGrammarModalParser.Concept, i);
		}
		public Bin_connectiveContext bin_connective() {
			return getRuleContext(Bin_connectiveContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(iALCGrammarModalParser.RPAREN, 0); }
		public List<TerminalNode> NOT() { return getTokens(iALCGrammarModalParser.NOT); }
		public TerminalNode NOT(int i) {
			return getToken(iALCGrammarModalParser.NOT, i);
		}
		public FormulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iALCGrammarModalListener ) ((iALCGrammarModalListener)listener).enterFormula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iALCGrammarModalListener ) ((iALCGrammarModalListener)listener).exitFormula(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof iALCGrammarModalVisitor ) return ((iALCGrammarModalVisitor<? extends T>)visitor).visitFormula(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormulaContext formula() throws RecognitionException {
		FormulaContext _localctx = new FormulaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_formula);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11);
			modal();
			setState(12);
			match(Role);
			setState(13);
			match(T__0);
			setState(14);
			match(LPAREN);
			setState(18);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NOT) {
				{
				{
				setState(15);
				match(NOT);
				}
				}
				setState(20);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(21);
			match(Concept);
			setState(22);
			bin_connective();
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NOT) {
				{
				{
				setState(23);
				match(NOT);
				}
				}
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(29);
			match(Concept);
			setState(30);
			match(RPAREN);
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

	public static class ModalContext extends ParserRuleContext {
		public TerminalNode FORALL() { return getToken(iALCGrammarModalParser.FORALL, 0); }
		public TerminalNode EXISTS() { return getToken(iALCGrammarModalParser.EXISTS, 0); }
		public ModalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iALCGrammarModalListener ) ((iALCGrammarModalListener)listener).enterModal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iALCGrammarModalListener ) ((iALCGrammarModalListener)listener).exitModal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof iALCGrammarModalVisitor ) return ((iALCGrammarModalVisitor<? extends T>)visitor).visitModal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModalContext modal() throws RecognitionException {
		ModalContext _localctx = new ModalContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_modal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			_la = _input.LA(1);
			if ( !(_la==FORALL || _la==EXISTS) ) {
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

	public static class Bin_connectiveContext extends ParserRuleContext {
		public TerminalNode CONJ() { return getToken(iALCGrammarModalParser.CONJ, 0); }
		public TerminalNode DISJ() { return getToken(iALCGrammarModalParser.DISJ, 0); }
		public TerminalNode IMPL() { return getToken(iALCGrammarModalParser.IMPL, 0); }
		public Bin_connectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bin_connective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iALCGrammarModalListener ) ((iALCGrammarModalListener)listener).enterBin_connective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iALCGrammarModalListener ) ((iALCGrammarModalListener)listener).exitBin_connective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof iALCGrammarModalVisitor ) return ((iALCGrammarModalVisitor<? extends T>)visitor).visitBin_connective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bin_connectiveContext bin_connective() throws RecognitionException {
		Bin_connectiveContext _localctx = new Bin_connectiveContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_bin_connective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONJ) | (1L << DISJ) | (1L << IMPL))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\22\'\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\7\3\23\n\3\f\3\16"+
		"\3\26\13\3\3\3\3\3\3\3\7\3\33\n\3\f\3\16\3\36\13\3\3\3\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\5\2\2\6\2\4\6\b\2\4\3\2\7\b\3\2\n\f\2$\2\n\3\2\2\2\4\r\3\2"+
		"\2\2\6\"\3\2\2\2\b$\3\2\2\2\n\13\5\4\3\2\13\f\7\2\2\3\f\3\3\2\2\2\r\16"+
		"\5\6\4\2\16\17\7\r\2\2\17\20\7\3\2\2\20\24\7\5\2\2\21\23\7\t\2\2\22\21"+
		"\3\2\2\2\23\26\3\2\2\2\24\22\3\2\2\2\24\25\3\2\2\2\25\27\3\2\2\2\26\24"+
		"\3\2\2\2\27\30\7\16\2\2\30\34\5\b\5\2\31\33\7\t\2\2\32\31\3\2\2\2\33\36"+
		"\3\2\2\2\34\32\3\2\2\2\34\35\3\2\2\2\35\37\3\2\2\2\36\34\3\2\2\2\37 \7"+
		"\16\2\2 !\7\6\2\2!\5\3\2\2\2\"#\t\2\2\2#\7\3\2\2\2$%\t\3\2\2%\t\3\2\2"+
		"\2\4\24\34";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}