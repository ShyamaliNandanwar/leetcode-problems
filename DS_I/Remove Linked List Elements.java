/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class RemoveLinkedListElements {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    
    public ListNode removeElements(ListNode head, int val) {

        ListNode node = new ListNode(0);
        node.next = head;
        ListNode prev = node;
        while(prev.next != null)
        {
            if(prev.next.val == val){
                prev.next = prev.next.next;
            }else{
                prev = prev.next;
            }
        }
        return node.next;
    }
}