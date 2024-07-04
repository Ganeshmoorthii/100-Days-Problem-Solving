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
    public ListNode removeElements(ListNode head, int val) {
        // Create a dummy node
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = head;
        ListNode prev = dummy;

        while (current != null) {
            if (current.val == val) {
                // Skip the current node
                prev.next = current.next;
            } else {
                // Move prev to current node
                prev = current;
            }
            // Move to the next node
            current = current.next;
        }

        return dummy.next;
    }
}
