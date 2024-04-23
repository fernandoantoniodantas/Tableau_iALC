// Generated from d:/eclipse-workspace/iALC/src/main/java/iALC/grammar_modal/iALCGrammarModal.g4 by ANTLR 4.13.1

   package iALC.grammar_modal;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class iALCGrammar_modalLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, LPAREN=2, RPAREN=3, FORALL=4, EXISTS=5, NOT=6, CONJ=7, DISJ=8, 
		IMPL=9, RELATION=10, ENDLINE=11, WHITESPACE=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "LPAREN", "RPAREN", "FORALL", "EXISTS", "NOT", "CONJ", "DISJ", 
			"IMPL", "RELATION", "ENDLINE", "WHITESPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'('", "')'", "'\\u2200'", "'\\u018E'", "'~'", "'\\u2293'", 
			"'\\u2294'", "'\\u226B'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "LPAREN", "RPAREN", "FORALL", "EXISTS", "NOT", "CONJ", "DISJ", 
			"IMPL", "RELATION", "ENDLINE", "WHITESPACE"
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


	public iALCGrammar_modalLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "iALCGrammarModal.g4"; }

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
		"\u0004\u0000\f9\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\n\u0004\n/\b\n\u000b\n\f\n0\u0001\u000b\u0004"+
		"\u000b4\b\u000b\u000b\u000b\f\u000b5\u0001\u000b\u0001\u000b\u0000\u0000"+
		"\f\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0001\u0000\u0003"+
		"\u0003\u000009AZaz\u0002\u0000\n\n\r\r\u0002\u0000\t\t  :\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000"+
		"\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0001\u0019\u0001\u0000"+
		"\u0000\u0000\u0003\u001b\u0001\u0000\u0000\u0000\u0005\u001d\u0001\u0000"+
		"\u0000\u0000\u0007\u001f\u0001\u0000\u0000\u0000\t!\u0001\u0000\u0000"+
		"\u0000\u000b#\u0001\u0000\u0000\u0000\r%\u0001\u0000\u0000\u0000\u000f"+
		"\'\u0001\u0000\u0000\u0000\u0011)\u0001\u0000\u0000\u0000\u0013+\u0001"+
		"\u0000\u0000\u0000\u0015.\u0001\u0000\u0000\u0000\u00173\u0001\u0000\u0000"+
		"\u0000\u0019\u001a\u0005.\u0000\u0000\u001a\u0002\u0001\u0000\u0000\u0000"+
		"\u001b\u001c\u0005(\u0000\u0000\u001c\u0004\u0001\u0000\u0000\u0000\u001d"+
		"\u001e\u0005)\u0000\u0000\u001e\u0006\u0001\u0000\u0000\u0000\u001f \u0005"+
		"\u2200\u0000\u0000 \b\u0001\u0000\u0000\u0000!\"\u0005\u018e\u0000\u0000"+
		"\"\n\u0001\u0000\u0000\u0000#$\u0005~\u0000\u0000$\f\u0001\u0000\u0000"+
		"\u0000%&\u0005\u2293\u0000\u0000&\u000e\u0001\u0000\u0000\u0000\'(\u0005"+
		"\u2294\u0000\u0000(\u0010\u0001\u0000\u0000\u0000)*\u0005\u226b\u0000"+
		"\u0000*\u0012\u0001\u0000\u0000\u0000+,\u0007\u0000\u0000\u0000,\u0014"+
		"\u0001\u0000\u0000\u0000-/\u0007\u0001\u0000\u0000.-\u0001\u0000\u0000"+
		"\u0000/0\u0001\u0000\u0000\u00000.\u0001\u0000\u0000\u000001\u0001\u0000"+
		"\u0000\u00001\u0016\u0001\u0000\u0000\u000024\u0007\u0002\u0000\u0000"+
		"32\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u000053\u0001\u0000\u0000"+
		"\u000056\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u000078\u0006\u000b"+
		"\u0000\u00008\u0018\u0001\u0000\u0000\u0000\u0003\u000005\u0001\u0006"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}