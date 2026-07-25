class Solution {
    public boolean isValid(String s) {
        char[] myArray = s.toCharArray();
        Deque<Character> stack = new ArrayDeque<>();
        for (char a : myArray) {
            if (a == '{' || a == '(' || a == '[')
                stack.push(a);
            else if(!stack.isEmpty() && (a == '}' && (stack.peek() == '{') || (a == ')' && stack.peek() == '(') ||(a == ']' && stack.peek() == '[') ))
                stack.pop();
            else return false;
        } 
        return stack.isEmpty();
    }
}
