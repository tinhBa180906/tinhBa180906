class Solution {
    public boolean isValid(String s) {
         Stack stack = new Stack();
        for (char c : s.toCharArray()) {
            if (c == '('|| c == '{' || c == '['){
                stack.push(c);
            }
            else if(c == '}' || c == ']' || c == ')') {
                if (stack.isEmpty()) return false;
                else {
                    char c1 = (char)stack.pop();
                    if (!((c == '}' && c1 == '{' ||c == ']' && c1 == '[' || c == ')' && c1 == '(' )))
                        return false;
                }
            }
        }
        return stack.isEmpty();
    }
}