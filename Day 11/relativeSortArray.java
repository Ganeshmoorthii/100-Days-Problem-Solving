class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] count = new int[1001];

        // Count the occurrences of each element in arr1
        for (int num : arr1) {
            count[num]++;
        }

        int index = 0;

        // Append the elements from arr2 in the order they appear
        for (int num : arr2) {
            while (count[num] > 0) {
                arr1[index++] = num;
                count[num]--;
            }
        }

        // Append the remaining elements in ascending order
        for (int i = 0; i < 1001; i++) {
            while (count[i] > 0) {
                arr1[index++] = i;
                count[i]--;
            }
        }

        return arr1;
    }
}
