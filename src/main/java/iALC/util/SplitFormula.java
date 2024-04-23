package iALC.util;

import iALC.vetInvet.Node;

public class SplitFormula {
	GFG objGFG = new GFG();

	
	/// Para regras Alpha
	public String splitFirst(Node objNode) {
//		String formula = objNode.getFormula().trim();
//		formula = RemocaoParentesesExtras.trataParenteses(formula);
		GFG objGFG = new GFG(); //Util que trata os parenteses extras (Novo)
		objNode.setFormula(objGFG.testeParenteses(objNode.getFormula()));
//		int position = objNode.getpositionConectivoPrincipal();
//		return formula.substring(0,(position*2-1));
		String formula = objNode.getFormula().trim();
		//formula = RemocaoParentesesExtras.trataParenteses(formula);
		int positionInd = objNode.getpositionConectivoPrincipal(); //é o indice do conectivo no conjunto de conectivos
		PegaConectivoPorIndice objPega = new PegaConectivoPorIndice();
		int position = objPega.SimbolRestoreIndice(positionInd,formula);
		System.out.println(formula.substring(0,(position)));
		//return formula.substring(0,(position*2-1));
		return formula.substring(0,(position));

	}
	
	public String splitSecond(Node objNode) {
//		String formula = objNode.getFormula().trim();
//		formula = RemocaoParentesesExtras.trataParenteses(formula);
		objNode.setFormula(objGFG.testeParenteses(objNode.getFormula()));
//		int position = objNode.getpositionConectivoPrincipal();
//		return formula.substring((position*2), formula.length());
		String formula = objNode.getFormula().trim();
		//formula = RemocaoParentesesExtras.trataParenteses(formula);
		int positionInd = objNode.getpositionConectivoPrincipal(); //é o indice do conectivo no conjunto de conectivos
		PegaConectivoPorIndice objPega = new PegaConectivoPorIndice();
		int position = objPega.SimbolRestoreIndice(positionInd,formula);
		System.out.println(formula.substring(position+1,formula.length()));
		//return formula.substring(0,(position*2-1));
		return formula.substring(position+1,formula.length());
		
	}
	
	
	
	
	//// Para regras Beta//////
	public String splitLeft(Node objNode) {
		String formula = objNode.getFormula();
		//formula = RemocaoParentesesExtras.trataParenteses(formula);
		objNode.setFormula(objGFG.testeParenteses(objNode.getFormula()));
		int positionInd = objNode.getpositionConectivoPrincipal(); //é o indice do conectivo no conjunto de conectivos
		PegaConectivoPorIndice objPega = new PegaConectivoPorIndice();
		int position = objPega.SimbolRestoreIndice(positionInd,formula);
		System.out.println(formula.substring(0,(position)));
		//return formula.substring(0,(position*2-1));
		return formula.substring(0,(position));
	}
	
	public String splitRight(Node objNode) {
		//String formula = objNode.getFormula();
		//formula = RemocaoParentesesExtras.trataParenteses(formula);
		objNode.setFormula(objGFG.testeParenteses(objNode.getFormula()));
		//int position = objNode.getpositionConectivoPrincipal();
		
		//return formula.substring((position*2), formula.length());
		String formula = objNode.getFormula();
		//formula = RemocaoParentesesExtras.trataParenteses(formula);
		int positionInd = objNode.getpositionConectivoPrincipal(); //é o indice do conectivo no conjunto de conectivos
		PegaConectivoPorIndice objPega = new PegaConectivoPorIndice();
		int position = objPega.SimbolRestoreIndice(positionInd,formula);
		System.out.println(formula.substring(position+1,formula.length()));
		//return formula.substring(0,(position*2-1));
		return formula.substring(position+1,formula.length());

	
	
	
	
	}
	

}


