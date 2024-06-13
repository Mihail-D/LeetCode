package Easy;

public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        int position = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {

            if (nums[0] == target && nums.length == 1) {
                position = 0;
                break;
            } else if (nums[nums.length - 1] < target) {
                position = nums.length;
                break;
            } else if (nums[i] >= target) {
                position = i;
                break;
            }

        }

        return position;
    }

    public static void main(String[] args) {
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        int[] nums = {1, 3, 5, 6};
        int target = 7;
        System.out.println(searchInsertPosition.searchInsert(nums, target));
    }
}

// https://leetcode.com/problems/search-insert-position
