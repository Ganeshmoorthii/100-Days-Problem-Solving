/*
Input: arr[] = [1, 2, 3, -2, 5]
Output: 9
Explanation: Max subarray sum is 9 of elements (1, 2, 3, -2, 5) which is a contiguous subarray.
*/

class Solution {

    // arr: input array
    // Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int[] arr) {
        long max = arr[0];
        long newMax=arr[0];
        for(int i=1;i<arr.length;i++){
            newMax =Math.max(arr[i],newMax+arr[i]);
            max = Math.max(max,newMax);
        }
        return max;
    }
}
