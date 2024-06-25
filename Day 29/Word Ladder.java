/*
Example 1:
Input: beginWord = "hit", endWord = "cog", wordList = ["hot","dot","dog","lot","log","cog"]
Output: 5
Explanation: One shortest transformation sequence is "hit" -> "hot" -> "dot" -> "dog" -> cog", which is 5 words long.

Example 2:
Input: beginWord = "hit", endWord = "cog", wordList = ["hot","dot","dog","lot","log"]
Output: 0
Explanation: The endWord "cog" is not in wordList, therefore there is no valid transformation sequence.
*/
class Pair{
    String str;
    int count;
    Pair(String str,int count){
        this.str = str;
        this.count = count;
    }
}

class Solution {    
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<Pair> q = new LinkedList<>();
        Set<String> set = new HashSet<>();

        q.offer(new Pair(beginWord,1));

        for(String s:wordList){
            set.add(s);
        }
        set.remove(beginWord);

        while(!q.isEmpty()){
            String currStr = q.peek().str;
            int currCount = q.peek().count;
            q.poll();
            int len = currStr.length();
            if(currStr.equals(endWord))
                return currCount;
            for(int i=0;i<len;i++){
                for(char ch='a';ch<='z';ch++){
                    String temp = currStr.substring(0,i) + ch +currStr.substring(i+1);
                    if(set.contains(temp)){
                        set.remove(temp);
                        q.offer(new Pair(temp,currCount+1));
                    }
                }
            }
        }
        return 0;
    }
}
