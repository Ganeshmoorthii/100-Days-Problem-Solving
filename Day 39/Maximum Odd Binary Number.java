import java.util.*;
class Solution {
    public String maximumOddBinaryNumber(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        reverseArray(arr); 
        int j = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '0') {
                j = i;
                break;
            }
        }
        if (j == -1) {
            return String.valueOf(arr);
        }
        char temp = arr[arr.length-1];
        arr[arr.length-1] = arr[j-1];
        arr[j-1] = temp;
        return String.valueOf(arr);
    }
    private void reverseArray(char[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
