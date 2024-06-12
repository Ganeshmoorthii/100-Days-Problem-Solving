/*
Example 1:

Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
Example 2:

Input: numRows = 1
Output: [[1]]
*/

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal = new ArrayList<>();

        for(int i=0;i<numRows;i++){
            List<Integer> row = new ArrayList<>();
            for(int j=0;j<i+1;j++){
                if(j==0||j==i){
                    row.add(1);
                }else{
                    List<Integer> prevRow = pascal.get(i-1);
                    row.add(prevRow.get(j)+prevRow.get(j-1));
                }
            }
            pascal.add(row);
        }
        return pascal;
    }
}
