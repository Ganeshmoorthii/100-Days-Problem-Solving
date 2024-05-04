/*

Example 1:

Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
Example 2:

Input: nums = [1,1,1,1,1]
Output: [1,2,3,4,5]
Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
Example 3:

Input: nums = [3,1,2,10,1]
Output: [3,4,6,16,17]

*/

class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length; 
        int[] result = new int[n];
        result[0] = nums[0];
        for(int i=1; i<n;i++){
            int val = result[i-1] + nums[i];
            result[i] = val;
        }
        return result;
    }
}
