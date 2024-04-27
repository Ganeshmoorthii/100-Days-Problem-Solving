//User function Template for Java
class Solution {
    static int evenlyDivides(int N) {
        List<Integer> nums = new ArrayList<>();
        int c = 0;
        int a = N;
        while (N != 0) {
            nums.add(N % 10);
            N = N / 10;
        }
        for (int i : nums) {
            if (i != 0) {
                if (a % i == 0) {
                    c++;
                }
            }
        }
        return c;
    }
}
