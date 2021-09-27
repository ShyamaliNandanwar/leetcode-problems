/* Structure of node

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
*/

class GfG
{
    //Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int n)
    {
        // Your code here
        Node node = head ;
        int len=1;
        while(node.next!=null){
            len++;
            node = node.next;
        }
        if(n > len){
            return -1;
        }
        n = len-n;

        node=head;
        while(n > 0){
            n--;
            node=node.next;
        }
        return node.data;
    }
}
