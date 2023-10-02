class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> queue = new LinkedList<>();
        int time_taken = 0;
        for(int i=0;i<tickets.length;i++){
            queue.add(i);
        }
        while(!queue.isEmpty()){
            if(tickets[k]==0){
                break;
            }

            if(tickets[queue.peek()]!=0){
                time_taken++;
                tickets[queue.peek()]--;
                queue.add(queue.remove());
            }
            else{
                queue.remove();
            }
        }
        return time_taken;
    }
}