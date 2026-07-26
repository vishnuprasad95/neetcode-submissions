class MinStack {
    private Deque<Integer> stack;
    private Deque<Integer> minstack;

    private int min1= Integer.MAX_VALUE;
    public MinStack() {
        this.stack= new ArrayDeque<>();
        this.minstack= new ArrayDeque<>();
    }
    
    public void push(int val) {
        this.stack.push(val);
        if(minstack.isEmpty())
        this.minstack.push(val);
        else if(val<=minstack.peek())
        this.minstack.push(val);
        else  this.minstack.push( this.minstack.peek());
    }
    
    public void pop() {
       this.stack.pop(); 
       this.minstack.pop();
    }
    
    public int top() {
      return this.stack.peek();
    }
    
    public int getMin() {
       return this.minstack.peek(); 
    }
}
