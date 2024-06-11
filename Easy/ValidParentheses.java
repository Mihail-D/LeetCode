package Easy;

import java.util.*;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> mappings = new HashMap<>();
        mappings.put(')', '(');
        mappings.put('}', '{');
        mappings.put(']', '[');

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (mappings.containsKey(c)) {
                char topElement = stack.empty() ? '#' : stack.pop();

                if (topElement != mappings.get(c)) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("()[]{}")); // true
        System.out.println(isValid("(]")); // false
        System.out.println(isValid("([]{})")); // true
        System.out.println(isValid("([{]})")); // false
    }
}


// {}()[]
// ({[({[[({[]})]]})]}) [({[]})]


/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:
Открытые скобки должны закрываться скобками того же типа.
Открытые скобки должны закрываться в правильном порядке.
Каждой закрывающей скобке соответствует открытая скобка того же типа.

        Example 1:
        Input: s = "()"
        Output: true

        Example 2:
        Input: s = "()[]{}"
        Output: true

        Example 3:
        Input: s = "(]"
        Output: false

        Constraints:
        1 <= s.length <= 104
        s consists of parentheses only '()[]{}'.
        */
