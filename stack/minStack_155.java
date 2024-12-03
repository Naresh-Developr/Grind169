class MinStack {
    int size = 10000;
    int[] arr  = new int[size];
    Stack<Integer> min = new Stack<>();
    int top = -1;
    public MinStack() {
        
    }
    
    public void push(int val) {
        top++;
        arr[top] = val;

        if(min.isEmpty() || val<=min.peek()){
            min.push(val);
        }
    }
    
    public void pop() {
        if(top==-1){
            return;
        }
        if(min.peek() == arr[top]){
            min.pop();
        }
        arr[top] = 0;
        top--;
    }
    
    public int top() {
        return arr[top];
    }
    
    public int getMin() {
        if(min.isEmpty()){
            return 0;
        }
        return min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */