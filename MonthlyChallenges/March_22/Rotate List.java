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
class RotateList {
      public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k==0)
            return head;
        int length = 0;
        ListNode node = head;
        while(node!=null){
            length++;
            node=node.next;
        }

        if(k>=length)
            k = k%length;

        if(k==0)
            return head;
        else
            k = length - k;

        node = head;
        ListNode prev = head;
        while(k > 0){
            prev = node;
            node=node.next;
            k--;
        }
        ListNode newHead = node;
        prev.next = null;

        node = newHead;
        while(node.next!=null)
            node= node.next;
        node.next = head;
        return newHead;
    }
}