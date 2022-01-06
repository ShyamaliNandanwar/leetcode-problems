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
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null)
            return head;
        ListNode second = head, dummy = new ListNode(-1,head), first = dummy, ans = dummy;
        int cnt = 0;
        while(second != null){
            if(cnt < (n)) {
                second = second.next;
                cnt++;
            }
            else{
                first = first.next;
                second = second.next;
            }
        }
        if(first.next != null)
            first.next = first.next.next;

        return ans.next;
    }
}