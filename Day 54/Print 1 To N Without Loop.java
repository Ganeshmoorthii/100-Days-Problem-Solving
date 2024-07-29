/*
Input: n = 10
Output: 1 2 3 4 5 6 7 8 9 10

Input: n = 5
Output: 1 2 3 4 5
*/

class Solution
{    
    int K = 0;
    
  public void printNos(int N)
    {   K = K+1;
        if(N==0){
            return;
        }
        System.out.print(K+" ");
        printNos(N-1);
    }
}

