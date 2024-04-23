package graph;

import javax.swing.*;
 

//import com.sun.java.swing.plaf.windows.resources.windows;

//import vetInvet.Graphics;
import iALC.vetInvet.Line;
import iALC.vetInvet.Node;
import iALC.vetInvet.NodeTreeViewPosition;
import iALC.vetInvet.PrincipalNew;

import java.awt.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.Collections;


import iALC.util.TamanhoFormula;
import iALC.util.pegaInformacoesFormula;

public class TableauxTree extends JComponent {
	public static NodeTreeViewPosition ntv;// = new NodeTreeViewPosition();	
	public static LinkedList<NodeTreeViewPosition> listNodeView = new LinkedList<NodeTreeViewPosition>();
	public static LinkedList<Line> lines = new LinkedList<Line>();
	public static List<Integer> ways = new ArrayList<>();
	public static ArrayList<Integer> waysTemp = new ArrayList<>();	
    public static ArrayList<ArrayList<Integer>> waysLista = new ArrayList<>();
    public static ArrayList<ArrayList<Integer>> CounterModel = new ArrayList<>();


	//public static ArrayList<Integer> CounterModel = new ArrayList<>();
	
	private static final long serialVersionUID = 1L;
	
	private String filename3 = "contra-modelo.txt";
	

	TamanhoFormula objFormata = new TamanhoFormula();
    pegaInformacoesFormula objInformacao = new pegaInformacoesFormula();
	//Map<Integer, List<Integer>> hashMap = PrincipalNew.hashMap;	
    public TableauxTree objTableaux;
    int brother;
    
    
    int winsize = 1500;
	//private List<Integer>  ways;
	
	
	//Devolve quantos filhos tem um nó específico
	public int qtdFilhos(int idPai) {
	    List<Integer> listaFilhos = PrincipalNew.hashMap.get(idPai);
	    return listaFilhos.size();
		
	}
	
	
	
	public static String converter(String formula) {
		
    	// \u00AC -> ¬ 
    	// \u018E -> Ǝ
    	// \u2200 -> ∀
    	// \u226B -> ≫
		// \u2228 -> ∨
		// \u2227 -> ∧
		// \u2293 -> ⊓
		// \u2294 -> ⊔
		// \u227C -> ≼
		 
		String replacedString=formula.replaceAll("¬","\u00AC");
		replacedString=replacedString.replaceAll("Ǝ","\u018E");
		replacedString=replacedString.replaceAll("¬","\u00AC");
		replacedString=replacedString.replaceAll("∀","\u2200");
		replacedString=replacedString.replaceAll("≫","\u226B");		
		replacedString=replacedString.replaceAll("⊓","\u2293");
		replacedString=replacedString.replaceAll("⊔","\u2294");
		replacedString=replacedString.replaceAll("∨","\u2228");
		replacedString=replacedString.replaceAll("≼","\u227C");
		
		
		
		return replacedString;
		
	}

	
	public void teste(int idPai, int XdoPai, int YdoPai) {
		boolean bif=false;
	    List<Integer> listaFilhos = PrincipalNew.hashMap.get(idPai);
	    for (int i=0; i<listaFilhos.size(); i++) {
	    	System.out.println("Pai->"+idPai+ "Filho->"+listaFilhos.get(i));
	    	ntv.setId(listaFilhos.get(i));
	    	ntv.setY(YdoPai+40);
	    	listNodeView.add(ntv);
	    }

	}
	
	
	//Devolve o irmao de um nó específico
	public int Sibling(int idNo) {
		int sibling=0; //0 nao tem irmao
        for (Map.Entry<Integer, Integer> entry : PrincipalNew.hashSiblings.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            if (key == idNo) {
            	sibling = value;
            }
            if (value == idNo) {
            	sibling = key;
            }
        }
        return sibling;	    
	}
	

	
	//Devolve se tem irmao a partir de um nó adjacente (nao raiz)
	public boolean Sibling2(int idNo) {
	    boolean hasSibling = false; 
		for (Map.Entry<Integer, List<Integer>> entry : PrincipalNew.hashMap.entrySet()) {
             Integer chave = entry.getKey();
             List<Integer> lista = entry.getValue();
             	if (lista.size()>1) {
             		for (int k=0; k<lista.size(); k++) {
             			if (idNo == lista.get(k)) {
             				hasSibling = true;
             			}
             		}
             	}
         
		}return hasSibling;
	
	}
	
