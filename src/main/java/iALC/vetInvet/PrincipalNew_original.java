package iALC.vetInvet;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

import graph.TableauxTree;

import iALC.prefixa.FormulaPrefixa;
import iALC.rules.Rules;
import iALC.util.AlphaBeta;
import iALC.util.CountSymbol;
import iALC.util.ListaSeusAdjacentes;
import iALC.util.PegaConectivoPorIndice;
import iALC.util.RemocaoParentesesExtras;
import iALC.util.PegaFolha2;
import iALC.util.PegarIndiceConectivo;
import iALC.grammar.*;

public class PrincipalNew_original {

	public static LinkedList<Node> mainList = new LinkedList<Node>();
    public static List<List<Integer>> listaAdj = new ArrayList<>();
    public static Map<Integer, List<Integer>> hashMap = new HashMap<>();
    public static List<Integer> listaAdj2 = new ArrayList<>();
    public static Map<Integer, Integer> hashSiblings = new HashMap<>();

	static boolean loop = true;
	public static List<Integer> celula;

	public Node searchNotChecked(LinkedList<Node> lista) {
		Iterator<Node> iteracao = lista.iterator();		
		while (iteracao.hasNext()) {
			Node no = iteracao.next();	
			System.out.println("Consultando Nó ->"+no.getIndice()+"     ["+no.getWorld()+"]   "+no.getSignal()+" "+no.getFormula()+" Conectivo: "+no.getConectivoPrincipal()+"["+no.getpositionConectivoPrincipal()+"]"+" Tipo da Expansão: "+no.getTipoExpansao()+" Nó Pai: "+no.getIndicePai()+" Checked:"+no.getChecked());
			if (no.getChecked()=='N') {
				loop = true;
				no.setChecked('N'); 
				return no;
			}
		}loop = false; return null;
	}
	
	
	public int qtdFolhas(List<List<Integer>> listaAdj, int id) {
		int count = 0;
		List<Integer> lista = listaAdj.get(id-1);
		for (int j = 0; j < lista.size(); j++) {
			count++;
			System.out.println("ID->"+(id-1)+" qtd->"+count);
		}
		System.out.println("ID->"+(id-1)+" qtd->"+count);	
	return count-1; //-1 porque 1 é o próprio nó
	}

