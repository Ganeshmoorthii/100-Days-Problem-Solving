/*

Example 1:

Input: nums1 = [2,6,4], nums2 = [9,7,5]
Output: 3

Explanation:
The integer added to each element of nums1 is 3.

Example 2:

Input: nums1 = [10], nums2 = [5]
Output: -5

Explanation:
The integer added to each element of nums1 is -5.
*/

class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        
        int sum1 = 0, sum2 = 0;
        for (int num : nums1) {
            sum1 += num;
        }
        for (int num : nums2) {
            sum2 += num;
        }
        return (sum2 - sum1) / nums1.length;
        
    }
}
