package Blind75.Medium;
import java.util.*;
public class MaxProductSubArray {
    public int maxProduct(int[] nums) {
        int result = nums[0];
        int max = nums[0], min = nums[0], temp = nums[0];
        for(int i=1; i<nums.length; i++){
            temp = max;
            max = Math.max(Math.max(max * nums[i], min * nums[i]), nums[i]);
            min = Math.min(Math.min(temp * nums[i], min * nums[i]), nums[i]);
            if(result < max){
                result = max;
            }
        }
        return result;
    }
}
