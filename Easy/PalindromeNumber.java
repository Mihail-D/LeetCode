package Easy;

import java.util.ArrayList;
import java.util.Collections;

public class PalindromeNumber {

    public static boolean isPalindrome(int x) {
        boolean result;
        ArrayList<Integer> digits = new ArrayList<>();

        while (x > 0) {
            digits.add(0, x % 10);
            x = x / 10;
        }

        int sum = digits.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
        Collections.reverse(digits);
        int sum1 = digits.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum1);

        if (x < 0) {
            result = false;
        }
        else {
            result = sum == sum1;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(10));
    }
}

// https://leetcode.com/problems/palindrome-number
