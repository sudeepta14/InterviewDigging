package Blind75.Medium;

public class JumpGame {
    public boolean canJump(int[] nums) {
        int maxPos = nums[0];
        for(int i=1; i<nums.length; i++){
            if(maxPos < i) return false;
            maxPos = Math.max(maxPos, i + nums[i]);
        }
        return true;
    }
}
