/*
Example 1:
Input: n = 10, m = 3
Output: 19
Explanation: In the given example:
- Integers in the range [1, 10] that are not divisible by 3 are [1,2,4,5,7,8,10], num1 is the sum of those integers = 37.
- Integers in the range [1, 10] that are divisible by 3 are [3,6,9], num2 is the sum of those integers = 18.
We return 37 - 18 = 19 as the answer
*/

class Solution {
    public int differenceOfSums(int n, int m) {
        int oddSum = 0;
        int evenSum = 0;
        for(int i=1;i<n+1;i++){
            if(i%m==0){
                oddSum+=i;
            }else{
                evenSum+=i;
            }
        }
        return evenSum - oddSum;
    }
}
