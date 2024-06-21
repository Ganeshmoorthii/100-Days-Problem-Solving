class Solution {
    public int getPairsCount(int[] arr, int n, int k) {
        // HashMap to store frequency of each element
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int count = 0;
        
        // Traverse the array
        for (int i = 0; i < n; i++) {
            int complement = k - arr[i];
            
            // Check if complement exists in the map
            if (map.containsKey(complement)) {
                count += map.get(complement);
            }
            
            // Increment the count of current element in the map
            // If not present, put 1, otherwise increment the count
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        
        return count;
    }
}
