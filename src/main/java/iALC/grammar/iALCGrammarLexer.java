// Generated from iALCGrammar.g4 by ANTLR 4.8

   package iALC.grammar;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class iALCGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21[\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\3\6\3%\n\3"+
		"\r\3\16\3&\3\3\5\3*\n\3\3\3\6\3-\n\3\r\3\16\3.\3\4\6\4\62\n\4\r\4\16\4"+
		"\63\3\5\6\5\67\n\5\r\5\16\58\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\3\f\3\f\3\r\3\r\3\16\6\16L\n\16\r\16\16\16M\3\17\6\17Q\n\17\r"+
		"\17\16\17R\3\20\6\20V\n\20\r\20\16\20W\3\20\3\20\2\2\21\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21\3\2\b\3"+
		"\2c|\3\2C\\\4\2C\\c|\5\2\62;C\\c|\4\2\f\f\17\17\4\2\13\13\"\"\2b\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3!\3\2\2\2\5$\3\2\2\2\7"+
		"\61\3\2\2\2\t\66\3\2\2\2\13:\3\2\2\2\r<\3\2\2\2\17>\3\2\2\2\21@\3\2\2"+
		"\2\23B\3\2\2\2\25D\3\2\2\2\27F\3\2\2\2\31H\3\2\2\2\33K\3\2\2\2\35P\3\2"+
		"\2\2\37U\3\2\2\2!\"\7\60\2\2\"\4\3\2\2\2#%\t\2\2\2$#\3\2\2\2%&\3\2\2\2"+
		"&$\3\2\2\2&\'\3\2\2\2\')\3\2\2\2(*\t\3\2\2)(\3\2\2\2)*\3\2\2\2*,\3\2\2"+
		"\2+-\t\2\2\2,+\3\2\2\2-.\3\2\2\2.,\3\2\2\2./\3\2\2\2/\6\3\2\2\2\60\62"+
		"\t\3\2\2\61\60\3\2\2\2\62\63\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\b"+
		"\3\2\2\2\65\67\t\4\2\2\66\65\3\2\2\2\678\3\2\2\28\66\3\2\2\289\3\2\2\2"+
		"9\n\3\2\2\2:;\7*\2\2;\f\3\2\2\2<=\7+\2\2=\16\3\2\2\2>?\7\u2202\2\2?\20"+
		"\3\2\2\2@A\7\u0190\2\2A\22\3\2\2\2BC\7\u0080\2\2C\24\3\2\2\2DE\7\u2295"+
		"\2\2E\26\3\2\2\2FG\7\u2296\2\2G\30\3\2\2\2HI\7\u226d\2\2I\32\3\2\2\2J"+
		"L\t\5\2\2KJ\3\2\2\2LM\3\2\2\2MK\3\2\2\2MN\3\2\2\2N\34\3\2\2\2OQ\t\6\2"+
		"\2PO\3\2\2\2QR\3\2\2\2RP\3\2\2\2RS\3\2\2\2S\36\3\2\2\2TV\t\7\2\2UT\3\2"+
		"\2\2VW\3\2\2\2WU\3\2\2\2WX\3\2\2\2XY\3\2\2\2YZ\b\20\2\2Z \3\2\2\2\13\2"+
		"&).\638MRW\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}