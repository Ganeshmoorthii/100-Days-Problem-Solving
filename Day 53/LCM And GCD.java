/*
Input: a = 5 , b = 10
Output: 10 5
Explanation: LCM of 5 and 10 is 10, while thier GCD is 5.

Input: a = 14 , b = 8
Output: 56 2
Explanation: LCM of 14 and 8 is 56, while thier GCD is 2.
*/

class Solution {
    static Long[] lcmAndGcd(Long A , Long B) {
        return new Long[]{lcm(A,B),gcd(A,B)};
    }
    static Long gcd(Long a, Long b){
        while(b!=0){
            Long temp = b;
            b = a%b;
            a=temp;
        }
        return a;
    }
    static Long lcm(Long a,Long b){
        return (a*b)/gcd(a,b);
    }
}
