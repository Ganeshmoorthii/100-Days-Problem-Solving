/*

Example 1:

Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
Example 2:

Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9

*/

class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int n: nums){
            set.add(n);
        }

        int max = 0;
        for(int i =0; i<nums.length;i++){
            int num = nums[i];
            if(set.contains(nums[i]-1)) continue;
            int currLength = 0;
            while(set.contains(num)){
                currLength++;
                num++;
            }
            max = Math.max(max,currLength);
        }
        return max;
    }
}
