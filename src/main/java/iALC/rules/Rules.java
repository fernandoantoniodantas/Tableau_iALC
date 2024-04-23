package iALC.rules;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import iALC.util.RemocaoParentesesExtras;
import iALC.util.CaminhoNaArvore;
import iALC.util.SplitFormula;
import iALC.vetInvet.Node;
import iALC.vetInvet.PrincipalNew;

public class Rules {
	

	PrincipalNew objPrin = new PrincipalNew();
	public Integer origem;
	public Integer destino;
	public Integer destinoL;
	public Integer destinoR;
	
	public static String mundoTemp;
	

	
	public void iALC_neg(Node objNode, LinkedList<Node> mainList, char direction, Map<Integer, List<Integer>> adjMap, int idFolha) {
		char tipoExpansao = 'A';//Sempre é Alpha		
		Node objNovoNo = new Node();
		CaminhoNaArvore objCaminhoArvore = new CaminhoNaArvore();
	
		
		if ((tipoExpansao=='A') && (direction == 'Z')) {

			if (objNode.getSignal()==('F')) { //Aqui muda de mundo
				String maiormundo = objCaminhoArvore.UltimoMundoUtilizado(objNode.getIndice());
				objNovoNo.setWorld(maiormundo+"'");
				objNovoNo.setRelacao(objNode.getWorld()+"R"+maiormundo+"'");
				//objNovoNo.setWorld(objNode.getWorld()+"'");
				//objNovoNo.setRelacao(objNode.getWorld()+"R"+objNode.getWorld()+"'");
				
				
				
				objNovoNo.setSignal('T');
			}
			if (objNode.getSignal()==('T')) { //Aqui não muda de mundo
				objNovoNo.setWorld(objNode.getWorld());
				objNovoNo.setRelacao(objNode.getWorld()+"\u227C"+objNode.getWorld());
				//Colocar aqui a regra de escolha de mundo (06/02/2024)
				objNovoNo.setSignal('F');
			}

			objNovoNo.setIndice(mainList.size()+1);//Indice
			objNovoNo.setFormula(objNode.getFormula().replace("~"," ").trim());
			objNovoNo.setIndicePai(String.valueOf(objNode.getIndice()));
			objNovoNo.setIndice(mainList.size()+1);


			
			objNovoNo.setTipoExpansao('U');
			if ((objNovoNo.getFormula().charAt(0)=='Ǝ') || (objNovoNo.getFormula().charAt(0)=='∀')) {
				objNovoNo.setChecked('N');
			}else {
				objNovoNo.setChecked('S');
			}			 
			objNovoNo.setAntecedente(objNode.getIndice());
			objNovoNo.setSignal(objNovoNo.getSignal());
			objNovoNo.setNivel(objNode.getNivel()+1);
			
			
			adjMap.put(idFolha, Arrays.asList(objNovoNo.getIndice()));	
			
		
			
			//Nas regras gerais que nao modifica o mundo, fazer a regra para a escolha do mundo ideal (entre aqueles existentes)
			//Atualiza esses dois atributos
			/*
			 * if obj.
			 * 
			 */
			//objNovoNo.setWorld(objNode.getWorld()+"'");
			//objNovoNo.setRelacao(objNode.getWorld()+"R"+objNode.getWorld()+"'");
			
			if (objNode.getWorld() != objNovoNo.getWorld()) {
				 System.out.println("ADJMAP->"+adjMap.toString());	
				}
				
			
			
			
			mainList.add(objNovoNo);
			
			

				
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
			objNovoNo.setIndicePai(String.valueOf(objNode.getIndice()));//Colocada segunda dia 26
			mainList.add(objNovoNo);
			adjMap.put(idFolha, Arrays.asList(objNovoNo.getIndice()));
			
		}

	}
	
