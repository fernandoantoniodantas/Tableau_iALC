package iALC.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import iALC.vetInvet.Node;

public class ListaSeusAdjacentes {
	
	List<Integer> celula2;  
	//ublic static List<List<Integer>> adj = new ;
    public static List<List<Integer>> adj = new ArrayList<>();

	
	public List<Integer> listarSeusAdjacentes(Node noLocal, List<List<Integer>> listaAdj ) {
    
		for (List<Integer> lista : listaAdj) { 
			Integer idPai = lista.get(0);
			if (idPai == noLocal.getIndice()){
				celula2 = lista;
				System.out.println("VALOR INTER->"+idPai.toString().charAt(0));
				System.out.println("CELULA->"+celula2);
	
				
			}

			}
			return celula2;
	}
	


	
	
	
	public List<Integer> listarSeusAdjacentes(int idLocal, List<List<Integer>> listaAdj ) {
	    
		boolean achou=false;
		
        System.out.println(idLocal+" "+listaAdj);
		for (List<Integer> lista : listaAdj) { 
			Integer idPai = lista.get(0);
			if (idPai == idLocal){
				celula2 = lista;
				achou=true;
			}
       }
       
	   if (achou) {		
		   for (int x=1; x<celula2.size(); x++) {	
			   listarSeusAdjacentes(celula2.get(x), listaAdj);
		   }
       
       }
       return celula2;
	}
	

	
	public static void main(String[] args) {
		ListaSeusAdjacentes objL = new ListaSeusAdjacentes();
		adj.add(Arrays.asList(1,2));
		adj.add(Arrays.asList(2,3));
		adj.add(Arrays.asList(3,4));
		adj.add(Arrays.asList(4,5));
		adj.add(Arrays.asList(5,6));
		adj.add(Arrays.asList(6,7,8));
		adj.add(Arrays.asList(7,9));
		adj.add(Arrays.asList(8,10));
		System.out.println(objL.listarSeusAdjacentes(6, adj));
		
	}
	
	
	

}
