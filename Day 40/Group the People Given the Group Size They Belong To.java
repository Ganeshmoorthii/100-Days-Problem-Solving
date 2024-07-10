class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer,List<Integer>> map = new HashMap();
        List<List<Integer>> res = new ArrayList();
        for(int i = 0;i<groupSizes.length;i++){
            int person = i;
            int groupSize = groupSizes[i];
            List<Integer> lst = map.getOrDefault(groupSize,new ArrayList());
            lst.add(person);
            map.put(groupSize,lst);
            if(lst.size()==groupSize){
                res.add(lst);
                map.remove(groupSize);
            }
        }
        return res;
    }
}
