/*
Example 1:
Input: nums = [1,2,3,4]
Output: 3
Explanation:
All array elements can be made divisible by 3 using 3 operations:
Subtract 1 from 1.
Add 1 to 2.
Subtract 1 from 4.

Example 2:
Input: nums = [3,6,9]
Output: 0
*/

class Solution {
    public int minimumOperations(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            int addEl = nums[i] + 1;
            int subEl = nums[i] - 1;
            if(addEl % 3 == 0 || subEl % 3 == 0){
                count++;
            }
        }
        return count;
    }
}
