class Solution {
    public String firstPalindrome(String[] words) {
        String palindrome = "";
        for (String word : words) {
            if (isPalindrome(word)) {
                palindrome = word;
                break; // Found the first palindrome, no need to continue searching
            }
        }
        return palindrome;
    }

    private boolean isPalindrome(String word) {
        int start = 0;
        int end = word.length() - 1;
        while (start < end) {
            if (word.charAt(start) != word.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
