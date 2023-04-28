package Blind75.Medium;

public class WordSearch {
    public boolean exist(char[][] board, String word) {
        if(board == null || board.length == 0) return false;

        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){
                if(dfs(board, i, j, word, 0)){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean dfs(char[][] board, int i, int j, String word, int index){
        if(index == word.length()) return true;

        if(i < 0 || j < 0 || i >= board.length || j>=board[i].length) return false;

        if(board[i][j] != word.charAt(index)) return false;

        board[i][j] = '*';
        boolean exist = dfs(board, i+1, j, word, index+1) ||dfs(board, i, j-1, word, index+1)||dfs(board, i, j+1, word, index+1)||dfs(board, i-1, j, word, index+1);
        board[i][j] = word.charAt(index);
        return exist;
    }
}

/*
Time complexity : O(N * 3^l)
Space complexity O(l)
 */