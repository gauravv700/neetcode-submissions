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
 */

class Solution {
    // private int max = Integer.MIN_VALUE;
    private int count = 0;
    public int goodNodes(TreeNode root) {
        if(root == null) return 0;
        helper(root,root.val);
        return this.count;
    }

    private void helper(TreeNode node,int max){
        if(node == null) return;
        if(node.val >= max){
            max = node.val;
            this.count++;
        }
        helper(node.left,max);
        helper(node.right,max);
    }
}
