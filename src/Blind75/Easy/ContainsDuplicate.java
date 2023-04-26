package Blind75.Easy;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args){
        int[] nums = {1, 2, 4, 7};
        System.out.println(containsDuplicate(nums));
    }
    public static boolean containsDuplicate(int[] nums){
        Set<Integer> set = new HashSet<>();
        for(int a: nums){
            if(set.contains(a)){
                return true;
            }
            set.add(a);
        }
        return false;
    }
}
