class Solution {
    public String[] findRelativeRanks(int[] score) {
        String[] ans = new String[score.length];
        HashMap<Integer,Integer> hm  = new HashMap<>();
        PriorityQueue<Integer> heap = new PriorityQueue<>((a,b)-> b-a);
        for (int i = 0; i < ans.length; i++) {
            hm.put(score[i], i);
            heap.add(score[i]);
        }
        String[] rank = {"Gold Medal","Silver Medal","Bronze Medal"};
        int level = 0;
        while(!heap.isEmpty()){
            int key = heap.remove();
            if(level<3){
                ans[hm.get(key)] = rank[level];
            }
            else{
                ans[hm.get(key)] = level+1+"";
            }
            level++;
        }
        return ans;
    }
}