package iALC.rules;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import iALC.util.CountSymbol;
import iALC.util.RemocaoParentesesExtras;
import iALC.util.SplitFormula;
import iALC.vetInvet.Node;
import iALC.vetInvet.PrincipalNew;
//import util.Adjacencias;

public class RulesbACKUP {
	

	PrincipalNew objPrin = new PrincipalNew();
	public Integer origem;
	public Integer destino;
	public Integer destinoL;
	public Integer destinoR;
	

	
	public void iALC_neg(Node objNode, LinkedList<Node> mainList, char direction, Map<Integer, List<Integer>> adjMap, int idFolha) {
		char tipoExpansao = 'A';//Sempre é Alpha		
		Node objNovoNo = new Node();
	
		
		if ((tipoExpansao=='A') && (direction == 'Z')) {

			if (objNode.getSignal()==('F')) {
				objNovoNo.setSignal('T');
			}
			if (objNode.getSignal()==('T')) {
				objNovoNo.setSignal('F');
			}

			objNovoNo.setIndice(mainList.size()+1);//Indice
			objNovoNo.setFormula(objNode.getFormula().replace("~"," ").trim());
			objNovoNo.setIndicePai(String.valueOf(objNode.getIndice()));
			objNovoNo.setIndice(mainList.size()+1);
			//objNovoNo.setWorld(objNode.getWorld());
			objNovoNo.setWorld(objNode.getWorld()+"'");
			objNovoNo.setRelacao(objNode.getWorld()+"\u227C"+objNode.getWorld()+"'");
			objNovoNo.setTipoExpansao('U');
			objNovoNo.setChecked('S'); 
			objNovoNo.setAntecedente(objNode.getIndice());
			objNovoNo.setSignal(objNovoNo.getSignal());
			objNovoNo.setNivel(objNode.getNivel()+1);
			mainList.add(objNovoNo);

			adjMap.put(idFolha, Arrays.asList(objNovoNo.getIndice()));		
		}

	}
	
	
	//NUNCA ENTRA ??? //
	public void iALC_atomic(Node objNode, LinkedList<Node> mainList, char direction, Map<Integer, List<Integer>> adjMap, int idFolha ) {
		char tipoExpansao = 'U';//Sempre é Alpha		
		Node objNovoNo = new Node();
		
		if ((tipoExpansao=='U') && (direction == 'Z')) {
			objNovoNo.setIndice(mainList.size()+1);//Indice 
			objNovoNo.setFormula(objNode.getFormula());
			objNovoNo.setWorld(objNode.getWorld());
			objNovoNo.setRelacao(objNode.getWorld()+"\u227C"+objNode.getWorld());
			objNovoNo.setTipoExpansao('U');
			objNovoNo.setChecked('S');
			objNovoNo.setSignal(objNode.getSignal());
			objNovoNo.setNivel(objNode.getNivel()+1);
			//listaAdj.add(Arrays.asList(objNovoNo.getIndice(),0));
			objNovoNo.setIndicePai(String.valueOf(objNode.getIndice()));//Colocada segunda dia 26
			mainList.add(objNovoNo);
			adjMap.put(idFolha, Arrays.asList(objNovoNo.getIndice()));
			
		}

	}
	
	
	
	
	public void iIALC_imp(Node objNode, LinkedList<Node> mainList, char direction, int antecedente, Map<Integer, List<Integer>> adjMap, int idFolha) {
		

		
		char tipoExpansao = objNode.getTipoExpansao();		
		Node objNovoNo = new Node();

		SplitFormula objSplitForm = new SplitFormula();
		
		
		System.out.println("Tipo->"+tipoExpansao);

		if ((tipoExpansao=='A') && (direction == 'F')) {

			objNovoNo.setIndice(mainList.size()+1);//Indice 						
			objNovoNo.setIndicePai(String.valueOf(objNode.getIndice()));			
			objNovoNo.setFormula(objSplitForm.splitFirst(objNode)); //Grava a primeira formula
			objNovoNo.setFormula(RemocaoParentesesExtras.trataParenteses(objNovoNo.getFormula().trim()));			
			objNovoNo.setFormula(objNovoNo.getFormula().trim());			
			objNovoNo.setWorld(objNode.getWorld());
			objNovoNo.setRelacao(objNode.getWorld()+"\u227C"+objNode.getWorld());
			objNovoNo.setSignal('T'); 
			objNovoNo.setChecked('N');//Verificar?????
			objNovoNo.setIndiceFilho(String.valueOf(objNode.getIndice()+2));//Rever isso	
			objNovoNo.setNivel(objNode.getNivel()+1);
			objNovoNo.setAntecedente(objNode.getIndice());

			this.origem = objNovoNo.getIndice();

			adjMap.put(idFolha, Arrays.asList(origem));
			mainList.add(objNovoNo);

		}
			
		else if ((tipoExpansao=='A') && (direction == 'S')) {

			objNovoNo.setIndice(mainList.size()+1);//Indice 
			objNovoNo.setIndicePai(String.valueOf(objNode.getIndice()));//String.valueOf(objNovoNo.getIndice()-1));//Ver se tem esse -1
			objNovoNo.setFormula(objSplitForm.splitSecond(objNode)); //Grava a segunda formula
			objNovoNo.setFormula(RemocaoParentesesExtras.trataParenteses(objNovoNo.getFormula().trim()));
			objNovoNo.setFormula(objNovoNo.getFormula().trim());
			objNovoNo.setWorld(objNode.getWorld()+"'");
			objNovoNo.setRelacao(objNode.getWorld()+"\u227C"+objNode.getWorld()+"'");
			objNovoNo.setSignal('F'); 
			objNovoNo.setChecked('N');//Verificar?????
			objNovoNo.setNivel(objNode.getNivel()+2);
			objNovoNo.setAntecedente(objNode.getIndice()+1);

			this.destino = objNovoNo.getIndice();
			
			mainList.add(objNovoNo);
			//listaAdj.add(Arrays.asList(origem, destino)); comentado segunda
			//listaAdj.add(Arrays.asList(origem, destino)); //adicionado segunda
			adjMap.put(origem, Arrays.asList(destino));
		}		
		
		else if ((tipoExpansao=='B') && (direction == 'L')) {

			objNovoNo.setIndice(mainList.size()+1);//Indice 
			objNovoNo.setIndicePai(String.valueOf(objNode.getIndice()));
			objNovoNo.setFormula(objSplitForm.splitLeft(objNode)); //Grava a formula 
			objNovoNo.setFormula(RemocaoParentesesExtras.trataParenteses(objNovoNo.getFormula().trim()));
			objNovoNo.setFormula(objNovoNo.getFormula().trim());
			objNovoNo.setWorld(objNode.getWorld()+"'");
			objNovoNo.setRelacao(objNode.getWorld()+"\u227C"+objNode.getWorld()+"'");
			objNovoNo.setSignal('F');////Aqui 
			objNovoNo.setChecked('N');//Verificar?????
			objNovoNo.setNivel(objNode.getNivel()+1);
			objNovoNo.setAntecedente(antecedente);//Pega o ultimo elemento da Fila

			this.destinoL = objNovoNo.getIndice();
			
			mainList.add(objNovoNo);
		}	
		else if ((tipoExpansao=='B') && (direction == 'R')) {

			objNovoNo.setIndice(mainList.size()+1);//Indice 
			objNovoNo.setIndicePai(String.valueOf(objNode.getIndice()));
			objNovoNo.setFormula(objSplitForm.splitRight(objNode)); //Grava a formula 
			objNovoNo.setFormula(RemocaoParentesesExtras.trataParenteses(objNovoNo.getFormula().trim()));
			objNovoNo.setFormula(objNovoNo.getFormula().trim());
			objNovoNo.setWorld(objNode.getWorld()+"'");
			objNovoNo.setRelacao(objNode.getWorld()+"\u227C"+objNode.getWorld()+"'");
			objNovoNo.setSignal('T');////Aqui
			objNovoNo.setChecked('N');//Verificar?????
			objNovoNo.setNivel(objNode.getNivel()+1);
			objNovoNo.setAntecedente(antecedente);

			this.destinoR = objNovoNo.getIndice();
			if (objNode.getIndice()>2){ //por ultimo
				adjMap.put(idFolha, Arrays.asList(this.destinoL, this.destinoR));
			}
			mainList.add(objNovoNo);
			
		}

	}


