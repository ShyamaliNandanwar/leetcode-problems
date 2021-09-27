public class Solution
{
    //Function to check whether a Binary Tree is BST or not.
    boolean isBST(Node root)
    {
        // code here.
        return helper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean helper(Node root, long min, long max) {
        if(root == null)
            return true;
        if(root.data <= min || root.data >= max)
            return false;
        return helper(root.left, min, root.data) && helper(root.right, root.data, max);
    }
}