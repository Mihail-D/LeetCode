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


/*
Римские цифры представлены семью различными символами: I, V, X, L, C, D и M.

I-1
V 5
X 10
L 50
C 100
D 500
M 1000

Например, 2 записывается как II римскими цифрами, состоящими из двух единиц. 12 пишется как XII,
что есть просто X + II. Число 27 записывается как XXVII, то есть XX+V+II.

Римские цифры обычно пишутся от большей к меньшей слева направо. Однако цифра четыре не IIII.
Вместо этого цифра четыре пишется как IV. Поскольку единица стоит перед пятеркой, мы вычитаем ее, получая четыре.
Тот же принцип применим и к числу девять, которое пишется как IX. Есть шесть случаев, когда используется вычитание:

I можно поставить перед V (5) и X (10), чтобы получилось 4 и 9.
X можно поставить перед L (50) и C (100), чтобы получилось 40 и 90.
C можно поставить перед D (500) и M (1000), чтобы получилось 400 и 900.

Дана римская цифра, преобразуйте ее в целое число.

Example 1:
Input: s = "III"
Output: 3
Explanation: III = 3.

Example 2:
Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.

Example 3:
Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

Constraints:

1 <= s.length <= 15
s содержит только символы ('I', 'V', 'X', 'L', 'C', 'D', 'M').
Гарантируется, что s — допустимая римская цифра в диапазоне [1, 3999].
*/