	//Devolve o irmao a partir de um nó adjacente (nao raiz)
	public int Sibling3(int idNo) {
	    int Sibling = -1; 
		for (Map.Entry<Integer, List<Integer>> entry : PrincipalNew.hashMap.entrySet()) {
           Integer chave = entry.getKey();
           List<Integer> lista = entry.getValue();
             if (lista.size()>1) { //Exe: Chave: 2, lista: [3, 4]
             		for (int k=0; k<lista.size(); k++) {
             			if (idNo == lista.get(k)) {
             				if (k==0) {Sibling = lista.get(1);}
             				if (k==1) {Sibling = lista.get(0);}
             			}
             		}
             	}
         
		}return Sibling;
	
	}
	
	
	
	public int CalculaX(int idNo, int irmaos, int x) {
		int tamanho = PrincipalNew.mainList.get(idNo).getFormula().length();
		return (x - tamanho)/2;
	}
	
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	//Devolve  caminho de uma folha até a raiz do grafo
	public List WayToRoot(int idNo) {
		//List<Integer> ways = new ArrayList<>();
		//ways2.add(idNo);       
		for (Entry<Integer, List<Integer>> entry : PrincipalNew.hashMap.entrySet()) {
            Integer root = entry.getKey();
            List<Integer> leaves = entry.getValue();
            for (int i=0; i<leaves.size(); i++) {
            	if (leaves.get(i) == idNo) {//Existe uma raiz da subarvore
                    ways.add(root);	
            		WayToRoot(root);	
            	}
            }
        }return ways;
	}
	
	
	
	public void removeBranchClosed(int no1, int no2) {
		System.out.println("Remove branch dos nós: "+no1+" e "+no2);
		
	}
	
	
		
	
	public boolean closing(Graphics g) {
		boolean closed = false;
		List leaves = Leaves();		
		for (int i=0; i<leaves.size(); i++) {
			int idNo = (int) leaves.get(i);
			ways.add(0); //a separator by turing machine
			ways.add(idNo);
			System.out.println("Ways->"+WayToRoot(idNo));
		}
		
		//CounterModel = ways;
		

		
		

		
		LinkedList<Node> objNo = PrincipalNew.mainList;
		
		for (int k=0; k<ways.size(); k++) {
			if (ways.get(k)==0) { //inicio do caminho de uma branch
				System.out.println("---Nova Branch---");
				for (int s=k+1; ways.get(s)!=0 && s<ways.size()-1; s++) { //Pega os nós nos intervalos entre zeros
					System.out.println("S->"+ways.get(s));//São os nós (sem o Zero delimitador)
					
					
					if (objInformacao.getExpansao(ways.get(s))=='U'){ //Pega só os nós de expansao == "U"
						char signalFolha = objInformacao.getSignal(ways.get(k+1));
						char signalNo = objInformacao.getSignal(ways.get(s));
					    String formulaFolha = objInformacao.getFormula(ways.get(k+1));
					    String formulaNo = objInformacao.getFormula(ways.get(s));
					    String mundoFolha = objInformacao.getMundo(ways.get(k+1));
					    String mundoNo = objInformacao.getMundo(ways.get(s));
					    int XFolha = objInformacao.getX(ways.get(k+1))+10;
					    int YFolha = objInformacao.getY(ways.get(k+1))+15;
					    System.out.println("Nó 'U'->"+formulaNo);
					    
					    String propiedade=null;
					    
					    if ((mundoFolha.length()-mundoNo.length())==0) { propiedade="Heredity"; } //Validar com Hermann}
					    if ((mundoFolha.length()-mundoNo.length())==1) { propiedade="Heredity"; } 
					    if ((mundoFolha.length()-mundoNo.length())>1) { propiedade="Transitivity";}
					    
					    
					    //Validar com Hermann a terceira regra
					    if ((signalFolha != signalNo) && (formulaFolha.equals(formulaNo)) && (mundoFolha.length() == mundoNo.length())) {
					    	System.out.println("Brench da Folha->"+ways.get(k+1)+" Fecha com a fórmula-> "+ways.get(s)+" ("+propiedade+")");
					    	g.setColor(Color.RED);
					    	g.drawString("X"+" ("+ways.get(s)+") ", XFolha, YFolha);
							//g.setFont(getFont());
					    	//Chamar função que remove branch
					    	removeBranchClosed(ways.get(k+1), ways.get(s));

					    }
					    else {
					    	//Entrou na branch não fechada (gerar modelos aqui)///
					    	//if (signalFolha == signalNo)
							 
					    	
					    	System.out.println("==== MODELO====");
					    	//System.out.println("Teste Modelo (Formula)->"+formulaNo+"  (Char 0 da formula->  "+formulaNo.charAt(0)+" Nó->"+listNodeView.get(k));
							//System.out.println("Signal->"+objInformacao.getSignal(ways.get(s))+" Formula nó->"+formulaNo+"Tipo->"+objInformacao.getExpansao(ways.get(s)));
					    	//System.out.println("Brench da Folha->"+ways.get(k+1)+" Fecha com a fórmula-> "+ways.get(s)+" ("+propiedade+")");
					    	
							// if ((formulaNo.charAt(0) != '∀') || (formulaNo.charAt(0) != 'Ǝ') || (formulaNo.charAt(0) != '~')) {
							    	//g.setColor(Color.GREEN);
							    	//g.drawString("X"+" ("+ways.get(s)+") ", XFolha, YFolha);
							    	//g.drawString("X"+" ("+ways.get(s)+") ", listNodeView.get(k).getX(), listNodeView.get(k).getY());
							    //}					    	
					    }
					    

					    //Destacar Modelo
					   // if ((formulaNo.charAt(0) != '∀') || (formulaNo.charAt(0) != 'Ǝ') || (formulaNo.charAt(0) != '~')) {
					   // 	g.setColor(Color.GREEN);
					   // }
    				    
					    
					    
					    
					}   
				}
			}
		}
		return closed;
		
	}
	
	
	
