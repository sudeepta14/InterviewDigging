package Blind75.Medium;

public class NumberOfIslands {
    public int numIslands(char[][] grid) {
        if(grid.length == 0 || grid == null) return 0;
        int result = 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j] == '1'){
                    result++;
                    dfs(grid, i, j);
                }
            }
        }
        return result;
    }

    public void dfs(char[][] grid, int i, int j){
        if(i <0 || j< 0 || i>=grid.length || j >= grid[0].length || grid[i][j] == '0') return;
        grid[i][j] = '0';
        dfs(grid, i+1, j);
        dfs(grid, i-1, j);
        dfs(grid, i, j+1);
        dfs(grid, i, j-1);
    }
}
