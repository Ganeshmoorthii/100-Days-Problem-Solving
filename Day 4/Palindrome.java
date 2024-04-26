
class Solution
{
    public String is_palindrome(int n)
    {   int num = n;
        int c=0;
        while(n!=0){
            int lastdigit = n%10;
            c=c*10 + lastdigit;
            n=n/10;
        }
        if(c==num) return "Yes";
        else return "No";
    }
}
