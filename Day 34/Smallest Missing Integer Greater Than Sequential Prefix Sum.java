/*
Example 1:
Input: nums = [1,2,3,2,5]
Output: 6
Explanation: The longest sequential prefix of nums is [1,2,3] with a sum of 6. 6 is not in the array, therefore 6 is the smallest missing integer greater than or equal to the sum of the longest sequential prefix.

Example 2:
Input: nums = [3,4,5,1,12,14,13]
Output: 15
Explanation: The longest sequential prefix of nums is [3,4,5] with a sum of 12. 12, 13, and 14 belong to the array while 15 does not. Therefore 15 is the smallest missing integer greater than or equal to the sum of the longest sequential prefix.
*/

class Solution {
    public int missingInteger(int[] nums) {
       int longSeq = nums[0];
       for(int i=1;i<nums.length;i++){
        if(nums[i]==nums[i-1]+1 ){
            longSeq += nums[i];
        }else{
            break;
        }
       }
       Set<Integer> set = new HashSet<>();
       for(int i : nums){
        set.add(i);
       }
       while(set.contains(longSeq)){
        longSeq++;
       }
       System.out.println(longSeq);
       return longSeq;
    }
}
