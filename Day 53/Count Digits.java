/*
Input: n = 12
Output: 2
Explanation: 1, 2 when both divide 12 leaves remainder 0.

Input: n = 2446
Output: 1
Explanation: Here among 2, 4, 6 only 2 divides 2446 evenly while 4 and 6 do not.

Input: n = 23
Output: 0
Explanation: 2 and 3, none of them divide 23 evenly.
*/

class Solution {
    static int evenlyDivides(int N) {
        int d = N;
        int c = 0;
        while(N>0){
            int digit = N % 10;
            if(digit != 0 && d % digit == 0){
                c++;
            }
            N=N/10;
        }
        return c;
    }
}
