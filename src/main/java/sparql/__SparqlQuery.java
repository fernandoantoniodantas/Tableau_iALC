package sparql;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import iALC.vetInvet.Node;

public class __SparqlQuery {
	
	private String filename="sparql.txt";
	private boolean tTemplate=true; //Só valores T no contramodelo

	//public void doQuery(List<String> tokens) {
	public void doQuery(LinkedList<Node> tokens) {
		String TokenPergunta ="name";
		String TokenOntologia="do2rdf";
		
		
		 try (BufferedWriter writer = new BufferedWriter(new FileWriter(this.filename , true))) {
			 writer.write("PREFIX foaf:   <http://xmlns.com/foaf/0.1/>");
			 writer.newLine();
			 writer.write("SELECT ?"+TokenPergunta);

			 writer.newLine();
			 writer.write("WHERE {");
			 writer.newLine();
			 
			 
//			 for (Node tokensSql : tokens) {
//				 char sig = tokensSql.getSignal();
//				 if (sig=='F') { tTemplate=false;}
//			 }

//			if (tTemplate==true) { //Só tokens TRUE 
			 for (Node tokensSql : tokens) {
				 	writer.write("    {");
				 	writer.newLine();					  
				    writer.write("SELECT ?"+TokenPergunta);
				    writer.newLine();
				    writer.write("WHERE {");
				    writer.newLine();
				    writer.write("?x "+TokenOntologia+":"+tokensSql.getFormula()+"  "+"''"+tokensSql.getFormula()+"''  .");
				    writer.newLine();
				    writer.write("?x "+TokenOntologia+":"+TokenPergunta+" ?"+TokenPergunta+"   .");
				    writer.newLine();
				    writer.write("      }");
				 	writer.newLine();
				 	writer.write("    }");
			 }
			
			 
			 writer.write("}");
		 } catch (IOException e) {
			 // TODO Auto-generated catch block
			 e.printStackTrace();
		 }
	
	
}


	
	
	
/**	
	public void doQuery(List<String> tokens) {
		
		
			 try (BufferedWriter writer = new BufferedWriter(new FileWriter(this.filename , true))) {
				 writer.write("PREFIX foaf:   <http://xmlns.com/foaf/0.1/>");
				 writer.newLine();
				 writer.write("SELECT ");
				 //writer.newLine();
				 for (String tokensSql : tokens) {				 
					 	writer.write("?"+tokensSql+" ");
				 }
				 writer.newLine();
				 writer.write("WHERE");
				 writer.newLine();
				 writer.write("{");
				 writer.newLine();
				 
				 for (String tokensSql : tokens) {				 
					 	writer.write("?x foaf:"+tokensSql+"  :"+tokensSql+" .");
					 	writer.newLine();
				 }			 
				 writer.write("}");
			 } catch (IOException e) {
				 // TODO Auto-generated catch block
				 e.printStackTrace();
			 }
		
		
	}
*/
}
