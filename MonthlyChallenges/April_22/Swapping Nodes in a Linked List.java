import java.util.ArrayList;
import java.util.List;

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
class SwappingNodes {
    public ListNode swapNodes(ListNode head, int k) {
        List<Integer> l = new ArrayList<>();

        ListNode node = head;

        while(node!=null){
            l.add(node.val);
            node=node.next;
        }

        int temp = l.get(k-1);
        //System.out.println(temp);
        l.set(k -1, l.get(l.size()-k));
        l.set(l.size()-k, temp);

        head = new ListNode(l.get(0));
        node =head;
        for(int i=1; i< l.size();i++){
            ListNode newNode = new ListNode(l.get(i));
            node.next = newNode;
            node = node.next;
        }
        return head;
    }
    
     public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}