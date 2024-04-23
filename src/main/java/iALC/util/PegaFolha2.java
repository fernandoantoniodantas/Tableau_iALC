package iALC.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PegaFolha2 {

	
	//List<Integer> leaves = findLeaves(hashMap, 6);
    //System.out.println("Folhas de 6: " + leaves);

	
	public List<Integer> findLeaves(Map<Integer, List<Integer>> adjMap, int startNode) {
		List<Integer> leaves = new ArrayList<>();
		dfs(adjMap, startNode, leaves);
		return leaves;
	}

	private static void dfs(Map<Integer, List<Integer>> adjMap, int node, List<Integer> leaves) {
		if (!adjMap.containsKey(node)) {
        // Nó folha
        leaves.add(node);
        return;
		}

		List<Integer> neighbors = adjMap.get(node);
			for (int neighbor : neighbors) {
				dfs(adjMap, neighbor, leaves);
			}
	}
	


}
