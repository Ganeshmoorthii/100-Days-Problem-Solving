public class SumOfOddLengthSubarrays {
    
    public int sumOddLengthSubarrays(int[] arr) {
        int totalSum = 0;
        int n = arr.length;
        
        for (int i = 0; i < n; i++) {
            // Calculate the number of subarrays that include arr[i]
            // from start to i, there are (i + 1) choices
            // from i to end, there are (n - i) choices
            int startCount = i + 1;
            int endCount = n - i;
            
            // The total number of subarrays that include arr[i]
            int totalSubarrays = startCount * endCount;
            
            // Only half of these subarrays will be of odd length
            // If totalSubarrays is odd, the extra one will be odd-length
            int oddSubarrays = (totalSubarrays + 1) / 2;
            
            // Contribution of arr[i] to the final sum
            totalSum += arr[i] * oddSubarrays;
        }
        
        return totalSum;
    }

    public static void main(String[] args) {
        SumOfOddLengthSubarrays solution = new SumOfOddLengthSubarrays();
        
        int[] arr1 = {1, 4, 2, 5, 3};
        System.out.println(solution.sumOddLengthSubarrays(arr1)); // Output: 58
        
        int[] arr2 = {1, 2};
        System.out.println(solution.sumOddLengthSubarrays(arr2)); // Output: 3
        
        int[] arr3 = {10, 11, 12};
        System.out.println(solution.sumOddLengthSubarrays(arr3)); // Output: 66
    }
}
