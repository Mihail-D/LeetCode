package easy;

public class ClimbStairs {

    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int[] dp = new int[n];
        dp[0] = 1;
        dp[1] = 2;
        for (int i = 2; i < n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n - 1];
    }

    public static void main(String[] args) {
        ClimbStairs obj = new ClimbStairs();
        System.out.println(obj.climbStairs(2));
        System.out.println(obj.climbStairs(3));
        System.out.println(obj.climbStairs(4));
        System.out.println(obj.climbStairs(5));
        System.out.println(obj.climbStairs(6));
        System.out.println(obj.climbStairs(7));
        System.out.println(obj.climbStairs(8));
        System.out.println(obj.climbStairs(9));
        System.out.println(obj.climbStairs(10));
        System.out.println(obj.climbStairs(11));
        System.out.println(obj.climbStairs(12));
        System.out.println(obj.climbStairs(13));
        System.out.println(obj.climbStairs(14));
        System.out.println(obj.climbStairs(15));
        System.out.println(obj.climbStairs(16));
        System.out.println(obj.climbStairs(17));
        System.out.println(obj.climbStairs(18));
        System.out.println(obj.climbStairs(19));
        System.out.println(obj.climbStairs(20));
    }
}

// https://leetcode.com/problems/climbing-stairs/
