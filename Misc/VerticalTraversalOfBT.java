// { Driver Code Starts
//Initial Template for Java

import java.util.*;

class VerticalTraversalOfBT
{
    static class Qobj {
        int hd;
        Tree.Node node;
        Qobj(int hd, Tree.Node node)
        {
            this.hd = hd;
            this.node = node;
        }
    }
    //Function to find the vertical order traversal of Binary Tree.
    static ArrayList <Integer> verticalOrder(Tree.Node root)
    {
        // add your code here
        if (root == null)
            return new ArrayList <Integer>();

        TreeMap<Integer, ArrayList<Integer> > m = new TreeMap<>();
        int hd = 0;
        ArrayList<Integer> list = new ArrayList<>();


        Queue<Qobj> que = new LinkedList<Qobj>();
        que.add(new Qobj(0, root));

        while (!que.isEmpty()) {
            // pop from queue front
            Qobj temp = que.poll();
            hd = temp.hd;
            Tree.Node node = temp.node;

            // insert this node's data in array of hash
            if (m.containsKey(hd)) {
                m.get(hd).add(node.data);
            }
            else {
                ArrayList<Integer> al = new ArrayList<>();
                al.add(node.data);
                m.put(hd, al);
            }
            if (node.left != null)
                que.add(new Qobj(hd - 1, node.left));
            if (node.right != null)
                que.add(new Qobj(hd + 1, node.right));
        }


        for (Map.Entry<Integer, ArrayList<Integer> > e : m.entrySet())
            list.addAll(e.getValue());
        return list;
    }

}