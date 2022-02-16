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
    public TreeNode invertTree(TreeNode root) {
        helper(root);
        return root;
    }

    public void helper(TreeNode node){
        if(node==null || (node.left == null && node.right == null))
            return;
        TreeNode temp = node.right;
        node.right = node.left;
        node.left = temp;

        helper( node.left );
        helper( node.right );

    }
}