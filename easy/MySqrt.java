package easy;

public class MySqrt {

    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }

        int left = 1;
        int right = x;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (mid <= x / mid && (mid + 1) > x / (mid + 1)) {
                return mid;
            } else if (mid < x / mid) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        MySqrt solution = new MySqrt();
        System.out.println(solution.mySqrt(4));
    }
}
// https://leetcode.com/problems/sqrtx/
