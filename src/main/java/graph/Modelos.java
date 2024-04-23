package graph;

import java.awt.Graphics;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.codegen.model.chunk.NonLocalAttrRef;

import iALC.vetInvet.Node;

public class Modelos {

	
    public static List<String> relacoes = new ArrayList<>();
    public static List<String> fullRelationsList = new ArrayList<>();
    public static List<Integer> closedBranchs = new ArrayList<>();
    public static List<String> models = new ArrayList<>();
    
	private String filename = "modelo.txt";
	private String filename2 = "Brachs fechadas.txt";


	
	//Lista relaçao procurando por o complemento da fórmula local na branch
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
		
		
	public void gerarModelo(List<Integer> branche, Node noLocal, List mainList) throws IOException {
		//boolean control = false;
		
		for (int x=0; x<=branche.size()-1; x++) {
			int val = branche.get(x);	
			//control = false;
			Node complemento = (Node) mainList.get(val-1);
			
			  if
			  (complemento.getFormula().toString().trim().equals(noLocal.getFormula().trim(
			  )) && (complemento.getSignal() != noLocal.getSignal())) { 

				  if (complemento.getWorld() == noLocal.getWorld()) {
					  //Grava o modelo.
					  try (BufferedWriter writer = new BufferedWriter(new FileWriter(this.filename , true))) {
						  //writer.write("Branch=> "+x);
						  writer.write("("+complemento.getIndice()+")  "+complemento.getWorld()+"  "+complemento.getSignal()+"  "+complemento.getFormula()+ " ==>: ("+noLocal.getIndice()+")  "+noLocal.getWorld()+"  "+noLocal.getSignal()+" "+noLocal.getFormula());
						  writer.newLine();
						  models.add("("+noLocal.getIndice()+","+complemento.getIndice()+")");
						  //control = true;
					  }
				  }else { //Mundos diferentes
					  //Aqui vai ter que buscar por uma relação que possa forçar a mudança do mundo do noLocal (ou no local de atribuicao do mundo no nó)
					  Modelos objRelacoes = new Modelos();
					  String relation = objRelacoes.listaRelacoes(branche, mainList, noLocal);
					  try (BufferedWriter writer = new BufferedWriter(new FileWriter(this.filename , true))) {
						  //writer.write("Branch=> "+x);
						  //writer.newLine();
						  writer.write("("+complemento.getIndice()+")  "+complemento.getWorld()+"  "+complemento.getSignal()+"  "+complemento.getFormula()+ " ==>: ("+noLocal.getIndice()+")  "+noLocal.getWorld()+"  "+noLocal.getSignal()+" "+noLocal.getFormula()+"  [Relation==>"+relation+"]");
						  writer.newLine();
						  models.add("("+noLocal.getIndice()+","+complemento.getIndice()+")");
						  						  
						  //control = true;
					  }
				  }
				  

			  }
			  
		}
		  
	}
	

	
}
