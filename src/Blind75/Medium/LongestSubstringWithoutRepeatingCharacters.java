package Blind75.Medium;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args){
        String s = "abcaadefgghijkl";
        System.out.println("longest string length" + longest(s));
    }
    public static int longest(String s){
        Set<Character> set = new HashSet<>();
        int max = 0;
        int i = 0, j = 0;
        while(j < s.length()){
            if(!set.contains(s.charAt(j))){
                max = Math.max(max, j-i);
                set.add(s.charAt(j++));
            }else{
                set.remove(s.charAt(i++));
            }
        }
        return max;
    }
}
