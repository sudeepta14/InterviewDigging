package Blind75.Medium;
import java.util.*;
public class LIS {
        public int longestConsecutive(int[] nums) {
            Set<Integer> set = new HashSet<>();
            for(int num: nums){
                set.add(num);
            }
            int maxLength = 0;
            for(int num: nums){
                if(!set.contains(num-1)){ // only check if there is no prev (num-1) value..
                    int currentNum = num;
                    int currentLength = 1;
                    while(set.contains(currentNum+1)){ // check for increasing numbers
                        currentNum +=1;
                        currentLength +=1; // add to current length
                    }
                    maxLength = Math.max(maxLength, currentLength); // return the maxlength
                }
            }
            return maxLength;
        }
    }

/*
Time complexity : O(n)
Space complexity : O(n)
 */