	public void iIALC_imp(Node objNode, LinkedList<Node> mainList, char direction, int antecedente, Map<Integer, List<Integer>> adjMap, int idFolha) {
		
		char tipoExpansao = objNode.getTipoExpansao();		
		Node objNovoNo = new Node();
		SplitFormula objSplitForm = new SplitFormula();
		CaminhoNaArvore objCaminhoArvore = new CaminhoNaArvore();		
		
		System.out.println("Tipo->"+tipoExpansao);

		if ((tipoExpansao=='A') && (direction == 'F')) {

			objNovoNo.setIndice(mainList.size()+1);//Indice 						
			objNovoNo.setIndicePai(String.valueOf(objNode.getIndice()));			
			objNovoNo.setFormula(objSplitForm.splitFirst(objNode)); //Grava a primeira formula
			objNovoNo.setFormula(objNovoNo.getFormula().trim());			
			
			String maiormundo = objCaminhoArvore.UltimoMundoUtilizado(objNode.getIndice());
			objNovoNo.setWorld(maiormundo+"'");
			objNovoNo.setRelacao(objNode.getWorld()+"R"+maiormundo+"'");
			
			//objNovoNo.setWorld(objNode.getWorld()+"'");
			//objNovoNo.setRelacao(objNode.getWorld()+"R"+objNode.getWorld()+"'");//Em 06/02/2024
			objNovoNo.setSignal('T'); 
			objNovoNo.setChecked('N');//Verificar?????
			objNovoNo.setIndiceFilho(String.valueOf(objNode.getIndice()+2));//Rever isso	
			objNovoNo.setNivel(objNode.getNivel()+1);
			objNovoNo.setAntecedente(objNode.getIndice());

			mundoTemp = objNovoNo.getWorld();
			
			this.origem = objNovoNo.getIndice();

			adjMap.put(idFolha, Arrays.asList(origem));
			mainList.add(objNovoNo);

		}
			
		else if ((tipoExpansao=='A') && (direction == 'S')) {

			objNovoNo.setIndice(mainList.size()+1);//Indice 
			objNovoNo.setIndicePai(String.valueOf(objNode.getIndice()));//String.valueOf(objNovoNo.getIndice()-1));//Ver se tem esse -1
			objNovoNo.setFormula(objSplitForm.splitSecond(objNode)); //Grava a segunda formula
			objNovoNo.setFormula(objNovoNo.getFormula().trim());
			objNovoNo.setWorld(mundoTemp);
			objNovoNo.setRelacao(objNode.getWorld()+"R"+mundoTemp);
			//String maiormundo = objCaminhoArvore.UltimoMundoUtilizado(objNode.getIndice());
			//objNovoNo.setWorld(maiormundo+"'");///coloquei dia 16/04 noite
			//objNovoNo.setRelacao(objNode.getWorld()+"R"+maiormundo+"'");
			//objNovoNo.setWorld(objNode.getWorld()+"'");
			//objNovoNo.setRelacao(objNode.getWorld()+"R"+objNode.getWorld()+"'");//EM 06/02/2024			
			objNovoNo.setSignal('F'); 
			objNovoNo.setChecked('N');//Verificar?????
			objNovoNo.setNivel(objNode.getNivel()+2);
			objNovoNo.setAntecedente(objNode.getIndice()+1);

			this.destino = objNovoNo.getIndice();
			
			mainList.add(objNovoNo);

			adjMap.put(origem, Arrays.asList(destino));
			mundoTemp="";
		}		
		
		else if ((tipoExpansao=='B') && (direction == 'L')) {

			objNovoNo.setIndice(mainList.size()+1);//Indice 
			objNovoNo.setIndicePai(String.valueOf(objNode.getIndice()));
			objNovoNo.setFormula(objSplitForm.splitLeft(objNode)); //Grava a formula 
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

			objNovoNo.setIndice(mainList.size()+1); 
			objNovoNo.setIndicePai(String.valueOf(objNode.getIndice()));
			objNovoNo.setFormula(objSplitForm.splitRight(objNode));  
			objNovoNo.setFormula(objNovoNo.getFormula().trim());
			objNovoNo.setWorld(objNode.getWorld()+"'");
			objNovoNo.setRelacao(objNode.getWorld()+"\u227C"+objNode.getWorld()+"'");
			objNovoNo.setSignal('T');
			objNovoNo.setChecked('N');
			objNovoNo.setNivel(objNode.getNivel()+1);
			objNovoNo.setAntecedente(antecedente);

			this.destinoR = objNovoNo.getIndice();
			if (objNode.getIndice()>2){ //por ultimo
				adjMap.put(idFolha, Arrays.asList(this.destinoL, this.destinoR));
			}
			mainList.add(objNovoNo);
			
		}

	}
	
