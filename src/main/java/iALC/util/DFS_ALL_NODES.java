package iALC.util;

import java.util.*;

/**
 * Created by Abhishek on 4/12/21.
 */
public class DFS_ALL_NODES {

        // prints all not yet visited vertices reachable from s
        private List<Integer> DFS(int root, Map<Integer, List<Integer>> adjacencyLists, Set<Integer> visited, List<Integer> res)
        {
            visited.add(root); // mark discovered node as visited, to avoid infinite loop if there is one or more cycle(s)

            // Process:
            // process the node here if you want to process the node before processing
            // all the nodes in the subgraph rooted at this node (i.e, before all the nodes that would be discovered
            // after this node). This is similar to concept of PREORDER Traversal .
            //
            // Remember processing varies from problem to problem depending on the problem statement.
            // For our basic DFS we just need to put the node in the list res.
            res.add(root);

            for (int adjacentNode : adjacencyLists.get(root)) {
                if (!visited.contains(adjacentNode)) {
                    DFS(adjacentNode, adjacencyLists, visited, res); // do DFS on unvisited adjacent nodes
                }
            }

            // Process:
            // process the node here instead, if you want to process the node after processing
            // all the nodes in the subgraph rooted at this node (i.e, after all the nodes that were discovered
            // after this node). This is similar to concept of POSTORDER Traversal .
            //
            // Remember processing varies from problem to problem depending on the problem statement.
            // For our basic DFS we just need to put the node in the list res.
			//
			// Just for your knowledge: If you want to implement this (processing a node after processing all the
			// nodes in the sub-graph rooted at the node) ITERATIVELY, it would be bit harder than implementing recursively.
			// More on this later.
            // res.add(root);

            return res;
        }

        // prints all vertices in DFS manner
        public void performDFS(Map<Integer, List<Integer>> adjacencyLists)
        {
            Set<Integer> visited = new HashSet<>();
            List<Integer> res = new ArrayList<>();
            for (int node : adjacencyLists.keySet()) {
                if (!visited.contains(node)) {
                    DFS(node, adjacencyLists, visited, res);
                }
            }
            for (int node : res) {
                System.out.print(node + "  ");
            }
        }

    public static void main(String[]  args) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        /*
                    1      8
                   /  \
                  2 -- 3 -----
                /  \    \      \
               4 -- 5    6  --  7

        */
        graph.put(1, new ArrayList<Integer>(){{ add(2); add(3); }});
        graph.put(2, new ArrayList<Integer>(){{ add(3); add(4); add(5); }});
        graph.put(3, new ArrayList<Integer>(){{ add(6); add(7); }});
        graph.put(4, new ArrayList<Integer>(){{ add(2); add(5); }});
        graph.put(5, new ArrayList<Integer>(){{ add(2); add(4); }});
        graph.put(6, new ArrayList<Integer>(){{ add(3); add(7); }});
        graph.put(7, new ArrayList<Integer>(){{ add(3); add(6); }});
        //graph.put(8, new ArrayList<>());
        DFS_ALL_NODES ob = new DFS_ALL_NODES();
        ob.performDFS(graph);
    }
}
