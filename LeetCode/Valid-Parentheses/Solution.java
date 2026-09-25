1class Solution {
2    public boolean isValid(String s) {
3        Stack<Character> stack = new Stack<>();
4        for (char c : s.toCharArray()) {
5
6            if (c == '(' || c == '{' || c == '[') {
7                stack.push(c);
8            }
9            else {
10                if (stack.isEmpty()) {
11                    return false;
12                }
13                char top = stack.pop();
14                if (c == ')' && top != '(' ||
15                    c == '}' && top != '{' ||
16                    c == ']' && top != '[') {
17                    return false;
18                }
19            }
20        }
21        return stack.isEmpty();
22        
23    }
24}