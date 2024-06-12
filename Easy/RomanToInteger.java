package Easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class RomanToInteger {

    public static int romanToInt(String s) {
        int result = 0;
        String[] arr = s.split("");

        List<String> splittedStr = new ArrayList<>();

        Map<String, Integer> numbersMap = Map.ofEntries(
                Map.entry("I", 1),
                Map.entry("V", 5),
                Map.entry("X", 10),
                Map.entry("L", 50),
                Map.entry("C", 100),
                Map.entry("D", 500),
                Map.entry("M", 1000),
                Map.entry("IV", 4),
                Map.entry("IX", 9),
                Map.entry("XL", 40),
                Map.entry("XC", 90),
                Map.entry("CD", 400),
                Map.entry("CM", 900)
        );

        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                if (numbersMap.containsKey(arr[i] + arr[i + 1])) {
                    splittedStr.add(arr[i] + arr[i + 1]);
                    arr[i] = "";
                    arr[i + 1] = "";
                    i++;
                }
            }
            if (numbersMap.containsKey(arr[i])) {
                splittedStr.add(arr[i]);
            }

        }

        for (String i : splittedStr) {
            result += numbersMap.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("III")); // 3
        System.out.println(romanToInt("LVIII")); // 58
        System.out.println(romanToInt("MCMXCIV")); // 1994
        System.out.println(romanToInt("IV")); // 4
    }
}

// https://leetcode.com/problems/roman-to-integer
