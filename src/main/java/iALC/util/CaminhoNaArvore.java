package iALC.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

import iALC.vetInvet.PrincipalNew;

public class CaminhoNaArvore {

	public static List<Integer> ways = new ArrayList<>();

	
	public String UltimoMundoUtilizado(int idNo) {
		//List caminho = WayToRoot(idNo);
		List<Integer> idFolha = pegaFolha(idNo);
		System.out.println("FOLHAS------------------------------------------------->"+idFolha.toString());
		int idFolhaNew = idFolha.get(0);//Escolha arbitrária (ter atenção por podem exitir N folhas para esse nó.
		
		///resolvendo o problema da folha
		for (int k=0; k<idFolha.size(); k++) {
			System.out.println("ID DA FOLHA==========>"+idFolha.get(k));	
		}
		
		
		
		List caminho = WayToRoot(idNo, idFolhaNew); 
				
		
		String maiorMundo = "w";
		for (int x=0; x < caminho.size(); x++) {
			int indice = (int) caminho.get(x);
			String mundo = PrincipalNew.mainList.get(indice-1).getWorld();
			if (mundo.length()>maiorMundo.length()){
				maiorMundo = mundo;
			}			
		}
		return maiorMundo;
	}
	
	
	//Devolve  caminho de um "no?" até a raiz do grafo
	// Esse id deve ser da folha do nó em análise
	
	public List<Integer> pegaFolha(int idNo) {
		
		

		/////////DFS Folhas //////
		PegaFolha2 objPegaFolha = new PegaFolha2();
		List<Integer> leaves = objPegaFolha.findLeaves(PrincipalNew.hashMap, idNo);
		
		if (idNo == 9) {
			System.out.println("-----------9------------>"+leaves.toString());
			System.out.println("Lista PRINCIPAL->"+PrincipalNew.mainList.toString());
		}
		
		return leaves;
		//System.out.println("FOLHAS DAQUI___>"+leaves.toString());
		///////////////////////////
	}
	
	public List WayToRoot(int StartNode, int EndNode) {
        
		DFS objDFS = new DFS();
		List caminhos = objDFS.CaminhoEntreNos(StartNode, EndNode, PrincipalNew.hashMap);
		return caminhos;
		
		
		/*for (Entry<Integer, List<Integer>> entry : PrincipalNew.hashMap.entrySet()) {
            Integer root = entry.getKey();
            List<Integer> leaves = entry.getValue();
            for (int i=0; i<leaves.size(); i++) {
            	if (leaves.get(i) == idNo) {//Existe uma raiz da subarvore
                    ways.add(root);	
            		WayToRoot(root);	
            	}
            }
            System.out.println("CAMINHOS--------------------------------->"+ways);
            System.out.println("ADJACENTES----->"+PrincipalNew.hashMap.toString()+"  ESTOU NO NO->"+idNo);
        */    
        }
	

	
	
	
	
	
	
	

}
