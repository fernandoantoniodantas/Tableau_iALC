// Generated from iALCGrammar.g4 by ANTLR 4.8

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
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

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
			null, "'.'", null, null, null, "'('", "')'", "'\u2200'", "'\u018E'", 
			"'~'", "'\u2293'", "'\u2294'", "'\u226B'"
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

	public static class SContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(iALCGrammarParser.EOF, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof iALCGrammarVisitor ) return ((iALCGrammarVisitor<? extends T>)visitor).visitS(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iALCGrammarListener ) ((iALCGrammarListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iALCGrammarListener ) ((iALCGrammarListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof iALCGrammarVisitor ) return ((iALCGrammarVisitor<? extends T>)visitor).visitCondition(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof iALCGrammarVisitor ) return ((iALCGrammarVisitor<? extends T>)visitor).visitParenFormula(this);
			else return visitor.visitChildren(this);
		}
	}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iALCGrammarListener ) ((iALCGrammarListener)listener).enterForallFormula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iALCGrammarListener ) ((iALCGrammarListener)listener).exitForallFormula(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof iALCGrammarVisitor ) return ((iALCGrammarVisitor<? extends T>)visitor).visitForallFormula(this);
			else return visitor.visitChildren(this);
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
			if ( listener instanceof iALCGrammarListener ) ((iALCGrammarListener)listener).enterOpFormula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iALCGrammarListener ) ((iALCGrammarListener)listener).exitOpFormula(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof iALCGrammarVisitor ) return ((iALCGrammarVisitor<? extends T>)visitor).visitOpFormula(this);
			else return visitor.visitChildren(this);
		}
	}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iALCGrammarListener ) ((iALCGrammarListener)listener).enterAtomFormula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iALCGrammarListener ) ((iALCGrammarListener)listener).exitAtomFormula(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof iALCGrammarVisitor ) return ((iALCGrammarVisitor<? extends T>)visitor).visitAtomFormula(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConceptAtomicoContext extends FormulaContext {
		public TerminalNode Concept() { return getToken(iALCGrammarParser.Concept, 0); }
		public List<TerminalNode> NOT() { return getTokens(iALCGrammarParser.NOT); }
		public TerminalNode NOT(int i) {
			return getToken(iALCGrammarParser.NOT, i);
		}
		public ConceptAtomicoContext(FormulaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iALCGrammarListener ) ((iALCGrammarListener)listener).enterConceptAtomico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iALCGrammarListener ) ((iALCGrammarListener)listener).exitConceptAtomico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof iALCGrammarVisitor ) return ((iALCGrammarVisitor<? extends T>)visitor).visitConceptAtomico(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForallAtomicoContext extends FormulaContext {
		public ModalContext modal() {
			return getRuleContext(ModalContext.class,0);
		}
		public ForallAtomicoContext(FormulaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iALCGrammarListener ) ((iALCGrammarListener)listener).enterForallAtomico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iALCGrammarListener ) ((iALCGrammarListener)listener).exitForallAtomico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof iALCGrammarVisitor ) return ((iALCGrammarVisitor<? extends T>)visitor).visitForallAtomico(this);
			else return visitor.visitChildren(this);
		}
	}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iALCGrammarListener ) ((iALCGrammarListener)listener).enterExistFormula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iALCGrammarListener ) ((iALCGrammarListener)listener).exitExistFormula(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof iALCGrammarVisitor ) return ((iALCGrammarVisitor<? extends T>)visitor).visitExistFormula(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof iALCGrammarVisitor ) return ((iALCGrammarVisitor<? extends T>)visitor).visitNotFormula(this);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iALCGrammarListener ) ((iALCGrammarListener)listener).enterAsser(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iALCGrammarListener ) ((iALCGrammarListener)listener).exitAsser(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof iALCGrammarVisitor ) return ((iALCGrammarVisitor<? extends T>)visitor).visitAsser(this);
			else return visitor.visitChildren(this);
		}
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

	public static class ModalContext extends ParserRuleContext {
		public TerminalNode FORALL() { return getToken(iALCGrammarParser.FORALL, 0); }
		public TerminalNode EXISTS() { return getToken(iALCGrammarParser.EXISTS, 0); }
		public ModalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iALCGrammarListener ) ((iALCGrammarListener)listener).enterModal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iALCGrammarListener ) ((iALCGrammarListener)listener).exitModal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof iALCGrammarVisitor ) return ((iALCGrammarVisitor<? extends T>)visitor).visitModal(this);
			else return visitor.visitChildren(this);
		}
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

	public static class Bin_connectiveContext extends ParserRuleContext {
		public TerminalNode CONJ() { return getToken(iALCGrammarParser.CONJ, 0); }
		public TerminalNode DISJ() { return getToken(iALCGrammarParser.DISJ, 0); }
		public TerminalNode IMPL() { return getToken(iALCGrammarParser.IMPL, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof iALCGrammarVisitor ) return ((iALCGrammarVisitor<? extends T>)visitor).visitBin_connective(this);
			else return visitor.visitChildren(this);
		}
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
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\21\u008e\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\3\3\3\3\3\7\3\25"+
		"\n\3\f\3\16\3\30\13\3\3\3\7\3\33\n\3\f\3\16\3\36\13\3\3\3\3\3\3\4\3\4"+
		"\7\4$\n\4\f\4\16\4\'\13\4\3\4\3\4\7\4+\n\4\f\4\16\4.\13\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4:\n\4\f\4\16\4=\13\4\3\4\3\4\7\4A\n\4"+
		"\f\4\16\4D\13\4\3\4\7\4G\n\4\f\4\16\4J\13\4\3\4\7\4M\n\4\f\4\16\4P\13"+
		"\4\3\4\3\4\3\4\3\4\7\4V\n\4\f\4\16\4Y\13\4\3\4\3\4\7\4]\n\4\f\4\16\4`"+
		"\13\4\3\4\7\4c\n\4\f\4\16\4f\13\4\3\4\7\4i\n\4\f\4\16\4l\13\4\3\4\3\4"+
		"\7\4p\n\4\f\4\16\4s\13\4\3\4\5\4v\n\4\3\4\3\4\3\4\3\4\7\4|\n\4\f\4\16"+
		"\4\177\13\4\3\5\7\5\u0082\n\5\f\5\16\5\u0085\13\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\7\2\3\6\b\2\4\6\b\n\f\2\4\3\2\t\n\3\2\f\16\2\u009c\2\16\3\2"+
		"\2\2\4\21\3\2\2\2\6u\3\2\2\2\b\u0083\3\2\2\2\n\u0089\3\2\2\2\f\u008b\3"+
		"\2\2\2\16\17\5\4\3\2\17\20\7\2\2\3\20\3\3\2\2\2\21\26\5\6\4\2\22\23\7"+
		"\20\2\2\23\25\5\6\4\2\24\22\3\2\2\2\25\30\3\2\2\2\26\24\3\2\2\2\26\27"+
		"\3\2\2\2\27\34\3\2\2\2\30\26\3\2\2\2\31\33\7\20\2\2\32\31\3\2\2\2\33\36"+
		"\3\2\2\2\34\32\3\2\2\2\34\35\3\2\2\2\35\37\3\2\2\2\36\34\3\2\2\2\37 \7"+
		"\2\2\3 \5\3\2\2\2!%\b\4\1\2\"$\7\7\2\2#\"\3\2\2\2$\'\3\2\2\2%#\3\2\2\2"+
		"%&\3\2\2\2&(\3\2\2\2\'%\3\2\2\2(,\7\17\2\2)+\7\b\2\2*)\3\2\2\2+.\3\2\2"+
		"\2,*\3\2\2\2,-\3\2\2\2-v\3\2\2\2.,\3\2\2\2/\60\7\7\2\2\60\61\5\6\4\2\61"+
		"\62\7\b\2\2\62v\3\2\2\2\63\64\7\13\2\2\64v\5\6\4\7\65\66\7\t\2\2\66\67"+
		"\7\4\2\2\67;\7\3\2\28:\7\7\2\298\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2"+
		"<>\3\2\2\2=;\3\2\2\2>B\7\5\2\2?A\5\f\7\2@?\3\2\2\2AD\3\2\2\2B@\3\2\2\2"+
		"BC\3\2\2\2CH\3\2\2\2DB\3\2\2\2EG\7\5\2\2FE\3\2\2\2GJ\3\2\2\2HF\3\2\2\2"+
		"HI\3\2\2\2IN\3\2\2\2JH\3\2\2\2KM\7\b\2\2LK\3\2\2\2MP\3\2\2\2NL\3\2\2\2"+
		"NO\3\2\2\2Ov\3\2\2\2PN\3\2\2\2QR\7\n\2\2RS\7\4\2\2SW\7\3\2\2TV\7\7\2\2"+
		"UT\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2XZ\3\2\2\2YW\3\2\2\2Z^\7\5\2\2"+
		"[]\5\f\7\2\\[\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_d\3\2\2\2`^\3\2\2"+
		"\2ac\7\5\2\2ba\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2ej\3\2\2\2fd\3\2\2"+
		"\2gi\7\b\2\2hg\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2kv\3\2\2\2lj\3\2\2"+
		"\2mv\5\n\6\2np\7\13\2\2on\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2rt\3\2"+
		"\2\2sq\3\2\2\2tv\7\5\2\2u!\3\2\2\2u/\3\2\2\2u\63\3\2\2\2u\65\3\2\2\2u"+
		"Q\3\2\2\2um\3\2\2\2uq\3\2\2\2v}\3\2\2\2wx\f\t\2\2xy\5\f\7\2yz\5\6\4\n"+
		"z|\3\2\2\2{w\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\7\3\2\2\2\177}"+
		"\3\2\2\2\u0080\u0082\7\17\2\2\u0081\u0080\3\2\2\2\u0082\u0085\3\2\2\2"+
		"\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0086\3\2\2\2\u0085\u0083"+
		"\3\2\2\2\u0086\u0087\7\3\2\2\u0087\u0088\5\6\4\2\u0088\t\3\2\2\2\u0089"+
		"\u008a\t\2\2\2\u008a\13\3\2\2\2\u008b\u008c\t\3\2\2\u008c\r\3\2\2\2\22"+
		"\26\34%,;BHNW^djqu}\u0083";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}