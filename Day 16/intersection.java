/*

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.

*/

class Solution {
     public int[] intersection(int[] nums1, int[] nums2) {
        
        Set<Integer> set1 = new HashSet<>();
        for (int n1:nums1
             ) {
            set1.add(n1);
        }
        Set<Integer> set2 = new HashSet<>();
        for (int n2:nums2
        ) {

            if(set1.contains(n2)) {
                set2.add(n2);
            }
        }

        int[] result = new int[set2.size()];
        int i =0;
        for (int x:set2
             ) {
            result[i] = x;
            i++;
        }

        return result;
    }
}
