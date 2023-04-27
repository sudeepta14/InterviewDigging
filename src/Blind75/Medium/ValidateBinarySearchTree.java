package Blind75.Medium;

import Blind75.Easy.Classes.TreeNode;

public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        return root == null || isValid(root, null, null);
    }
    public boolean isValid(TreeNode root, Integer min, Integer max){
        if(root == null) return true;
        if(min != null && root.val <= min) return false;
        if(max != null && root.val >= max) return false;
        return isValid(root.left, min, root.val) && isValid(root.right, root.val, max);
    }
}

/*
Time complexity : 0(N)
Space complexity: O(N)
 */
