/*
Input: position = [1,2,3,4,7], m = 3
Output: 3
Explanation: Distributing the 3 balls into baskets 1, 4 and 7 will make the magnetic force between ball pairs [3, 3, 6]. The minimum magnetic force is 3. We cannot achieve a larger minimum magnetic force than 3.
Example 2:

Input: position = [5,4,3,2,1,1000000000], m = 2
Output: 999999999
Explanation: We can use baskets 1 and 1000000000.
*/

class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int lo = 1;
        int hi = position[position.length-1];
        int ans = 1;
        while(lo<=hi)
        {
            int mid = lo+(hi-lo)/2;
            if(canWePlace(position, mid, m))
            {
                ans = mid;
                lo=mid+1;
            }
            else
            {
                hi = mid-1;
            }
        }
        return ans;
    }
    private boolean canWePlace(int[] arr, int dist, int cows)
    {
        int cntCows=1;
        int last = arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]-last>=dist)
            {
                cntCows++;
                last = arr[i];
            }
            if(cntCows>=cows)
            {
                return true;
            }
        }
        return false;
    }
}