	public Node iIALC_and(Node objNode, LinkedList<Node> mainList, char direction, int antecedente, Map<Integer, List<Integer>> adjMap, int idFolha) {


		char tipoExpansao = objNode.getTipoExpansao();		
		Node objNovoNo = new Node();		
		SplitFormula objSplitForm = new SplitFormula();
		Rules objRules = new Rules();
		
		if ((tipoExpansao=='A') && (direction == 'F')) {

			objNovoNo.setIndice(mainList.size()+1); 
			objNovoNo.setIndicePai(String.valueOf(objNode.getIndice()));
			objNovoNo.setFormula(objSplitForm.splitFirst(objNode));  
			objNovoNo.setFormula(objNovoNo.getFormula().trim());
			objNovoNo.setWorld(objNode.getWorld());
			objNovoNo.setRelacao(objNode.getWorld()+"\u227C"+objNode.getWorld());
			objNovoNo.setSignal('T'); 
			objNovoNo.setChecked('N');
			objNovoNo.setIndiceFilho(String.valueOf(objNode.getIndice()+2));
			objNovoNo.setNivel(objNode.getNivel()+1);
			objNovoNo.setAntecedente(objNode.getIndice());
		    
			this.origem = objNovoNo.getIndice();

			adjMap.put(idFolha, Arrays.asList(objNovoNo.getIndice()));
			
			mainList.add(objNovoNo);
		
		}
			
		if ((tipoExpansao=='A') && (direction == 'S')) {
			objNovoNo.setIndice(mainList.size()+1); 
			objNovoNo.setIndicePai(String.valueOf(objNode.getIndice()));
			objNovoNo.setFormula(objSplitForm.splitSecond(objNode)); 
			objNovoNo.setFormula(objNovoNo.getFormula().trim());	
			objNovoNo.setWorld(objNode.getWorld());
			objNovoNo.setRelacao(objNode.getWorld()+"\u227C"+objNode.getWorld());
			objNovoNo.setSignal('T'); 
			objNovoNo.setChecked('N');
			objNovoNo.setIndiceFilho(String.valueOf(objNode.getIndice()+2));
			objNovoNo.setNivel(objNode.getNivel()+2);
			objNovoNo.setAntecedente(objNode.getIndice()+1);

			this.destino = objNovoNo.getIndice();
			
			mainList.add(objNovoNo);

			adjMap.put(origem, Arrays.asList(destino));
		}
		
		
		if ((tipoExpansao=='B') && (direction == 'L')) {
			objNovoNo.setIndice(mainList.size()+1); 
			objNovoNo.setIndicePai(String.valueOf(objNode.getIndice()));
			objNovoNo.setFormula(objSplitForm.splitLeft(objNode));  
			//objNovoNo.setFormula(RemocaoParentesesExtras.trataParenteses(objNovoNo.getFormula().trim()));
			objNovoNo.setFormula(objNovoNo.getFormula().trim());
			objNovoNo.setWorld(objNode.getWorld());
			objNovoNo.setRelacao(objNode.getWorld()+"\u227C"+objNode.getWorld());
			objNovoNo.setSignal('F'); 
			objNovoNo.setChecked('N');
			objNovoNo.setNivel(objNode.getNivel()+1);
			objNovoNo.setAntecedente(antecedente);

			this.destinoL = objNovoNo.getIndice();
			
			mainList.add(objNovoNo);
			
		}	
		if ((tipoExpansao=='B') && (direction == 'R')) {
			objNovoNo.setIndice(mainList.size()+1);//Indice 
			objNovoNo.setIndicePai(String.valueOf(objNode.getIndice()));
			objNovoNo.setFormula(objSplitForm.splitRight(objNode)); //Grava a formula 
			//objNovoNo.setFormula(RemocaoParentesesExtras.trataParenteses(objNovoNo.getFormula().trim()));
			objNovoNo.setFormula(objNovoNo.getFormula().trim());
			objNovoNo.setWorld(objNode.getWorld());
			objNovoNo.setRelacao(objNode.getWorld()+"\u227C"+objNode.getWorld());
			objNovoNo.setSignal('F');
			objNovoNo.setChecked('N');
			objNovoNo.setNivel(objNode.getNivel()+1);
			objNovoNo.setAntecedente(antecedente);

			this.destinoR = objNovoNo.getIndice();
			
			adjMap.put(idFolha, Arrays.asList(this.destinoL, this.destinoR));

			mainList.add(objNovoNo);
			
		}
		return objNovoNo;
		
	}

