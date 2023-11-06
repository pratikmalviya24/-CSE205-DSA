class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans = new int[k];
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int item : nums) hm.put(item,hm.getOrDefault(item,0)+1);
        PriorityQueue<Integer> heap = new PriorityQueue<>((a,b)->hm.get(b)-hm.get(a));
        for (int item : hm.keySet()) {
            heap.add(item);
        }
        int i = 0;
        while(k-->0){
            ans[i++] = heap.remove();
        }
        return ans;
    }
}