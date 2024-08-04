class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int size = n * (n + 1) / 2;
        long[] newArr = new long[size];
        int k = 0;
        
        for (int j = 0; j < n; j++) {
            long sum = 0;
            for (int i = j; i < n; i++) {
                sum += nums[i];
                newArr[k++] = sum;
            }
        }
        
        Arrays.sort(newArr);
        
        long res = 0;
        int mod = 1_000_000_007;
        for (int i = left - 1; i < right; i++) {
            res = (res + newArr[i]) % mod;
        }
        
        return (int) res;
    }
}
