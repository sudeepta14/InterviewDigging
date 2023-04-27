package Blind75.Medium;

public class HouseRobber2 {
    public int rob(int[] nums) {
        if(nums == null || nums.length == 0) return 0;

        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return Math.max(nums[0], nums[1]);

        int a = helper(nums, 0, nums.length -2);
        int b = helper(nums, 1, nums.length - 1);
        return Math.max(a, b);
    }
    public int helper(int[] nums, int low, int high){
        int prevSum = 0;
        int currSum = 0;
        for(int i=low; i<=high; i++){
            int tempSum = currSum;
            currSum = Math.max(currSum, prevSum + nums[i]);
            prevSum = tempSum;
        }
        return currSum;
    }

    /*
    time complexity : O(N)
    space complexity : O(1)
    */
}
