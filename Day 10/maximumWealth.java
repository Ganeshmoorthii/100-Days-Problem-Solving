class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = Arrays.stream(accounts[0]).sum();
        for (int i = 1; i < accounts.length; i++) {
            int sum = Arrays.stream(accounts[i]).sum();
            if (max < sum) {
                max = sum;
            }
        }
        return max;
    }
}
