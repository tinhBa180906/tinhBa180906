class Solution {
    public int maxDepth(String s) {
       Stack stack = new Stack();

        int maxDepth = 0;
        int currentDepth = 0;
        for (int i = 0; i < s.length(); i++) {
            if (stack.isEmpty()) {
                currentDepth = 0;
            }
            //check if character at i is (
            if (s.charAt(i) == '(') {
                stack.push(s.charAt(i));
                currentDepth++;
            } else if (s.charAt(i) == ')') {
                stack.pop();
                if (currentDepth > maxDepth) {
                    maxDepth = currentDepth;
                }
                currentDepth--;
            }
        }
        return maxDepth;
    }
}