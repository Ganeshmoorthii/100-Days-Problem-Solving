class Solution {
    public int[] frequencySort(int[] nums) {
        int[] result = new int[nums.length];
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i : nums) {
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(hm.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>(){
           public int compare(Map.Entry<Integer,Integer> e1, Map.Entry<Integer,Integer> e2) {
               if (e1.getValue() == e2.getValue())
                   return e2.getKey() - e1.getKey();
               else 
                   return e1.getValue() - e2.getValue();
           } 
        });
        
        int i = 0;
        for (Map.Entry<Integer, Integer> k : list) {
            int val = k.getValue();
            while(val > 0) {
                result[i] = k.getKey();
                i++;
                val--;
            }
        }
        return result;
    }
}
