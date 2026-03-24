class StockSpanner {
    // Stack stores pairs of [price, span]
    private Stack<int[]> stack;
    
    public StockSpanner() {
        stack = new Stack<>();
    }
    
    public int next(int price) {
        int span = 1;
        
        // Pop elements with price <= current price and accumulate their spans
        while (!stack.isEmpty() && stack.peek()[0] <= price) {
            span += stack.pop()[1];
        }
        
        // Push current price with its calculated span
        stack.push(new int[]{price, span});
        
        return span;
    }
}