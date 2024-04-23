package sparql;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import iALC.vetInvet.Node;
import iALC.vetInvet.PrincipalNew;

public class SparqlQuery {
	
	private String filename="sparql.txt";
	private boolean tTemplate=true; //Só valores T no contramodelo
	
	/*
	 * public SparqlQuery() throws IOException { //Limpar conteúdo anterior do
	 * arquivo sparql.txt BufferedWriter writer = new BufferedWriter(new
	 * FileWriter(this.filename , true)); writer.close();
	 * 
	 * }
	 */
	
	private static String getRole(Node token) {
		String predicado=null;
		int idNo = token.getIndice();
		for (Node tokensMainList : PrincipalNew.mainList) {
            if (tokensMainList.getIndice() ==  idNo){
            	String idPai = tokensMainList.getIndicePai();
            	for (Node paiMainList : PrincipalNew.mainList) {
            		if (paiMainList.getIndice() == Integer.parseInt(idPai)){
            	        String regex = "[∀|Ǝ]+([a-zA-Z]+)";                        
            	        Pattern pattern = Pattern.compile(regex, Pattern.DOTALL);
            	        Matcher matcher = pattern.matcher(paiMainList.getFormula());
            	        while (matcher.find()) {
            	        	predicado = matcher.group(1);
            	        }
            		}
            	}
            }
		}
		
		
		return predicado;
	}
	
	

//	public void doQuery(List<String> tokens) {
	public void doQuery(LinkedList<Node> tokens) {
		
		String TokenPergunta ="name";
		String TokenOntologia="foaf";
		
		
		
		
		 try (BufferedWriter writer = new BufferedWriter(new FileWriter(this.filename , true))) {
			 writer.write("PREFIX "+TokenOntologia+":   <http://xmlns.com/"+TokenOntologia+"/0.1/>");
			 writer.newLine();
			 writer.write("SELECT ?"+TokenPergunta);

			 writer.newLine();
			 writer.write("WHERE {");
			 writer.newLine();
			 
			 for (Node tokensSql : tokens) {
				 char sig = tokensSql.getSignal();
				 if (sig=='F') { tTemplate=false;}
				 }
			 
			 if (tTemplate==true) { //Só tokens TRUE 
			 for (Node tokensSql : tokens) {
				 	writer.write("    {");
				 	writer.newLine();					  
				    writer.write("SELECT ?"+TokenPergunta);
				    writer.newLine();
				    writer.write("WHERE {");
				    writer.newLine();
			    	writer.write("?x "+TokenOntologia+":"+SparqlQuery.getRole(tokensSql)+"  "+"'"+tokensSql.getFormula()+"'  .");
				    writer.newLine();
				    writer.write("?x "+TokenOntologia+":"+TokenPergunta+" ?"+TokenPergunta+"   .");
				    writer.newLine();
				    writer.write("      }");
				 	writer.newLine();
				 	writer.write("    }");
			 }
			 writer.write("}");
			 }else {//Tem token FALSE
				 for (Node tokensSql : tokens) {
					 if (tokensSql.getSignal() == 'F') {
						 	writer.write("    {");
						 	writer.newLine();					  
						    writer.write("SELECT ?"+TokenPergunta);
						    writer.newLine();
						    writer.write("WHERE {");
						    writer.newLine();
						    for (Node tokensSqlTrue : tokens) {
						    	if (tokensSqlTrue.getSignal() == 'T'){
								   	writer.write("?x "+TokenOntologia+":"+SparqlQuery.getRole(tokensSqlTrue)+"  "+"'"+tokensSqlTrue.getFormula()+"'  .");
								   	writer.newLine();
						    	}
						    }
						   	writer.write("FILTER NOT EXISTS {?x "+TokenOntologia+":"+SparqlQuery.getRole(tokensSql)+"  "+"'"+tokensSql.getFormula()+"'}");//+TemPrev 'RGPS'} 
						    writer.newLine();
						    writer.write("?x "+TokenOntologia+":"+TokenPergunta+" ?"+TokenPergunta+"   .");
						    writer.newLine();
						    writer.write("      }");
						 	writer.newLine();
						 	writer.write("    }");
					 }
				 }writer.write("}");
			 }
			 //writer.write("}");
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
