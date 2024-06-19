class Solution {
    public int maximumCount(int[] nums) {
        int countNegatives = 0;
        int countPositives = 0;
        
        for (int num : nums) {
            if (num < 0) {
                countNegatives++;
            } else if (num > 0) {
                countPositives++;
            }
        }
        
        return Math.max(countNegatives, countPositives);
    }
}
