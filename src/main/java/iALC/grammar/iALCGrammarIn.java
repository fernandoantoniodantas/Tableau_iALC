package iALC.grammar;

import java.util.List;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;



public class iALCGrammarIn extends iALCGrammarBaseVisitor<String>{

	
	
	@Override
	public String visitS(iALCGrammarParser.SContext ctx) {
		// TODO Auto-generated method stub
		return super.visitS(ctx);
	}


	@Override
	public String visitOpFormula(iALCGrammarParser.OpFormulaContext ctx) {
		System.out.println("Starting analysis...");
        //String left = visit(ctx.left);
        //String right = visit(ctx.right);
        
        //System.out.println("Context"+ctx.left);
       // System.out.println("Context"+ctx.right);
        
        
        String op = ctx.op.getText();
        String lef = ctx.left.getText();
        String rig = ctx.right.getText();


        
        String texto1 = lef;
        String texto2 = op;
        String texto3 = rig;
        
        String texto = texto1+texto2+texto3; 
         
        int qtdSimbolos = 0;
        
        Matcher m = Pattern.compile("(≫|⊓|⊔)",Pattern.DOTALL).matcher(texto);
        
        while (m.find())
        	{
        	qtdSimbolos++;
        	}

			/*
			 * while (m.find()) quantidade++; System.out.println(quantidade);
			 */    
        
        
        //System.out.println("Qtd simbolos esquerda: "+qtdSimbolos);
        //qtdSimbolos++;
        System.out.println("Simbolo principal é o: "+qtdSimbolos);
        
              		
        		
        		
        System.out.println("OP->"+op);
        System.out.println("Left->"+lef);
        System.out.println("Right->"+rig);
        System.out.println("-------------");
        System.out.println(op.charAt(0));

        
        switch (op.charAt(0)) {
        	case '\u2293': return lef;// return "@"+lef+"@"+op+"@"+rig; //return Integer.toString(qtdSimbolos);
        	case '\u2294': return lef; //return "@"+lef+"@"+op+"@"+rig;        	
        	case '\u226B': return lef; //return "@"+lef+"@"+op+"@"+rig;

        	default: throw new IllegalArgumentException("Unknown operator " + op);
        	//case '&': return "Left->"+visit(ctx.left) +"---Right->"+visit(ctx.right) ;        	
        }

        
        //String[] valor = {Integer.toString(qtdSimbolos), op};
        //return valor;
		/*
		 * System.out.println("QTD_>"+Integer.toString(qtdSimbolos)); if (qtdSimbolos ==
		 * 1) { return Integer.toString(1); }else { return
		 * Integer.toString(qtdSimbolos); }
		 */		/*
		 * System.out.println("Tota->"+qtdSimbolos); switch (op.charAt(0)) { case '⊓':
		 * return Integer.toString(qtdSimbolos); //⊓ case '⊔': return
		 * Integer.toString(qtdSimbolos); //⊔ case '≫': return
		 * Integer.toString(qtdSimbolos); //≫
		 * 
		 * default: throw new IllegalArgumentException("Unknown operator " + op); //case
		 * '&': return "Left->"+visit(ctx.left) +"---Right->"+visit(ctx.right) ; }
		 */        
        
	}
	
	public static String converter(String formula) {
		
    	// \u00AC -> ¬ 
    	// \u018E -> Ǝ
    	// \u2200 -> ∀
    	// \u226B -> ≫
		// \u2228 -> ∨
		// \u2227 -> ∧
		// \u2293 -> ⊓
		// \u2294 -> ⊔
		 
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
    
	public String IndiceSimboloPrincipal(String Formula) {
		
		String formulaConv = converter(Formula);
		iALCGrammarLexer lexer = new iALCGrammarLexer(CharStreams.fromString(formulaConv));
        iALCGrammarParser parser = new iALCGrammarParser(new CommonTokenStream(lexer));
        
        
        ParseTree tree = parser.formula();
        String answer = new iALCGrammarIn().visit(tree);
        System.out.println("Gramatica anwer->"+answer);
        return answer;
       
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
		//String expression = "∀hasCargo.CC ≫ (∀hasCargo.FG ≫ (∀hasCargo.CC ⊓ ∀hasCargo.FG))"; //ook
		//String expression = "(ƎhasMoney.(CC) ⊓ ~ƎhasMoney.(FG))"; //ok
		//String expression = "∀Ra.Servidor ⊓ ~∀Ra.Estatutario";
		//String expression = "∀hasCargo.(AA≫AA)";
		
		String expression = "(∀emLotacao.SEMPMA ⊓ ~ ∀temGrupo.GI) ≫ ((ƎtemScore.SCORE60) ⊓ (ƎtemScore.SCORE100))";
		
		
		iALCGrammarIn obj = new iALCGrammarIn();
		System.out.println(obj.IndiceSimboloPrincipal(converter(expression)));
		
		
		
    	
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
