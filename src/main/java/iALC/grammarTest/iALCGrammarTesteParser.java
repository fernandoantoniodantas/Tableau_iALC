// Generated from iALCGrammarTeste.g4 by ANTLR 4.8

   package iALC.grammarTest;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class iALCGrammarTesteParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

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
			null, "'.'", null, "'('", "')'", "'\u2200'", "'\u018E'", "'~'", "'\u2293'", 
			"'\u2294'", "'\u226B'"
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

	public static class SContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(iALCGrammarTesteParser.EOF, 0); }
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iALCGrammarTesteListener ) ((iALCGrammarTesteListener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iALCGrammarTesteListener ) ((iALCGrammarTesteListener)listener).exitS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof iALCGrammarTesteVisitor ) return ((iALCGrammarTesteVisitor<? extends T>)visitor).visitS(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iALCGrammarTesteListener ) ((iALCGrammarTesteListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iALCGrammarTesteListener ) ((iALCGrammarTesteListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof iALCGrammarTesteVisitor ) return ((iALCGrammarTesteVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iALCGrammarTesteListener ) ((iALCGrammarTesteListener)listener).enterOpFormula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iALCGrammarTesteListener ) ((iALCGrammarTesteListener)listener).exitOpFormula(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof iALCGrammarTesteVisitor ) return ((iALCGrammarTesteVisitor<? extends T>)visitor).visitOpFormula(this);
			else return visitor.visitChildren(this);
		}
	}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iALCGrammarTesteListener ) ((iALCGrammarTesteListener)listener).enterAtomFormula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iALCGrammarTesteListener ) ((iALCGrammarTesteListener)listener).exitAtomFormula(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof iALCGrammarTesteVisitor ) return ((iALCGrammarTesteVisitor<? extends T>)visitor).visitAtomFormula(this);
			else return visitor.visitChildren(this);
		}
	}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iALCGrammarTesteListener ) ((iALCGrammarTesteListener)listener).enterNotFormula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iALCGrammarTesteListener ) ((iALCGrammarTesteListener)listener).exitNotFormula(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof iALCGrammarTesteVisitor ) return ((iALCGrammarTesteVisitor<? extends T>)visitor).visitNotFormula(this);
			else return visitor.visitChildren(this);
		}
	}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iALCGrammarTesteListener ) ((iALCGrammarTesteListener)listener).enterModalFormula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iALCGrammarTesteListener ) ((iALCGrammarTesteListener)listener).exitModalFormula(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof iALCGrammarTesteVisitor ) return ((iALCGrammarTesteVisitor<? extends T>)visitor).visitModalFormula(this);
			else return visitor.visitChildren(this);
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

	public static class RoleContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(iALCGrammarTesteParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(iALCGrammarTesteParser.STRING, i);
		}
		public RoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_role; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iALCGrammarTesteListener ) ((iALCGrammarTesteListener)listener).enterRole(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iALCGrammarTesteListener ) ((iALCGrammarTesteListener)listener).exitRole(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof iALCGrammarTesteVisitor ) return ((iALCGrammarTesteVisitor<? extends T>)visitor).visitRole(this);
			else return visitor.visitChildren(this);
		}
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

	public static class ConceptContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(iALCGrammarTesteParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(iALCGrammarTesteParser.STRING, i);
		}
		public ConceptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concept; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iALCGrammarTesteListener ) ((iALCGrammarTesteListener)listener).enterConcept(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iALCGrammarTesteListener ) ((iALCGrammarTesteListener)listener).exitConcept(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof iALCGrammarTesteVisitor ) return ((iALCGrammarTesteVisitor<? extends T>)visitor).visitConcept(this);
			else return visitor.visitChildren(this);
		}
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

	public static class AtomicContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(iALCGrammarTesteParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(iALCGrammarTesteParser.STRING, i);
		}
		public AtomicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iALCGrammarTesteListener ) ((iALCGrammarTesteListener)listener).enterAtomic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iALCGrammarTesteListener ) ((iALCGrammarTesteListener)listener).exitAtomic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof iALCGrammarTesteVisitor ) return ((iALCGrammarTesteVisitor<? extends T>)visitor).visitAtomic(this);
			else return visitor.visitChildren(this);
		}
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

	public static class LparenContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(iALCGrammarTesteParser.LPAREN, 0); }
		public LparenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lparen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iALCGrammarTesteListener ) ((iALCGrammarTesteListener)listener).enterLparen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iALCGrammarTesteListener ) ((iALCGrammarTesteListener)listener).exitLparen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof iALCGrammarTesteVisitor ) return ((iALCGrammarTesteVisitor<? extends T>)visitor).visitLparen(this);
			else return visitor.visitChildren(this);
		}
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

	public static class RparenContext extends ParserRuleContext {
		public TerminalNode RPAREN() { return getToken(iALCGrammarTesteParser.RPAREN, 0); }
		public RparenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rparen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iALCGrammarTesteListener ) ((iALCGrammarTesteListener)listener).enterRparen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iALCGrammarTesteListener ) ((iALCGrammarTesteListener)listener).exitRparen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof iALCGrammarTesteVisitor ) return ((iALCGrammarTesteVisitor<? extends T>)visitor).visitRparen(this);
			else return visitor.visitChildren(this);
		}
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

	public static class ModalContext extends ParserRuleContext {
		public TerminalNode FORALL() { return getToken(iALCGrammarTesteParser.FORALL, 0); }
		public TerminalNode EXISTS() { return getToken(iALCGrammarTesteParser.EXISTS, 0); }
		public ModalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iALCGrammarTesteListener ) ((iALCGrammarTesteListener)listener).enterModal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iALCGrammarTesteListener ) ((iALCGrammarTesteListener)listener).exitModal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof iALCGrammarTesteVisitor ) return ((iALCGrammarTesteVisitor<? extends T>)visitor).visitModal(this);
			else return visitor.visitChildren(this);
		}
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

	public static class Bin_connectiveContext extends ParserRuleContext {
		public TerminalNode CONJ() { return getToken(iALCGrammarTesteParser.CONJ, 0); }
		public TerminalNode DISJ() { return getToken(iALCGrammarTesteParser.DISJ, 0); }
		public TerminalNode IMPL() { return getToken(iALCGrammarTesteParser.IMPL, 0); }
		public Bin_connectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bin_connective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iALCGrammarTesteListener ) ((iALCGrammarTesteListener)listener).enterBin_connective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iALCGrammarTesteListener ) ((iALCGrammarTesteListener)listener).exitBin_connective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof iALCGrammarTesteVisitor ) return ((iALCGrammarTesteVisitor<? extends T>)visitor).visitBin_connective(this);
			else return visitor.visitChildren(this);
		}
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\17x\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\7\3\35\n\3\f\3\16\3 \13\3\3\3\7\3#\n\3\f\3\16\3"+
		"&\13\3\3\3\3\3\3\4\3\4\7\4,\n\4\f\4\16\4/\13\4\3\4\3\4\7\4\63\n\4\f\4"+
		"\16\4\66\13\4\3\4\3\4\3\4\3\4\7\4<\n\4\f\4\16\4?\13\4\3\4\3\4\7\4C\n\4"+
		"\f\4\16\4F\13\4\3\4\3\4\7\4J\n\4\f\4\16\4M\13\4\3\4\3\4\7\4Q\n\4\f\4\16"+
		"\4T\13\4\5\4V\n\4\3\4\3\4\3\4\3\4\7\4\\\n\4\f\4\16\4_\13\4\3\5\6\5b\n"+
		"\5\r\5\16\5c\3\6\6\6g\n\6\r\6\16\6h\3\7\6\7l\n\7\r\7\16\7m\3\b\3\b\3\t"+
		"\3\t\3\n\3\n\3\13\3\13\3\13\2\3\6\f\2\4\6\b\n\f\16\20\22\24\2\4\3\2\7"+
		"\b\3\2\n\f\2{\2\26\3\2\2\2\4\31\3\2\2\2\6U\3\2\2\2\ba\3\2\2\2\nf\3\2\2"+
		"\2\fk\3\2\2\2\16o\3\2\2\2\20q\3\2\2\2\22s\3\2\2\2\24u\3\2\2\2\26\27\5"+
		"\4\3\2\27\30\7\2\2\3\30\3\3\2\2\2\31\36\5\6\4\2\32\33\7\16\2\2\33\35\5"+
		"\6\4\2\34\32\3\2\2\2\35 \3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37$\3\2\2"+
		"\2 \36\3\2\2\2!#\7\16\2\2\"!\3\2\2\2#&\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%\'"+
		"\3\2\2\2&$\3\2\2\2\'(\7\2\2\3(\5\3\2\2\2)-\b\4\1\2*,\5\16\b\2+*\3\2\2"+
		"\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\60\3\2\2\2/-\3\2\2\2\60\64\5\f\7\2\61"+
		"\63\5\20\t\2\62\61\3\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65"+
		"V\3\2\2\2\66\64\3\2\2\2\678\5\22\n\289\5\b\5\29=\7\3\2\2:<\5\16\b\2;:"+
		"\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>@\3\2\2\2?=\3\2\2\2@D\5\n\6\2A"+
		"C\5\20\t\2BA\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2EV\3\2\2\2FD\3\2\2\2"+
		"GK\7\t\2\2HJ\5\16\b\2IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LN\3\2\2"+
		"\2MK\3\2\2\2NR\5\6\4\2OQ\5\20\t\2PO\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2"+
		"\2\2SV\3\2\2\2TR\3\2\2\2U)\3\2\2\2U\67\3\2\2\2UG\3\2\2\2V]\3\2\2\2WX\f"+
		"\5\2\2XY\5\24\13\2YZ\5\6\4\6Z\\\3\2\2\2[W\3\2\2\2\\_\3\2\2\2][\3\2\2\2"+
		"]^\3\2\2\2^\7\3\2\2\2_]\3\2\2\2`b\7\4\2\2a`\3\2\2\2bc\3\2\2\2ca\3\2\2"+
		"\2cd\3\2\2\2d\t\3\2\2\2eg\7\4\2\2fe\3\2\2\2gh\3\2\2\2hf\3\2\2\2hi\3\2"+
		"\2\2i\13\3\2\2\2jl\7\4\2\2kj\3\2\2\2lm\3\2\2\2mk\3\2\2\2mn\3\2\2\2n\r"+
		"\3\2\2\2op\7\5\2\2p\17\3\2\2\2qr\7\6\2\2r\21\3\2\2\2st\t\2\2\2t\23\3\2"+
		"\2\2uv\t\3\2\2v\25\3\2\2\2\17\36$-\64=DKRU]chm";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}