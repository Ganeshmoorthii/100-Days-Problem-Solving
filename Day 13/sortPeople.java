class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
         int n = names.length;
        TreeMap<Integer,String> map = new TreeMap<>();
        for(int i = 0; i<n;i++){
            map.put(heights[i],names[i]);
        }
        int i=0;
        for(String val : map.values()){
            names[n-1-i++] = val;    
        }
        return names;
    }
}
