/*

Input: Enter the String: programming
Output: Duplicate characters in the string:
r: 2 times
g: 2 times
m: 2 times

Example 2:
Input: Enter the String: hello
Output: Duplicate characters in the string:
l: 2 times

*/

import java.util.Scanner;

class Duplicate {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String: ");
        String string = sc.next();

        // Array to count occurrences of each character
        int[] charCount = new int[256];

        // Increment the count for each character in the string
        for (char c : string.toCharArray()) {
            charCount[c]++;
        }

        System.out.println("Duplicate characters in the string:");

        // Print characters that appear more than once
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > 1) {
                System.out.println((char) i + ": " + charCount[i] + " times");
            }
        }
    }
}