	public List<Integer> Leaves() { //Gera uma lista das folhas do grafo 
	    List<Integer> chaves = new ArrayList<>();
	    List<Integer> nos = new ArrayList<>();
	    
        for (Map.Entry<Integer, List<Integer>> entry : PrincipalNew.hashMap.entrySet()) {
            Integer chave = entry.getKey();
            List<Integer> lista = entry.getValue();
            chaves.add(chave);
            for (int i=0; i<lista.size(); i++) {
            	nos.add(lista.get(i));
            }
        }
        nos.removeAll(chaves);
        System.out.println(nos);
        return nos;
	}
            
	//Devolve a raiz da subarvore
	public int root(int idNo) {
        
		for (Entry<Integer, List<Integer>> entry : PrincipalNew.hashMap.entrySet()) {
            Integer root = entry.getKey();
            List<Integer> leaves = entry.getValue();
            for (int i=0; i<leaves.size(); i++) {
            	if (leaves.get(i) == idNo) {
            		return root;
            	}
            }
        }return 0;
	}
		
	
	//Devolve os descedentes de um root
	public List descedentes(int root) {
        
        int keyToSearch=root;
        if ( PrincipalNew.hashMap.containsKey( keyToSearch ) ) {
            return PrincipalNew.hashMap.get(keyToSearch);
           }else{
                  System.err.println("Root não existe");
           }return null;
	}
			
	
	public int CalcularX(int idNo) {
		int x=0;
        for (Map.Entry<Integer, List<Integer>> entry : PrincipalNew.hashMap.entrySet()) {
            Integer chave = entry.getKey();
            List<Integer> lista = entry.getValue();
            for (int i=0; i<lista.size(); i++) {
            	if (lista.get(i)==idNo) {
            		int IdnoPai = chave;            		
                    for (int b = 0; b < listNodeView.size(); b++) {
                        if (listNodeView.get(b).getId() == IdnoPai) {
                          System.out.println("O nó->"+idNo+ "Tem pai->"+IdnoPai);	
                          x = listNodeView.get(b).getX();
                        }
                    }
            		//x = listNodeView.get(IdnoPai-1).getX();

            	}
            }		
        }
        return x;
	}


	
	public int CalcularY(int idNo) {
		int y=0;
        for (Map.Entry<Integer, List<Integer>> entry : PrincipalNew.hashMap.entrySet()) {
            Integer chave = entry.getKey();
            List<Integer> lista = entry.getValue();
            for (int i=0; i<lista.size(); i++) {
            	if (lista.get(i)==idNo) {
            		int IdnoPai = chave; 
                    for (int b = 0; b < listNodeView.size(); b++) {
                        if (listNodeView.get(b).getId() == IdnoPai) {
                          System.out.println("O nó->"+idNo+ "Tem pai->"+IdnoPai);	
                          y = listNodeView.get(b).getY();
                        }
                    }
            		//y = listNodeView.get(noPai-1).getY();
            	}
            }		
        }
        return y;
	}
	
