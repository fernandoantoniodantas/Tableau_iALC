package iALC.util;

public class TamanhoFormula {
	
	
	
	public String redefinirTamanho(String formula) {
		
		while (formula.length()<2) {
			formula = " "+formula+" ";
		}		
		return formula;
	}

	
	public int PegarTamanho(String formula) {
				
		return formula.length();
	}
	
	
	
	
}
