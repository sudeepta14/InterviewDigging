package Blind75.Medium;

public class MaximumSubArray {
    public int maxSubArray(int[] nums) {
        int maxSoFar = nums[0];
        int maxEndingHere = nums[0];

        for(int i=1; i<nums.length; i++){
            maxSoFar = Math.max(maxSoFar + nums[i], nums[i]);
            maxEndingHere = Math.max(maxSoFar, maxEndingHere);
        }
        return maxEndingHere;
    }
}
/*
Time complexity : O(N)
Space complexity: O(1)
 */
