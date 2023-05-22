package Blind75.Medium;

import Blind75.Easy.Classes.TreeNode;
import java.util.*;
public class BuildTreeFromPreandInorder {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<inorder.length; i++){
            map.put(inorder[i], i);
        }

        return build(0, 0, inorder.length-1, preorder, inorder, map);
    }

    public TreeNode build(int prestart, int instart, int inend, int[] preorder, int[] inorder, Map<Integer, Integer> map){
        if((prestart > preorder.length) || (instart > inend)) return null;
        TreeNode node = new TreeNode(preorder[prestart]);
        int index = map.get(node.val);
        node.left = build(prestart+1, instart, index-1, preorder, inorder, map);
        node.right = build(prestart+index-instart+1, index+1, inend, preorder, inorder, map);
        return node;
    }
}
/*
Time and space complexity : O(N)
 */