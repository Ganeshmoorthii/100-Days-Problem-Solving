/*

Example 1:

Input: nums = [5,6,2,7,4]
Output: 34
Explanation: We can choose indices 1 and 3 for the first pair (6, 7) and indices 2 and 4 for the second pair (2, 4).
The product difference is (6 * 7) - (2 * 4) = 34.
Example 2:

Input: nums = [4,2,5,9,7,4,8]
Output: 64
Explanation: We can choose indices 3 and 6 for the first pair (9, 8) and indices 1 and 5 for the second pair (2, 4).
The product difference is (9 * 8) - (2 * 4) = 64.

*/

class Solution {
    public int maxProductDifference(int[] nums) {
        int[] pair1 = getMaxMin(nums);
        int[] pair2 = getMaxMin(nums);

        return pair1[0] * pair2[0] - pair1[1] * pair2[1];
    }
    public int[] getMaxMin(int[] nums){
        int minIndex = -1, maxIndex = -1;
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        
        for (int i = 0; i < nums.length; i++){
            if (nums[i] > 0){
                if (nums[i] > max){
                    max = nums[i]; maxIndex = i;
                }
                if (nums[i] < min){
                    min = nums[i]; minIndex = i;
                }
            }
        }
        
        nums[maxIndex] = 0;
        nums[minIndex] = 0;
        
        return new int[]{max, min};
    }
}
