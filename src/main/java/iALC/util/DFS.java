package iALC.util;

import java.util.*;

/**
 *
 */
public class DFS {

    // Função DFS modificada para devolver o caminho entre dois nós
    private boolean DFS(int currentNode, int endNode, Map<Integer, List<Integer>> adjacencyLists, Set<Integer> visited, List<Integer> path) {
        // Marcar o nó atual como visitado
        visited.add(currentNode);
        // Adicionar o nó atual ao caminho
        path.add(currentNode);

        // Verificar se o nó atual é o nó de destino
        if (currentNode == endNode) {
            return true; // Caminho encontrado
        }

        // Percorrer os vizinhos do nó atual
        for (int adjacentNode : adjacencyLists.get(currentNode)) {
            if (!visited.contains(adjacentNode)) {
                // Realizar DFS recursivamente no nó adjacente
                if (DFS(adjacentNode, endNode, adjacencyLists, visited, path)) {
                    return true; // Caminho encontrado
                }
            }
        }

        // Se o nó atual não leva ao nó de destino, remover o nó do caminho
        path.remove(path.size() - 1);
        return false;
    }

    // Função para iniciar a busca pelo caminho entre dois nós
    public List<Integer> findPath(int startNode, int endNode, Map<Integer, List<Integer>> adjacencyLists) {
        List<Integer> path = new ArrayList<>();
        Set<Integer> visited = new HashSet<>();

        // Iniciar a DFS a partir do nó de origem
        if (DFS(startNode, endNode, adjacencyLists, visited, path)) {
            return path; // Caminho encontrado
        } else {
            // Se não houver caminho, retornar uma lista vazia
            return Collections.emptyList();
        }
    }
    
    
    
    public List CaminhoEntreNos(int startNode, int endNode, Map<Integer, List<Integer>> adjMap) {
    	DFS ob = new DFS();
    	List<Integer> path = ob.findPath(startNode, endNode, adjMap);
    	
    	return path;
    	
    }
    

    public static void main(String[] args) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        /*
            1      8
           /  \
          2 -- 3 -----
        /  \    \      \
       4 -- 5    6  -- 7

        */

        //1=[2], 2=[3], 3=[4], 4=[5, 6], 5=[7], 6=[8], 7=[9], 8=[10], 9=[11], 10=[12], 11=[13], 12=[14]
        		
        		
        graph.put(1, new ArrayList<Integer>(){{ add(2); }});
        graph.put(2, new ArrayList<Integer>(){{ add(3); }});
        graph.put(3, new ArrayList<Integer>(){{ add(4); }});
        graph.put(4, new ArrayList<Integer>(){{ add(5); add(6); }});
        graph.put(5, new ArrayList<Integer>(){{ add(7); }});
        graph.put(6, new ArrayList<Integer>(){{ add(8); }});
        graph.put(7, new ArrayList<Integer>(){{ add(9); }});
        graph.put(8, new ArrayList<Integer>(){{ add(10); }});
        graph.put(9, new ArrayList<Integer>(){{ add(11); }});
        graph.put(10, new ArrayList<Integer>(){{ add(12); }});
        graph.put(11, new ArrayList<Integer>(){{ add(13); }});
        graph.put(12, new ArrayList<Integer>(){{ add(14); }});

        //graph.put(8, new ArrayList<>());
        
        DFS ob = new DFS();
        
        // Encontrar o caminho entre o nó 2 e o nó 7
        int startNode = 1;
        int endNode = 7; //6-8-10-12
        List<Integer> path = ob.findPath(startNode, endNode, graph);

        // Exibir o caminho encontrado
        if (!path.isEmpty()) {
            System.out.println("Caminho do nó " + startNode + " até o nó " + endNode + ": " + path);
        } else {
            System.out.println("Não existe caminho entre o nó " + startNode + " e o nó " + endNode);
        }
    }
}
