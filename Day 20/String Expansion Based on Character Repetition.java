/*

Example 1:
Input: a2b3
Output: aabbb

Example 2:
Input: x5y1z2
Output: xxxxxyz

Example 3:
Input: a10b2
Output: aaaaaaaaaabb

*/

import java.util.*;
public class ExpandString {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the input : ");
        String input = sc.next();
        StringBuilder result = new StringBuilder();

        char currentLetter = '\0';
        int number = 0;
        boolean isDigit = false;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isLetter(ch)) {
                if (isDigit) {
                    for (int j = 0; j < number; j++) {
                        result.append(currentLetter);
                    }
                    isDigit = false; 
                    number = 0;
                }
                currentLetter = ch; 
            } else if (Character.isDigit(ch)) {
                number = number * 10 + (ch - '0');
                isDigit = true;
            }
        }

        for (int j = 0; j < number; j++) {
            result.append(currentLetter);
        }

        System.out.println("Output: " + result.toString());
    }
}
