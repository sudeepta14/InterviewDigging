package Blind75.Medium;

import Blind75.Easy.Classes.TreeNode;

public class LCA {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode curr = root;
        if(curr == p || curr == q || curr == null) return curr;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if(left != null && right != null) return curr;
        if(left != null) return left;
        if(right != null) return right;
        return null;
    }
    /*
    Time complexity : O(N)
    Space complexity: O(N)
     */
}
