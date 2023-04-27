package Blind75.Medium;

import java.util.List;

public class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] visited = new boolean[s.length()+1];
        return isWordBreak(s, wordDict, visited, 0);
    }
    public boolean isWordBreak(String s, List<String> wordDict, boolean[] visited, int index){
        if(index == s.length()) return true;
        visited[index] = true;
        for(int i=index; i<=s.length(); i++){
            if(!visited[i] && wordDict.contains(s.substring(index, i)) && isWordBreak(s, wordDict, visited, i)){
                return true;
            }
        }
        return false;

        /*
        Time complexity : O(N3)
        Space complexity : O(N)
         */
    }
}
