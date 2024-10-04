package Arrays;

import java.util.HashSet;
public class SubarrayWithZeroSum {

    public static boolean hasSubarrayWithZeroSum(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int prefixSum = 0;

        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];

            // If prefixSum becomes 0 or if it is already present in the set, there is a subarray with sum 0.
            if (prefixSum == 0 || set.contains(prefixSum)) {
                return true;
            }

            // Add the current prefixSum to the set.
            set.add(prefixSum);
        }

        // No subarray with sum 0 found.
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, -3, 1, 6};

        if (hasSubarrayWithZeroSum(arr)) {
            System.out.println("Subarray with sum 0 is present.");
        } else {
            System.out.println("No subarray with sum 0 found.");
        }
    }
}
