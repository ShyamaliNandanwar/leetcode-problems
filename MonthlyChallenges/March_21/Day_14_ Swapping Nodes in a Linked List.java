import java.util.ArrayList;

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
class SwappingNodes1 {
    
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }
    public ListNode swapNodes(ListNode head, int k) {
        ArrayList<Integer> al = new ArrayList<>();
        ListNode node = head;
        while(node!=null){
            al.add(node.val);
            node = node.next;
        }
        if(k > al.size())
            return head;
        Integer a[] = new Integer[al.size()];
        a = al.toArray(a);
        k =k-1;
        
        int l = 0;
        if(k+1 != a.length)
            l = a.length-k-1;
        //System.out.println(k + " " + l);
        int temp = a[k];
        a[k]=a[l];
        a[l]=temp;
        node = head;
        for(int i=0;i< a.length;i++){
            if(node.val !=a[i])
                node.val=a[i];
            node = node.next;
        }
        return head;
            
        
    }
}