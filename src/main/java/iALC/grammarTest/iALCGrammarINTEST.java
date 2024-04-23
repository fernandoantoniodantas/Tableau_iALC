package iALC.grammarTest;


import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import iALC.grammarTest.*;



public class iALCGrammarINTEST {

	
	


	
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
    
	public void IndiceSimboloPrincipal(String Formula) {
		
		
	
		        // Criar um analisador léxico
		        UpperLexer lexer = new UpperLexer(CharStreams.fromString(Formula));

		        // Criar um token stream baseado no analisador léxico
		        CommonTokenStream tokens = new CommonTokenStream(lexer);

		        // Criar um analisador sintático baseado no token stream
		        UpperParser parser = new UpperParser(tokens);

		        // Iniciar a análise sintática a partir da regra nomeString
		        ParseTree tree = parser.s();

		        // Imprimir a árvore de análise sintática
		        System.out.println(tree.toStringTree(parser));

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*String formulaConv = converter(Formula);
		
		 * iALCGrammarTesteLexer lexer = new
		 * iALCGrammarTesteLexer(CharStreams.fromString(formulaConv));
		 * iALCGrammarTesteParser parser = new iALCGrammarTesteParser(new
		 * CommonTokenStream(lexer)); ParseTree tree = parser.s();
		 * System.out.println(tree.toStringTree(parser));
		 */		
/*
		        
		        String formulaConv = Formula;
		UpperLexer lexer = new UpperLexer(CharStreams.fromString(formulaConv));
        UpperParser parser = new UpperParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.s();
        System.out.println(tree.toStringTree(parser));
        
*/        
        
        //String answer = new iALCGrammarINTEST(); //.visit(tree);
        //System.out.println("Gramatica anwer->"+answer);
        //return answer;
       
	}
	
	public static void main(String[] args) {

        //String expression = "(A ∧ B) ≫ C";ok
    	//String expression = "(a:A) ≫ C"; //to do grammar.
    	
    	//String expression = "(Forall r.x > Exists t.x) & C";
    	//String expression = "(Forall r.x) & Forall r.x ";
    	//String expression = "Forallr.x & Forall r.x ";
    	//String expression = "Forall (R.SA) & Forall R.CA";
    	//String expression = "(Forall R.SA & Forall R.CA) > C";
    	//String expression = "(Forall R.SA & Exists R.CA) > C";
    	//String expression = "(Forall R.SA Ͳ Exists R.CA) Ͳ C";
    	//String expression = "(\u2200 R.SA \u226B \u018ER.CA) \u226B \u00AC C";
    	//String expression = "(∀R.SA ⊓ ƎR.CA) ≫ ¬C";
		//String expression = "(( A ⊔ B ) ⊓ (C ⊓ D)"; //Null
		//String expression = "( A ⊔ B ) ⊔ C"; //Null
		
		//String expression = "( A ⊔ B ) ⊔ C";
		//String expression = "A ⊔ ( B ⊓ C )";
		//String expression = "A ⊓ ( B ⊔ C )";
		//String expression = "A ⊔ B";
		
		
		//String expression = "(∀R.Servidor ⊓ (ƎR.ProfessorA ⊓ ƎR.ProfessorB)) ≫ (∀R.PodeAcumular)";
		//String expression = "∀R.PrA ≫ ∀R.PrB ≫ ∀Real.(PrA) ⊓ ∀Reax.(PrB)";
		//String expression = "(ƎR.(CC) ⊓ ~ƎR.(FG))";
		//String expression = "∀Ra.Servidor ⊓ ~∀Ra.Estatutario";
		//String expression = "∀Ra.(AA⊓FG)";		
		//String expression = "ƎCAsaAAAA.(cas)";
		
		String expression = "hasMone.CASA";
		
		iALCGrammarINTEST obj = new iALCGrammarINTEST();
		//System.out.println(obj.IndiceSimboloPrincipal(converter(expression)));
		//obj.IndiceSimboloPrincipal(converter(expression));
		obj.IndiceSimboloPrincipal(expression);
		
		
		
		
    	
		/*
		 * expression = converter(expression); iALCGrammarLexer lexer = new
		 * iALCGrammarLexer(CharStreams.fromString(expression)); iALCGrammarParser
		 * parser = new iALCGrammarParser(new CommonTokenStream(lexer)); ParseTree tree
		 * = parser.formula();
		 * 
		 * 
		 * String answer = new iALCGrammarIn().visit(tree);
		 * //System.out.println("Valor é->"+answer); System.out.printf("%s = %s \n",
		 * expression, answer);
		 */        
    }	
	
	
	

}
