package easy;

public class PlusOne {

    public int[] plusOne(int[] digits) {

        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newNumber = new int[n + 1];
        newNumber[0] = 1;
        return newNumber;
    }

    public static void main(String[] args) {
        PlusOne solution = new PlusOne();
        int[] digits = {9, 9};
        int[] result = solution.plusOne(digits);
        for (int j : result) {
            System.out.print(j + " ");
        }
    }
}

// https://leetcode.com/problems/plus-one/
