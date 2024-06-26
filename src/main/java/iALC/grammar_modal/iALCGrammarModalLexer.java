// Generated from iALCGrammarModal.g4 by ANTLR 4.8

   package iALC.grammar_modal;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class iALCGrammarModalLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\22_\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\3\6\3\'\n\3\r\3\16\3(\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t"+
		"\3\n\3\n\3\13\3\13\3\f\6\f<\n\f\r\f\16\f=\3\f\5\fA\n\f\3\f\6\fD\n\f\r"+
		"\f\16\fE\3\r\6\rI\n\r\r\r\16\rJ\3\16\6\16N\n\16\r\16\16\16O\3\17\3\17"+
		"\3\20\6\20U\n\20\r\20\16\20V\3\21\6\21Z\n\21\r\21\16\21[\3\21\3\21\2\2"+
		"\22\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22\3\2\b\4\2\f\f\16\17\3\2c|\3\2C\\\5\2\62;C\\c|\4\2\f\f\17"+
		"\17\4\2\13\13\"\"\2f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\3#\3\2\2\2\5&\3\2\2\2\7*\3\2\2\2\t,\3\2\2\2\13.\3\2\2\2"+
		"\r\60\3\2\2\2\17\62\3\2\2\2\21\64\3\2\2\2\23\66\3\2\2\2\258\3\2\2\2\27"+
		";\3\2\2\2\31H\3\2\2\2\33M\3\2\2\2\35Q\3\2\2\2\37T\3\2\2\2!Y\3\2\2\2#$"+
		"\7\60\2\2$\4\3\2\2\2%\'\t\2\2\2&%\3\2\2\2\'(\3\2\2\2(&\3\2\2\2()\3\2\2"+
		"\2)\6\3\2\2\2*+\7*\2\2+\b\3\2\2\2,-\7+\2\2-\n\3\2\2\2./\7\u2202\2\2/\f"+
		"\3\2\2\2\60\61\7\u0190\2\2\61\16\3\2\2\2\62\63\7\u0080\2\2\63\20\3\2\2"+
		"\2\64\65\7\u2295\2\2\65\22\3\2\2\2\66\67\7\u2296\2\2\67\24\3\2\2\289\7"+
		"\u226d\2\29\26\3\2\2\2:<\t\3\2\2;:\3\2\2\2<=\3\2\2\2=;\3\2\2\2=>\3\2\2"+
		"\2>@\3\2\2\2?A\t\4\2\2@?\3\2\2\2@A\3\2\2\2AC\3\2\2\2BD\t\3\2\2CB\3\2\2"+
		"\2DE\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\30\3\2\2\2GI\t\4\2\2HG\3\2\2\2IJ\3\2"+
		"\2\2JH\3\2\2\2JK\3\2\2\2K\32\3\2\2\2LN\t\5\2\2ML\3\2\2\2NO\3\2\2\2OM\3"+
		"\2\2\2OP\3\2\2\2P\34\3\2\2\2QR\t\5\2\2R\36\3\2\2\2SU\t\6\2\2TS\3\2\2\2"+
		"UV\3\2\2\2VT\3\2\2\2VW\3\2\2\2W \3\2\2\2XZ\t\7\2\2YX\3\2\2\2Z[\3\2\2\2"+
		"[Y\3\2\2\2[\\\3\2\2\2\\]\3\2\2\2]^\b\21\2\2^\"\3\2\2\2\13\2(=@EJOV[\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}