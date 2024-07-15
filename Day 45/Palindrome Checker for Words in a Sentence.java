import java.util.*;

class Sample1 {
    public static void main(String args[]) {
        String s = "   The Ramar is Good  Boy";
        List<String> arr = new ArrayList<>();
        StringBuilder temp = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                temp.append(s.charAt(i));
            } else {
                if (temp.length() > 0) {
                    arr.add(temp.toString());
                    temp = new StringBuilder();
                }
            }
        }
        
        if (temp.length() > 0) {
            arr.add(temp.toString());
        }

        for (String word : arr) {
            if (word.equals(" ")) continue;
            if (isPalindrome(word)) {
                System.out.println(word + " is Palindrome.");
            } else {
                System.out.println(word + " is not Palindrome.");
            }
        }
    }

    public static boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            if (Character.toLowerCase(s.charAt(l)) == Character.toLowerCase(s.charAt(r))) {
                l++;
                r--;
            } else {
                return false;
            }
        }
        return true;
    }
}
