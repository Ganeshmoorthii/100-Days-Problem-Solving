/*

Example 1:

Input: 
N = 5
arr[]= {0 2 1 2 0}
Output:
0 0 1 2 2
Explanation:
0s 1s and 2s are segregated 
into ascending order.
Example 2:

Input: 
N = 3
arr[] = {0 1 0}
Output:
0 0 1
Explanation:
0s 1s and 2s are segregated 
into ascending order.

*/


class Solution
{
    // Function to sort an array of 0s, 1s, and 2s in-place
    public static void sort012(int a[], int n){
        // Initialize low, mid, and high pointers
        int low = 0, high = n-1, mid = 0;
        
        // Iterate until mid pointer is less than or equal to high pointer
        while(mid <= high){
            // If element at mid pointer is 0
            if(a[mid]==0) {
                // Swap element at low pointer with element at mid pointer
                int temp=a[low];
                a[low]=a[mid];
                a[mid]=temp;
                // Increment low and mid pointers
                low++;
                mid++;
            }
            // If element at mid pointer is 1
            else if(a[mid]==1) {
                // Increment mid pointer
                mid++;
            } 
            // If element at mid pointer is 2
            else {
                // Swap element at mid pointer with element at high pointer
                int temp=a[mid];
                a[mid]=a[high];
                a[high]=temp;
                // Decrement high pointer
                high--;
            }
        }
    }
}
