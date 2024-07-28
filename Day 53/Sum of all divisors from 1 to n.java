/*
Input:
N = 4
Output:
15

Explanation:
F(1) = 1
F(2) = 1 + 2 = 3
F(3) = 1 + 3 = 4
F(4) = 1 + 2 + 4 = 7
ans = F(1) + F(2) + F(3) + F(4)
    = 1 + 3 + 4 + 7
    = 15
*/

class Solution {
    static long sumOfDivisors(int N) {
        long sum = 0;
        // Iterate through each possible divisor
        for (int i = 1; i <= N; i++) {
            // Add the contribution of the divisor to the sum
            sum += (N / i) * i;
        }
        return sum;
    }
}
