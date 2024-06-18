/*
Example 1:

Input: difficulty = [2,4,6,8,10], profit = [10,20,30,40,50], worker = [4,5,6,7]
Output: 100
Explanation: Workers are assigned jobs of difficulty [4,4,6,6] and they get a profit of [20,20,30,30] separately.
Example 2:

Input: difficulty = [85,47,57], profit = [24,66,99], worker = [40,25,25]
Output: 0
 
*/

class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int maxDifficulty = 0;
        for (int d : difficulty) {
            maxDifficulty = Math.max(maxDifficulty, d);
        }

        int[] maxProfitUpToDifficulty = new int[maxDifficulty + 1];
        for (int i = 0; i < difficulty.length; i++) {
            maxProfitUpToDifficulty[difficulty[i]] = Math.max(maxProfitUpToDifficulty[difficulty[i]], profit[i]);
        }

        for (int i = 1; i <= maxDifficulty; i++) {
            maxProfitUpToDifficulty[i] = Math.max(maxProfitUpToDifficulty[i], maxProfitUpToDifficulty[i - 1]);
        }

        int totalProfit = 0;
        for (int ability : worker) {
            if (ability > maxDifficulty) {
                totalProfit += maxProfitUpToDifficulty[maxDifficulty];
            } else {
                totalProfit += maxProfitUpToDifficulty[ability];
            }
        }

        return totalProfit;
    }

}