	public void iIALC_or(Node objNode, LinkedList<Node> mainList, char direction, int antecedente, Map<Integer, List<Integer>> adjMap, int idFolha) {


		char tipoExpansao = objNode.getTipoExpansao();		
		Node objNovoNo = new Node();		
		SplitFormula objSplitForm = new SplitFormula();
		Rules objRules = new Rules();
		
		if ((tipoExpansao=='A') && (direction == 'F')) {

			objNovoNo.setIndice(mainList.size()+1); 
			objNovoNo.setIndicePai(String.valueOf(objNode.getIndice()));
			objNovoNo.setFormula(objSplitForm.splitFirst(objNode)); //Grava a primeira formula 
			//objNovoNo.setFormula(RemocaoParentesesExtras.trataParenteses(objNovoNo.getFormula().trim()));			
			objNovoNo.setFormula(objNovoNo.getFormula().trim());
			objNovoNo.setWorld(objNode.getWorld());
			objNovoNo.setRelacao(objNode.getWorld()+"\u227C"+objNode.getWorld());
			objNovoNo.setSignal('F'); 
			objNovoNo.setChecked('N');
			objNovoNo.setIndiceFilho(String.valueOf(objNode.getIndice()+2));
			objNovoNo.setNivel(objNode.getNivel()+1);
			objNovoNo.setAntecedente(objNode.getIndice());
		    
			this.origem = objNovoNo.getIndice();

			adjMap.put(idFolha, Arrays.asList(objNovoNo.getIndice()));
			
			mainList.add(objNovoNo);
		
		}
			
		if ((tipoExpansao=='A') && (direction == 'S')) {
			objNovoNo.setIndice(mainList.size()+1); 
			objNovoNo.setIndicePai(String.valueOf(objNode.getIndice()));
			objNovoNo.setFormula(objSplitForm.splitSecond(objNode)); 
			objNovoNo.setFormula(objNovoNo.getFormula().trim());	
			objNovoNo.setWorld(objNode.getWorld());
			objNovoNo.setRelacao(objNode.getWorld()+"\u227C"+objNode.getWorld());
			objNovoNo.setSignal('F'); 
			objNovoNo.setChecked('N');
			objNovoNo.setIndiceFilho(String.valueOf(objNode.getIndice()+2));
			objNovoNo.setNivel(objNode.getNivel()+2);
			objNovoNo.setAntecedente(objNode.getIndice()+1);

			this.destino = objNovoNo.getIndice();
			
			mainList.add(objNovoNo);

			adjMap.put(origem, Arrays.asList(destino));
		}
		
		
		if ((tipoExpansao=='B') && (direction == 'L')) {
			objNovoNo.setIndice(mainList.size()+1); 
			objNovoNo.setIndicePai(String.valueOf(objNode.getIndice()));
			objNovoNo.setFormula(objSplitForm.splitLeft(objNode));  
			objNovoNo.setFormula(objNovoNo.getFormula().trim());
			objNovoNo.setWorld(objNode.getWorld());
			objNovoNo.setRelacao(objNode.getWorld()+"\u227C"+objNode.getWorld());
			objNovoNo.setSignal('T'); 
			objNovoNo.setChecked('N');
			objNovoNo.setNivel(objNode.getNivel()+1);
			objNovoNo.setAntecedente(antecedente);

			this.destinoL = objNovoNo.getIndice();
			
			mainList.add(objNovoNo);
			
		}	
		if ((tipoExpansao=='B') && (direction == 'R')) {
			objNovoNo.setIndice(mainList.size()+1);//Indice 
			objNovoNo.setIndicePai(String.valueOf(objNode.getIndice()));
			objNovoNo.setFormula(objSplitForm.splitRight(objNode)); //Grava a formula 
			objNovoNo.setFormula(objNovoNo.getFormula().trim());
			objNovoNo.setWorld(objNode.getWorld());
			objNovoNo.setRelacao(objNode.getWorld()+"\u227C"+objNode.getWorld());
			objNovoNo.setSignal('T');//????
			objNovoNo.setChecked('N');//Verificar?????
			objNovoNo.setNivel(objNode.getNivel()+1);
			objNovoNo.setAntecedente(antecedente);

			this.destinoR = objNovoNo.getIndice();
			
			adjMap.put(idFolha, Arrays.asList(this.destinoL, this.destinoR));

			mainList.add(objNovoNo);
			
		}
		
		
	}
	
