package Blind75.Medium;

import java.util.*;
public class NumberOfConnectedComponents {
    public int countComponents(int n, int[][] edges) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        boolean[] visited = new boolean[n];
        int count = 0;

        for(int i=0; i<n; i++){
            map.put(i, new ArrayList<>());
        }

        for(int[] edge: edges){
            map.get(edge[0]).add(edge[1]);
            map.get(edge[1]).add(edge[0]);
        }

        for(int i=0; i<n; i++){
            if(!visited[i]){
                count++;
                dfs(map, visited, i);
            }
        }
        return count;
    }

    public void dfs(Map<Integer, List<Integer>> map, boolean[] visited, int i){
        for(int j: map.get(i)){
            if(!visited[j]){
                visited[j] = true;
                dfs(map, visited, j);
            }
        }
    }

    /*
    time complexity : O(V+E)
    space complexity : O(V+E)
     */
}
