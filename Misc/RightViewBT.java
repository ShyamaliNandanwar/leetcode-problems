class Node
{
    int data;
    Node left, right;
    public Node(int data)
    {
        this.data = data;
        left = right = null;
    }
}*/


class Solution{
    //Function to return list containing elements of right view of binary tree.
    ArrayList<Integer> rightView(Node node) {
        ArrayList<Integer> res = new ArrayList<>();
        TreeMap<Integer, Integer> hm = new TreeMap<>();
        helper(node,0, hm);
        for(Map.Entry<Integer, Integer> e: hm.entrySet()){
            res.add(e.getValue());
        }
        return res;
    }

    void helper(Node root, int h, TreeMap<Integer, Integer> s){
        if(root==null)
            return;
        if(!s.containsKey(h))
            s.put(h, root.data);

        helper(root.right, h+1 ,s);
        helper(root.left, h+1 ,s);

    }
}

