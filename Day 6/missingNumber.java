/*
Given an array of size N-1 such that it only contains distinct integers in the range of 1 to N. Find the missing element.

Example 1:

Input:
N = 5
A[] = {1,2,3,5}
Output: 4
Example 2:

Input:
N = 10
A[] = {6,1,2,8,3,4,7,10,5}
Output: 9
*/

class Solution {
    int missingNumber(int array[], int n) {
        // variable to store the sum of numbers from 1 to n
        int total;
        // calculating the sum using the formula
        total = (n + 1) * (n) / 2;
        // subtracting each number in the array from the total
        for (int i = 0; i < n-1; i++)
            total -= array[i];
        // returning the missing number
        return total;
    }
}
