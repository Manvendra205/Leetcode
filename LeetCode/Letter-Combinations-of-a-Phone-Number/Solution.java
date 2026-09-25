1import java.util.*;
2
3class Solution {
4    public List<String> letterCombinations(String digits) {
5
6        List<String> result = new ArrayList<>();
7
8        if (digits.length() == 0) {
9            return result;
10        }
11
12        String[] phone = {
13            "", "", "abc", "def", "ghi",
14            "jkl", "mno", "pqrs", "tuv", "wxyz"
15        };
16
17        backtrack(digits, 0, "", result, phone);
18
19        return result;
20    }
21
22    public void backtrack(String digits, int index, String current,
23                           List<String> result, String[] phone) {
24        if (index == digits.length()) {
25            result.add(current);
26            return;
27        }
28        String letters = phone[digits.charAt(index) - '0'];
29
30        for (char ch : letters.toCharArray()) {
31            backtrack(
32                digits,
33                index + 1,
34                current + ch,
35                result,
36                phone
37            );
38        }
39    }
40}