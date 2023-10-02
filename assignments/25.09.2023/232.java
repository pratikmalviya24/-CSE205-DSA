class MyQueue {
    Stack<Integer> stack;
    public MyQueue() {
        stack = new Stack<>();
    }
    
    public void push(int x) {
        stack.push(x);
    }
    private int itemAtBottom(Stack<Integer> st,boolean b){
        if(st.size()==1){
            if(b){
                return st.pop();
            }
            return st.peek();
        }
        int top = st.pop();
        int ans = itemAtBottom(st,b);
        st.push(top);
        return ans;
    }
    public int pop() {
        return itemAtBottom(stack,true);
    }
    
    public int peek() {
        return itemAtBottom(stack,false);
    }
    
    public boolean empty() {
        return stack.isEmpty();
    }
}