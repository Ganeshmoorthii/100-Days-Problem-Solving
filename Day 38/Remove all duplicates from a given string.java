/*
Input:
str = "geEksforGEeks"
Output: 
"geEksforG"
Explanation: 
After removing duplicate characters such as E, e, k, s, we have string as "geEksforG".
*/

class Solution {
    String removeDuplicates(String str) {
        Set<Character> set = new LinkedHashSet<>();
        for(char n:str.toCharArray()){
            set.add(n);
        }
        StringBuilder sb = new StringBuilder();
        for(char n: set){
            sb.append(n);
        }
        return sb.toString();
    }
}
