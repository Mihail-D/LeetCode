package easy;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicate sol = new ContainsDuplicate();
        int[] nums = {1, 2, 3, 1};
        System.out.println(sol.containsDuplicate(nums));
    }
}
// https://leetcode.com/problems/contains-duplicate
