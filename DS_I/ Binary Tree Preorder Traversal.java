import java.util.ArrayList;
import java.util.List;

class PreorderTransversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer>  res = new ArrayList<>();
        helper(root, res);
        return res;
    }

    public void helper(TreeNode node, List<Integer> l ){
        if(node==null)
            return;
        l.add(node.val);
        helper(node.left, l);
        helper(node.right, l);
    }
}