	public int listapontoX(int idNo) {
		int result =0;
		for (int x=0; x<listNodeView.size(); x++) {
			if (idNo==x) {
				result = listNodeView.get(x).getX();
			}
		}
		return result;
	}
	
	public int listapontoY(int idNo) {
		int result =0;
		for (int x=0; x<listNodeView.size(); x++) {
			if (idNo==x) {
				result = listNodeView.get(x).getY();
			}
		}
		return result;
	}
	
	
	
	
	public void paintLines(Graphics g) {
		objTableaux = new TableauxTree();
		Collections.sort(listNodeView);//Ordena o vetor
        //int y=0;
        //int size = listNodeView.size();
        //int i=0;
        
        for (Integer root : PrincipalNew.hashMap.keySet()) {
            //Capturamos o valor a partir da chave
            List<Integer> folhas =  descedentes(root);
            System.out.println("Root-> "+root + " Descedentes-> "+folhas);
            if (folhas.size()==1) {
            	System.out.println("Root-> "+root + " Descedentes 1-> "+folhas.get(0));
            	System.out.println("ID da lista de Nós - ROOT->"+listNodeView.get(root-1).getId());
            	System.out.println("ID da lista de Nós - Descedente->"+listNodeView.get(folhas.get(0)-1).getId());
            	g.drawLine(listNodeView.get(root-1).getX()+20,listNodeView.get(root-1).getY()+8,listNodeView.get(folhas.get(0)-1).getX()+20,listNodeView.get(folhas.get(0)-1).getY()-8);
            }else {
                System.out.println("Root-> "+root + " Descedentes 1-> "+folhas.get(0));
            	System.out.println("ID da lista de Nós 1 - ROOT->"+listNodeView.get(root-1).getId());
            	System.out.println("ID da lista de Nós 1 - Descedente->"+listNodeView.get(folhas.get(0)-1).getId());
            	g.drawLine(listNodeView.get(root-1).getX()+20,listNodeView.get(root-1).getY()+8,listNodeView.get(folhas.get(0)-1).getX()+20, listNodeView.get(folhas.get(0)-1).getY()-8);
                
                System.out.println("Root-> "+root + " Descedentes 2-> "+folhas.get(1));
            	System.out.println("ID da lista de Nós 2 - ROOT->"+listNodeView.get(root-1).getId());
            	System.out.println("ID da lista de Nós 2 - Descedente->"+listNodeView.get(folhas.get(1)-1).getId());
            	g.drawLine(listNodeView.get(root-1).getX()+20,listNodeView.get(root-1).getY()+8,listNodeView.get(folhas.get(1)-1).getX()+20, listNodeView.get(folhas.get(1)-1).getY()-8);
            }
        }
              

	}
        	
	
	 public void paint(Graphics g) {
		    objTableaux = new TableauxTree();
		    objTableaux.Leaves();

		    boolean firstBifurc = true;
		    int fatorBif=0;
		    int countbif=0;
			//Font fonte = new Font("Times New Roman", Font.BOLD, 14);
			//Font fonte = new Font("Cambria", Font.PLAIN, 12);
		    //Font fonte = new Font("SansSerif", Font.BOLD, 12);//tamanho 07 é boa para formulas grandes
		    //Font fonte = new Font("Roboto", Font.BOLD, 12);//Google
		    Font fonte = new Font("COURIER", Font.BOLD, 10);
		    //Font fonte = new Font("COURIER", Font.BOLD, 7);
		    

		    
		    
		    
		    
		    //Roboto
			  //Font fonte = new Font("Times New Roman", Font.BOLD, 14);

		    
		    
			
			
			g.setFont(fonte);
			System.out.println("Hash (tamanho da árvore)->"+PrincipalNew.hashMap.size());
	        for (Map.Entry<Integer, List<Integer>> entry : PrincipalNew.hashMap.entrySet()) {
	            Integer chave = entry.getKey();
	            List<Integer> lista = entry.getValue();
	            System.out.println("Chave: " + chave + ", Valores: " + lista);

	            //Par CHAVE e LISTA
	            ntv = new NodeTreeViewPosition();

	            int tamanho = PrincipalNew.mainList.get(chave).getFormula().length();
	            
	              
	            if (chave == 1) {	
		            ntv.setId(chave);
		            ntv.setY(40);
	        		ntv.setX((winsize - tamanho)/2);   
	        		listNodeView.add(ntv);
	            }
	            	

	             if (chave > 1) {

	            	int irmao = objTableaux.Sibling(chave); 
	            	
	            	
	            	if (irmao == 0){ //traz o irmao do nó atual (zero significa que nao tem irmao)
	            	 // nao tem irmao, pega a X (e repete) da chave onde este nó atual é um adjacente
	            		ntv.setId(chave);
	            		ntv.setX(objTableaux.CalcularX(chave));
	            		ntv.setY(objTableaux.CalcularY(chave)+30); //+60 (original)
	            		listNodeView.add(ntv);
	            	System.out.println("no atual->"+chave+" nao tem irmao");
	            	}else { //tem irmão
	            		
	            		if (chave < irmao) { //Nó atual é do lado esquerdo
		            		if (countbif==0){fatorBif=100;}else {fatorBif=0;} //fatorBif=100 (original)
	            			ntv.setId(chave);
		            		ntv.setY(objTableaux.CalcularY(chave)+30); //+60 (original)
		            		ntv.setX(objTableaux.CalcularX(chave)-100-fatorBif);		            		
		            		listNodeView.add(ntv);
		            		countbif = countbif+1;
	            			System.out.println("no atual menor->"+chave+" irmao é maior->"+irmao);
	            		}else { //no atual é do lado direito
	            			if (countbif==1){fatorBif=100;}else {fatorBif=0;}
		            		ntv.setId(chave);
		            		ntv.setY(objTableaux.CalcularY(chave)+30); //+60 (original)
		            		ntv.setX(objTableaux.CalcularX(chave)+100+fatorBif);		            		
		            		listNodeView.add(ntv);
		            		countbif = countbif+1;
	            			System.out.println("no atual maior->"+chave+" irmao é menor->"+irmao);
	            		}
	            	}
	            		
	            	
	            }
	            
	            
	        }
	        
	        //Aqui calcular o listNodeView para as folhas (pois estou interagindo apenas no hashMap que nao tem as folhas como chave)
	        //Aqui calcular o listNodeView para as folhas (pois estou interagindo apenas no hashMap que nao tem as folhas como chave)
	        List<Integer> folhas = objTableaux.Leaves();
	        boolean control = false;
	        int sibling=-1;
	        for (int i=0; i<folhas.size(); i++) {
	        	System.out.println("Tamanho das folhas->"+folhas.size());
	        	System.out.println("ID Folha->"+folhas.get(i));	        	
	        	ntv = new NodeTreeViewPosition();
	        	ntv.setId(folhas.get(i));
	        	sibling = objTableaux.Sibling3(folhas.get(i));
                	if (objTableaux.Sibling2(folhas.get(i))) {//se o nó tem um irmao
                		System.out.println("ID Folha->"+folhas.get(i)+" tem irmão");
                		if ((folhas.get(i)) < (sibling)) {
                			ntv.setX(objTableaux.CalcularX(folhas.get(i))-105);
                		}
                		if ((folhas.get(i)) > (sibling)) {
                			ntv.setX(objTableaux.CalcularX(folhas.get(i))+105);
                		}
 
                	}else { //Nao sao irmaos
                		ntv.setX(objTableaux.CalcularX(folhas.get(i)));
                	}
	        	//ntv.setX(objTableaux.CalcularX(folhas.get(i)));
        		ntv.setY(objTableaux.CalcularY(folhas.get(i))+30);  //+60 (original)
	        	listNodeView.add(ntv); 		 
				Collections.sort(listNodeView);//Ordena o vetor                	
	        }

	        
	        
	        
			Iterator<Node> iteracao = PrincipalNew.mainList.iterator();				
			
			while (iteracao.hasNext()) {
				Node no = iteracao.next();
				if (no.getIndice()==1) {
					//g.drawString("("+no.getIndice()+")  "+no.getSignal()+": "+no.getFormula(), 435, 40); Ver com Hermann
					//no.getFormula().replaceAll(" ","");
					g.drawString("("+no.getIndice()+")  "+no.getFormula().replaceAll(" ",""), 730, 42);
					//.setText("Character \u2200"); 
					
				}else {
					ListIterator<NodeTreeViewPosition> list_Nodes_Coordenadas = listNodeView.listIterator();
			        while(list_Nodes_Coordenadas.hasNext()){
			        	NodeTreeViewPosition noTreeViewCoordenadas = list_Nodes_Coordenadas.next();
			        	if (noTreeViewCoordenadas.getId() == no.getIndice()) {
			        		
			        		String novaFormula = converter(no.getFormula().replaceAll(" ",""));
			        		
			        		//g.drawString("("+no.getIndice()+")  "+no.getWorld()+" : "+no.getSignal()+" {"+objFormata.redefinirTamanho(no.getFormula())+"} ("+no.getIndicePai()+")"+"  "+no.getRelacao(), noTreeViewCoordenadas.getX(), noTreeViewCoordenadas.getY());
			        		g.drawString("("+no.getIndice()+")  "+no.getWorld()+" : "+no.getSignal()+" {"+objFormata.redefinirTamanho(novaFormula)+"} ("+no.getIndicePai()+")"+"  "+no.getRelacao(), noTreeViewCoordenadas.getX(), noTreeViewCoordenadas.getY());

			        		//			        		
			        		g.drawString("Aqui->"+String.valueOf("\u2203"), 20, 20);
//			        		g.setText("c'est " + String.valueOf("\u2203"));
//			        		 getContentPane().add(textPane, BorderLayout.CENTER);
			        	}
			        }
				}
			}
	        
			objTableaux.paintLines(g);	 
			objTableaux.closing(g);
			
			//// código para criar o contra-modelo
			System.out.println("Par ordenado de modelos->"+Modelos.models);
			System.out.println("Tamanho do modelo->"+Modelos.models.size());
			
	
			int idBranch=0;
			int check = 0;
			Integer no1=null;
			Integer no2=null;
			
			//int seqModelo=null;
			//ways.add(0); //Necessário para rodar no final da lista de caminhos
			System.out.println("CAMINHOS-->"+ways);
			
			
			for (int num: ways) {
				if (num != 0) {
					waysTemp.add(num);
				}else {
					waysLista.add(waysTemp);
					waysTemp = new ArrayList<>();
				}
			}
			
			//adicionar o ultimo subvetor, caso exista			
			if (!waysTemp.isEmpty()) {
				waysLista.add(waysTemp);
			}
			
			waysLista.remove(0);//Sempre será necessário?
		//	for (ArrayList<Integer> sub: waysLista) {
		//		System.out.println("Subvetor "+sub);
		//	}
			
			//System.out.println("Lista 0->"+waysLista.get(0));
			//System.out.println("Lista 1->"+waysLista.get(1));
			int indiceSublista=-1;
			
			for (ArrayList<Integer> subLista: waysLista) {
				indiceSublista++;
				boolean controle=false;
				System.out.println("SubListas "+subLista);
				for (String subModelo: Modelos.models) {
					System.out.println("Submodelo:"+subModelo);
					String regex = "(?<numero1>[0-9]*),(?<numero2>[0-9]*)";
					Pattern pattern = Pattern.compile(regex);
					Matcher matcher = pattern.matcher(subModelo);
					while (matcher.find()) {
					 		no1 = Integer.parseInt(matcher.group("numero1"));
					 		no2 = Integer.parseInt(matcher.group("numero2"));
					 		System.out.println("No1-> "+no1+" No2-> "+no2+ " SubModelo->"+subModelo);
					}
					if (subLista.contains(no1) && subLista.contains(no2)){
						System.out.println("Sublista->"+indiceSublista+"   contém os nós->"+no1+"-"+no2);
						controle=true;
					}
				}
				if (controle==false){
					CounterModel.add(subLista);// na lista de contra-moldelos
				}
			}
			
			
			System.out.println("Novo contra-modelo->"+CounterModel.toString());
			System.out.println("Gerando counter-model...");
			ContraModelo objContraModelo = new ContraModelo();
			try {
				objContraModelo.gerarContraModelo(CounterModel, PrincipalNew.mainList);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			
			
			
			
			
			
			
			
			
			
			
			
			
			for (int x=1; x<ways.size(); x++) {
				//waysTemp.add(ways.get(x));
				if (ways.get(x)>0) {					
					
				}else {// quando ways.get(x)==0
					for (int y=0; y<Modelos.models.size(); y++) {
						 System.out.println("-----------------");
						 //Extrai os valores dos Ids dos nos do modelo como um inteiro
						 String nosModelo = Modelos.models.get(y);
						 String regex = "(?<numero1>[0-9]*),(?<numero2>[0-9]*)";
						 Pattern pattern = Pattern.compile(regex);
						 Matcher matcher = pattern.matcher(nosModelo);
						 while (matcher.find()) {
						 		no1 = Integer.parseInt(matcher.group("numero1"));
						 		no2 = Integer.parseInt(matcher.group("numero2"));
						 		System.out.println("No1-> "+no1+" No2-> "+no2+ " waysTemp->"+waysTemp);
						 }
						 
						 if (waysTemp.contains(no1) && waysTemp.contains(no2)){
							 //Esse é um waysTemp de modelo, então devo apagálo.
						//	 System.out.println("NO1 e NO2 "+no1+"-"+no2);
						//	 waysTemp.clear();
						 }else {
						//	 CounterModel.addAll(waysTemp);
						//	 waysTemp.clear();
						 }
						 //waysTemp.clear();
						 //if (waysTemp.contains(no1) && waysTemp.contains(no2)){
							 //Esse é um waysTemp de modelo, então devo apagálo.
							// System.out.println("CONTRA MODELO");
							// CounterModel.addAll(waysTemp);
							// waysTemp.clear();
							 
						 //}						 
					 
						 
					}//Terminou o for
					//waysTemp.clear();
					
				}
				
			}
			

					
					
					
					//System.out.println("valor de x->"+ways.get(x));
					/**	 if (Modelos.models.size()>0) {
						 String nosModelo = Modelos.models.get(idBranch);
						 String regex = "(?<numero1>[0-9]*),(?<numero2>[0-9]*)";
						 Pattern pattern = Pattern.compile(regex);
						 Matcher matcher = pattern.matcher(nosModelo);
						 	while (matcher.find()) {
						 		Integer no1 = Integer.parseInt(matcher.group("numero1"));
						 		Integer no2 = Integer.parseInt(matcher.group("numero2"));
				            
						 		if ((ways.get(x) == no1) || (ways.get(x) == no2)) {
						 			check++;
						 			if (check==2) {
						 				System.out.println("CHECKED->"+check);
						 				//Aqui marcar a branch como fechada
						 			}
						 		}
						 	}
					 }else {
						 System.out.println("Não tem nenhum modelo, percorrer todas as branchs");
						 //Colocar aqui o codigo que corre todas as branchs
					 }

					//CounterModel.add(seqModelo);//Colocar aqui o array list das branchs que nao fecham
				}else { //Else quando encontra o "zero no way"
					check = 0;
					idBranch++;
					waysTemp.clear();**/
				//}	
					
				//}
			//System.out.println("Qtd branchs"+idBranch);
	
	 
	 }//Fechamento da classe
			
			
	       
			

	
	 public void renderTree() {  
	 
	 
	 //public static void main(String[] args) {
		   
			/*
			 * JFrame frame = new JFrame("Grafo"); frame.setSize(400, 400);
			 * frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); frame.setVisible(true);
			 * JPanel panel = new JPanel(); frame.add(panel);
			 */		   
		 
		    //winsize == 760 Declarado. 
	        JFrame window = new JFrame("iALC Tableaux"); // define a criação de uma janela
	        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Define a ação padrão ao fechar a janela
	        
	        window.setBounds(2, 2, winsize, winsize); // Define o tamanho da janela, informando o canto superior esquerdo (absoluto) e o canto inferior direito (relativo)
	        
	        // Crie um JScrollPane e adicione o componente existente (TableauxTree) a ele
            JScrollPane scrollPane = new JScrollPane(new TableauxTree());
            //scrollPane.setPreferredSize(new Dimension(464, 439));
            
            
            scrollPane.getVerticalScrollBar().setPreferredSize(new Dimension(50, 0));
            scrollPane.getHorizontalScrollBar().setPreferredSize(new Dimension(0, 50));
            //window.getContentPane().setLayout(new FlowLayout());  
      	  
            window.getContentPane().add(scrollPane, BorderLayout.CENTER);
	        //window.getContentPane().add(new TableauxTree()); // Associa um componente gráfico á janela
	        //window.setLocationRelativeTo(null);
            

            		
	        window.setVisible(true); // torna a janela visível
	        
            
            
            // Adicione o JScrollPane ao JFrame
            //window.getContentPane().add(scrollPane);
            //window.setBounds(2, 2, winsize, winsize);
            //window.setVisible(true);
	        
	        

		   
	        
	        //window.setExtendedState(JFrame.MAXIMIZED_BOTH); 
	        //window.setUndecorated(true);
	        //window.setVisible(true);
	        
	        
	        
	        
	        
	        /*
	         * Metaforicamente, fazendo alução a uma pintura:
	         *  O JFrame é a moldura, que define a estrutura do quadro
	         *  O JComponent é a tela em branco que é afixada na moldura 
	         *  O Graphics é a ação de pintar na tela
	        */
//	    	public int qtdFolhas(List<List<Integer>> listaAdj, int id) {
//			for (int i = 0; i<listaAdj.size(); i++) {
//				List<Integer> lista = listaAdj.get(i);
//				for (int j = 0; j < lista.size(); j++) {
//					lista.get(j);
//				}
//			}
//		return null;
//		}
		   
		   
	   }
	 
	 public void renderTreeNew() {  
		 
	       // Create and set up the window.  
	        final JFrame frame = new JFrame("iALC Tableaux - PUC-Rio - TecMF");  
	  
	        // Display the window.  
	        frame.setSize(1500, 900);  
	        //frame.setVisible(true);
	        //frame.setLayout(null);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	  
	        // set flow layout for the frame  
	        //frame.getContentPane().setLayout(new FlowLayout());  
	  
	        //JPanel textArea = new JPanel(45, 120); 
	        //JPanel panelArea = new JPanel();
	        //panelArea.add(new TableauxTree());
	        
	        //JScrollPane scrollableTextArea = new JScrollPane(panelArea);
	        
	        JScrollPane scrollableTextArea = new JScrollPane(new TableauxTree());
	       
	        
	        
	        
	        JScrollBar horizontal = new JScrollBar(JScrollBar.HORIZONTAL, 0, 100, 0, 800);
	        JScrollBar vertical = new JScrollBar(JScrollBar.VERTICAL, 0, 100, 0, 800);
	        
	        
	        //JScrollBar.setWheelScrollingEnabled( false );
	        //setAutoscrolls
	      scrollableTextArea.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
	      scrollableTextArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);  
	  
	        //frame.add(scrollableTextArea);
	        
	        frame.getContentPane().add(horizontal, BorderLayout.SOUTH);
	        frame.getContentPane().add(vertical, BorderLayout.EAST);
	        frame.getContentPane().add(scrollableTextArea, BorderLayout.CENTER); 
	       //frame.getContentPane().setBackground(new Color(230,230,250));
	        
	        //frame.getContentPane().add(new TableauxTree());
	        frame.setVisible(true);
		 
		 
/*
	        JFrame window = new JFrame("iALC Tableaux"); // define a criação de uma janela
	        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Define a ação padrão ao fechar a janela
	        
	        window.setBounds(2, 2, winsize, winsize); // Define o tamanho da janela, informando o canto superior esquerdo (absoluto) e o canto inferior direito (relativo)
	        

            JScrollPane scrollPane = new JScrollPane(new TableauxTree());

            
            
            scrollPane.getVerticalScrollBar().setPreferredSize(new Dimension(50, 0));
            scrollPane.getHorizontalScrollBar().setPreferredSize(new Dimension(0, 50));
            
            window.getContentPane().add(scrollPane, BorderLayout.CENTER);

            

            		
	        window.setVisible(true); // torna a janela visível
            
      */      

	   
		   
	   }
	 
	 
	 
