/*
class Node
{
    int data;
    Node next;
}
*/

class RemoveLoopLL
{
    class Node
    {
        int data;
        Node next;
    }
    //Function to remove a loop in the linked list.
    public static void removeLoop(Node head){
        Node prev=head;
        while(head!=null){
            prev = head;
            head.data=-1;
            head=head.next;
            if(head!=null && head.data==-1){
                prev.next=null;
                break;
            }
        }
    }
}