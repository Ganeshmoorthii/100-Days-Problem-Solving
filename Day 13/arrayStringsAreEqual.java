/*

Example 1:

Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
Output: true
Explanation:
word1 represents string "ab" + "c" -> "abc"
word2 represents string "a" + "bc" -> "abc"
The strings are the same, so return true.
Example 2:

Input: word1 = ["a", "cb"], word2 = ["ab", "c"]
Output: false

*/

class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        
        StringBuilder str1 = new StringBuilder("");
        for(String word : word1){
          str1.append(word);
        }

         StringBuilder str2 = new StringBuilder("");
         for(String word : word2){
          str2.append(word);
        }
        
        if(str1.toString().equals(str2.toString())){
            return true;
        }
 
        return false;
    }
}
