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
    int depth;
    int maxDepth;
    int sum;
    HashMap<TreeNode, Integer> hm;
public int deepestLeavesSum(TreeNode root) {
    if(root==null)
        return 0;
    hm = new HashMap<>();
    depth=0;
    maxDepth = Math.max(maxDepth, helper(root, hm, depth+1));
    //System.out.println("maxDepth=" + maxDepth + " depth=" + depth);
    for(Map.Entry<TreeNode, Integer> e: hm.entrySet()){

        if(e.getValue()== maxDepth)
            sum = sum+e.getKey().val;
    }
    // hm.forEach((key,value) -> sum += value==maxDepth?key : 0);
    return sum;
}

public int helper(TreeNode node, HashMap hm, int depth ){
    
    //System.out.println("In helper" + "  max=" + maxDepth);
    if(node.left==null && node.right==null ){
        //System.out.println("Leaf node =" + node.val + " dep=" +depth);
        hm.put(node, depth);
        
    }
    maxDepth = Math.max(maxDepth, depth);
    
    //System.out.println("  max=" + maxDepth);
    if(node.left!= null)
        maxDepth = Math.max(maxDepth, helper(node.left, hm, depth+1));
    if(node.right!=null)
        maxDepth = Math.max(maxDepth, helper(node.right, hm, depth+1));
    
    return maxDepth;
}
}