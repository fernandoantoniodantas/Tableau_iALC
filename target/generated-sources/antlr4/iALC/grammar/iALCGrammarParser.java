// Generated from iALCGrammar.g4 by ANTLR 4.4

   package iALC.grammar;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class iALCGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, LPAREN=2, RPAREN=3, FORALL=4, EXISTS=5, NOT=6, CONJ=7, DISJ=8, 
		IMPL=9, CHARACTER=10, ENDLINE=11, WHITESPACE=12;
	public static final String[] tokenNames = {
		"<INVALID>", "'.'", "'('", "')'", "'\\u2200'", "'\\u018E'", "'~'", "'\\u2293'", 
		"'\\u2294'", "'\\u226B'", "CHARACTER", "ENDLINE", "WHITESPACE"
	};
	public static final int
		RULE_s = 0, RULE_condition = 1, RULE_formula = 2, RULE_asser = 3, RULE_bin_connective = 4;
	public static final String[] ruleNames = {
		"s", "condition", "formula", "asser", "bin_connective"
	};

	@Override
	public String getGrammarFileName() { return "iALCGrammar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public iALCGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iALCGrammarListener ) ((iALCGrammarListener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iALCGrammarListener ) ((iALCGrammarListener)listener).exitS(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10); condition();
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

	public static class ConditionContext extends ParserRuleContext {
		public List<TerminalNode> ENDLINE() { return getTokens(iALCGrammarParser.ENDLINE); }
		public TerminalNode EOF() { return getToken(iALCGrammarParser.EOF, 0); }
		public List<FormulaContext> formula() {
			return getRuleContexts(FormulaContext.class);
		}
		public FormulaContext formula(int i) {
			return getRuleContext(FormulaContext.class,i);
		}
		public TerminalNode ENDLINE(int i) {
			return getToken(iALCGrammarParser.ENDLINE, i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iALCGrammarListener ) ((iALCGrammarListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iALCGrammarListener ) ((iALCGrammarListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_condition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(12); formula(0);
			setState(17);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(13); match(ENDLINE);
					setState(14); formula(0);
					}
					} 
				}
				setState(19);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDLINE) {
				{
				{
				setState(20); match(ENDLINE);
				}
				}
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(26); match(EOF);
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
		public FormulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formula; }
	 
		public FormulaContext() { }
		public void copyFrom(FormulaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParenFormulaContext extends FormulaContext {
		public TerminalNode LPAREN() { return getToken(iALCGrammarParser.LPAREN, 0); }
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(iALCGrammarParser.RPAREN, 0); }
		public ParenFormulaContext(FormulaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iALCGrammarListener ) ((iALCGrammarListener)listener).enterParenFormula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iALCGrammarListener ) ((iALCGrammarListener)listener).exitParenFormula(this);
		}
	}
	public static class ForallFormulaContext extends FormulaContext {
		public TerminalNode RPAREN(int i) {
			return getToken(iALCGrammarParser.RPAREN, i);
		}
		public AsserContext asser() {
			return getRuleContext(AsserContext.class,0);
		}
		public List<TerminalNode> LPAREN() { return getTokens(iALCGrammarParser.LPAREN); }
		public List<FormulaContext> formula() {
			return getRuleContexts(FormulaContext.class);
		}
		public TerminalNode FORALL() { return getToken(iALCGrammarParser.FORALL, 0); }
		public List<TerminalNode> RPAREN() { return getTokens(iALCGrammarParser.RPAREN); }
		public FormulaContext formula(int i) {
			return getRuleContext(FormulaContext.class,i);
		}
		public TerminalNode LPAREN(int i) {
			return getToken(iALCGrammarParser.LPAREN, i);
		}
		public ForallFormulaContext(FormulaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iALCGrammarListener ) ((iALCGrammarListener)listener).enterForallFormula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iALCGrammarListener ) ((iALCGrammarListener)listener).exitForallFormula(this);
		}
	}
	public static class OpFormulaContext extends FormulaContext {
		public FormulaContext left;
		public Bin_connectiveContext op;
		public FormulaContext right;
		public List<FormulaContext> formula() {
			return getRuleContexts(FormulaContext.class);
		}
		public Bin_connectiveContext bin_connective() {
			return getRuleContext(Bin_connectiveContext.class,0);
		}
		public FormulaContext formula(int i) {
			return getRuleContext(FormulaContext.class,i);
		}
		public OpFormulaContext(FormulaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iALCGrammarListener ) ((iALCGrammarListener)listener).enterOpFormula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iALCGrammarListener ) ((iALCGrammarListener)listener).exitOpFormula(this);
		}
	}
	public static class AtomFormulaContext extends FormulaContext {
		public Token atom;
		public TerminalNode CHARACTER() { return getToken(iALCGrammarParser.CHARACTER, 0); }
		public AtomFormulaContext(FormulaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iALCGrammarListener ) ((iALCGrammarListener)listener).enterAtomFormula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iALCGrammarListener ) ((iALCGrammarListener)listener).exitAtomFormula(this);
		}
	}
	public static class ExistFormulaContext extends FormulaContext {
		public TerminalNode EXISTS() { return getToken(iALCGrammarParser.EXISTS, 0); }
		public TerminalNode RPAREN(int i) {
			return getToken(iALCGrammarParser.RPAREN, i);
		}
		public AsserContext asser() {
			return getRuleContext(AsserContext.class,0);
		}
		public List<TerminalNode> LPAREN() { return getTokens(iALCGrammarParser.LPAREN); }
		public List<FormulaContext> formula() {
			return getRuleContexts(FormulaContext.class);
		}
		public List<TerminalNode> RPAREN() { return getTokens(iALCGrammarParser.RPAREN); }
		public FormulaContext formula(int i) {
			return getRuleContext(FormulaContext.class,i);
		}
		public TerminalNode LPAREN(int i) {
			return getToken(iALCGrammarParser.LPAREN, i);
		}
		public ExistFormulaContext(FormulaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iALCGrammarListener ) ((iALCGrammarListener)listener).enterExistFormula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iALCGrammarListener ) ((iALCGrammarListener)listener).exitExistFormula(this);
		}
	}
	public static class NotFormulaContext extends FormulaContext {
		public TerminalNode NOT() { return getToken(iALCGrammarParser.NOT, 0); }
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public NotFormulaContext(FormulaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iALCGrammarListener ) ((iALCGrammarListener)listener).enterNotFormula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iALCGrammarListener ) ((iALCGrammarListener)listener).exitNotFormula(this);
		}
	}

	public final FormulaContext formula() throws RecognitionException {
		return formula(0);
	}

	private FormulaContext formula(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FormulaContext _localctx = new FormulaContext(_ctx, _parentState);
		FormulaContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_formula, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			switch (_input.LA(1)) {
			case NOT:
				{
				_localctx = new NotFormulaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(29); match(NOT);
				setState(30); formula(3);
				}
				break;
			case CHARACTER:
				{
				_localctx = new AtomFormulaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(31); ((AtomFormulaContext)_localctx).atom = match(CHARACTER);
				}
				break;
			case LPAREN:
				{
				_localctx = new ParenFormulaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(32); match(LPAREN);
				setState(33); formula(0);
				setState(34); match(RPAREN);
				}
				break;
			case FORALL:
				{
				_localctx = new ForallFormulaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(36); match(FORALL);
				{
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LPAREN) {
					{
					{
					setState(37); match(LPAREN);
					}
					}
					setState(42);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(43); asser();
				setState(47);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(44); match(RPAREN);
						}
						} 
					}
					setState(49);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				}
				setState(53);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(50); formula(0);
						}
						} 
					}
					setState(55);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				}
				}
				break;
			case EXISTS:
				{
				_localctx = new ExistFormulaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(56); match(EXISTS);
				{
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LPAREN) {
					{
					{
					setState(57); match(LPAREN);
					}
					}
					setState(62);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(63); asser();
				setState(67);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(64); match(RPAREN);
						}
						} 
					}
					setState(69);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				}
				setState(73);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(70); formula(0);
						}
						} 
					}
					setState(75);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(84);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OpFormulaContext(new FormulaContext(_parentctx, _parentState));
					((OpFormulaContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_formula);
					setState(78);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(79); ((OpFormulaContext)_localctx).op = bin_connective();
					setState(80); ((OpFormulaContext)_localctx).right = formula(6);
					}
					} 
				}
				setState(86);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class AsserContext extends ParserRuleContext {
		public List<TerminalNode> CHARACTER() { return getTokens(iALCGrammarParser.CHARACTER); }
		public TerminalNode CHARACTER(int i) {
			return getToken(iALCGrammarParser.CHARACTER, i);
		}
		public AsserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asser; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iALCGrammarListener ) ((iALCGrammarListener)listener).enterAsser(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iALCGrammarListener ) ((iALCGrammarListener)listener).exitAsser(this);
		}
	}

	public final AsserContext asser() throws RecognitionException {
		AsserContext _localctx = new AsserContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_asser);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CHARACTER) {
				{
				{
				setState(87); match(CHARACTER);
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93); match(T__0);
			setState(97);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(94); match(CHARACTER);
					}
					} 
				}
				setState(99);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
		public TerminalNode IMPL() { return getToken(iALCGrammarParser.IMPL, 0); }
		public TerminalNode DISJ() { return getToken(iALCGrammarParser.DISJ, 0); }
		public TerminalNode CONJ() { return getToken(iALCGrammarParser.CONJ, 0); }
		public Bin_connectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bin_connective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iALCGrammarListener ) ((iALCGrammarListener)listener).enterBin_connective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iALCGrammarListener ) ((iALCGrammarListener)listener).exitBin_connective(this);
		}
	}

	public final Bin_connectiveContext bin_connective() throws RecognitionException {
		Bin_connectiveContext _localctx = new Bin_connectiveContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_bin_connective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONJ) | (1L << DISJ) | (1L << IMPL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		case 2: return formula_sempred((FormulaContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean formula_sempred(FormulaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\16i\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\3\3\3\3\3\7\3\22\n\3\f\3\16\3\25"+
		"\13\3\3\3\7\3\30\n\3\f\3\16\3\33\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\7\4)\n\4\f\4\16\4,\13\4\3\4\3\4\7\4\60\n\4\f\4\16\4\63"+
		"\13\4\3\4\7\4\66\n\4\f\4\16\49\13\4\3\4\3\4\7\4=\n\4\f\4\16\4@\13\4\3"+
		"\4\3\4\7\4D\n\4\f\4\16\4G\13\4\3\4\7\4J\n\4\f\4\16\4M\13\4\5\4O\n\4\3"+
		"\4\3\4\3\4\3\4\7\4U\n\4\f\4\16\4X\13\4\3\5\7\5[\n\5\f\5\16\5^\13\5\3\5"+
		"\3\5\7\5b\n\5\f\5\16\5e\13\5\3\6\3\6\3\6\2\3\6\7\2\4\6\b\n\2\3\3\2\t\13"+
		"r\2\f\3\2\2\2\4\16\3\2\2\2\6N\3\2\2\2\b\\\3\2\2\2\nf\3\2\2\2\f\r\5\4\3"+
		"\2\r\3\3\2\2\2\16\23\5\6\4\2\17\20\7\r\2\2\20\22\5\6\4\2\21\17\3\2\2\2"+
		"\22\25\3\2\2\2\23\21\3\2\2\2\23\24\3\2\2\2\24\31\3\2\2\2\25\23\3\2\2\2"+
		"\26\30\7\r\2\2\27\26\3\2\2\2\30\33\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2"+
		"\32\34\3\2\2\2\33\31\3\2\2\2\34\35\7\2\2\3\35\5\3\2\2\2\36\37\b\4\1\2"+
		"\37 \7\b\2\2 O\5\6\4\5!O\7\f\2\2\"#\7\4\2\2#$\5\6\4\2$%\7\5\2\2%O\3\2"+
		"\2\2&*\7\6\2\2\')\7\4\2\2(\'\3\2\2\2),\3\2\2\2*(\3\2\2\2*+\3\2\2\2+-\3"+
		"\2\2\2,*\3\2\2\2-\61\5\b\5\2.\60\7\5\2\2/.\3\2\2\2\60\63\3\2\2\2\61/\3"+
		"\2\2\2\61\62\3\2\2\2\62\67\3\2\2\2\63\61\3\2\2\2\64\66\5\6\4\2\65\64\3"+
		"\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28O\3\2\2\29\67\3\2\2\2:>\7"+
		"\7\2\2;=\7\4\2\2<;\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?A\3\2\2\2@>\3"+
		"\2\2\2AE\5\b\5\2BD\7\5\2\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FK\3"+
		"\2\2\2GE\3\2\2\2HJ\5\6\4\2IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LO\3"+
		"\2\2\2MK\3\2\2\2N\36\3\2\2\2N!\3\2\2\2N\"\3\2\2\2N&\3\2\2\2N:\3\2\2\2"+
		"OV\3\2\2\2PQ\f\7\2\2QR\5\n\6\2RS\5\6\4\bSU\3\2\2\2TP\3\2\2\2UX\3\2\2\2"+
		"VT\3\2\2\2VW\3\2\2\2W\7\3\2\2\2XV\3\2\2\2Y[\7\f\2\2ZY\3\2\2\2[^\3\2\2"+
		"\2\\Z\3\2\2\2\\]\3\2\2\2]_\3\2\2\2^\\\3\2\2\2_c\7\3\2\2`b\7\f\2\2a`\3"+
		"\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2d\t\3\2\2\2ec\3\2\2\2fg\t\2\2\2g\13"+
		"\3\2\2\2\16\23\31*\61\67>EKNV\\c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}