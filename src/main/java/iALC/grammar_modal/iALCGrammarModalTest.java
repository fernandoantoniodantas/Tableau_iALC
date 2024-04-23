package iALC.grammar_modal;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;


public class iALCGrammarModalTest{

	
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
    
	
	
	public static void main(String[] args) {

        //String expression = "(A ? B) ? C";ok
    	//String expression = "(a:A) ? C"; //to do grammar.
    	
    	//String expression = "(Forall r.x > Exists t.x) & C";
    	//String expression = "(Forall r.x) & Forall r.x ";
    	//String expression = "Forallr.x & Forall r.x ";
    	//String expression = "Forall (R.SA) & Forall R.CA";
    	//String expression = "(Forall R.SA & Forall R.CA) > C";
    	//String expression = "(Forall R.SA & Exists R.CA) > C";
    	//String expression = "(Forall R.SA ? Exists R.CA) ? C";
    	//String expression = "(\u2200 R.SA \u226B \u018ER.CA) \u226B \u00AC C";
    	//String expression = "(?R.SA ? ?R.CA) ? �C";
		//String expression = "( A ? B ) ? C";
		//String expression = "( A ? B ) ? C";
		
		//String expression = "( A ? B )";
		
		//String expression = "( A ? B ) ? C";
		//String expression = "?R.(A ? B) ? C";
		//String expression = "∀R.(As ⊔ Bs)";//ok
		//String expression = "∀R.(AA0 ≫ AA0) ⊔ (∀R.CC)";//ok
		//String expression = "∀R.(AA0 ⊔ AA0)"; //ok
		//String expression = "∀R.CC ≫ (ƎR.CC ⊓ ~ ƎR.FG)"; //OKOK
		//String expression = "∀R.CC"; //OKOK
		//String expression = "∀hasCargo.(AA≫AA)"; //ok
		//String expression = "ƎhasScore.(SCORES ⊓ SCORET)";
		String expression = "ƎhasScore.(~SCORES⊓~SCORET)";
		//String expression = "(AA ≫ AA)";
		//String expression = "?R.CC ? (?R.CC ? ~ ?R.FG))"; //OKOK
		//String expression = "(?R.Servidor ? (?R.ProfessorA ? ?R.ProfessorB)) ? (?R.PodeAcumular)";
    	
    	
    	expression = converter(expression);    	

    	iALCGrammarModalLexer lexer = new iALCGrammarModalLexer(CharStreams.fromString(expression));
    	CommonTokenStream tokens = new CommonTokenStream(lexer);    	
        iALCGrammarModalParser parser = new iALCGrammarModalParser(tokens);
        
        ParseTree tree = parser.s();
//        System.out.println(parser.getNumberOfSyntaxErrors());
//        System.out.println(tree.toStringTree(parser));

        
        
        //parser.setBuildParseTree(true);
        
        //RuleContext tree = parser.s();
        //System.out.println(tree.toStringTree(parser)); // print LISP-style tree
 
       
       // Verificar se não houve erros sintáticos
       if (parser.getNumberOfSyntaxErrors() == 0) {
           System.out.println("A string faz parte da gramática!");
       } else {
           System.out.println("A string não faz parte da gramática!");
       }
		
        
       

  
       
       
       
        
        

        
        
        
        
        
        
        
        
        


    }	
	
	
	

}