	public void iALC_existencial(Node objNode, LinkedList<Node> mainList, char direction, Map<Integer, List<Integer>> adjMap, int idFolha) {
	
		char tipoExpansao = objNode.getTipoExpansao();		
		Node objNovoNo = new Node();		
		SplitFormula objSplitForm = new SplitFormula();
		Rules objRules = new Rules();
		boolean control = false;
		CaminhoNaArvore objCaminhoArvore = new CaminhoNaArvore();
		
		
		if ((tipoExpansao=='A') && (direction == 'Z')) {
			
			
			//objNovoNo.setFormula(objNode.getFormula().replace("Ǝ R ."," ").trim());
			//objNovoNo.setFormula(objNode.getFormula().replace("ƎR."," ").trim());
			objNovoNo.setFormula(objNode.getFormula().replaceAll("Ǝ[a-zA-Z]*.", " ").trim());
			objNovoNo.setIndice(mainList.size()+1);//Indice 
			
			
			if (objNode.getSignal() == 'T') { //Adicionado este if em 31/12/2023
				////metodo de mudança de mundo
				String maiormundo = objCaminhoArvore.UltimoMundoUtilizado(objNode.getIndice());
				objNovoNo.setWorld(maiormundo+"'");
				objNovoNo.setRelacao(objNode.getWorld()+"R"+maiormundo+"'");
				//objNovoNo.setWorld(objNode.getWorld()+"'");
				//objNovoNo.setRelacao(objNode.getWorld()+"R"+objNode.getWorld()+"'");
			}

			if (objNode.getSignal() == 'F') { //Adicionado este if em 31/12/2023
				objNovoNo.setWorld(objNode.getWorld());
				objNovoNo.setRelacao(objNode.getWorld()+"\u227C"+objNode.getWorld());//Aqui implementar regra de escolher um mundo existentente para poder fechar a branch 
				control = true;
			}
			

			
			objNovoNo.setIndicePai(String.valueOf(objNode.getIndice()));		
			objNovoNo.setSignal(objNode.getSignal()); 
			objNovoNo.setChecked('N');//Verificar?????
			objNovoNo.setIndiceFilho(String.valueOf(objNode.getIndice()+1));//Rever isso
			objNovoNo.setNivel(objNode.getNivel()+1);
			objNovoNo.setAntecedente(objNode.getIndice());//antecedente); //Pode estar bugado

		
			this.destino = objNovoNo.getIndice();
			
			//mainList.add(objNovoNo);

			adjMap.put(idFolha, Arrays.asList(destino));
			
			//////// Regra da escolha do Mundo ///////
			if (control==true){
				System.out.println("Entrou na regra de MUNDOS");
				System.out.println("Formula->"+objNovoNo.getFormula());
				System.out.println("Liata de adj:->"+adjMap.toString());
			}
			
			mainList.add(objNovoNo); //MEXI AQUI (Estava antes da regra da escolha de Mundo) (em 02/02/2024)
			
		}
			
	
	}
		
