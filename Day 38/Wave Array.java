/*
Input: n = 5, arr[] = {1,2,3,4,5}
Output: 2 1 4 3 5
Explanation: Array elements after sorting it in the waveform are 2 1 4 3 5.
*/

class Solution {
    public static void convertToWave(int n, int[] arr) {
        for(int i=0;i<n-1;i+=2){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
    }
}
