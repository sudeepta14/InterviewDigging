package Blind75.Medium;

public class HouseRobber {
    public int rob(int[] nums) {
        int currSum = 0;
        int prevSum = 0;

        for(int num: nums){
            int temp = currSum;
            currSum = Math.max(currSum, prevSum + num);
            prevSum = temp;
        }
        return currSum;
    }
}
