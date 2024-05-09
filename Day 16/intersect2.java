/*

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
Explanation: [9,4] is also accepted.

*/

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
       int map[]=new int[1001];
       int res[]=new int[1001];
       int count=0;
       for(int i:nums1)
        map[i]++;
        for(int i:nums2){
            if(map[i]>0){
                res[count++]=i;
                map[i]--;
            }
        } 
        return Arrays.copyOfRange(res,0,count);
    }
}
