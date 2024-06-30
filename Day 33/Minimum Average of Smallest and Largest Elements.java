/*
Example 1:
Input: nums = [7,8,3,4,15,13,4,1]
Output: 5.5
*/

class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        double avg = Double.MAX_VALUE;
        System.out.print(avg);
        int n = nums.length ;
        for(int i=0;i<n/2;i++){
            double curr = (nums[i] + nums[n-i-1])/2.0;
            avg = Math.min(avg,curr);
        }
        if(n%2!=0) avg = Math.min(avg,nums[n/2]);
        return avg;
    }
}
