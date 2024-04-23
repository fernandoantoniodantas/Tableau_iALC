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
public class iALCGrammarModalLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, BOL=2, LPAREN=3, RPAREN=4, FORALL=5, EXISTS=6, NOT=7, CONJ=8, 
		DISJ=9, IMPL=10, Role=11, Concept=12, CHARACTER=13, RELATION=14, ENDLINE=15, 
		WHITESPACE=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "BOL", "LPAREN", "RPAREN", "FORALL", "EXISTS", "NOT", "CONJ", 
			"DISJ", "IMPL", "Role", "Concept", "CHARACTER", "RELATION", "ENDLINE", 
			"WHITESPACE"
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


	public iALCGrammarModalLexer(CharStream input) {
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
		"\u0004\u0000\u0010]\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0001\u0000\u0001\u0000\u0001\u0001\u0004\u0001%\b"+
		"\u0001\u000b\u0001\f\u0001&\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n"+
		"\u0004\n:\b\n\u000b\n\f\n;\u0001\n\u0003\n?\b\n\u0001\n\u0004\nB\b\n\u000b"+
		"\n\f\nC\u0001\u000b\u0004\u000bG\b\u000b\u000b\u000b\f\u000bH\u0001\f"+
		"\u0004\fL\b\f\u000b\f\f\fM\u0001\r\u0001\r\u0001\u000e\u0004\u000eS\b"+
		"\u000e\u000b\u000e\f\u000eT\u0001\u000f\u0004\u000fX\b\u000f\u000b\u000f"+
		"\f\u000fY\u0001\u000f\u0001\u000f\u0000\u0000\u0010\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010"+
		"\u0001\u0000\u0006\u0002\u0000\n\n\f\r\u0001\u0000az\u0001\u0000AZ\u0003"+
		"\u000009AZaz\u0002\u0000\n\n\r\r\u0002\u0000\t\t  d\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000"+
		"\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0001!\u0001\u0000\u0000\u0000"+
		"\u0003$\u0001\u0000\u0000\u0000\u0005(\u0001\u0000\u0000\u0000\u0007*"+
		"\u0001\u0000\u0000\u0000\t,\u0001\u0000\u0000\u0000\u000b.\u0001\u0000"+
		"\u0000\u0000\r0\u0001\u0000\u0000\u0000\u000f2\u0001\u0000\u0000\u0000"+
		"\u00114\u0001\u0000\u0000\u0000\u00136\u0001\u0000\u0000\u0000\u00159"+
		"\u0001\u0000\u0000\u0000\u0017F\u0001\u0000\u0000\u0000\u0019K\u0001\u0000"+
		"\u0000\u0000\u001bO\u0001\u0000\u0000\u0000\u001dR\u0001\u0000\u0000\u0000"+
		"\u001fW\u0001\u0000\u0000\u0000!\"\u0005.\u0000\u0000\"\u0002\u0001\u0000"+
		"\u0000\u0000#%\u0007\u0000\u0000\u0000$#\u0001\u0000\u0000\u0000%&\u0001"+
		"\u0000\u0000\u0000&$\u0001\u0000\u0000\u0000&\'\u0001\u0000\u0000\u0000"+
		"\'\u0004\u0001\u0000\u0000\u0000()\u0005(\u0000\u0000)\u0006\u0001\u0000"+
		"\u0000\u0000*+\u0005)\u0000\u0000+\b\u0001\u0000\u0000\u0000,-\u0005\u2200"+
		"\u0000\u0000-\n\u0001\u0000\u0000\u0000./\u0005\u018e\u0000\u0000/\f\u0001"+
		"\u0000\u0000\u000001\u0005~\u0000\u00001\u000e\u0001\u0000\u0000\u0000"+
		"23\u0005\u2293\u0000\u00003\u0010\u0001\u0000\u0000\u000045\u0005\u2294"+
		"\u0000\u00005\u0012\u0001\u0000\u0000\u000067\u0005\u226b\u0000\u0000"+
		"7\u0014\u0001\u0000\u0000\u00008:\u0007\u0001\u0000\u000098\u0001\u0000"+
		"\u0000\u0000:;\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000;<\u0001"+
		"\u0000\u0000\u0000<>\u0001\u0000\u0000\u0000=?\u0007\u0002\u0000\u0000"+
		">=\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?A\u0001\u0000\u0000"+
		"\u0000@B\u0007\u0001\u0000\u0000A@\u0001\u0000\u0000\u0000BC\u0001\u0000"+
		"\u0000\u0000CA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000D\u0016"+
		"\u0001\u0000\u0000\u0000EG\u0007\u0002\u0000\u0000FE\u0001\u0000\u0000"+
		"\u0000GH\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000HI\u0001\u0000"+
		"\u0000\u0000I\u0018\u0001\u0000\u0000\u0000JL\u0007\u0003\u0000\u0000"+
		"KJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000"+
		"\u0000MN\u0001\u0000\u0000\u0000N\u001a\u0001\u0000\u0000\u0000OP\u0007"+
		"\u0003\u0000\u0000P\u001c\u0001\u0000\u0000\u0000QS\u0007\u0004\u0000"+
		"\u0000RQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TR\u0001\u0000"+
		"\u0000\u0000TU\u0001\u0000\u0000\u0000U\u001e\u0001\u0000\u0000\u0000"+
		"VX\u0007\u0005\u0000\u0000WV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000"+
		"\u0000YW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z[\u0001\u0000"+
		"\u0000\u0000[\\\u0006\u000f\u0000\u0000\\ \u0001\u0000\u0000\u0000\t\u0000"+
		"&;>CHMTY\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}