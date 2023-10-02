class MyCircularQueue {
    private int[] queue;
    private int front;
    private int end;
    private int size;

    public MyCircularQueue(int k) {
        queue = new int[k];
        front = 0;
        end = -1;
        size  = 0;
    }
    
    public boolean enQueue(int value) {
        if(size==queue.length) return false;
        end++;
        queue[end%queue.length] = value;
        end = end%queue.length;
        size++;
        return true;
    }
    
    public boolean deQueue() {
        if(size==0) return false;
        front++;
        front = front%queue.length;
        size--;
        return true;
    }
    
    public int Front() {
        if(size==0) return -1;
        return queue[front];
    }
    
    public int Rear() {
        if(size==0) return -1;
        return queue[end];
    }
    
    public boolean isEmpty() {
        return size==0;
    }
    
    public boolean isFull() {
        return size==queue.length;
    }
}