class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/
class Tree
{
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
        // Your code here
        ArrayList<Integer> res = new ArrayList<>();
        TreeMap<Integer, Integer> hm = new TreeMap<>();
        helper(root,0, hm);
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

        helper(root.left, h+1 ,s);

        helper(root.right, h+1 ,s);


    }
}