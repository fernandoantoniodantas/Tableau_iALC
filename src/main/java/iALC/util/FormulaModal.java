package iALC.util;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import iALC.grammar_modal.iALCGrammarModalLexer;
import iALC.grammar_modal.iALCGrammarModalParser;

public class FormulaModal {
	
	
	
	public static String converter(String formula) {
		 
		String replacedString=formula.replaceAll("¬","\u00AC");
		replacedString=replacedString.replaceAll("Ǝ","\u018E");
		replacedString=replacedString.replaceAll("¬","\u00AC");
		replacedString=replacedString.replaceAll("∀","\u2200");
		replacedString=replacedString.replaceAll("≫","\u226B");		
		replacedString=replacedString.replaceAll("⊓","\u2293");
		replacedString=replacedString.replaceAll("⊔","\u2294");
		replacedString=replacedString.replaceAll("∨","\u2228");
		
		
		return replacedString;
		
	}
	
		
	public boolean IsModal(String formula) {
		
		boolean result = true;
		
    	String expression = converter(formula);    	

    	iALCGrammarModalLexer lexer = new iALCGrammarModalLexer(CharStreams.fromString(expression));
    	CommonTokenStream tokens = new CommonTokenStream(lexer);    	
        iALCGrammarModalParser parser = new iALCGrammarModalParser(tokens);
        ParseTree tree = parser.s();

       
       // Verificar se não houve erros sintáticos
       if (parser.getNumberOfSyntaxErrors() == 0) {
           System.out.println("A string faz parte da gramática!");
           result=true;
       } else {
           System.out.println("A string não faz parte da gramática!");
           result=false;
       }
		
		return result;
	}

}
