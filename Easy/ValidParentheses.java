package Easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ValidParentheses {

    public static boolean isValid(String s) {
        boolean result = true;
        int fromIndex = 0;
        int toIndex = 0;

        List<String> brackets = new ArrayList<>(List.of(s.split("")));
        String[] pairs = {"()", "{}", "[]"};

        if (s.isEmpty() || s.length() % 2 != 0) {
            result = false;
        }

        for (String pair : pairs) {
            if (Collections.frequency(brackets, String.valueOf(pair.charAt(0)))
                    != Collections.frequency(brackets, String.valueOf(pair.charAt(1)))) {
                result = false;
                break;
            }
        }

        while (toIndex - 1 <= brackets.size()) {
                for (int i = fromIndex; i < brackets.size(); i++) {

                }


        }



        return result;
    }

    public static void main(String[] args) {
        System.out.println(isValid("()[]{}")); // true
        System.out.println(isValid("(]")); // false
        System.out.println(isValid("([]{})")); // true
        System.out.println(isValid("([{]})")); // false
    }
}
// "({[) }]{[)}]{[)}]{[)}"


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
