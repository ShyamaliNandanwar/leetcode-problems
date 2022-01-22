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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null)
            return head;
        ListNode node = head;//1

        ListNode res = new ListNode();

        res.next = head;
        ListNode prev = res;
        while(node!=null && node.next!=null){
            boolean du= false;
            while(node!= null && node.next!=null && node.val == node.next.val){
                du=true;
                node=node.next;
            }

            if(du){
                prev.next = node.next;
            }
            else{
                prev=prev.next;
            }
            node=node.next;
        }
        return res.next;
    }
}