class Solution {
    static int isPrime(int N) {
        if (N <= 1) {
            return 0; // Not a prime number
        }
        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (N % i == 0) {
                return 0; // Not a prime number
            }
        }
        return 1; // Prime number
    }
}
