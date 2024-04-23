package iALC.grammar;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class iALCGrammarTest extends iALCGrammarBaseVisitor<String>{

	
	
	@Override
	public String visitS(iALCGrammarParser.SContext ctx) {
		// TODO Auto-generated method stub
		return super.visitS(ctx);
	}

	
	@Override
	public String visitForallAtomico(iALCGrammarParser.ForallAtomicoContext ctx) { 
		// TODO Auto-generated method stub		
	//	String f1 = ctx.f1.getText();
	//	System.out.println("FORALL ATOMICO->"+f1);
		return super.visit(ctx);
	}	
	
   

	@Override
	public String visitAtomFormula(iALCGrammarParser.AtomFormulaContext ctx) {	
		System.out.println("Starting analysis-Atomic Formulas...");
		String atom = ctx.atom.getText();
		System.out.println("Atomica->"+atom);
		return atom;
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
        
        
        System.out.println("OP->"+op);
        System.out.println("Left->"+lef);
        System.out.println("Right->"+rig);
        System.out.println("-------------");
        

        
        switch (op.charAt(0)) {
            //System.out.println("Aqui->"+op);
    		case '\u226B': return "Left->"+lef +"---Right->"+rig+"---Main Connective->"+"'"+op+"'";
            case '\u2293': return "Left->"+lef +"---Right->"+rig+"---Main Connective->"+"'"+op+"'";
        	case '\u2294': return "Left->"+lef +"---Right->"+rig+"---Main Connective->"+"'"+op+"'";        	


        	default: throw new IllegalArgumentException("Unknown operator " + op);
        	//case '&': return "Left->"+visit(ctx.left) +"---Right->"+visit(ctx.right) ;
        	
        }

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
		//String expression = "( A ⊔ B ) ⊓ C";
		//String expression = "( A ⊔ B ) ⊔ C";
		
		//String expression = "( A ⊔ B )";
		
		//String expression = "( A ⊔ B ) ⊔ C";
		//String expression = "∀R.(A ≫ B) ≫ C";
		//String expression = "∀R.(A ⊔ B)";
		//String expression = "As ≫ Bs"; //ok
		//String expression = "∀R.(AA0 ≫ AA0) ⊔ (∀R.CC)";//ok
		
		
		
		//String expression = "∀R.CC ≫ (ƎR.CC ⊓ ~ ƎR.FG))"; //OKOK
		//String expression = "( Ǝ R . C C ⊓ ~ Ǝ R . F G )";
		//String expression = "(ƎR.CC ⊓ ~ƎR.FG)";
		//String expression = "∀R.(A ≫ A)";
		
		//String expression = "(∀R.Servidor ⊓ (ƎR.ProfessorA ⊓ ƎR.ProfessorB)) ≫ (∀R.PodeAcumular)";
    	
		String expression = "((∀emLotacao.SEMPMA)⊓(~∀temGrupo.GI))≫((ƎtemScore.SCORE60)⊓(ƎtemScore.SCORE100))";
		//String expression = "(∀emLotacao.SEMPMA ⊓ ~∀temGrupo.GI) ≫ (ƎtemScore.SCORE60 ⊓ ƎtemScore.SCORE100)";
		///String expression = "(∀emLotacao.SEMPMA ⊓ ~∀temGrupo.GI) ≫ (ƎtemScore.SCORE60 ⊓ ƎtemScore.SCORE100)";
		//String expression = "(∀emLotacao.SEMPMA ⊓ ~∀temGrupo.GI) ≫ (ƎtemScore.SCORE60 ⊓ ƎtemScore.SCORE100)";
		//String expression = "(∀emLotacao.SEMPMA ⊓ ~∀temGrupo.GI) ≫ (ƎtemScore.SCORE60 ⊓ ƎtemScore.SCORE100)";
		//String expression = "(∀emLotacao.SEMPMA ⊓ ~∀temGrupo.GI) ≫ (ƎtemScore.SCORE60 ⊓ ƎtemScore.SCORE100)";
		//String expression = "(∀emLotacao.SEMPMA ⊓ ~∀temGrupo.GI) ≫ (ƎtemScore.SCORE60 ⊓ ƎtemScore.SCORE100)";
		
    	expression = converter(expression);    	
        iALCGrammarLexer lexer = new iALCGrammarLexer(CharStreams.fromString(expression));
        iALCGrammarParser parser = new iALCGrammarParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.formula();
        ParseTree tree1 = parser.getContext();
        
        
        String answer = new iALCGrammarTest().visit(tree);
        String answer1 = new iALCGrammarTest().visitBin_connective(parser.bin_connective());//  .visitForallAtomico(tree);
        String answer2 = new iALCGrammarTest().visitModal(parser.modal());
        System.out.println("FFF->"+answer2);
        
        
        
        
        System.out.println("vlr"+answer);
        System.out.printf("%s = %s \n", expression, answer);
        
    }	
	
	
	

}
