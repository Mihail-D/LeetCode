package easy;

public class BinarySearch {

    public int search(int[] nums, int target) {
        int from = 0;
        int to = nums.length - 1;

        while (from <= to) {
            int middlePosition = from + (to - from) / 2;
            if (nums[middlePosition] == target) {
                return middlePosition;
            } else if (nums[middlePosition] < target) {
                from = middlePosition + 1;
            } else {
                to = middlePosition - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25};
        int target = 23;
        System.out.println(bs.search(nums, target)); // Выведет индекс элемента 23, который равен 22
    }
}
// https://leetcode.com/problems/binary-search
