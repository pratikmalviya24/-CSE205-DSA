class KthLargest {
    private PriorityQueue<Integer> heap;
    private int k;
    public KthLargest(int k, int[] nums) {
        heap = new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            if(heap.size()<k){
                heap.add(nums[i]);
            }
            else{
                if(nums[i]>heap.peek()){
                    heap.poll();
                    heap.add(nums[i]);
                }
            }
        }
        this.k = k;
    }
    public int add(int val) {
        if(heap.size()<k){
            heap.add(val);
        }
        else if(val>heap.peek()){
            heap.poll();
            heap.add(val);
        }
        return heap.peek();
    }
}