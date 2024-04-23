package graph;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;



import iALC.vetInvet.Node;
import sparql.SparqlQuery;

public class ContraModelo {

	
    public static List<String> relacoes = new ArrayList<>();
    public static List<String> fullRelationsList = new ArrayList<>();
    public static List<Integer> closedBranchs = new ArrayList<>();
    public static List<String> models = new ArrayList<>();
    //public static List<String> tokensSPARQL = new ArrayList<>();
    public static LinkedList<Node> tokensSPARQL = new LinkedList<Node>();
   
    
	private String filename = "contra-modelo.txt";



	

	public String listaRelacoes(List<Integer> branch, List mainList, Node noLocal) throws IOException {
		String relation="";
		
		  for (int x=0; x<=branch.size()-1; x++) { 
			  int val = branch.get(x); 
			  Node complemento = (Node) mainList.get(val-1); //?????? (val-1)
			  if (complemento.getRelacao().toString().contains("R")) {
				  System.out.println("RELACAO--> "+complemento.getRelacao().toString());				  
				  ////COLOCAR O PROCEDIMENTO DE COMPARACAO DOS MUNDOS DA RELACAO. ret = true;
				  String relationTemp = (noLocal.getWorld()+"R"+complemento.getWorld());
				  System.out.println("relacatemp->"+relationTemp.trim()+" relacaocomplemento->"+complemento.getRelacao().trim());
				  if (relationTemp.trim().equals(complemento.getRelacao().toString().trim())){					  
					  relation = relationTemp;
				  }else { //para pegar a relação no próprio noLocal (exceção)
					  if (noLocal.getRelacao().contains("R")) {
						  relation = noLocal.getRelacao();
					  }
				  }
			  }			  

	}return relation;
	}
		
		
	/*
	 * public void gerarContraModelo(ArrayList<ArrayList<Integer>>
	 * BranchcounterModel, List mainList) throws IOException {
	 * 
	 *
	 */
		
	public void gerarContraModelo(ArrayList<ArrayList<Integer>> BranchcounterModel, LinkedList<Node> mainList) throws IOException {
			// TODO Auto-generated method stub
			
		System.out.println("Tamanho main->"+mainList.size());
		
		for (Node no : mainList) {
			System.out.println("NO_>"+no.getFormula());
			
		}
		
		SparqlQuery objSparql = new SparqlQuery();
		
		for (ArrayList<Integer> cm: BranchcounterModel) {
			System.out.println("---------ENTROU NA PRIMEIRA BRANCH---------");
			for (Integer listCm : cm) {				
				for (Node no : mainList) {
					if (listCm == no.getIndice()){
						if (!no.getFormula().contains("Ǝ") && !no.getFormula().contains("∀")){
							System.out.println("Nó contra-modelo"+no.getFormula());
							  //Aqui vai ter que buscar por uma relação)
							  ContraModelo objRelacoes = new ContraModelo();
							  //String relation = objRelacoes.listaRelacoes(branche, mainList, noLocal);
							  //tokensSPARQL.add(no);
							  tokensSPARQL.add(no);
							  
							  try (BufferedWriter writer = new BufferedWriter(new FileWriter(this.filename , true))) {
							     writer.write("("+no.getIndice()+")  "+no.getWorld()+"  "+no.getSignal()+"  "+no.getFormula());
								 writer.newLine();
							  }
						}
					}
				}
			}
			objSparql.doQuery(tokensSPARQL);
			tokensSPARQL.clear();
		}
		
	}
}

		
		
		
		
		
		
		

	

