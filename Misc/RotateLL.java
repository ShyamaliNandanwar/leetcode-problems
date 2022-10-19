




public class RotateLL {
    class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }

    //Function to rotate a linked list.
    public Node rotate(Node head, int k) {
        // add code here
        Node temp = head;
        while(k > 1){
            temp = temp.next;
            k--;
        }
        //System.out.println(temp.data);

        if(temp.next == null){
            return head;
        }
        Node nhead = temp.next;
        temp.next = null;

        Node temp2 = nhead;
        while(temp2.next !=null){
            temp2 = temp2.next;
        }
        temp2.next = head;
        return nhead;
    }
}
