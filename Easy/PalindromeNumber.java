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

/*
Учитывая целое число x, верните true, если x является палиндромом, и false в противном случае.

Пример 1:
Ввод: х = 121
Вывод: правда
Пояснение: 121 читается как 121 слева направо и справа налево.

Пример 2:
Ввод: х = -121
Вывод: ложь
Пояснение: Слева направо указано -121. Справа налево становится 121-. Следовательно, это не палиндром.

Пример 3:
Ввод: х = 10
Вывод: ложь
Пояснение: Читается 01 справа налево. Следовательно, это не палиндром.

Ограничения:
        -231 <= х <= 231 - 1

Продолжение: не могли бы вы решить эту проблему, не преобразуя целое число в строку?
*/
