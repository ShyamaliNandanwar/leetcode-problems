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
class AddTwoNums {
      public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry =0;
        if(l1==null)
            return l2;
        if(l2==null)
            return l1;
        ListNode head = null;
        ListNode node = head;
        int sum =0 ;
        while(l1!=null && l2!=null){
            sum= l1.val+l2.val+carry;
            carry=sum/10;
            if(sum > 9){
                sum = sum%10;
            }

            l1 = l1.next;
            l2 = l2.next;
            if(node == null){
                node = new ListNode(sum);
                head = node;
            }else{
                node.next = new ListNode(sum);
                node = node.next;
            }
        }

        while(l1!=null){
            sum = l1.val+carry;
            carry = sum/10;
            if(sum>9)
                sum = sum%10;

            l1=l1.next;
            node.next = new ListNode(sum);
            node = node.next;
        }

        while(l2!=null){
            sum = l2.val+carry;
            carry = sum/10;
            if(sum>9)
                sum = sum%10;
            l2=l2.next;
            node.next = new ListNode(sum);
            node = node.next;
        }

        if(carry >0){
            node.next = new ListNode(carry);
            node=node.next;
        }

        return head;
    }
}