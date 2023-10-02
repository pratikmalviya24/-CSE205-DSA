class MyStack {
    Queue<Integer> queue;
    public MyStack() {
        queue = new LinkedList<>();
    }
    
    public void push(int x) {
        queue.add(x);
    }
    
    public int pop() {
        int size = queue.size();
        while(size-->1){
            queue.add(queue.remove());
        }
        return queue.remove();
    }
    
    public int top() {
        int size = queue.size();
        while(size-->1){
            queue.add(queue.remove());
        }
        int remove = queue.remove();
        queue.add(remove);
        return remove;
    }
    
    public boolean empty() {
        return queue.isEmpty();
    }
}