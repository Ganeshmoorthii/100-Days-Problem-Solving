/*

Example 1:

Input: barcodes = [1,1,1,2,2,2]
Output: [2,1,2,1,2,1]
Example 2:

Input: barcodes = [1,1,1,1,2,2,3,3]
Output: [1,3,1,3,1,2,1,2]

*/

class Solution {
    public int[] rearrangeBarcodes(int[] barcodes) {
        int n = barcodes.length;
        int[] result = new int[n];
        Map<Integer,Integer> map = new HashMap<>();
        for(int b: barcodes){
            map.put(b,map.getOrDefault(b,0)+1);
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        maxHeap.addAll(map.keySet());
        int index=0;
        while(maxHeap.size() > 0){
            int a = maxHeap.poll();
            result[index++] = a;
            if(maxHeap.size()==0){
                break;
            }
            int b = maxHeap.poll();
            result[index++]=b;
            modify(map,maxHeap,a);
            modify(map,maxHeap,b);
        }
        return result;
    }
    private void modify(Map<Integer,Integer> map, PriorityQueue<Integer> maxHeap,int m){
        if(map.get(m)==1){
            map.remove(m);
        }else{
            map.put(m,map.get(m)-1);
            maxHeap.offer(m);
        }
    }
}
