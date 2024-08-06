class Solution {
    public int minimumPushes(String word) {
        // Step 1: Count frequency of each letter
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char ch : word.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }
        
        // Step 2: Sort letters by frequency in descending order
        List<Integer> frequencies = new ArrayList<>(frequencyMap.values());
        Collections.sort(frequencies, Collections.reverseOrder());
        
        // Step 3: Assign letters to keys (minimize key presses)
        int res = 0;
        for (int i = 0; i < frequencies.size(); i++) {
            res += frequencies.get(i) * (i / 8 + 1);
        }
        
        return res;
    }
}
