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
    public ListNode mergeNodes(ListNode head) {
        if(head==null) return head;
        ListNode res=new ListNode();
        int count=0;
        head=head.next;

        ListNode head1=null; 
        
        while(head!=null){
            count+=head.val;
            if(head.val==0){
               res.next=new ListNode(count);
               if(head1==null) head1=res.next;
               res=res.next;
                count=0;

            }
            head=head.next;
        }
        return head1;
    }
}
