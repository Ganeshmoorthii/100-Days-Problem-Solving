class Solution {
    public boolean isHappy(int n) {
        if (n == 1) {
            return true;
        } else if (n == 2 || n == 4 || n == 8) {
            return false;
        } else {
            int c = 0;
            while (n != 0) {
                int a = n % 10;
                c += Math.pow(a, 2);
                n = n / 10;
            }
            if (c == 1) {
                return true;
            } else {
                return isHappy(c);
            }
        }
    }
}
