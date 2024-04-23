package iALC.prefixa;

import java.util.List;
import java.util.ArrayList;
import java.util.Stack;

public class FormulaPrefixa {
	
	

	/*
	 * public static void main(String[] args) { //String formula = " A & ( B > C )";
	 * //> & A B C //& A > B C //Tem que por espaços //String formula =
	 * " ( A > B ) & C "; //& > A B C String formula = "A > ( B > C )"; //> A > B C
	 * String prefixa = obterPrefixa(formula);
	 * System.out.println("A fórmula em ordem prefixa é: " + prefixa); }
	 */

    public static String obterPrefixa(String formula) {
        String[] tokens = formula.split(" ");
        Stack<String> pilha = new Stack<>();
        StringBuilder prefixa = new StringBuilder();
        Stack<String> i_pilha = new Stack<>();
        StringBuilder i_prefixa = new StringBuilder();
        String indiceFinal;

        
        
        for (int i = tokens.length - 1; i >= 0; i--) {
            String token = tokens[i];
            if (token.matches("[A-Z]+")) {
                prefixa.append(token).append(" ");
                i_prefixa.append(String.valueOf(i));
            } else if (token.equals(")") || token.equals("~")) {
                pilha.push(token);
                i_pilha.push(String.valueOf(i));
            } else if (token.equals("(")) {
                while (!pilha.peek().equals(")")) {
                    prefixa.append(pilha.pop()).append(" ");
                    i_prefixa.append(i_pilha.pop()).append("");
                    //System.out.println("Token->"+token+" "+i);
                }
                pilha.pop();
                i_pilha.pop();
            } else { // operador binário 
            	//System.out.println("pilha ->"+pilha);
                while (!pilha.empty() && precedencia(pilha.peek()) > precedencia(token)) {
                	//System.out.println("pilha 2->"+pilha);
                	prefixa.append(pilha.pop()).append(" ");
                	//i_prefixa.append(i_pilha.pop()).append(String.valueOf(i));
                	i_prefixa.append(i_pilha.pop()).append("");
                    
                }
                //indice.add(i);
                //System.out.println("Aqui ->"+token+"INdice "+i);
                pilha.push(token);
                i_pilha.push(String.valueOf(i));
            }
        }

        
        while (!pilha.empty()) {
            prefixa.append(pilha.pop()).append(" ");
            i_prefixa.append(i_pilha.pop()).append("");
        }
        String indice = i_prefixa.reverse().toString().trim();
        System.out.println("ìndices String  --> "+indice);
        //System.out.println("Qtd Indices --> "+indice.length());
        int qtdIndices = indice.length();
        long indiceLong = Long.parseLong(indice);//Remove zeros esquerda
        String indiceString = String.valueOf(indiceLong);
        if (qtdIndices > 10) { //Não está funcionando direito - fazer testes com parenteses externos à formula. (condição do else)
        	//indiceFinal = indiceString.charAt(1)+""+indiceString.charAt(0); Esse regra está instável
        	indiceFinal = indiceString.substring(0, 1);        	
        	System.out.println("Condição Problemática, variável qtdIndices > 10 (linha 73)");
        }else {
        	indiceFinal = indiceString.substring(0, 1);
        	System.out.println("Condição        --> 2");  
        }
        System.out.println("Fórmula Infixa  -->"+formula);
        System.out.println("Fórmula Prefixa -->"+prefixa.reverse().toString().trim());
        System.out.println("Indice do Conectivo Principal -->"+indiceFinal);
        
        //return prefixa.reverse().toString().trim();
        return indiceFinal;
    }

    private static int precedencia(String operador) {
        switch (operador) {
            case "~":
                return 3;
            case "⊓":
            	return 2;
            case "|":
                return 1;
            case ">":
                return 0;
            default:
                return -1;
        }
    }
}
