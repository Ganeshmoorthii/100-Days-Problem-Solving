/*

Example 1:

Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2,_,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 2.
It does not matter what you leave beyond the returned k (hence they are underscores).
Example 2:

Input: nums = [0,1,2,2,3,0,4,2], val = 2
Output: 5, nums = [0,1,4,0,3,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
Note that the five elements can be returned in any order.
It does not matter what you leave beyond the returned k (hence they are underscores).

*/

class Solution {
    public int removeElement(int[] nums, int val) {
        int index = 0; // Initialize pointer
        
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // If current element is not equal to val, replace nums[index] with nums[i]
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++; // Move pointer to the next position
            }
        }
        
        return index; // Number of elements after removing val is the index of the pointer
    }
}
