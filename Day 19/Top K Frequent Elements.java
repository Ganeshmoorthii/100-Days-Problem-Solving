/*

Example 1:

Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]
Example 2:

Input: nums = [1], k = 1
Output: [1]

*/

import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Step 1: Count the frequency of each element in nums
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!countMap.containsKey(nums[i]))
                countMap.put(nums[i], 0);
            countMap.put(nums[i], countMap.get(nums[i]) + 1);
        }

        // Step 2: Group elements by their frequency
        Map<Integer, List<Integer>> rc = new HashMap<>();
        for (int num : countMap.keySet()) {
            int count = countMap.get(num);
            if (!rc.containsKey(count))
                rc.put(count, new ArrayList<Integer>());
            rc.get(count).add(num);
        }

        // Step 3: Collect the top K frequent elements
        int result[] = new int[k];
        int index = 0;
        for (int pc = nums.length; pc >= 1; pc--) {
            if (rc.containsKey(pc)) {
                for (int n : rc.get(pc)) {
                    if (index < k)
                        result[index++] = n;
                    else
                        break;
                }
            }
            if (index >= k)
                break;
        }
        return result;
    }
}
