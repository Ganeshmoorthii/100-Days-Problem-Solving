class Solution 
{
    static Pair getMinMax(long a[], long n) 
    {
        long mn = Long.MAX_VALUE, mx = Long.MIN_VALUE;

        // Iterating over the array
        for (int i = 0; i < n; i++) {

            // Updating the minimum value
            mn = Math.min(a[i], mn);

            // Updating the maximum value
            mx = Math.max(a[i], mx);
        }

        // Returning the minimum and maximum values as a pair
        return new Pair(mn, mx);
    }
}
