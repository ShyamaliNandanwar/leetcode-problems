/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null){
            return false;
        }
        ListNode p=head, q=head;
        // p = p.next;
        // q = q.next.next;
        while(q!=null && q.next!=null){
            p = p.next;
            q = q.next;
            if(q!=null)
                q=q.next;
            if(p==q)
                return true;

        }
        return false;
    }
}