	public void iALC_universal(Node objNode, LinkedList<Node> mainList, char direction, Map<Integer, List<Integer>> adjMap, int idFolha) {
	
		char tipoExpansao = objNode.getTipoExpansao();		
		Node objNovoNo = new Node();		
		SplitFormula objSplitForm = new SplitFormula();
		Rules objRules = new Rules();
		CaminhoNaArvore objCaminhoArvore = new CaminhoNaArvore();
		
		if ((tipoExpansao=='A') && (direction == 'Z')) {
			
			if (objNode.getSignal() == 'F') { //Adicionado este if em 31/12/2023
				////metodo de mudança de mundo
				String maiormundo = objCaminhoArvore.UltimoMundoUtilizado(objNode.getIndice());
				objNovoNo.setWorld(maiormundo+"'");
				objNovoNo.setRelacao(objNode.getWorld()+"R"+maiormundo+"'");
				//objNovoNo.setWorld(objNode.getWorld()+"'");
				//objNovoNo.setRelacao(objNode.getWorld()+"R"+objNode.getWorld()+"'");
			}

			if (objNode.getSignal() == 'T') { //Adicionado este if em 31/12/2023
				objNovoNo.setWorld(objNode.getWorld());
				objNovoNo.setRelacao(objNode.getWorld()+"\u227C"+objNode.getWorld());//Aqui implementar regra de escolher um mundo existentente para poder fechar a branch 
			}		
			
			
			objNovoNo.setIndice(mainList.size()+1);//Indice 
			objNovoNo.setIndicePai(String.valueOf(objNode.getIndice())); 
			objNovoNo.setFormula(objNode.getFormula().replaceAll("∀[a-zA-Z]*.", " ").trim());
		
			objNovoNo.setSignal(objNode.getSignal()); 
			objNovoNo.setChecked('N');//Verificar?????
			objNovoNo.setIndiceFilho(String.valueOf(objNode.getIndice()+1));//Rever isso
			objNovoNo.setNivel(objNode.getNivel()+1);
			objNovoNo.setAntecedente(objNode.getIndice());//antecedente); //Pode estar bugado
		    
			this.destino = objNovoNo.getIndice();
			
			mainList.add(objNovoNo);

			adjMap.put(idFolha, Arrays.asList(destino));
		
		}
			

	
	}

/////////////////////// modal ////////////////	
	public void iALC_modal_existencial(Node objNode, LinkedList<Node> mainList, char direction, Map<Integer, List<Integer>> adjMap, int idFolha) {
		
		//ƎR.ProfessorA 
		//∀R.ProfessorA
		char tipoExpansao = objNode.getTipoExpansao();		
		Node objNovoNo = new Node();		
		SplitFormula objSplitForm = new SplitFormula();
		Rules objRules = new Rules();
		CaminhoNaArvore objCaminhoArvore = new CaminhoNaArvore();

		
		if ((tipoExpansao=='A') && (direction == 'Z')) {
			
			
			if (objNode.getSignal() == 'T') { //Adicionado este if em 31/12/2023
				
				String maiormundo = objCaminhoArvore.UltimoMundoUtilizado(objNode.getIndice());
				objNovoNo.setWorld(maiormundo+"'");
				objNovoNo.setRelacao(objNode.getWorld()+"R"+maiormundo+"'");

				//objNovoNo.setWorld(objNode.getWorld()+"'");
				//objNovoNo.setRelacao(objNode.getWorld()+"R"+objNode.getWorld()+"'");
			}

			if (objNode.getSignal() == 'F') { //Adicionado este if em 31/12/2023
				objNovoNo.setWorld(objNode.getWorld());
				objNovoNo.setRelacao(objNode.getWorld()+"\u227C"+objNode.getWorld());//Aqui implementar regra de escolher um mundo existentente para poder fechar a branch 
			}

			objNovoNo.setIndice(mainList.size()+1);//Indice 
			objNovoNo.setIndicePai(String.valueOf(objNode.getIndice()));
			//objNovoNo.setFormula(objNode.getFormula().replace("Ǝ R ."," ").trim());
			//objNovoNo.setFormula(objNode.getFormula().replace("ƎR."," ").trim());
			objNovoNo.setFormula(objNode.getFormula().replaceAll("Ǝ[a-zA-Z]*.", " ").trim());
			
			objNovoNo.setSignal(objNode.getSignal()); 
			objNovoNo.setChecked('N');//Verificar?????
			objNovoNo.setIndiceFilho(String.valueOf(objNode.getIndice()+1));//Rever isso
			objNovoNo.setNivel(objNode.getNivel()+1);
			objNovoNo.setAntecedente(objNode.getIndice());//antecedente); //Pode estar bugado
		
			this.destino = objNovoNo.getIndice();
			
			mainList.add(objNovoNo);

			adjMap.put(idFolha, Arrays.asList(destino));
		
			
		}
			
	
	}
	
