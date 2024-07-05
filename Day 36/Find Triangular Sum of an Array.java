/*
Example 1:
Input: nums = [1,2,3,4,5]
Output: 8
Explanation:
The above diagram depicts the process from which we obtain the triangular sum of the array.

Example 2:
Input: nums = [5]
Output: 5
Explanation:
Since there is only one element in nums, the triangular sum is the value of that element itself.
*/

class Solution {
    public int triangularSum(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int[] temp = new  int[nums.length-1];
        int j=0;
        for(int i=0;i<nums.length-1;i++){
            int el = nums[i] + nums[i+1];
            el = el %10;
            temp[j++]=el;
        }
        return triangularSum(temp);
    }
}
