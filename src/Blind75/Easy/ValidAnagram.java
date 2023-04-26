package Blind75.Easy;

public class ValidAnagram {
    public static void main(String[] args){
        String s = "anagram";
        String t = "nagarama";

        System.out.println(anagram(s, t));
    }

    public static boolean anagram(String s, String t){
        if(s.length() != t.length()) return false;
        int[] counter = new int[26]; // we need to ask how many chars
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            char d = t.charAt(i);
            counter[c-'a']++;
            counter[d-'a']--;
        }
        for(int i=0; i<counter.length; i++){
            if(counter[i] != 0){
                return false;
            }
        }
        return true;
    }
}
