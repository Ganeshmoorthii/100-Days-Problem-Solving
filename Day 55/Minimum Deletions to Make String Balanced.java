class Solution {
    public int minimumDeletions(String s) {
        int countB = 0;
        int  deletion = 0;

        for(char ch : s.toCharArray()){
            if(ch == 'b'){
               countB++;
            }else{
                if(countB>0){
                    countB--;
                    deletion++;
                }
            }        
        }
        return deletion;
    }
}
