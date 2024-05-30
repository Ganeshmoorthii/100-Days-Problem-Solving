/*

Example 1:

Input: nums = [4,2,3], k = 1
Output: 5
Explanation: Choose index 1 and nums becomes [4,-2,3].
Example 2:

Input: nums = [3,-1,0,2], k = 3
Output: 6
Explanation: Choose indices (1, 2, 2) and nums becomes [3,1,0,2].
Example 3:

Input: nums = [2,-3,-1,5,-4], k = 2
Output: 13
Explanation: Choose indices (1, 4) and nums becomes [2,3,-1,5,4].

*/

class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int i =0;
        while(k>0 && i<nums.length){
            if(nums[i]<0){
                nums[i]=- nums[i];
                k--;
            }else{
                break;
            }i++;
        }
        Arrays.sort(nums);
        if(k%2==1){
            nums[0]=-nums[0];
        }
        int sum =0 ;
        for(int num : nums){
            sum += num;
        }
        return sum;
    }
}
