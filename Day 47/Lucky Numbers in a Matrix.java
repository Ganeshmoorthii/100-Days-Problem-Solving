class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int m = matrix.length,n = matrix[0].length;
        int[] mi = new int[m], mx = new int[n];
        Arrays.fill(mi,Integer.MAX_VALUE);
        for(int i=0;i<m;++i){
            for(int j=0;j<n;++j){
                mi[i] = Math.min(matrix[i][j], mi[i]);
                mx[j] = Math.max(matrix[i][j],mx[j]);
            }
        }
        for(int i=0;i<m;++i){
            for(int j=0;j<n;++j){
                if(mi[i]==mx[j]){
                    res.add(mi[i]);
                    break;
                }
            }
        }
        return res;
    }
}
