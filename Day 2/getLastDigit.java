class Solution {
    static int getLastDigit(String a, String b) {
        int num1 = Integer.parseInt(a);
        int num2 = Integer.parseInt(b);
        int res = (int) Math.pow(num1, num2); // Casting to int since Math.pow returns double
        return res % 10;
    }
}