	////// Modificacao 29/11/2023
	public void iIALC_disj(Node objNode, LinkedList<Node> mainList, char direction, int antecedente, Map<Integer, List<Integer>> adjMap, int idFolha) {
			
		char tipoExpansao = objNode.getTipoExpansao();		
		Node objNovoNo = new Node();

		SplitFormula objSplitForm = new SplitFormula();
		
		
		System.out.println("Tipo->"+tipoExpansao);

		if ((tipoExpansao=='A') && (direction == 'F')) {

			objNovoNo.setIndice(mainList.size()+1);//Indice 						
			objNovoNo.setIndicePai(String.valueOf(objNode.getIndice()));			
			objNovoNo.setFormula(objSplitForm.splitFirst(objNode)); //Grava a primeira formula
			objNovoNo.setFormula(RemocaoParentesesExtras.trataParenteses(objNovoNo.getFormula().trim()));			
			objNovoNo.setFormula(objNovoNo.getFormula().trim());			
			objNovoNo.setWorld(objNode.getWorld());
			objNovoNo.setRelacao(objNode.getWorld()+"\u227C"+objNode.getWorld());
			objNovoNo.setSignal('F'); 
			objNovoNo.setChecked('N');//Verificar?????
			objNovoNo.setIndiceFilho(String.valueOf(objNode.getIndice()+2));//Rever isso	
			objNovoNo.setNivel(objNode.getNivel()+1);
			objNovoNo.setAntecedente(objNode.getIndice());

			this.origem = objNovoNo.getIndice();

			adjMap.put(idFolha, Arrays.asList(origem));
			mainList.add(objNovoNo);

		}
			
		else if ((tipoExpansao=='A') && (direction == 'S')) {

			objNovoNo.setIndice(mainList.size()+1);//Indice 
			objNovoNo.setIndicePai(String.valueOf(objNode.getIndice()));//String.valueOf(objNovoNo.getIndice()-1));//Ver se tem esse -1
			objNovoNo.setFormula(objSplitForm.splitSecond(objNode)); //Grava a segunda formula
			objNovoNo.setFormula(RemocaoParentesesExtras.trataParenteses(objNovoNo.getFormula().trim()));
			objNovoNo.setFormula(objNovoNo.getFormula().trim());
			//objNovoNo.setWorld(objNode.getWorld()+"'"); 
			objNovoNo.setWorld(objNode.getWorld());			
			objNovoNo.setRelacao(objNode.getWorld()+"\u227C"+objNode.getWorld());
			objNovoNo.setSignal('F'); 
			objNovoNo.setChecked('N');//Verificar?????
			objNovoNo.setNivel(objNode.getNivel()+2);
			objNovoNo.setAntecedente(objNode.getIndice()+1);

			this.destino = objNovoNo.getIndice();
			
			mainList.add(objNovoNo);
			//listaAdj.add(Arrays.asList(origem, destino)); comentado segunda
			//listaAdj.add(Arrays.asList(origem, destino)); //adicionado segunda
			adjMap.put(origem, Arrays.asList(destino));
		}		
		
		else if ((tipoExpansao=='B') && (direction == 'L')) {

			objNovoNo.setIndice(mainList.size()+1);//Indice 
			objNovoNo.setIndicePai(String.valueOf(objNode.getIndice()));
			objNovoNo.setFormula(objSplitForm.splitLeft(objNode)); //Grava a formula 
			objNovoNo.setFormula(RemocaoParentesesExtras.trataParenteses(objNovoNo.getFormula().trim()));
			objNovoNo.setFormula(objNovoNo.getFormula().trim());
			objNovoNo.setWorld(objNode.getWorld()+"'");
			objNovoNo.setRelacao(objNode.getWorld()+"\u227C"+objNode.getWorld()+"'");
			objNovoNo.setSignal('T');////Aqui 
			objNovoNo.setChecked('N');//Verificar?????
			objNovoNo.setNivel(objNode.getNivel()+1);
			objNovoNo.setAntecedente(antecedente);//Pega o ultimo elemento da Fila

			this.destinoL = objNovoNo.getIndice();
			
			mainList.add(objNovoNo);
		}	
		else if ((tipoExpansao=='B') && (direction == 'R')) {

			objNovoNo.setIndice(mainList.size()+1);//Indice 
			objNovoNo.setIndicePai(String.valueOf(objNode.getIndice()));
			objNovoNo.setFormula(objSplitForm.splitRight(objNode)); //Grava a formula 
			objNovoNo.setFormula(RemocaoParentesesExtras.trataParenteses(objNovoNo.getFormula().trim()));
			objNovoNo.setFormula(objNovoNo.getFormula().trim());
			objNovoNo.setWorld(objNode.getWorld()+"'");
			objNovoNo.setRelacao(objNode.getWorld()+"\u227C"+objNode.getWorld()+"'");
			objNovoNo.setSignal('T');////Aqui
			objNovoNo.setChecked('N');//Verificar?????
			objNovoNo.setNivel(objNode.getNivel()+1);
			objNovoNo.setAntecedente(antecedente);

			this.destinoR = objNovoNo.getIndice();
			if (objNode.getIndice()>2){ //por ultimo
				adjMap.put(idFolha, Arrays.asList(this.destinoL, this.destinoR));
			}
			mainList.add(objNovoNo);
			
		}

	}	
	//////
	
	
	public Node iIALC_and(Node objNode, LinkedList<Node> mainList, char direction, int antecedente, Map<Integer, List<Integer>> adjMap, int idFolha) {


		char tipoExpansao = objNode.getTipoExpansao();		
		Node objNovoNo = new Node();		
		SplitFormula objSplitForm = new SplitFormula();
		RulesbACKUP objRules = new RulesbACKUP();
		
		if ((tipoExpansao=='A') && (direction == 'F')) {

			objNovoNo.setIndice(mainList.size()+1);//Indice 
			objNovoNo.setIndicePai(String.valueOf(objNode.getIndice()));
			objNovoNo.setFormula(objSplitForm.splitFirst(objNode)); //Grava a primeira formula 
			objNovoNo.setFormula(RemocaoParentesesExtras.trataParenteses(objNovoNo.getFormula().trim()));			
			objNovoNo.setFormula(objNovoNo.getFormula().trim());
			objNovoNo.setWorld(objNode.getWorld());
			objNovoNo.setRelacao(objNode.getWorld()+"\u227C"+objNode.getWorld());
			objNovoNo.setSignal('T'); 
			objNovoNo.setChecked('N');//Verificar?????
			objNovoNo.setIndiceFilho(String.valueOf(objNode.getIndice()+2));//Rever isso
			objNovoNo.setNivel(objNode.getNivel()+1);
			objNovoNo.setAntecedente(objNode.getIndice());//antecedente); //Pode estar bugado
		    
			this.origem = objNovoNo.getIndice();

			adjMap.put(idFolha, Arrays.asList(objNovoNo.getIndice()));
			
			mainList.add(objNovoNo);
		
		}
			
		if ((tipoExpansao=='A') && (direction == 'S')) {
			objNovoNo.setIndice(mainList.size()+1);//Indice 
			objNovoNo.setIndicePai(String.valueOf(objNode.getIndice()));
			objNovoNo.setFormula(objSplitForm.splitSecond(objNode)); //Grava a segunda formula
			objNovoNo.setFormula(RemocaoParentesesExtras.trataParenteses(objNovoNo.getFormula().trim()));			
			objNovoNo.setFormula(objNovoNo.getFormula().trim());	
			objNovoNo.setWorld(objNode.getWorld());
			objNovoNo.setRelacao(objNode.getWorld()+"\u227C"+objNode.getWorld());
			objNovoNo.setSignal('T'); 
			objNovoNo.setChecked('N');//Verificar?????
			objNovoNo.setIndiceFilho(String.valueOf(objNode.getIndice()+2));//Rever isso
			objNovoNo.setNivel(objNode.getNivel()+2);
			objNovoNo.setAntecedente(objNode.getIndice()+1);//antecedente);

			this.destino = objNovoNo.getIndice();
			
			mainList.add(objNovoNo);

			adjMap.put(origem, Arrays.asList(destino));
		}
		
		
		if ((tipoExpansao=='B') && (direction == 'L')) {
			objNovoNo.setIndice(mainList.size()+1);//Indice 
			objNovoNo.setIndicePai(String.valueOf(objNode.getIndice()));
			objNovoNo.setFormula(objSplitForm.splitLeft(objNode)); //Grava a formula 
			objNovoNo.setFormula(RemocaoParentesesExtras.trataParenteses(objNovoNo.getFormula().trim()));
			objNovoNo.setFormula(objNovoNo.getFormula().trim());
			objNovoNo.setWorld(objNode.getWorld());
			objNovoNo.setRelacao(objNode.getWorld()+"\u227C"+objNode.getWorld());
			objNovoNo.setSignal('F'); 
			objNovoNo.setChecked('N');//Verificar?????
			objNovoNo.setNivel(objNode.getNivel()+1);
			objNovoNo.setAntecedente(antecedente);

			this.destinoL = objNovoNo.getIndice();
			
			mainList.add(objNovoNo);
			
		}	
		if ((tipoExpansao=='B') && (direction == 'R')) {
			objNovoNo.setIndice(mainList.size()+1);//Indice 
			objNovoNo.setIndicePai(String.valueOf(objNode.getIndice()));
			objNovoNo.setFormula(objSplitForm.splitRight(objNode)); //Grava a formula 
			objNovoNo.setFormula(RemocaoParentesesExtras.trataParenteses(objNovoNo.getFormula().trim()));
			objNovoNo.setFormula(objNovoNo.getFormula().trim());
			objNovoNo.setWorld(objNode.getWorld());
			objNovoNo.setRelacao(objNode.getWorld()+"\u227C"+objNode.getWorld());
			objNovoNo.setSignal('F');//????
			objNovoNo.setChecked('N');//Verificar?????
			objNovoNo.setNivel(objNode.getNivel()+1);
			objNovoNo.setAntecedente(antecedente);

			this.destinoR = objNovoNo.getIndice();
			
			adjMap.put(idFolha, Arrays.asList(this.destinoL, this.destinoR));

			mainList.add(objNovoNo);
			
		}
		return objNovoNo;
		
	}

	
	
}
