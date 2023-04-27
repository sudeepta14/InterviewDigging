package Blind75.Medium;
import java.util.*;
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            if(i == 0 || nums[i] != nums[i-1]){
                int left = i+1, right = nums.length - 1, sum = 0 - nums[i];
                while(left < right){
                    if(nums[left] + nums[right] == sum){
                        result.add(Arrays.asList(nums[left], nums[right], nums[i]));
                        while(left < right && nums[left] == nums[left+1]) left++;
                        while(left < right && nums[right] == nums[right-1]) right--;
                        left++;
                        right--;
                    }else if(nums[left] + nums[right] < sum){
                        left++;
                    }else{
                        right--;
                    }
                }
            }
        }
        return result;
    }
}

/*
Time complexity : O(n2) two sum is O(N) and we are calling it n times
Space complexity: O(logN)
 */