	 public void renderTreeNew2() {
	       // Create a frame 
	        JFrame f = new JFrame("JViewport Example"); 
	        // Layout for the frame 
	        f.setLayout(new BorderLayout()); 
	  
	        // Create a label and set its properties 
	        JLabel l1 = new JLabel("GeeksforGeeks"); 
	        l1.setFont(new Font("Arial", Font.BOLD, 40)); 
	        l1.setForeground(Color.GREEN); 
	        l1.setHorizontalAlignment(JLabel.CENTER); 
	  
	        // Create another label and set its properties 
	        JLabel l2 = new JLabel( 
	            "A computer science portal for geeks!"); 
	        l2.setFont(new Font("Arial", Font.PLAIN, 14)); 
	  
	        // Create a JViewport 
	        JViewport j = new JViewport(); 
	        // Make label l1 as the view of the viewport 
	        j.setView(l1); 
	        // Set the view position of the viewport 
	        j.setViewPosition(new Point(50, 25)); 
	        // Set the size of the viewport 
	        j.setPreferredSize(new Dimension(350, 200)); 
	        // Add the scrollable properties 
	        j.setScrollMode(JViewport.SIMPLE_SCROLL_MODE); 
	  
	        // Create a JPanel 
	        JPanel p = new JPanel(); 
	        // Add the viewport to the panel 
	        p.add(j); 
	        // Add label l2 to the panel 
	        p.add(l2); 
	  
	        // Add panel p to the frame f 
	        f.add(p, BorderLayout.CENTER); 
	        // Close operation of JFrame 
	        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	        // Set the size of the frame 
	        f.setSize(400, 400); 
	        // Make the frame visible 
	        f.setVisible(true); 
	    } 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 

}
