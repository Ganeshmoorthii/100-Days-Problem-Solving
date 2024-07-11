import java.util.*;

class Problem1 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
	System.out.print("Enter a Number : ");
        int number = sc.nextInt();
	int count = 0;
        int res = singleDigit(number , count);
        System.out.println("Result: " + res);
    }

    public static int singleDigit(int num,int c) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            set.add(i);
        }
        int count=c;
        int val = 1;

        if (set.contains(num)) {
            return count;
        } else {
            while (num > 0) {
                int a = num % 10;
                val *= a;
                num = num / 10;
            }
	    count++;
            return singleDigit(val,count);
        }
    }
}
