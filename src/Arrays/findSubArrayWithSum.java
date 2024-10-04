package Arrays;

import java.util.ArrayList;
import java.util.Arrays;


//To find elements of whose subarray sum is equal to the given sum
public class findSubArrayWithSum {

    public static ArrayList<Integer> findSubarray(int[] arr, int n, int targetSum) {
        int left = 0, right = 0, currentSum = 0;
        ArrayList<Integer> result = new ArrayList<>();
        if(targetSum == 0) {
            result.add(-1);  // 1-based indexing

            return result;
        }

        while (right < n) {
            // Expand the subarray to the right
            currentSum += arr[right];

            // Check if the current sum is greater than or equal to the target
            while (currentSum >= targetSum) {
                // If the current sum equals the target, store the indices and update the result
                if (currentSum == targetSum) {
                    result.add(left + 1);  // 1-based indexing
                    result.add(right + 1); // 1-based indexing
                    return result;
                }

                if (currentSum < targetSum && right < n) {
                    // Expand the subarray to the right
                    currentSum += arr[right];
                    right++;
                } else {
                    // Shrink the subarray from the left
                    currentSum -= arr[left];
                    left++;
                }
            }

            // If no subarray is found, add -1 to the result list
            result.add(-1);
            return result;
        }

        // If no subarray is found or targetSum is 0, add -1 to the result list
        if (result.isEmpty() && targetSum != 0) {
            result.add(-1);
        }

        return result;
    }

        public static void main(String[] args) {
            int[] arr = {1, 2, 3,4};
            int n = arr.length;
            int targetSum = 0 ;

            ArrayList<Integer> result = findSubarray(arr, n, targetSum);

            if (result.get(0) == -1) {
                System.out.println("No subarray found");
            } else {
                System.out.println("Subarray found from index " + result.get(0) + " to " + result.get(1));
            }
        }
    }


