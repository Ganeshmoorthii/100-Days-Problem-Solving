/*
Example 1:

Input: k = 2, w = 0, profits = [1,2,3], capital = [0,1,1]
Output: 4
Explanation: Since your initial capital is 0, you can only start the project indexed 0.
After finishing it you will obtain profit 1 and your capital becomes 1.
With capital 1, you can either start the project indexed 1 or the project indexed 2.
Since you can choose at most 2 projects, you need to finish the project indexed 2 to get the maximum capital.
Therefore, output the final maximized capital, which is 0 + 1 + 3 = 4.
*/

class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int n = profits.length;
        int[][] projects = new int[n][2];

        for (int i = 0; i < n; i++) {
            projects[i][0] = profits[i];
            projects[i][1] = capital[i]; // Fixed typo: should be projects[i][1]
        }
        
        Arrays.sort(projects, (a, b) -> a[1] - b[1]);
        
        int i = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        while (k > 0) {
            while (i < capital.length && projects[i][1] <= w) {
                pq.add(projects[i][0]);
                i++;
            }
            
            if (pq.isEmpty()) {
                break;
            }
            
            int front = pq.poll();
            w += front;
            k--;
        }
        
        return w;
    }
}
