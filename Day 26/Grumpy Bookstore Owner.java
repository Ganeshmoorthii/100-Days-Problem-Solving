class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int max = 0;
        int temp =0;
        int j=0;
        for(int i = 0 ;i<customers.length; i++){
            temp+=customers[i] * grumpy[i];
            max = Math.max(max,temp);
            if(i>=minutes-1){
                temp-=customers[j] * grumpy[j++];
            }
        }
        
        for(int i =0 ;i<customers.length;i++){
          max+=customers[i] * (1-grumpy[i]);
        }
        return max;

    }
}
