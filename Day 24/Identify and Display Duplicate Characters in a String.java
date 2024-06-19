/*
Enter the String : programming
Duplicate characters in the string:
g
r
m
*/

import java.util.*;

class Duplicate{
   public static void main(String args[]){
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter the String : ");
       String string = sc.next();

       char[] ch = new char[256];

       for(char c : string.toCharArray()){
           ch[c]++;
       }
       System.out.println("Duplicate characters in the string:");

       for(int i= 0; i<ch.length;i++){
           if(ch[i]>1){
               System.out.println((char)i);            
	   }
       }
   }
}
