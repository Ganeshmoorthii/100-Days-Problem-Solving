class Solution
{
    public long reverse_digit(long n)
    {
        long x = 0;
        while (n != 0) {
            int digit = (int)(n % 10); // Extract the last digit
            x = x * 10 + digit; // Append the digit to the result
            n = n / 10; // Remove the last digit from n
        }
        return x;
    }
}
