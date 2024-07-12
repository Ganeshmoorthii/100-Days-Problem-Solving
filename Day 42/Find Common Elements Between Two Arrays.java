
public class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        
        // Add elements of nums1 to set1
        for (int num : nums1) {
            set1.add(num);
        }
        
        // Add elements of nums2 to set2
        for (int num : nums2) {
            set2.add(num);
        }

        int res1 = 0;
        int res2 = 0;

        // Count elements of nums1 that exist in nums2
        for (int num : nums1) {
            if (set2.contains(num)) {
                res1++;
            }
        }

        // Count elements of nums2 that exist in nums1
        for (int num : nums2) {
            if (set1.contains(num)) {
                res2++;
            }
        }

        return new int[]{res1, res2};
    }

}
