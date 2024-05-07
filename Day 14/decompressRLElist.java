class Solution {
    public int[] decompressRLElist(int[] nums) {
        // Calculate the length of the decompressed array
        int length = 0;
        for (int i = 0; i < nums.length; i += 2) {
            length += nums[i];
        }
        
        // Create the decompressed array
        int[] result = new int[length];
        
        // Fill the decompressed array
        int index = 0;
        for (int i = 0; i < nums.length; i += 2) {
            int freq = nums[i];
            int value = nums[i + 1];
            // Fill the array directly without nested loops
            Arrays.fill(result, index, index + freq, value);
            index += freq;
        }
        
        return result;
    }
}
