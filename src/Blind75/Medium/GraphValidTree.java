package Blind75.Medium;
import java.util.*;

class GraphValidTree {
    public boolean validTree(int n, int[][] edges) {
        if(edges.length != n-1) return false;
        Map<Integer, Set<Integer>> map = new HashMap<>();

        for(int i=0; i<n; i++){
            map.put(i, new HashSet<>());
        }

        for(int[] edge: edges){
            map.get(edge[0]).add(edge[1]);
            map.get(edge[1]).add(edge[0]);
        }

        Set<Integer> visited = new HashSet<>();

        dfs(map, visited, 0);
        return visited.size() == n; // all nodes are visited and there is no cycle
    }

    public void dfs(Map<Integer, Set<Integer>> map, Set<Integer> visited, int i){
        if(!visited.add(i)) return;
        for(int j: map.get(i)){
            dfs(map, visited, j);
        }
    }

}

/*
Time complexity : O(V+E)
Space complexity : O(V+E)
 */