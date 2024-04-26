import java.util.ArrayList;
import java.util.List;

class Solution {
    static int isPerfectNumber(long N) {
        List<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= N / 2; i++) {
            if (N % i == 0) {
                nums.add(i);
            }
        }
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (sum == N) {
            return 1;
        } else {
            return 0;
        }
    }
}
