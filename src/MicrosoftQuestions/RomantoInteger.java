package MicrosoftQuestions;
import java.util.*;
public class RomantoInteger {
}

class Solution {
    public int romanToInt(String s) {
        // map of the character to the value
        Map<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        // have to consider the cases where it is "iv" and "vi"
        int prev = 0;
        int result = 0;
        // start from back of array
        for(int i=s.length()-1 ; i>=0; i--){
            int number = map.get(s.charAt(i));

            if(number < prev){
                result -= number;
            }else{
                result += number;
                prev = number;
            }
        }
        return result;
    }
}

/*
Time complexity : O(1) as there are finite roman numerals
Space complexity : O(1) as there are finite roman numerals
*/
