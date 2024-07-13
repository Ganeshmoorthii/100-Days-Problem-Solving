/*
Example 1:
Input: s = "abc", t = "bac"
Output: 2
Explanation:
For s = "abc" and t = "bac", the permutation difference of s and t is equal to the sum of:
The absolute difference between the index of the occurrence of "a" in s and the index of the occurrence of "a" in t.
The absolute difference between the index of the occurrence of "b" in s and the index of the occurrence of "b" in t.
The absolute difference between the index of the occurrence of "c" in s and the index of the occurrence of "c" in t.
That is, the permutation difference between s and t is equal to |0 - 1| + |2 - 2| + |1 - 0| = 2.

Example 2:
Input: s = "abcde", t = "edbac"
Output: 12
Explanation: The permutation difference between s and t is equal to |0 - 3| + |1 - 2| + |2 - 4| + |3 - 1| + |4 - 0| = 12.
*/

class Solution {
    public int findPermutationDifference(String s, String t) {
        int res =0;
        char[] c=s.toCharArray();
        for(char a : c){
            res += Math.abs(s.indexOf(a) - t.indexOf(a));
        }
        return res;
    }
}
