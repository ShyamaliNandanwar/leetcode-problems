
// Definition for a Node.



import java.util.*;

public class NaryTreePreorderTraversal {
    List<Integer> res = null ;
    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
    public List<Integer> preorder(Node root) {
        res = new ArrayList<>();
        if(root == null)
            return res;
        
        if(root.children == null || root.children.size() == 0 ){
            res.add(root.val);
             return res;
        }
           
       Stack<Node> q = new Stack<>();

        Node node = root;
        q.add(root);
        while(!q.isEmpty()){
            Node n= q.pop();
            res.add(n.val);
            int i=n.children.size()-1;
            while(i >-1 ){
                q.push(n.children.get(i));
                i--;
            }
        }
        return res;
    }
}