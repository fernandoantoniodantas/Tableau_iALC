// Generated from iALCGrammar.g4 by ANTLR 4.4

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
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, LPAREN=2, RPAREN=3, FORALL=4, EXISTS=5, NOT=6, CONJ=7, DISJ=8, 
		IMPL=9, CHARACTER=10, ENDLINE=11, WHITESPACE=12;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'"
	};
	public static final String[] ruleNames = {
		"T__0", "LPAREN", "RPAREN", "FORALL", "EXISTS", "NOT", "CONJ", "DISJ", 
		"IMPL", "CHARACTER", "ENDLINE", "WHITESPACE"
	};


	public iALCGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "iALCGrammar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\16;\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3"+
		"\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\6\f\61\n\f\r\f\16\f\62\3\r\6\r\66"+
		"\n\r\r\r\16\r\67\3\r\3\r\2\2\16\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\3\2\5\5\2\62;C\\c|\4\2\f\f\17\17\4\2\13\13\"\"<\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\3\33\3\2\2\2\5\35\3\2\2\2\7\37\3\2\2\2\t!\3\2\2\2\13#\3\2"+
		"\2\2\r%\3\2\2\2\17\'\3\2\2\2\21)\3\2\2\2\23+\3\2\2\2\25-\3\2\2\2\27\60"+
		"\3\2\2\2\31\65\3\2\2\2\33\34\7\60\2\2\34\4\3\2\2\2\35\36\7*\2\2\36\6\3"+
		"\2\2\2\37 \7+\2\2 \b\3\2\2\2!\"\7\u2202\2\2\"\n\3\2\2\2#$\7\u0190\2\2"+
		"$\f\3\2\2\2%&\7\u0080\2\2&\16\3\2\2\2\'(\7\u2295\2\2(\20\3\2\2\2)*\7\u2296"+
		"\2\2*\22\3\2\2\2+,\7\u226d\2\2,\24\3\2\2\2-.\t\2\2\2.\26\3\2\2\2/\61\t"+
		"\3\2\2\60/\3\2\2\2\61\62\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\30\3\2"+
		"\2\2\64\66\t\4\2\2\65\64\3\2\2\2\66\67\3\2\2\2\67\65\3\2\2\2\678\3\2\2"+
		"\289\3\2\2\29:\b\r\2\2:\32\3\2\2\2\5\2\62\67\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}