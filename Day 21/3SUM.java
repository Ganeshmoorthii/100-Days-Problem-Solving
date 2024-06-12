/*

Example 1:

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation: 
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.
Example 2:

Input: nums = [0,1,1]
Output: []
Explanation: The only possible triplet does not sum up to 0.
Example 3:

Input: nums = [0,0,0]
Output: [[0,0,0]]
Explanation: The only possible triplet sums up to 0.

*/

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Map<Integer,Integer> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        if(nums == null || nums.length == 0){
            return result;
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int currsum = nums[i] + nums[j];
                if(map.containsKey(-1*currsum)){
                    int k = map.get(-1*currsum);
                    if(!set.contains(nums[i]+":"+nums[j]+":"+nums[k]) && k>i && k>j){
                        result.add(Arrays.asList(nums[i],nums[j],nums[k]));
                        set.add(nums[i]+":"+nums[j]+":"+nums[k]);
                    }
                }
            }
        }
        return result;
    }
}
