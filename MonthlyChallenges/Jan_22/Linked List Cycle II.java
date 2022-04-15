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
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next == null)
            return null;
        ListNode p =head, q=head;
        while(q!= null && q.next!=null){
            //System.out.println(p.val +"  " + q.val);
            p = p.next;
            q=q.next.next;
            if(p==q){
                p =head;
                while(p!=q){
                    p=p.next;
                    q=q.next;
                }
                return p;            }
        }
        return null;
    }
}