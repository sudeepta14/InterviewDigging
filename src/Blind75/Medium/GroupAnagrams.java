package Blind75.Medium;
import java.util.*;
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0) return null;

        Map<String, List<String>> map = new HashMap<>();

        for(String s : strs){
            char[] ch = new char[26];
            for(char c: s.toCharArray()) ch[c-'a']++;
            String key = String.valueOf(ch);

            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
}

/*
Time complexity : O(NK) -- n is no of strings, K is the length of the string
Space complexity: O(NK) -- n is no of strings and K is length of the string
 */
