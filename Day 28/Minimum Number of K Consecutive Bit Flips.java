/*
Example 1:

Input: nums = [0,1,0], k = 1
Output: 2
Explanation: Flip nums[0], then flip nums[2].
Example 2:

Input: nums = [1,1,0], k = 2
Output: -1
Explanation: No matter how we flip subarrays of size 2, we cannot make the array become [1,1,1].
Example 3:

Input: nums = [0,0,0,1,0,1,1,0], k = 3
Output: 3
Explanation: 
Flip nums[0],nums[1],nums[2]: nums becomes [1,1,1,1,0,1,1,0]
Flip nums[4],nums[5],nums[6]: nums becomes [1,1,1,1,1,0,0,0]
Flip nums[5],nums[6],nums[7]: nums becomes [1,1,1,1,1,1,1,1]
*/
class Solution {
    public int minKBitFlips(int[] nums, int k) {
        int n = nums.length;
        int res = 0;
        int[] flipped = new int[n];

        int flipCount = 0;

        for (int i = 0; i < n; i++) {
            // If flipCount is odd, it means nums[i] has been flipped
            if (i >= k) {
                flipCount ^= flipped[i - k];
            }
            if (flipCount % 2 == nums[i]) {
                // We need to flip the current window
                if (i + k > n) {
                    return -1; // Not enough elements to flip
                }
                res++;
                flipCount ^= 1;
                flipped[i] = 1; // Record the flip at this position
            }
        }

        return res;
    }
}
