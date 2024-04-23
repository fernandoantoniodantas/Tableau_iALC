package iALC.util;

public class CountSymbol {
	
	
	
	public int count(String formula) {

	  int cont=0;
		for (int i=0; i< formula.length(); i++) {
			//if ((formula.charAt(i) == '>') || (formula.charAt(i) == '&') || (formula.charAt(i) == '~') || (formula.charAt(i) == '^')) { 
			if ((formula.charAt(i) == '≫') || (formula.charAt(i) == '⊓') || (formula.charAt(i) == '⊔')) { 

				cont++;
				
			}
		} return cont;
	}
}
		
		



