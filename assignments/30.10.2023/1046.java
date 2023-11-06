class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> heap = new PriorityQueue<>((a,b)->b-a);
        for (int item : stones) {
            heap.add(item);
        }

        while(!heap.isEmpty() && heap.size()!=1){
            int x = heap.remove();
            int y = heap.remove();
            if(x!=y){
                heap.add(Math.abs(y-x));
            }
        }
        if(heap.isEmpty()) return 0;
        return heap.remove();
    }
}