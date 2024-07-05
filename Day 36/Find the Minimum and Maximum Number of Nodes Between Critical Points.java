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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return new int[]{-1, -1};
        }
        List<Integer> criticalPoints = new ArrayList<>();
        int i=0;
        ListNode prev = head;
        ListNode curr = prev.next;
        ListNode nex = curr.next;
        int currNode = 1;
        while(nex!=null){
            if ((curr.val > prev.val && curr.val > nex.val) || (curr.val < prev.val && curr.val < nex.val)) {
                criticalPoints.add(currNode);
            }
            prev = curr;
            curr =nex;
            nex = nex.next;
            currNode++;
        }
        if (criticalPoints.size() < 2) {
            return new int[]{-1, -1};
        }
        int minDistance =  Integer.MAX_VALUE;
        int max = criticalPoints.get(criticalPoints.size()-1) - criticalPoints.get(0);
        for (int j = 1; j < criticalPoints.size(); j++) {
            minDistance = Math.min(minDistance, criticalPoints.get(j) - criticalPoints.get(j - 1));
        }
       return new int[]{minDistance,max};
    }
}
