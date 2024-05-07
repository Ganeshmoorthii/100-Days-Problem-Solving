class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] leftSum = new int[n];
        int[] rightSum = new int[n];
        int[] answer = new int[n];

        // Step 1: Calculate leftSum and rightSum
        int left = 0, right = 0;
        for (int i = 0; i < n; i++) {
            left += nums[i];
            leftSum[i] = left;
            right += nums[n - 1 - i];
            rightSum[n - 1 - i] = right;
        }

        // Step 2: Calculate absolute differences
        for (int i = 0; i < n; i++) {
            answer[i] = Math.abs(leftSum[i] - rightSum[i]);
        }

        // Step 3: Return the answer
        return answer;
    }
}
