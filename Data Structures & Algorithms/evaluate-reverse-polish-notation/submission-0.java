class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (String a : tokens) {
            if (a.equals("+") || a.equals("-") || a.equals("*") || a.equals("/")) {
                if (!stack.isEmpty()) {
                    int left = stack.pop();
                    int right = stack.pop();
                    stack.push(Op(right,left,a));
                }
            }
            else
            {
                int num= Integer.parseInt(a);
                stack.push(num);
            }
        }
        return stack.pop();
    }
    public int Op(int right, int left, String c) {
        if (c.equals("+"))
            return right + left;
        else if (c.equals("-"))
            return right - left;
        else if (c.equals("/"))
            return right / left;
        else
            return right * left;
    }
}
