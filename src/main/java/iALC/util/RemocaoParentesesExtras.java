package iALC.util;

import java.util.Stack;

public class RemocaoParentesesExtras {

    public static String removerParentesesExtras(String expressao) {
    	//Remove espaços em Branco entre os simbolos
    	expressao = expressao.trim();
    	expressao = expressao.replace(" ", "");
    	//System.out.println("No metodo de trata parenteses->"+expressao);
    	
    	
    	
        Stack<Character> pilha = new Stack<>();
        Stack<Integer> ipilha = new Stack<>();
        int contadorParentesesA = 0;
		int contadorParentesesB = 0;
		
        StringBuilder expressaoResultante = new StringBuilder();

        for (int i = 0; i < expressao.length(); i++) {
            char c = expressao.charAt(i);

            if (c == '(') {
                pilha.push(c);
                ipilha.push(i);
                contadorParentesesA++;
            } else if (c == ')') {
                if (!pilha.isEmpty()) {
                    pilha.pop();
                    ipilha.pop();
                    contadorParentesesB++;
                    //System.out.println("Conta parenteses  A->"+contadorPar�ntesesA+"Conta parenteses B->"+contadorPar�ntesesB);
                } else {
                    //System.out.println("Conta parenteses  A->"+contadorPar�ntesesA+"Conta parenteses B->"+contadorPar�ntesesB);
                    // Remove o par�ntese extra
                    continue;
                }
            }
            // Adiciona o caractere atual a expressão resultante
            expressaoResultante.append(c);
            //System.out.println("eXPRESSAO RESUL->"+expressaoResultante+"--->Pilha"+pilha.size()+" Conteudo--->"+pilha.elementAt(0));
            
        }

        // Remove os par�nteses extras restantes da pilha
        while (!pilha.isEmpty()) {
           // System.out.println("Cabeça->"+ipilha.firstElement());
        	pilha.pop();
            
            //contadorPar�nteses++;
//        }
//
//        // Remove os par�nteses extras da express�o resultante
        for (int i = 0; i < ipilha.size(); i++) {
            //int indiceUltimoParentese = expressaoResultante.lastIndexOf("()");
//            if (indiceUltimoParentese >= 0) {
                System.out.println("------>"+expressaoResultante.charAt(i)+"indice na formula->"+i);
                System.out.println("Antes->"+expressaoResultante);
                expressaoResultante = expressaoResultante.replace(i, i+1, " ");
                System.out.println("Depois->"+expressaoResultante);
            }
        }

        String expressaofinal="";// = expressaoResultante.toString();
        for (int i=0; i<expressaoResultante.length(); i++) {
        	expressaofinal = expressaofinal+" "+expressaoResultante.charAt(i); 
        }
        return expressaofinal;
    }

//    public static String trataParenteses(String formula) {    	
//        String expressaoSemParentesesExtras = removerParentesesExtras(formula);
//        System.out.println("Fórmula original:"+formula);
//        System.out.println("Fórmula sem par�nteses extras:"+expressaoSemParentesesExtras);
//    	return expressaoSemParentesesExtras;
//    }
    
}
