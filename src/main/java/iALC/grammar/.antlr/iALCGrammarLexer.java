// Generated from d:/eclipse-workspace/iALC/src/main/java/iALC/grammar/iALCGrammar.g4 by ANTLR 4.13.1

   package iALC.grammar;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class iALCGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, Role=2, Concept=3, STRING=4, LPAREN=5, RPAREN=6, FORALL=7, EXISTS=8, 
		NOT=9, CONJ=10, DISJ=11, IMPL=12, CHARACTER=13, ENDLINE=14, WHITESPACE=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "Role", "Concept", "STRING", "LPAREN", "RPAREN", "FORALL", "EXISTS", 
			"NOT", "CONJ", "DISJ", "IMPL", "CHARACTER", "ENDLINE", "WHITESPACE"
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


	public iALCGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "iALCGrammar.g4"; }

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
		"\u0004\u0000\u000fY\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0004\u0001#\b\u0001\u000b\u0001\f\u0001"+
		"$\u0001\u0001\u0003\u0001(\b\u0001\u0001\u0001\u0004\u0001+\b\u0001\u000b"+
		"\u0001\f\u0001,\u0001\u0002\u0004\u00020\b\u0002\u000b\u0002\f\u00021"+
		"\u0001\u0003\u0004\u00035\b\u0003\u000b\u0003\f\u00036\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0004\fJ\b\f\u000b\f\f\fK\u0001\r\u0004\rO\b\r\u000b\r"+
		"\f\rP\u0001\u000e\u0004\u000eT\b\u000e\u000b\u000e\f\u000eU\u0001\u000e"+
		"\u0001\u000e\u0000\u0000\u000f\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b"+
		"\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u0001\u0000\u0006\u0001\u0000"+
		"az\u0001\u0000AZ\u0002\u0000AZaz\u0003\u000009AZaz\u0002\u0000\n\n\r\r"+
		"\u0002\u0000\t\t  `\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000"+
		"\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0001\u001f\u0001\u0000\u0000"+
		"\u0000\u0003\"\u0001\u0000\u0000\u0000\u0005/\u0001\u0000\u0000\u0000"+
		"\u00074\u0001\u0000\u0000\u0000\t8\u0001\u0000\u0000\u0000\u000b:\u0001"+
		"\u0000\u0000\u0000\r<\u0001\u0000\u0000\u0000\u000f>\u0001\u0000\u0000"+
		"\u0000\u0011@\u0001\u0000\u0000\u0000\u0013B\u0001\u0000\u0000\u0000\u0015"+
		"D\u0001\u0000\u0000\u0000\u0017F\u0001\u0000\u0000\u0000\u0019I\u0001"+
		"\u0000\u0000\u0000\u001bN\u0001\u0000\u0000\u0000\u001dS\u0001\u0000\u0000"+
		"\u0000\u001f \u0005.\u0000\u0000 \u0002\u0001\u0000\u0000\u0000!#\u0007"+
		"\u0000\u0000\u0000\"!\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000"+
		"$\"\u0001\u0000\u0000\u0000$%\u0001\u0000\u0000\u0000%\'\u0001\u0000\u0000"+
		"\u0000&(\u0007\u0001\u0000\u0000\'&\u0001\u0000\u0000\u0000\'(\u0001\u0000"+
		"\u0000\u0000(*\u0001\u0000\u0000\u0000)+\u0007\u0000\u0000\u0000*)\u0001"+
		"\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000"+
		",-\u0001\u0000\u0000\u0000-\u0004\u0001\u0000\u0000\u0000.0\u0007\u0001"+
		"\u0000\u0000/.\u0001\u0000\u0000\u000001\u0001\u0000\u0000\u00001/\u0001"+
		"\u0000\u0000\u000012\u0001\u0000\u0000\u00002\u0006\u0001\u0000\u0000"+
		"\u000035\u0007\u0002\u0000\u000043\u0001\u0000\u0000\u000056\u0001\u0000"+
		"\u0000\u000064\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u00007\b\u0001"+
		"\u0000\u0000\u000089\u0005(\u0000\u00009\n\u0001\u0000\u0000\u0000:;\u0005"+
		")\u0000\u0000;\f\u0001\u0000\u0000\u0000<=\u0005\u2200\u0000\u0000=\u000e"+
		"\u0001\u0000\u0000\u0000>?\u0005\u018e\u0000\u0000?\u0010\u0001\u0000"+
		"\u0000\u0000@A\u0005~\u0000\u0000A\u0012\u0001\u0000\u0000\u0000BC\u0005"+
		"\u2293\u0000\u0000C\u0014\u0001\u0000\u0000\u0000DE\u0005\u2294\u0000"+
		"\u0000E\u0016\u0001\u0000\u0000\u0000FG\u0005\u226b\u0000\u0000G\u0018"+
		"\u0001\u0000\u0000\u0000HJ\u0007\u0003\u0000\u0000IH\u0001\u0000\u0000"+
		"\u0000JK\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000KL\u0001\u0000"+
		"\u0000\u0000L\u001a\u0001\u0000\u0000\u0000MO\u0007\u0004\u0000\u0000"+
		"NM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000"+
		"\u0000PQ\u0001\u0000\u0000\u0000Q\u001c\u0001\u0000\u0000\u0000RT\u0007"+
		"\u0005\u0000\u0000SR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000"+
		"US\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000"+
		"\u0000WX\u0006\u000e\u0000\u0000X\u001e\u0001\u0000\u0000\u0000\t\u0000"+
		"$\',16KPU\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}