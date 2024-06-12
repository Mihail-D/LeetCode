package Easy;

import java.util.ArrayList;
import java.util.List;

public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        List<Integer> list = new ArrayList<>();
        int index = 0;

        for (int num : nums) {
            if (num != val) {
                list.add(num);
                index++;
            }
        }

        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }

        return index;
    }

    public static void main(String[] args) {
        RemoveElement removeElement = new RemoveElement();
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        System.out.println(removeElement.removeElement(nums, val));
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
