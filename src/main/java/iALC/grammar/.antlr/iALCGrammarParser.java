// Generated from d:/eclipse-workspace/iALC/src/main/java/iALC/grammar/iALCGrammar.g4 by ANTLR 4.13.1

   package iALC.grammar;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class iALCGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, Role=2, Concept=3, STRING=4, LPAREN=5, RPAREN=6, FORALL=7, EXISTS=8, 
		NOT=9, CONJ=10, DISJ=11, IMPL=12, CHARACTER=13, ENDLINE=14, WHITESPACE=15;
	public static final int
		RULE_s = 0, RULE_condition = 1, RULE_formula = 2, RULE_asser = 3, RULE_modal = 4, 
		RULE_bin_connective = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "condition", "formula", "asser", "modal", "bin_connective"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", null, null, null, "'('", "')'", "'\\u2200'", "'\\u018E'", 
			"'~'", "'\\u2293'", "'\\u2294'", "'\\u226B'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "Role", "Concept", "STRING", "LPAREN", "RPAREN", "FORALL", 
			"EXISTS", "NOT", "CONJ", "DISJ", "IMPL", "CHARACTER", "ENDLINE", "WHITESPACE"
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
	public String getGrammarFileName() { return "iALCGrammar.g4"; }

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

	@SuppressWarnings("CheckReturnValue")
	public static class SContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(iALCGrammarParser.EOF, 0); }
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
			setState(12);
			condition();
			setState(13);
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
		public TerminalNode EOF() { return getToken(iALCGrammarParser.EOF, 0); }
		public List<TerminalNode> ENDLINE() { return getTokens(iALCGrammarParser.ENDLINE); }
		public TerminalNode ENDLINE(int i) {
			return getToken(iALCGrammarParser.ENDLINE, i);
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
			setState(15);
			formula(0);
			setState(20);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(16);
					match(ENDLINE);
					setState(17);
					formula(0);
					}
					} 
				}
				setState(22);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDLINE) {
				{
				{
				setState(23);
				match(ENDLINE);
				}
				}
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(29);
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
	public static class ParenFormulaContext extends FormulaContext {
		public TerminalNode LPAREN() { return getToken(iALCGrammarParser.LPAREN, 0); }
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(iALCGrammarParser.RPAREN, 0); }
		public ParenFormulaContext(FormulaContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForallFormulaContext extends FormulaContext {
		public TerminalNode FORALL() { return getToken(iALCGrammarParser.FORALL, 0); }
		public TerminalNode Role() { return getToken(iALCGrammarParser.Role, 0); }
		public List<TerminalNode> Concept() { return getTokens(iALCGrammarParser.Concept); }
		public TerminalNode Concept(int i) {
			return getToken(iALCGrammarParser.Concept, i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(iALCGrammarParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(iALCGrammarParser.LPAREN, i);
		}
		public List<Bin_connectiveContext> bin_connective() {
			return getRuleContexts(Bin_connectiveContext.class);
		}
		public Bin_connectiveContext bin_connective(int i) {
			return getRuleContext(Bin_connectiveContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(iALCGrammarParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(iALCGrammarParser.RPAREN, i);
		}
		public ForallFormulaContext(FormulaContext ctx) { copyFrom(ctx); }
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
		public Token atom;
		public TerminalNode CHARACTER() { return getToken(iALCGrammarParser.CHARACTER, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(iALCGrammarParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(iALCGrammarParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(iALCGrammarParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(iALCGrammarParser.RPAREN, i);
		}
		public AtomFormulaContext(FormulaContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConceptAtomicoContext extends FormulaContext {
		public TerminalNode Concept() { return getToken(iALCGrammarParser.Concept, 0); }
		public List<TerminalNode> NOT() { return getTokens(iALCGrammarParser.NOT); }
		public TerminalNode NOT(int i) {
			return getToken(iALCGrammarParser.NOT, i);
		}
		public ConceptAtomicoContext(FormulaContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForallAtomicoContext extends FormulaContext {
		public ModalContext modal() {
			return getRuleContext(ModalContext.class,0);
		}
		public ForallAtomicoContext(FormulaContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExistFormulaContext extends FormulaContext {
		public TerminalNode EXISTS() { return getToken(iALCGrammarParser.EXISTS, 0); }
		public TerminalNode Role() { return getToken(iALCGrammarParser.Role, 0); }
		public List<TerminalNode> Concept() { return getTokens(iALCGrammarParser.Concept); }
		public TerminalNode Concept(int i) {
			return getToken(iALCGrammarParser.Concept, i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(iALCGrammarParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(iALCGrammarParser.LPAREN, i);
		}
		public List<Bin_connectiveContext> bin_connective() {
			return getRuleContexts(Bin_connectiveContext.class);
		}
		public Bin_connectiveContext bin_connective(int i) {
			return getRuleContext(Bin_connectiveContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(iALCGrammarParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(iALCGrammarParser.RPAREN, i);
		}
		public ExistFormulaContext(FormulaContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotFormulaContext extends FormulaContext {
		public TerminalNode NOT() { return getToken(iALCGrammarParser.NOT, 0); }
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public NotFormulaContext(FormulaContext ctx) { copyFrom(ctx); }
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
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				_localctx = new AtomFormulaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LPAREN) {
					{
					{
					setState(32);
					match(LPAREN);
					}
					}
					setState(37);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(38);
				((AtomFormulaContext)_localctx).atom = match(CHARACTER);
				setState(42);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(39);
						match(RPAREN);
						}
						} 
					}
					setState(44);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				}
				break;
			case 2:
				{
				_localctx = new ParenFormulaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(45);
				match(LPAREN);
				setState(46);
				formula(0);
				setState(47);
				match(RPAREN);
				}
				break;
			case 3:
				{
				_localctx = new NotFormulaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(49);
				match(NOT);
				setState(50);
				formula(5);
				}
				break;
			case 4:
				{
				_localctx = new ForallFormulaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(51);
				match(FORALL);
				setState(52);
				match(Role);
				setState(53);
				match(T__0);
				{
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LPAREN) {
					{
					{
					setState(54);
					match(LPAREN);
					}
					}
					setState(59);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(60);
				match(Concept);
				setState(64);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(61);
						bin_connective();
						}
						} 
					}
					setState(66);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				setState(70);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(67);
						match(Concept);
						}
						} 
					}
					setState(72);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				setState(76);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(73);
						match(RPAREN);
						}
						} 
					}
					setState(78);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				}
				}
				break;
			case 5:
				{
				_localctx = new ExistFormulaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(79);
				match(EXISTS);
				setState(80);
				match(Role);
				setState(81);
				match(T__0);
				{
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LPAREN) {
					{
					{
					setState(82);
					match(LPAREN);
					}
					}
					setState(87);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(88);
				match(Concept);
				setState(92);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(89);
						bin_connective();
						}
						} 
					}
					setState(94);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				setState(98);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(95);
						match(Concept);
						}
						} 
					}
					setState(100);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				setState(104);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(101);
						match(RPAREN);
						}
						} 
					}
					setState(106);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				}
				}
				break;
			case 6:
				{
				_localctx = new ForallAtomicoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(107);
				modal();
				}
				break;
			case 7:
				{
				_localctx = new ConceptAtomicoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NOT) {
					{
					{
					setState(108);
					match(NOT);
					}
					}
					setState(113);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(114);
				match(Concept);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(123);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OpFormulaContext(new FormulaContext(_parentctx, _parentState));
					((OpFormulaContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_formula);
					setState(117);
					if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
					setState(118);
					((OpFormulaContext)_localctx).op = bin_connective();
					setState(119);
					((OpFormulaContext)_localctx).right = formula(8);
					}
					} 
				}
				setState(125);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
	public static class AsserContext extends ParserRuleContext {
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public List<TerminalNode> CHARACTER() { return getTokens(iALCGrammarParser.CHARACTER); }
		public TerminalNode CHARACTER(int i) {
			return getToken(iALCGrammarParser.CHARACTER, i);
		}
		public AsserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asser; }
	}

	public final AsserContext asser() throws RecognitionException {
		AsserContext _localctx = new AsserContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_asser);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CHARACTER) {
				{
				{
				setState(126);
				match(CHARACTER);
				}
				}
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(132);
			match(T__0);
			setState(133);
			formula(0);
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
		public TerminalNode FORALL() { return getToken(iALCGrammarParser.FORALL, 0); }
		public TerminalNode EXISTS() { return getToken(iALCGrammarParser.EXISTS, 0); }
		public ModalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modal; }
	}

	public final ModalContext modal() throws RecognitionException {
		ModalContext _localctx = new ModalContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_modal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
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
		public TerminalNode CONJ() { return getToken(iALCGrammarParser.CONJ, 0); }
		public TerminalNode DISJ() { return getToken(iALCGrammarParser.DISJ, 0); }
		public TerminalNode IMPL() { return getToken(iALCGrammarParser.IMPL, 0); }
		public Bin_connectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bin_connective; }
	}

	public final Bin_connectiveContext bin_connective() throws RecognitionException {
		Bin_connectiveContext _localctx = new Bin_connectiveContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_bin_connective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7168L) != 0)) ) {
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
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u000f\u008c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0005\u0001\u0013\b\u0001\n\u0001\f\u0001\u0016"+
		"\t\u0001\u0001\u0001\u0005\u0001\u0019\b\u0001\n\u0001\f\u0001\u001c\t"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0005\u0002\"\b"+
		"\u0002\n\u0002\f\u0002%\t\u0002\u0001\u0002\u0001\u0002\u0005\u0002)\b"+
		"\u0002\n\u0002\f\u0002,\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0005\u00028\b\u0002\n\u0002\f\u0002;\t\u0002\u0001\u0002\u0001"+
		"\u0002\u0005\u0002?\b\u0002\n\u0002\f\u0002B\t\u0002\u0001\u0002\u0005"+
		"\u0002E\b\u0002\n\u0002\f\u0002H\t\u0002\u0001\u0002\u0005\u0002K\b\u0002"+
		"\n\u0002\f\u0002N\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u0002T\b\u0002\n\u0002\f\u0002W\t\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u0002[\b\u0002\n\u0002\f\u0002^\t\u0002\u0001\u0002\u0005\u0002"+
		"a\b\u0002\n\u0002\f\u0002d\t\u0002\u0001\u0002\u0005\u0002g\b\u0002\n"+
		"\u0002\f\u0002j\t\u0002\u0001\u0002\u0001\u0002\u0005\u0002n\b\u0002\n"+
		"\u0002\f\u0002q\t\u0002\u0001\u0002\u0003\u0002t\b\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0005\u0002z\b\u0002\n\u0002\f\u0002}\t"+
		"\u0002\u0001\u0003\u0005\u0003\u0080\b\u0003\n\u0003\f\u0003\u0083\t\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0000\u0001\u0004\u0006\u0000\u0002\u0004\u0006"+
		"\b\n\u0000\u0002\u0001\u0000\u0007\b\u0001\u0000\n\f\u009a\u0000\f\u0001"+
		"\u0000\u0000\u0000\u0002\u000f\u0001\u0000\u0000\u0000\u0004s\u0001\u0000"+
		"\u0000\u0000\u0006\u0081\u0001\u0000\u0000\u0000\b\u0087\u0001\u0000\u0000"+
		"\u0000\n\u0089\u0001\u0000\u0000\u0000\f\r\u0003\u0002\u0001\u0000\r\u000e"+
		"\u0005\u0000\u0000\u0001\u000e\u0001\u0001\u0000\u0000\u0000\u000f\u0014"+
		"\u0003\u0004\u0002\u0000\u0010\u0011\u0005\u000e\u0000\u0000\u0011\u0013"+
		"\u0003\u0004\u0002\u0000\u0012\u0010\u0001\u0000\u0000\u0000\u0013\u0016"+
		"\u0001\u0000\u0000\u0000\u0014\u0012\u0001\u0000\u0000\u0000\u0014\u0015"+
		"\u0001\u0000\u0000\u0000\u0015\u001a\u0001\u0000\u0000\u0000\u0016\u0014"+
		"\u0001\u0000\u0000\u0000\u0017\u0019\u0005\u000e\u0000\u0000\u0018\u0017"+
		"\u0001\u0000\u0000\u0000\u0019\u001c\u0001\u0000\u0000\u0000\u001a\u0018"+
		"\u0001\u0000\u0000\u0000\u001a\u001b\u0001\u0000\u0000\u0000\u001b\u001d"+
		"\u0001\u0000\u0000\u0000\u001c\u001a\u0001\u0000\u0000\u0000\u001d\u001e"+
		"\u0005\u0000\u0000\u0001\u001e\u0003\u0001\u0000\u0000\u0000\u001f#\u0006"+
		"\u0002\uffff\uffff\u0000 \"\u0005\u0005\u0000\u0000! \u0001\u0000\u0000"+
		"\u0000\"%\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000#$\u0001\u0000"+
		"\u0000\u0000$&\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000\u0000&*\u0005"+
		"\r\u0000\u0000\')\u0005\u0006\u0000\u0000(\'\u0001\u0000\u0000\u0000)"+
		",\u0001\u0000\u0000\u0000*(\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000"+
		"\u0000+t\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000-.\u0005\u0005"+
		"\u0000\u0000./\u0003\u0004\u0002\u0000/0\u0005\u0006\u0000\u00000t\u0001"+
		"\u0000\u0000\u000012\u0005\t\u0000\u00002t\u0003\u0004\u0002\u000534\u0005"+
		"\u0007\u0000\u000045\u0005\u0002\u0000\u000059\u0005\u0001\u0000\u0000"+
		"68\u0005\u0005\u0000\u000076\u0001\u0000\u0000\u00008;\u0001\u0000\u0000"+
		"\u000097\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:<\u0001\u0000"+
		"\u0000\u0000;9\u0001\u0000\u0000\u0000<@\u0005\u0003\u0000\u0000=?\u0003"+
		"\n\u0005\u0000>=\u0001\u0000\u0000\u0000?B\u0001\u0000\u0000\u0000@>\u0001"+
		"\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000AF\u0001\u0000\u0000\u0000"+
		"B@\u0001\u0000\u0000\u0000CE\u0005\u0003\u0000\u0000DC\u0001\u0000\u0000"+
		"\u0000EH\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000FG\u0001\u0000"+
		"\u0000\u0000GL\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000IK\u0005"+
		"\u0006\u0000\u0000JI\u0001\u0000\u0000\u0000KN\u0001\u0000\u0000\u0000"+
		"LJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000Mt\u0001\u0000\u0000"+
		"\u0000NL\u0001\u0000\u0000\u0000OP\u0005\b\u0000\u0000PQ\u0005\u0002\u0000"+
		"\u0000QU\u0005\u0001\u0000\u0000RT\u0005\u0005\u0000\u0000SR\u0001\u0000"+
		"\u0000\u0000TW\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000UV\u0001"+
		"\u0000\u0000\u0000VX\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000"+
		"X\\\u0005\u0003\u0000\u0000Y[\u0003\n\u0005\u0000ZY\u0001\u0000\u0000"+
		"\u0000[^\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000\\]\u0001\u0000"+
		"\u0000\u0000]b\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000_a\u0005"+
		"\u0003\u0000\u0000`_\u0001\u0000\u0000\u0000ad\u0001\u0000\u0000\u0000"+
		"b`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000ch\u0001\u0000\u0000"+
		"\u0000db\u0001\u0000\u0000\u0000eg\u0005\u0006\u0000\u0000fe\u0001\u0000"+
		"\u0000\u0000gj\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000hi\u0001"+
		"\u0000\u0000\u0000it\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000"+
		"kt\u0003\b\u0004\u0000ln\u0005\t\u0000\u0000ml\u0001\u0000\u0000\u0000"+
		"nq\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000op\u0001\u0000\u0000"+
		"\u0000pr\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000rt\u0005\u0003"+
		"\u0000\u0000s\u001f\u0001\u0000\u0000\u0000s-\u0001\u0000\u0000\u0000"+
		"s1\u0001\u0000\u0000\u0000s3\u0001\u0000\u0000\u0000sO\u0001\u0000\u0000"+
		"\u0000sk\u0001\u0000\u0000\u0000so\u0001\u0000\u0000\u0000t{\u0001\u0000"+
		"\u0000\u0000uv\n\u0007\u0000\u0000vw\u0003\n\u0005\u0000wx\u0003\u0004"+
		"\u0002\bxz\u0001\u0000\u0000\u0000yu\u0001\u0000\u0000\u0000z}\u0001\u0000"+
		"\u0000\u0000{y\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|\u0005"+
		"\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000~\u0080\u0005\r\u0000"+
		"\u0000\u007f~\u0001\u0000\u0000\u0000\u0080\u0083\u0001\u0000\u0000\u0000"+
		"\u0081\u007f\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000"+
		"\u0082\u0084\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000"+
		"\u0084\u0085\u0005\u0001\u0000\u0000\u0085\u0086\u0003\u0004\u0002\u0000"+
		"\u0086\u0007\u0001\u0000\u0000\u0000\u0087\u0088\u0007\u0000\u0000\u0000"+
		"\u0088\t\u0001\u0000\u0000\u0000\u0089\u008a\u0007\u0001\u0000\u0000\u008a"+
		"\u000b\u0001\u0000\u0000\u0000\u0010\u0014\u001a#*9@FLU\\bhos{\u0081";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}