class MyStack {
     Queue<Integer> qew;
    public MyStack() {
       qew = new LinkedList<>();
    }
    
    public void push(int x) {
        qew.add(x);
        for (int i = 0; i < qew.size() - 1; i++) {
    qew.add(qew.remove());
}
    }
    
    public int pop() {
       return qew.remove();
    }
    
    public int top() {
        return qew.element();
    }
    
    public boolean empty() {
        return qew.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */