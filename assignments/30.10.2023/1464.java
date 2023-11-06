class Solution {
     public int maxProduct(int[] nums) {
        PriorityQueue<Integer> heap = new PriorityQueue<>((a,b)->b-a);
        for (int i = 0; i < nums.length; i++) {
            heap.add(nums[i]-1); 
        }
        return (heap.remove())*(heap.remove());
    }
}