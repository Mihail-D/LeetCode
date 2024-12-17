package easy;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {
        SortedSet<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toCollection(TreeSet::new));
        Arrays.fill(nums, Integer.MIN_VALUE);
        int index = 0;

        for (int i : set) {
            nums[index] = i;
            index++;
        }

        return index;
    }

    public static void main(String[] args) {
        RemoveDuplicates obj = new RemoveDuplicates();
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(obj.removeDuplicates(nums));
    }
}

// https://leetcode.com/problems/remove-duplicates-from-sorted-array/
