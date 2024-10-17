package Arrays;

import java.util.Arrays;

public class RemoveElement {

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        Arrays.stream(removeElement(nums, 2)).forEach(System.out::println);
    }

    public static int[] removeElement(int[] nums, int val) {

       /* int n = nums.length;
        int j = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == val) {
                j = i;
                while (j < n - 1) {
                    nums[j] = nums[j + 1];
                    j++;
                }
                n--;
                i--;
            }
        }
        return n;
    }

        */

    // Second Approach

    int index = 0;
        for (int i = 0; i < nums.length; i++) {
        if (nums[i] != val) {
            nums[index] = nums[i];
            index++;
        }
    }
        return nums;
}


}
