class Solution {
    public int minAddToMakeValid(String s) {
        if(s == "" || s == null){
            return 0;
        }
        Stack<Character> stack = new Stack<>();
        int imbalanceCount = 0;
        for(char ch: s.toCharArray()){
            if(ch == '('){
                stack.push(ch);
            }else{
                if(!stack.isEmpty() && ch==')'){
                    stack.pop();
                }else{
                    imbalanceCount++;
                }
            }
        }
        if(!stack.isEmpty()){
            return stack.size() + imbalanceCount;
        }else{
            return imbalanceCount;
        }
    }
}
