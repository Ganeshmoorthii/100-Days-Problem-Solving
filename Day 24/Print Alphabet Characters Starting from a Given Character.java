/*
Enter the Character (A-Z): D
Result is : DEFGHIJKLMNOPQRSTUVWXYZ
*/

import java.util.Scanner;

class PrintChar {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Character (A-Z): ");
        char ch = sc.next().charAt(0);
        int codeVal = (int) ch; 

        StringBuilder sb = new StringBuilder();

        for (int i = codeVal; i <= 90; i++) { 
            sb.append((char) i); 	
        }
        System.out.println("Result is : " + sb.toString());
    }
}