	public void iALC_modal_universal(Node objNode, LinkedList<Node> mainList, char direction, Map<Integer, List<Integer>> adjMap, int idFolha) {
	
		char tipoExpansao = objNode.getTipoExpansao();		
		Node objNovoNo = new Node();		
		SplitFormula objSplitForm = new SplitFormula();
		Rules objRules = new Rules();
		CaminhoNaArvore objCaminhoArvore = new CaminhoNaArvore();

		if ((tipoExpansao=='A') && (direction == 'Z')) {
			
			if (objNode.getSignal() == 'F') { //Adicionado este if em 31/12/2023
				String maiormundo = objCaminhoArvore.UltimoMundoUtilizado(objNode.getIndice());
				objNovoNo.setWorld(maiormundo+"'");
				objNovoNo.setRelacao(objNode.getWorld()+"R"+maiormundo+"'");

				//objNovoNo.setWorld(objNode.getWorld()+"'");
				//objNovoNo.setRelacao(objNode.getWorld()+"R"+objNode.getWorld()+"'");
			}

			if (objNode.getSignal() == 'T') { //Adicionado este if em 31/12/2023
				objNovoNo.setWorld(objNode.getWorld());
				objNovoNo.setRelacao(objNode.getWorld()+"\u227C"+objNode.getWorld());//Aqui implementar regra de escolher um mundo existentente para poder fechar a branch 
			}		
			
			
			objNovoNo.setIndice(mainList.size()+1);//Indice 
			objNovoNo.setIndicePai(String.valueOf(objNode.getIndice())); 
			//objNovoNo.setFormula(objNode.getFormula().replace("∀ R ."," ").trim()); //Grava a primeira formula
			//objNovoNo.setFormula(objNode.getFormula().replace("∀R."," ").trim()); //Grava a primeira formula 
			objNovoNo.setFormula(objNode.getFormula().replaceAll("∀[a-zA-Z]*.", " ").trim());
		
			objNovoNo.setSignal(objNode.getSignal()); 
			objNovoNo.setChecked('N');//Verificar?????
			objNovoNo.setIndiceFilho(String.valueOf(objNode.getIndice()+1));//Rever isso
			objNovoNo.setNivel(objNode.getNivel()+1);
			objNovoNo.setAntecedente(objNode.getIndice());//antecedente); //Pode estar bugado
		    
			this.destino = objNovoNo.getIndice();
			
			mainList.add(objNovoNo);

			adjMap.put(idFolha, Arrays.asList(destino));
		
		}
			

	
	}


		
	
	
	
}
