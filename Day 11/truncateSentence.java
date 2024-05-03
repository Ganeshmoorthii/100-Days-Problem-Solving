/*

Example 1:

Input: s = "Hello how are you Contestant", k = 4
Output: "Hello how are you"
Explanation:
The words in s are ["Hello", "how" "are", "you", "Contestant"].
The first 4 words are ["Hello", "how", "are", "you"].
Hence, you should return "Hello how are you".
Example 2:

Input: s = "What is the solution to this problem", k = 4
Output: "What is the solution"
Explanation:
The words in s are ["What", "is" "the", "solution", "to", "this", "problem"].
The first 4 words are ["What", "is", "the", "solution"].
Hence, you should return "What is the solution".

*/


class Solution {
    public String truncateSentence(String s, int k) {
        String[] words = s.split(" ");
        String res = words[0];
        for(int i=1;i<k;i++){
            res = res +" "+ words[i];
        }
        return res;
    }
}
