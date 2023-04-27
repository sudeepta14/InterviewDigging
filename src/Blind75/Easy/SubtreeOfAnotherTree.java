package Blind75.Easy;

import Blind75.Easy.Classes.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 *
 * Time complexity is O(N*M) where N = number of nodes in the tree and M is no of nodes in subtree
 * Space Complexity is O(N+M) where N= number of nodes in the tree (before calling isSame, our call stack has atmost N elements
 * and might increase to O(N+M) elements during the call. After the call, it will be back to O(N) elements. 
 * Atmost of N recursive calls to the DFS each of these calls will have M recursive calls to isSame.
 */
class SubtreeOfAnotherTree {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null) return false;
        if(isSame(root, subRoot)) return true;
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
    public boolean isSame(TreeNode root1, TreeNode root2){
        if(root1 == null && root2 == null) return true;
        if(root1 == null || root2 == null) return false;
        if(root1.val != root2.val) return false;
        return isSame(root1.left, root2.left) && isSame(root1.right, root2.right);
    }
}