	public int idsFolhas(List<List<Integer>> listaAdj, int id) {
		int count = 0;
		List<Integer> lista = listaAdj.get(id-1);
		for (int j = 0; j < lista.size(); j++) {
			count++;
			System.out.println("ID->"+(id-1)+" qtd->"+count);
		}
		System.out.println("ID->"+(id-1)+" qtd->"+count);	
	return count;
	}	
	
	
	public static void main(String[] args) {
		
		FormulaPrefixa objFPre = new FormulaPrefixa();
		PrincipalNew_original objPrincipal = new PrincipalNew_original();

		//String formulaInfixa = " ( XR.(A & B) > XR.(A) ) ";	
		//String formulaInfixa = " ( ~ A ≫ ~ B ) > ( ~ C ⊓ ~ D ) ";	
		//String formulaInfixa = " ( ~ A ≫ ~ B ) & ( ~ C ≫ ~ D ) "; 
		//String formulaInfixa = " ( ~ A ⊓ ~ B ) ≫ ( ~ C ⊓ ~ D ) ";
		//String formulaInfixa = "A ≫ ( B ≫ ( A ⊓ B ) )";//Tableaux fechado okok
		//String formulaInfixa = "A ≫ B ≫ ( A ⊓ B )";//okok (exemplo interessante).
		//String formulaInfixa = " ( ~ A ≫ B ) ≫ ( A ⊓ D ) ";//testando
		//String formulaInfixa = " ( ~ A ⊔ ~ B ) ";
		//String formulaInfixa = " ( A ≫ ( A & ~ B) )";
		//String formulaInfixa = " ( A \u226B ( A ⊔ A ) )"; //indice do conectivo = 3
		//String formulaInfixa = " ( A ⊓ B ⊓ C )"; //indice do conectivo = 3 ok 
		//String formulaInfixa = "A ⊓ ( B ⊔ C )"; //indice do conectivo = 3 PROBLEMA (okok)
		//String formulaInfixa = "( B ⊔ C ) ⊓ A"; //okok
		
		//String formulaInfixa = "( A ⊔ B ) ⊓ C"; //okok
		//String formulaInfixa = " A ⊓ (B ⊓ C)"; //okok
		//String formulaInfixa = " A ⊓ (~B ⊓ C)"; //okok
		
		//String formulaInfixa = " ( ( A ⊔ B ) ⊓ C )"; //ok
		//String formulaInfixa = " ( ( A ⊓ B ) ⊔ C )"; //ok
		//String formulaInfixa = " ( ( A ⊔ B ) ⊓ C )"; //ok
		//String formulaInfixa = "( A ⊓ B ) ≫ C"; //okok
		//String formulaInfixa = "( A ⊓ B ) ≫ ~ C"; //okok
		
		//String formulaInfixa = "(∀R.Servidor ⊔ (ƎR.ProfessorA ⊓ ƎR.ProfessorB)) ≫ (∀R.PodeAcumular)";
		//String formulaInfixa = "(∀R.Servidor ⊓ (ƎR.ProfessorA ⊓ ƎR.ProfessorB)) ≫ (∀R.PodeAcumular)"; //okok
		//String formulaInfixa = "(ƎR.ProfessorA ⊓ ƎR.ProfessorB) ≫ ∀R.PodeAcumular";//okok
		//String formulaInfixa = "ƎR.ProfessorA ⊓ ƎR.ProfessorB"; okok
		//String formulaInfixa = "∀R.ProfessorA ⊓ ∀R.ProfessorB"; // okok
		//String formulaInfixa = "∀R.PrA ≫ (∀R.PrB ≫ (∀R.PrA ⊓ ∀R.PrB))"; // problema
		//String formulaInfixa = "∀R.PrA ≫ (∀R.PrB ≫ (∀R.PrA ⊓ ∀R.PrB))"; // problema
		
			
		//String formulaInfixa = "∀R.PrA ≫ ∀R.PrB ≫ (∀R.PrA ⊓ ∀R.PrB)"; // okok (ramo fechado)
		//String formulaInfixa = "ƎR.ProfessorA ≫ (ƎR.ProfessorB ≫ (ƎR.ProfessorA ⊓ ƎR.ProfessorB))"; // okok
		//String formulaInfixa = "ƎR.ProfessorA ≫ ƎR.ProfessorB";okok
		//String formulaInfixa = "ƎR.ProfessorA ≫ ƎR.ProfessorB ≫ ƎR.ProfessorC";//okok
		
		//String formulaInfixa = "∀R.Servidor ≫ ∀R.PodeAcumular";okok
		
		
		//String formulaInfixa = " ( A > ( A ⊓ A ) )"; //indice do conectivo = 3 (qual modelo escolher? ver com Hermann)
		//String formulaInfixa = "( A ≫ B ) ≫ C";
		
		//String formulaInfixa = "( A ⊓ B ) ⊓ C"; //ok (estava com problema na renderização (resolvido com a nova versão do calcula X e Y)
		//String formulaInfixa = "∀R.Servidor ⊓ ∀R.Estatutario ≫ ((∀R.Servidor ⊓ ∀R.RPPS) ⊔ (∀R.Servidor ⊓ ~∀R.RGPS))  "; //problema render
		
		
		/// Exemplos na tese:
		//String formulaInfixa = "∀R.CC ≫ (ƎR.CC ⊓ ~ ƎR.FG))"; //okok 
		
		

		//QC1
		String formulaInfixa = "(ƎR.RemMenorPiso ⊔ ƎR.DoencaInc) ≫ ~ƎR.DedIRPF"; //okok 

		
		//QC2
		//String formulaInfixa = "(∀R.Servidor ⊓ ∀R.Estatutario) ≫ ~∀R.RGPS"; //okok 
		
		//String formulaInfixa = "(∀R.Servidor ⊓ ~∀R.Estatutario) ≫ ~∀R.RPPS"; //okok
		
		//String formulaInfixa = "(∀R.Servidor ⊓ ~∀R.Estatutario) ≫ ∀R.RGPS"; //okok
		
		
		
		
		
		
		
		
		PegarIndiceConectivo objIndiceNovo = new PegarIndiceConectivo();
		
		formulaInfixa = RemocaoParentesesExtras.trataParenteses(formulaInfixa);
		iALCGrammarIn ObjiALCGrammar = new iALCGrammarIn();
		Integer indiceConectivoPrincipal = objIndiceNovo.pegarIndice(ObjiALCGrammar.IndiceSimboloPrincipal(formulaInfixa));//MEXI AQUI (12/12)

		
		
		//Colocar aqui a chamada a interface do parser.
		
		//Integer indiceConectivoPrincipal = Integer.parseInt(objFPre.obterPrefixa(formulaInfixa));
		PegaConectivoPorIndice objPCI_A = new PegaConectivoPorIndice();
		AlphaBeta objAlpBet_A = new AlphaBeta();
	
		Node objNode = new Node();
		objNode.setIndice(1);
		objNode.setFormula(formulaInfixa);
		objNode.setSignal('T');
		objNode.setpositionConectivoPrincipal(indiceConectivoPrincipal);//
		objNode.setTipoExpansao(' ');
		objNode.setTipodaformula("LP"); 
		objNode.setWorld("w");
		objNode.setBranch("0");
		objNode.setChecked('S');
		objNode.setIndicePai(null);
		objNode.setIndiceFilho("2");
		objNode.setNivel(0);
		objNode.setAntecedente(0);
		mainList.add(objNode);
		
		Node objNode1 = new Node();		
		objNode1.setIndice(2);
		objNode1.setFormula(formulaInfixa);		
		objNode1.setSignal('F');
		objNode1.setpositionConectivoPrincipal(indiceConectivoPrincipal);		
		String simbolo = String.valueOf(objPCI_A.SimbolRestore(indiceConectivoPrincipal,formulaInfixa));
		objNode1.setTipoExpansao(objAlpBet_A.define(simbolo.charAt(0),'F'));//MUDAR AQUI PARA DEIXAR AUTOMATICO
		objNode1.setTipodaformula("LP");
		objNode1.setWorld("w");
		objNode1.setRelacao(objNode.getWorld()+"\u227C"+objNode.getWorld()); //u227C -> ≼
		objNode1.setBranch("0");
		objNode1.setChecked('N');
		objNode1.setIndicePai("1"); 
		objNode1.setIndiceFilho("3"); 
		objNode1.setNivel(1);
		objNode1.setAntecedente(1);
		mainList.add(objNode1);
			
		PrincipalNew_original.listaAdj.add(Arrays.asList(1, 2));
		
		PrincipalNew_original.listaAdj2.add(2);
		hashMap.put(1, Arrays.asList(2));//"1 é a chave e 2 é a lista de adjacencia (do tipo asList)
		
		/*
		 * if (objNode1.getTipoExpansao() == 'A') {
		 * 
		 * }else {
		 * 
		 * }
		 */	
		
		while (loop == true) {
			Node noLocal = objPrincipal.searchNotChecked(mainList);

			String formula = noLocal.getFormula();			

			///Veirifca a quantidade de conectivos da fórmula
		    CountSymbol objUtil = new CountSymbol();
		    int qtdConectivos = objUtil.count(formula); 

		    //////////////////////////// Regra de qtdConectivos == 1  (excluir parenteses externos) ////////////////////
		    if (qtdConectivos==1) {
		    	//System.out.println("Esq->"+noLocal.getFormula().charAt(0)+" Dir->"+noLocal.getFormula().charAt(noLocal.getFormula().length()-1));
		    	
		    	if ((noLocal.getFormula().charAt(0) == '(') && (noLocal.getFormula().charAt(noLocal.getFormula().length()-1) == ')')){ 
		    		char[] newFormula = noLocal.getFormula().toCharArray();
		    		newFormula[0] = ' ';
		    		newFormula[noLocal.getFormula().length()-1] = ' ';
		    		noLocal.setFormula(String.valueOf(newFormula).trim());
		    	}		    	
		    }
		    //////////////////////////////// Fim de qtdConectivos == 1 ////////////////////////////////

			
			if (qtdConectivos > 0) {
			  	if ((noLocal.getFormula().charAt(0) == '(') && (noLocal.getFormula().charAt(noLocal.getFormula().length()-1) == ')')){ 
		    		char[] newFormula = noLocal.getFormula().toCharArray();
		    		newFormula[0] = ' ';
		    		newFormula[noLocal.getFormula().length()-1] = ' ';
		    		noLocal.setFormula(String.valueOf(newFormula).trim());
		    	}		    	
		  	
				
			iALCGrammarIn ObjiALCGrammar2 = new iALCGrammarIn();
			Integer indiceConectivoPrincipal2 = objIndiceNovo.pegarIndice(ObjiALCGrammar2.IndiceSimboloPrincipal(noLocal.getFormula()));//MEXI AQUI (12/12)

			PegaConectivoPorIndice objPCI = new PegaConectivoPorIndice();
			
			//String simboloPrincipal = String.valueOf(objPCI.SimbolRestore(indiceConectivoPrincipal,formula));
			String simboloPrincipal = objPCI.SimbolRestoreNew(indiceConectivoPrincipal2,noLocal.getFormula());
			char sygnal = noLocal.getSignal();

			AlphaBeta objAlpBet = new AlphaBeta();
		    char AlphaBeta = objAlpBet.define(simboloPrincipal.charAt(0),sygnal);///MEXI AQUI TESTAR------

		    noLocal.setTipoExpansao(AlphaBeta);
		    noLocal.setpositionConectivoPrincipal(indiceConectivoPrincipal2);
		    noLocal.setConectivoPrincipal(simboloPrincipal.charAt(0));
		    noLocal.setFormula(noLocal.getFormula().trim());

			}
			
		   
		    
		    //////////////////////////// Regra de qtdConectivos == 0 Atomicas ////////////////////
		    System.out.println("Formula->"+noLocal.getFormula()+"   Primeiro->"+noLocal.getFormula().charAt(0));
			if (   ((qtdConectivos==0) && (noLocal.getFormula().charAt(0) != 'Ǝ'))
			 &&	
				   ((qtdConectivos==0) && (noLocal.getFormula().charAt(0) != '∀'))
			  )  { 
    			
				noLocal.setChecked('S'); 
		    	//Regra Atomica - FORMULAS NÃO-REDUTÍVEIS
	    		//if (simboloPrincipal.charAt(0)==('~')) {
    			if (noLocal.getFormula().charAt(0)==('~')) {	    				
	    			noLocal.setTipoExpansao('A');///Mudei aqui (Alpha a expansao da negacao?)
	    			Rules objRules = new Rules();
					System.out.println("NO ATUAL->"+noLocal.getIndice());
					System.out.println("Lista de Adj->"+listaAdj);
					//ListaSeusAdjacentes objListaSeusAdjacentes = new ListaSeusAdjacentes();
					
					/////////DFS Folhas //////
					PegaFolha2 objPegaFolha = new PegaFolha2();
					List<Integer> leaves = objPegaFolha.findLeaves(hashMap, noLocal.getIndice());
					///////////////////////////

					for (int j = 0; j < leaves.size(); j++) {
						objRules.iALC_neg(noLocal, mainList, 'Z', hashMap, leaves.get(j)); //Esse Z é a direcao
					}
	    		}else{ //Fim da negação	
	    			noLocal.setTipoExpansao('U');
	    			Rules objRules = new Rules();
					System.out.println("NO ATUAL->"+noLocal.getIndice());
					System.out.println("Lista de Adj->"+listaAdj);
	    			
	    		}	
		    			    	
	    	System.out.println(hashMap.toString());
		    }
		    ////////////////////////Fim QtdConectivos == 0 ////////////////////////////////////
		    

		    //////////////////////////// Regra de qtdConectivos == 0 (Quantificadores) ////////////////////
		    System.out.println("Formula->"+noLocal.getFormula()+"   Primeiro->"+noLocal.getFormula().charAt(0));
		    if ((qtdConectivos==0) && ((noLocal.getFormula().charAt(0) == '\u018E') || (noLocal.getFormula().charAt(0) == '\u2200')))  { 
    			noLocal.setChecked('S'); 
    			if (noLocal.getFormula().charAt(0)==('\u018E')) {//Existencial	    				
	    			noLocal.setTipoExpansao('A');
	    			Rules objRules = new Rules();
					System.out.println("NO ATUAL->"+noLocal.getIndice());
					System.out.println("Lista de Adj->"+listaAdj);
					//ListaSeusAdjacentes objListaSeusAdjacentes = new ListaSeusAdjacentes();
					
					/////////DFS Folhas //////
					PegaFolha2 objPegaFolha = new PegaFolha2();
					List<Integer> leaves = objPegaFolha.findLeaves(hashMap, noLocal.getIndice());
					///////////////////////////

					for (int j = 0; j < leaves.size(); j++) {
						
						objRules.iALC_existencial(noLocal, mainList, 'Z', hashMap, leaves.get(j)); //Esse Z é a direcao

						//objRules.iALC_existencial(noLocal, mainList, 'Z', hashMap, noLocal.getIndice()); //Esse Z é a direcao

						//Map<Integer, int idFolha) {

					}
	    		}
    			if (noLocal.getFormula().charAt(0)==('\u2200')) {//universal
    				noLocal.setTipoExpansao('A');
	    			Rules objRules = new Rules();
					System.out.println("NO ATUAL->"+noLocal.getIndice());
					System.out.println("Lista de Adj->"+listaAdj);

					/////////DFS Folhas //////
					PegaFolha2 objPegaFolha = new PegaFolha2();
					List<Integer> leaves = objPegaFolha.findLeaves(hashMap, noLocal.getIndice());
					///////////////////////////

					for (int j = 0; j < leaves.size(); j++) {
						objRules.iALC_universal(noLocal, mainList, 'Z', hashMap, leaves.get(j)); //Esse Z é a direcao
						
						//objRules.iALC_universal(noLocal, mainList, 'Z', hashMap, noLocal.getIndice()); //Esse Z é a direcao
						
						//objRules.iALC_universal(noLocal, mainList, 'Z', hashMap, leaves.get(j)); //Esse Z é a direcao
					}

	    		}	
		    			    	
	    	System.out.println(hashMap.toString());
		    }
		    ////////////////////////Fim QtdConectivos == 0 ////////////////////////////////////
		    
		    
		    
		    
		    Rules objRules = new Rules();

		    ////////////////////////// INICIO DE APLICAÇÃO DAS REGRAS - FORMULAS REDUTÍVEIS //////////////

		    //Regra Alfa (prioridade 1 dos alphas???)
			if ((noLocal.getSignal()==('T')) && (noLocal.getConectivoPrincipal()==('⊓') && (qtdConectivos>0))) { //T &
			    noLocal.setChecked('S');
				//Tem que retornar o ID das folhas para poder passar nos parametros (usado na  //adicionado domingo
				System.out.println("NO ATUAL->"+noLocal.getIndice()); ////adicionado domingo
				System.out.println("Lista de Adj->"+listaAdj); ////adicionado domingo
				ListaSeusAdjacentes objListaSeusAdjacentes = new ListaSeusAdjacentes();
				celula = objListaSeusAdjacentes.listarSeusAdjacentes(noLocal, listaAdj); //Está em uso?
				/////////DFS Folhas //////
				PegaFolha2 objPegaFolha = new PegaFolha2();
				List<Integer> leaves = objPegaFolha.findLeaves(hashMap, noLocal.getIndice());
				///////////////////////////				
				
				for (int j = 0; j < leaves.size(); j++) {
					objRules.iIALC_and(noLocal, mainList, 'F', 1, hashMap, leaves.get(j)); //Esse Z é a direcao
					objRules.iIALC_and(noLocal, mainList, 'S', 1, hashMap, leaves.get(j)); //Esse Z é a direcao

				}

			}
			//Regra Alfa (prioridade 2 dos alphas???)
			else if  ((noLocal.getSignal()==('F')) && (noLocal.getConectivoPrincipal()==('≫') && (qtdConectivos>0))) {
				noLocal.setChecked('S');
				//Tem que retornar o ID das folhas para poder passar nos parametros (usado na  //adicionado domingo
				System.out.println("NO ATUAL->"+noLocal.getIndice()); ////adicionado domingo
				System.out.println("Lista de Adj->"+listaAdj); ////adicionado domingo
				Integer indiceAtualLista = listaAdj.size()-1;
				List<Integer> celulaAtualLista = listaAdj.get(indiceAtualLista); ////adicionado na segunda (estava comentado)
				System.out.println(celulaAtualLista.get(0));
				/////////DFS Folhas //////
				PegaFolha2 objPegaFolha = new PegaFolha2();
				List<Integer> leaves = objPegaFolha.findLeaves(hashMap, noLocal.getIndice());
				///////////////////////////	

				objRules.iIALC_imp(noLocal, mainList, 'F', 1, hashMap, noLocal.getIndice());  
				objRules.iIALC_imp(noLocal, mainList, 'S', 1, hashMap, noLocal.getIndice());  
			}
		
			else if  ((noLocal.getSignal()==('F')) && (noLocal.getConectivoPrincipal()==('⊔') && (qtdConectivos>0))) {
				noLocal.setChecked('S');
				//Tem que retornar o ID das folhas para poder passar nos parametros (usado na  //adicionado domingo
				System.out.println("NO ATUAL->"+noLocal.getIndice()); ////adicionado domingo
				System.out.println("Lista de Adj->"+listaAdj); ////adicionado domingo
				Integer indiceAtualLista = listaAdj.size()-1;
				List<Integer> celulaAtualLista = listaAdj.get(indiceAtualLista); ////adicionado na segunda (estava comentado)
				System.out.println(celulaAtualLista.get(0));
				/////////DFS Folhas //////
				PegaFolha2 objPegaFolha = new PegaFolha2();
				List<Integer> leaves = objPegaFolha.findLeaves(hashMap, noLocal.getIndice());
				///////////////////////////	

				objRules.iIALC_or(noLocal, mainList, 'F', 1, hashMap, noLocal.getIndice());  
				objRules.iIALC_or(noLocal, mainList, 'S', 1, hashMap, noLocal.getIndice());  
			}

			
			
			
			
			
			
			////////////////////////Regra Beta
			else if ((noLocal.getSignal()==('F')) && (noLocal.getConectivoPrincipal()==('⊓') && (qtdConectivos>0))) {//F ⊓
				noLocal.setChecked('S');
				//Tem que retornar o ID das folhas para poder passar nos parametros (usado na 
				System.out.println("NO ATUAL->"+noLocal.getIndice());
				System.out.println("Lista de Adj->"+listaAdj);
				if (noLocal.getIndice()==2) {
					objRules.iIALC_and(noLocal, mainList, 'L',1, hashMap, noLocal.getIndice()); 
					objRules.iIALC_and(noLocal, mainList, 'R',1, hashMap, noLocal.getIndice());
				}else {

					ListaSeusAdjacentes objListaSeusAdjacentes = new ListaSeusAdjacentes();
					celula = objListaSeusAdjacentes.listarSeusAdjacentes(noLocal.getIndice(), listaAdj);
					/////////DFS Folhas //////
					PegaFolha2 objPegaFolha = new PegaFolha2();
					List<Integer> leaves = objPegaFolha.findLeaves(hashMap, noLocal.getIndice());
					///////////////////////////	

					for (int j = 0; j < leaves.size(); j++) {
						objRules.iIALC_and(noLocal, mainList, 'L',1, hashMap, leaves.get(j));
						objRules.iIALC_and(noLocal, mainList, 'R',1, hashMap, leaves.get(j));
					}

					
					

				}
			}
			else if ((noLocal.getSignal()==('T')) && (noLocal.getConectivoPrincipal()==('≫') && (qtdConectivos>0))) {
				noLocal.setChecked('S');
				System.out.println("NO ATUAL->"+noLocal.getIndice());
				System.out.println("Lista de Adj->"+listaAdj);

				/////////DFS Folhas //////
				PegaFolha2 objPegaFolha = new PegaFolha2();
				List<Integer> leaves = objPegaFolha.findLeaves(hashMap, noLocal.getIndice()-1);
				///////////////////////////	
				for (int j = 0; j < leaves.size(); j++) {
					objRules.iIALC_imp(noLocal, mainList, 'L', 1, hashMap, leaves.get(j));
					objRules.iIALC_imp(noLocal, mainList, 'R', 1, hashMap, leaves.get(j));
				}
			}
				
	            // MODIFICACOES EM 29/11/2023 - APLICACAO DA DISJUNCAO////
			
			else if ((noLocal.getSignal()==('T')) && (noLocal.getConectivoPrincipal()==('⊔') && (qtdConectivos>0))) {
				noLocal.setChecked('S');
				//Tem que retornar o ID das folhas para poder passar nos parametros (usado na 
				System.out.println("NO ATUAL->"+noLocal.getIndice());
				System.out.println("Lista de Adj->"+listaAdj);
				if (noLocal.getIndice()==2) {
					objRules.iIALC_or(noLocal, mainList, 'L',1, hashMap, noLocal.getIndice()); 
					objRules.iIALC_or(noLocal, mainList, 'R',1, hashMap, noLocal.getIndice());
				}else {

					ListaSeusAdjacentes objListaSeusAdjacentes = new ListaSeusAdjacentes();
					celula = objListaSeusAdjacentes.listarSeusAdjacentes(noLocal.getIndice(), listaAdj);
					/////////DFS Folhas //////
					PegaFolha2 objPegaFolha = new PegaFolha2();
					List<Integer> leaves = objPegaFolha.findLeaves(hashMap, noLocal.getIndice());
					///////////////////////////	

					for (int j = 0; j < leaves.size(); j++) {
						objRules.iIALC_or(noLocal, mainList, 'L',1, hashMap, leaves.get(j));
						objRules.iIALC_or(noLocal, mainList, 'R',1, hashMap, leaves.get(j));
					}
				}
			}

			
			
			
			
			
			//// fIM DA APLICACAO DA REGRA DA DISJUNCAO

			loop = true; 
			if (objPrincipal.searchNotChecked(mainList) != null)   {
				//tem que existir para o ultimo NULL lop = false?
			}else {
				System.out.println("Terminou");
				System.out.println(mainList.toString());

		        // Itere sobre os valores do HashMap
		        for (Map.Entry<Integer, List<Integer>> entry : hashMap.entrySet()) {
		            Integer chave = entry.getKey();
		            List<Integer> lista = entry.getValue();
		            System.out.println("Chave: " + chave + ", Valores: " + lista);
		            //prepara lista de irmãos
		            if (lista.size()>1) {
		            	hashSiblings.put(lista.get(0), lista.get(1));	
		            }
		           
		        }
		        // Itera sobre os hashmap dos irmaos
		        for (Map.Entry<Integer, Integer> entry : hashSiblings.entrySet()) {
		            Integer chave = entry.getKey();
		            Integer valor = entry.getValue();
		            System.out.println("Irmao de: " + chave + ", é: " + valor);
		        }
				
				
				TableauxTree objTree = new TableauxTree();
				objTree.renderTree();
		        
			}
		    
		}//Fim do while loop == true
	
	
	}//fim método main
	
	
	
	
	
	
	
	
	
}

