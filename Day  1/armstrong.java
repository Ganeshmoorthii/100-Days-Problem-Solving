
class Solution {
    static String armstrongNumber(int n) {
        int temp = n;
        int arm = 0;
        while (temp != 0) {
            int lastdigit = temp % 10;
            arm = arm + (lastdigit * lastdigit * lastdigit);
            temp = temp / 10;
        }
        if (n == arm) {
            return "Yes";
        } else {
            return "No";
        }
    }
}
