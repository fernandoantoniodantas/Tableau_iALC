package sparql;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class __SparqlQueryOriginal {
	
	private String filename="sparql.txt";

	public void doQuery(List<String> tokens) {
		String TokenPergunta ="name";
		String TokenOntologia="do2rdf";
		
		
		 try (BufferedWriter writer = new BufferedWriter(new FileWriter(this.filename , true))) {
			 writer.write("PREFIX foaf:   <http://xmlns.com/foaf/0.1/>");
			 writer.newLine();
			 writer.write("SELECT ?"+TokenPergunta);

			 writer.newLine();
			 writer.write("WHERE {");
			 writer.newLine();
			 
			 for (String tokensSql : tokens) {		
				 	writer.write("    {");
				 	writer.newLine();					  
				    writer.write("SELECT ?"+TokenPergunta);
				    writer.newLine();
				    writer.write("WHERE {");
				    writer.newLine();
				    writer.write("?x "+TokenOntologia+":"+tokensSql+"  "+"''"+tokensSql+"''  .");
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
