package iALC.util;

public class PegarIndiceConectivo {
	
	//Este método trata pega o indice do conectivo principaç a partir da String (left da arvore) de retorno do parser de iALC
	public int pegarIndice(String LeftFormula) {
		int contador=0;
		for (int i=0; i<LeftFormula.length(); i++) {
			char s = LeftFormula.charAt(i);
			String b = String.valueOf(s); 
			String simb1 = "≫";
			String simb2 = "⊓";
			String simb3 = "⊔";
		
			if (b.equals(simb1) || b.equals(simb2) || b.equals(simb3)) {
				contador++;
			}
		}
		return contador+1;
	}

}
