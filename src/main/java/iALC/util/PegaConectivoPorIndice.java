package iALC.util;

public class PegaConectivoPorIndice {
	
	
	public char SimbolRestore(int indice, String formula) {
		
//		for (int i=0; i<formula.length(); i++) {
//			System.out.println("------------------->"+i+"---->"+formula.charAt(i));
//		}
		
		//System.out.println("------------------->"+indice+"---->"+formula);
		return formula.charAt((indice*2)-1);
	}
	
	public String SimbolRestoreNew(int indice, String formula) {
		int contador=0;
		String resultado=null;
		for (int i=0; i<formula.length(); i++) {
			char s = formula.charAt(i);
			String b = String.valueOf(s); 
			String simb1 = "≫";
			String simb2 = "⊓";
			String simb3 = "⊔";
		
			if (b.equals(simb1) || b.equals(simb2) || b.equals(simb3)) {
				contador++;
				if (contador==indice) {
					 resultado = b;
				}
			}
	}
		return resultado;
}

	//Retorna o indice do conectivo na string
	public int SimbolRestoreIndice(int indice, String formula) { 
		int contador=0;
		int resultado=0;
		for (int i=0; i<formula.length(); i++) {
			char s = formula.charAt(i);
			String b = String.valueOf(s); 
			String simb1 = "≫";
			String simb2 = "⊓";
			String simb3 = "⊔";
		
			if (b.equals(simb1) || b.equals(simb2) || b.equals(simb3)) {
				contador++;
				if (contador==indice) {
					 resultado = i;
				}
			}
	}
		return resultado;
}





}


		
		

