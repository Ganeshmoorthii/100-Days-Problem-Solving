/*
Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Example 2:

Input: nums = [2,0,1]
Output: [0,1,2]
*/

class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length -1 ;
        while(mid<=high){
            switch(nums[mid]){
                case 0:
                    swap(nums,low++, mid++);
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(nums,high--, mid);
                    break;
            }
        }
    }
    static void swap(int nums[], int a , int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
