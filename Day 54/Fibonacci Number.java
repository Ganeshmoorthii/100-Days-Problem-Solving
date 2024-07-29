/*
xample 1:
Input: n = 2
Output: 1
Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.

Example 2:
Input: n = 3
Output: 2
Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.
*/

class Solution {
    public int fib(int n) {
        if(n<=1){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
}
