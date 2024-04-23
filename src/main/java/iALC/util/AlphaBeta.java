package iALC.util;

import iALC.vetInvet.Node;

public class AlphaBeta {


	
	public char define(char conectivo, char signal) {
			
		if (((signal == 'T') && (conectivo == '⊓')) || ((signal == 'F') && (conectivo == '≫')) || ((signal == 'F') && (conectivo == '⊔'))) 
		   {
			return 'A';
		}else if (((signal == 'T') && (conectivo == '≫')) || ((signal == 'F') && (conectivo == '⊓')) || ((signal == 'T') && (conectivo == '⊔')))  
		   {
			return 'B';
		} return 'F' ;//Identifica que n�o tem conectivo ent�o � uma folha (Isso muda com a nega��o)
			
	}
	
	
	public static void main(String[] args) {
			AlphaBeta obj = new AlphaBeta();
			System.out.println(obj.define('>', 'F'));
		
	}
	
	
}
