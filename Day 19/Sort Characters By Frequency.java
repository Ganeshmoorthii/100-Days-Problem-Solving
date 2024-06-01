/*

Example 1:

Input: s = "tree"
Output: "eert"
Explanation: 'e' appears twice while 'r' and 't' both appear once.
So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.
Example 2:

Input: s = "cccaaa"
Output: "aaaccc"
Explanation: Both 'c' and 'a' appear three times, so both "cccaaa" and "aaaccc" are valid answers.
Note that "cacaca" is incorrect, as the same characters must be together.
Example 3:

Input: s = "Aabb"
Output: "bbAa"
Explanation: "bbaA" is also a valid answer, but "Aabb" is incorrect.
Note that 'A' and 'a' are treated as two different characters.

*/

class Solution {
    public String frequencySort(String s) {
        Map<Character , Integer> map = new HashMap<>();
        PriorityQueue<Character> pq = new PriorityQueue<>((x,y)->map.get(y)-map.get(x));

        for(char c:s.toCharArray()){
            map.put(c,(map.getOrDefault(c,0))+1);
        }

        for(char c: map.keySet()){
            pq.offer(c);
        }

        StringBuilder sb = new StringBuilder();
        while(!pq.isEmpty()){
            char ch = pq.poll();
            for(int i=0; i<map.get(ch);i++){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
