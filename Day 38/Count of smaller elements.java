/*
Example 1:
Input:
N = 6
A[] = {1, 2, 4, 5, 8, 10}
X = 9
Output:
5
*/

class Solution{
    public int countOfElements(int []arr,int n,int x)
    {
        int count = 0;
        for(int num : arr){
            if(num<=x){
            count++;}
        }
        return count;
    }
}
