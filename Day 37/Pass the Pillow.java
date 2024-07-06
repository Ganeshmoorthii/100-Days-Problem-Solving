/*
Example 1:
Input: n = 4, time = 5
Output: 2
Explanation: People pass the pillow in the following way: 1 -> 2 -> 3 -> 4 -> 3 -> 2.
After five seconds, the 2nd person is holding the pillow.

Example 2:
Input: n = 3, time = 2
Output: 3
Explanation: People pass the pillow in the following way: 1 -> 2 -> 3.
After two seconds, the 3rd person is holding the pillow.
*/

class Solution {
    public int passThePillow(int n, int time) {
        if(time==0){
            return 1;
        }
        while(time!=0){
            for(int i=1;i<n+1;i++){
            
            System.out.println(time +" " + i);
            if(time==0){
                return i;
            }
            time--;
        }
        
        for(int i = n-1;i>1;i--){
            System.out.println(time+" "+i);
            if(time==0){
                return  i;
            }
            time--;
        }
        }
        return 1;
    }
}
