class Solution {
    public int maximumGain(String s, int x, int y) {
        if (x < y) {
            return maximumGainHelper(s, y, x, 'b', 'a');
        } else {
            return maximumGainHelper(s, x, y, 'a', 'b');
        }
    }

    private int maximumGainHelper(String s, int maxPoints, int minPoints, char firstChar, char secondChar) {
        Stack<Character> stack = new Stack<>();
        int totalPoints = 0;

        // First pass: Remove the more rewarding pair
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == firstChar && c == secondChar) {
                stack.pop();
                totalPoints += maxPoints;
            } else {
                stack.push(c);
            }
        }

        // Second pass: Remove the remaining less rewarding pair
        Stack<Character> remainingStack = new Stack<>();
        while (!stack.isEmpty()) {
            char c = stack.pop();
            if (!remainingStack.isEmpty() && remainingStack.peek() == firstChar && c == secondChar) {
                remainingStack.pop();
                totalPoints += minPoints;
            } else {
                remainingStack.push(c);
            }
        }

        return totalPoints;
    }
}
