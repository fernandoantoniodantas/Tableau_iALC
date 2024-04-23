// Generated from d:/eclipse-workspace/iALC/src/main/java/iALC/grammarTest/iALCGrammarTeste.g4 by ANTLR 4.13.1

   package iALC.grammarTest;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class iALCGrammarTesteParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, STRING=2, LPAREN=3, RPAREN=4, FORALL=5, EXISTS=6, NOT=7, CONJ=8, 
		DISJ=9, IMPL=10, CHARACTER=11, ENDLINE=12, WHITESPACE=13;
	public static final int
		RULE_s = 0, RULE_condition = 1, RULE_formula = 2, RULE_role = 3, RULE_concept = 4, 
		RULE_atomic = 5, RULE_lparen = 6, RULE_rparen = 7, RULE_modal = 8, RULE_bin_connective = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "condition", "formula", "role", "concept", "atomic", "lparen", "rparen", 
			"modal", "bin_connective"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", null, "'('", "')'", "'\\u2200'", "'\\u018E'", "'~'", "'\\u2293'", 
			"'\\u2294'", "'\\u226B'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "STRING", "LPAREN", "RPAREN", "FORALL", "EXISTS", "NOT", 
			"CONJ", "DISJ", "IMPL", "CHARACTER", "ENDLINE", "WHITESPACE"
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
	public String getGrammarFileName() { return "iALCGrammarTeste.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public iALCGrammarTesteParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(iALCGrammarTesteParser.EOF, 0); }
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			condition();
			setState(21);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public List<FormulaContext> formula() {
			return getRuleContexts(FormulaContext.class);
		}
		public FormulaContext formula(int i) {
			return getRuleContext(FormulaContext.class,i);
		}
		public TerminalNode EOF() { return getToken(iALCGrammarTesteParser.EOF, 0); }
		public List<TerminalNode> ENDLINE() { return getTokens(iALCGrammarTesteParser.ENDLINE); }
		public TerminalNode ENDLINE(int i) {
			return getToken(iALCGrammarTesteParser.ENDLINE, i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_condition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			formula(0);
			setState(28);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(24);
					match(ENDLINE);
					setState(25);
					formula(0);
					}
					} 
				}
				setState(30);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDLINE) {
				{
				{
				setState(31);
				match(ENDLINE);
				}
				}
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(37);
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

	@SuppressWarnings("CheckReturnValue")
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
	@SuppressWarnings("CheckReturnValue")
	public static class OpFormulaContext extends FormulaContext {
		public FormulaContext left;
		public Bin_connectiveContext op;
		public FormulaContext right;
		public List<FormulaContext> formula() {
			return getRuleContexts(FormulaContext.class);
		}
		public FormulaContext formula(int i) {
			return getRuleContext(FormulaContext.class,i);
		}
		public Bin_connectiveContext bin_connective() {
			return getRuleContext(Bin_connectiveContext.class,0);
		}
		public OpFormulaContext(FormulaContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtomFormulaContext extends FormulaContext {
		public LparenContext lp;
		public AtomicContext atom;
		public RparenContext rp;
		public AtomicContext atomic() {
			return getRuleContext(AtomicContext.class,0);
		}
		public List<LparenContext> lparen() {
			return getRuleContexts(LparenContext.class);
		}
		public LparenContext lparen(int i) {
			return getRuleContext(LparenContext.class,i);
		}
		public List<RparenContext> rparen() {
			return getRuleContexts(RparenContext.class);
		}
		public RparenContext rparen(int i) {
			return getRuleContext(RparenContext.class,i);
		}
		public AtomFormulaContext(FormulaContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotFormulaContext extends FormulaContext {
		public TerminalNode NOT() { return getToken(iALCGrammarTesteParser.NOT, 0); }
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public List<LparenContext> lparen() {
			return getRuleContexts(LparenContext.class);
		}
		public LparenContext lparen(int i) {
			return getRuleContext(LparenContext.class,i);
		}
		public List<RparenContext> rparen() {
			return getRuleContexts(RparenContext.class);
		}
		public RparenContext rparen(int i) {
			return getRuleContext(RparenContext.class,i);
		}
		public NotFormulaContext(FormulaContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ModalFormulaContext extends FormulaContext {
		public RoleContext role() {
			return getRuleContext(RoleContext.class,0);
		}
		public ConceptContext concept() {
			return getRuleContext(ConceptContext.class,0);
		}
		public ModalContext modal() {
			return getRuleContext(ModalContext.class,0);
		}
		public List<LparenContext> lparen() {
			return getRuleContexts(LparenContext.class);
		}
		public LparenContext lparen(int i) {
			return getRuleContext(LparenContext.class,i);
		}
		public List<RparenContext> rparen() {
			return getRuleContexts(RparenContext.class);
		}
		public RparenContext rparen(int i) {
			return getRuleContext(RparenContext.class,i);
		}
		public ModalFormulaContext(FormulaContext ctx) { copyFrom(ctx); }
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
			setState(83);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
			case LPAREN:
				{
				_localctx = new AtomFormulaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LPAREN) {
					{
					{
					setState(40);
					((AtomFormulaContext)_localctx).lp = lparen();
					}
					}
					setState(45);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(46);
				((AtomFormulaContext)_localctx).atom = atomic();
				setState(50);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(47);
						((AtomFormulaContext)_localctx).rp = rparen();
						}
						} 
					}
					setState(52);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				}
				break;
			case FORALL:
			case EXISTS:
				{
				_localctx = new ModalFormulaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				{
				setState(53);
				modal();
				}
				setState(54);
				role();
				setState(55);
				match(T__0);
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LPAREN) {
					{
					{
					setState(56);
					lparen();
					}
					}
					setState(61);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(62);
				concept();
				setState(66);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(63);
						rparen();
						}
						} 
					}
					setState(68);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				}
				break;
			case NOT:
				{
				_localctx = new NotFormulaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(69);
				match(NOT);
				setState(73);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(70);
						lparen();
						}
						} 
					}
					setState(75);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				setState(76);
				formula(0);
				setState(80);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(77);
						rparen();
						}
						} 
					}
					setState(82);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(91);
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
					setState(85);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(86);
					((OpFormulaContext)_localctx).op = bin_connective();
					setState(87);
					((OpFormulaContext)_localctx).right = formula(4);
					}
					} 
				}
				setState(93);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RoleContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(iALCGrammarTesteParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(iALCGrammarTesteParser.STRING, i);
		}
		public RoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_role; }
	}

	public final RoleContext role() throws RecognitionException {
		RoleContext _localctx = new RoleContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_role);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(94);
				match(STRING);
				}
				}
				setState(97); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING );
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConceptContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(iALCGrammarTesteParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(iALCGrammarTesteParser.STRING, i);
		}
		public ConceptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concept; }
	}

	public final ConceptContext concept() throws RecognitionException {
		ConceptContext _localctx = new ConceptContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_concept);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(100); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(99);
					match(STRING);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(102); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	@SuppressWarnings("CheckReturnValue")
	public static class AtomicContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(iALCGrammarTesteParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(iALCGrammarTesteParser.STRING, i);
		}
		public AtomicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomic; }
	}

	public final AtomicContext atomic() throws RecognitionException {
		AtomicContext _localctx = new AtomicContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_atomic);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(105); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(104);
					match(STRING);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(107); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	@SuppressWarnings("CheckReturnValue")
	public static class LparenContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(iALCGrammarTesteParser.LPAREN, 0); }
		public LparenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lparen; }
	}

	public final LparenContext lparen() throws RecognitionException {
		LparenContext _localctx = new LparenContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_lparen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(LPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RparenContext extends ParserRuleContext {
		public TerminalNode RPAREN() { return getToken(iALCGrammarTesteParser.RPAREN, 0); }
		public RparenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rparen; }
	}

	public final RparenContext rparen() throws RecognitionException {
		RparenContext _localctx = new RparenContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_rparen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ModalContext extends ParserRuleContext {
		public TerminalNode FORALL() { return getToken(iALCGrammarTesteParser.FORALL, 0); }
		public TerminalNode EXISTS() { return getToken(iALCGrammarTesteParser.EXISTS, 0); }
		public ModalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modal; }
	}

	public final ModalContext modal() throws RecognitionException {
		ModalContext _localctx = new ModalContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_modal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Bin_connectiveContext extends ParserRuleContext {
		public TerminalNode CONJ() { return getToken(iALCGrammarTesteParser.CONJ, 0); }
		public TerminalNode DISJ() { return getToken(iALCGrammarTesteParser.DISJ, 0); }
		public TerminalNode IMPL() { return getToken(iALCGrammarTesteParser.IMPL, 0); }
		public Bin_connectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bin_connective; }
	}

	public final Bin_connectiveContext bin_connective() throws RecognitionException {
		Bin_connectiveContext _localctx = new Bin_connectiveContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_bin_connective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1792L) != 0)) ) {
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
		case 2:
			return formula_sempred((FormulaContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean formula_sempred(FormulaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\rv\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0005\u0001\u001b\b\u0001\n\u0001\f\u0001\u001e"+
		"\t\u0001\u0001\u0001\u0005\u0001!\b\u0001\n\u0001\f\u0001$\t\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0005\u0002*\b\u0002\n\u0002"+
		"\f\u0002-\t\u0002\u0001\u0002\u0001\u0002\u0005\u00021\b\u0002\n\u0002"+
		"\f\u00024\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005"+
		"\u0002:\b\u0002\n\u0002\f\u0002=\t\u0002\u0001\u0002\u0001\u0002\u0005"+
		"\u0002A\b\u0002\n\u0002\f\u0002D\t\u0002\u0001\u0002\u0001\u0002\u0005"+
		"\u0002H\b\u0002\n\u0002\f\u0002K\t\u0002\u0001\u0002\u0001\u0002\u0005"+
		"\u0002O\b\u0002\n\u0002\f\u0002R\t\u0002\u0003\u0002T\b\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002Z\b\u0002\n\u0002\f\u0002"+
		"]\t\u0002\u0001\u0003\u0004\u0003`\b\u0003\u000b\u0003\f\u0003a\u0001"+
		"\u0004\u0004\u0004e\b\u0004\u000b\u0004\f\u0004f\u0001\u0005\u0004\u0005"+
		"j\b\u0005\u000b\u0005\f\u0005k\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0000\u0001\u0004\n\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0000\u0002\u0001\u0000\u0005"+
		"\u0006\u0001\u0000\b\ny\u0000\u0014\u0001\u0000\u0000\u0000\u0002\u0017"+
		"\u0001\u0000\u0000\u0000\u0004S\u0001\u0000\u0000\u0000\u0006_\u0001\u0000"+
		"\u0000\u0000\bd\u0001\u0000\u0000\u0000\ni\u0001\u0000\u0000\u0000\fm"+
		"\u0001\u0000\u0000\u0000\u000eo\u0001\u0000\u0000\u0000\u0010q\u0001\u0000"+
		"\u0000\u0000\u0012s\u0001\u0000\u0000\u0000\u0014\u0015\u0003\u0002\u0001"+
		"\u0000\u0015\u0016\u0005\u0000\u0000\u0001\u0016\u0001\u0001\u0000\u0000"+
		"\u0000\u0017\u001c\u0003\u0004\u0002\u0000\u0018\u0019\u0005\f\u0000\u0000"+
		"\u0019\u001b\u0003\u0004\u0002\u0000\u001a\u0018\u0001\u0000\u0000\u0000"+
		"\u001b\u001e\u0001\u0000\u0000\u0000\u001c\u001a\u0001\u0000\u0000\u0000"+
		"\u001c\u001d\u0001\u0000\u0000\u0000\u001d\"\u0001\u0000\u0000\u0000\u001e"+
		"\u001c\u0001\u0000\u0000\u0000\u001f!\u0005\f\u0000\u0000 \u001f\u0001"+
		"\u0000\u0000\u0000!$\u0001\u0000\u0000\u0000\" \u0001\u0000\u0000\u0000"+
		"\"#\u0001\u0000\u0000\u0000#%\u0001\u0000\u0000\u0000$\"\u0001\u0000\u0000"+
		"\u0000%&\u0005\u0000\u0000\u0001&\u0003\u0001\u0000\u0000\u0000\'+\u0006"+
		"\u0002\uffff\uffff\u0000(*\u0003\f\u0006\u0000)(\u0001\u0000\u0000\u0000"+
		"*-\u0001\u0000\u0000\u0000+)\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000"+
		"\u0000,.\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000.2\u0003\n\u0005"+
		"\u0000/1\u0003\u000e\u0007\u00000/\u0001\u0000\u0000\u000014\u0001\u0000"+
		"\u0000\u000020\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u00003T\u0001"+
		"\u0000\u0000\u000042\u0001\u0000\u0000\u000056\u0003\u0010\b\u000067\u0003"+
		"\u0006\u0003\u00007;\u0005\u0001\u0000\u00008:\u0003\f\u0006\u000098\u0001"+
		"\u0000\u0000\u0000:=\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000"+
		";<\u0001\u0000\u0000\u0000<>\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000"+
		"\u0000>B\u0003\b\u0004\u0000?A\u0003\u000e\u0007\u0000@?\u0001\u0000\u0000"+
		"\u0000AD\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000BC\u0001\u0000"+
		"\u0000\u0000CT\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000EI\u0005"+
		"\u0007\u0000\u0000FH\u0003\f\u0006\u0000GF\u0001\u0000\u0000\u0000HK\u0001"+
		"\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000"+
		"JL\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000LP\u0003\u0004\u0002"+
		"\u0000MO\u0003\u000e\u0007\u0000NM\u0001\u0000\u0000\u0000OR\u0001\u0000"+
		"\u0000\u0000PN\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QT\u0001"+
		"\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000S\'\u0001\u0000\u0000\u0000"+
		"S5\u0001\u0000\u0000\u0000SE\u0001\u0000\u0000\u0000T[\u0001\u0000\u0000"+
		"\u0000UV\n\u0003\u0000\u0000VW\u0003\u0012\t\u0000WX\u0003\u0004\u0002"+
		"\u0004XZ\u0001\u0000\u0000\u0000YU\u0001\u0000\u0000\u0000Z]\u0001\u0000"+
		"\u0000\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\\u0005"+
		"\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000^`\u0005\u0002\u0000"+
		"\u0000_^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000a_\u0001\u0000"+
		"\u0000\u0000ab\u0001\u0000\u0000\u0000b\u0007\u0001\u0000\u0000\u0000"+
		"ce\u0005\u0002\u0000\u0000dc\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000"+
		"\u0000fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000g\t\u0001\u0000"+
		"\u0000\u0000hj\u0005\u0002\u0000\u0000ih\u0001\u0000\u0000\u0000jk\u0001"+
		"\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000"+
		"l\u000b\u0001\u0000\u0000\u0000mn\u0005\u0003\u0000\u0000n\r\u0001\u0000"+
		"\u0000\u0000op\u0005\u0004\u0000\u0000p\u000f\u0001\u0000\u0000\u0000"+
		"qr\u0007\u0000\u0000\u0000r\u0011\u0001\u0000\u0000\u0000st\u0007\u0001"+
		"\u0000\u0000t\u0013\u0001\u0000\u0000\u0000\r\u001c\"+2;BIPS[afk";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}