/*
Input:
5
Output:
GFG GFG GFG GFG GFG
*/

class Solution {

    void printGfg(int N) {
        if(N==0){
            return;
        }
        System.out.print("GFG ");
        printGfg(N-1);
    }
}
