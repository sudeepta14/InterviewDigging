package Blind75.Medium;
import java.util.*;
class PacificAtlantic {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {


        List<List<Integer>> list =  new ArrayList<>();
        if(heights == null || heights.length == 0) return list;
        int m = heights.length; // row length
        int n = heights[0].length; // col length

        boolean[][] p = new boolean[m][n]; // visited array for pacific water
        boolean[][] a = new boolean[m][n]; // visited array for atlantic water
/*
pacific ocean ==== hint to the problem -- from a cell water should flow to pacific and atlantic ocean and height should
be greater than neighbouring cells.
*/
        //pacific ocean
        for(int i=0; i<m; i++){
            dfs(heights, p, Integer.MIN_VALUE, i, 0);
            dfs(heights, a, Integer.MIN_VALUE, i, n-1);

        }
        // atlantic ocean
        for(int i=0; i<n; i++){
            dfs(heights, p, Integer.MIN_VALUE, 0, i);
            dfs(heights, a, Integer.MIN_VALUE, m-1, i);
        }

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(p[i][j] && a[i][j]){
                    List<Integer> res = new ArrayList<>();
                    res.add(i);
                    res.add(j);
                    list.add(new ArrayList<>(res));
                }
            }
        }
        return list;
    }

    public void dfs(int[][] m, boolean[][] visited, int height, int i, int j){
        if(i<0 || j<0 || i>=m.length || j>=m[0].length || visited[i][j] || height>m[i][j]) return;
        visited[i][j] = true;
        dfs(m, visited, m[i][j], i+1, j);
        dfs(m, visited, m[i][j], i-1, j);
        dfs(m, visited, m[i][j], i, j+1);
        dfs(m, visited, m[i][j], i, j-1);
    }
}