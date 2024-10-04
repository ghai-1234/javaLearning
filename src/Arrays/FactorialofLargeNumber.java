package Arrays;

import java.awt.image.BandedSampleModel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class FactorialofLargeNumber {

    public static void main(String[] args) {

        int n = 5;
        System.out.println(factorial(n));

        Set<String> stringSets = new HashSet<String>()
        {
            {
                add("set1");
                add("set2");
                add("set3");
            }
        };


        //System.out.println(factorialOfLargeNumber(n));
    }


    public static void multiplier(int[] nums, int[] size, int multiplier) {
        int carry = 0;

        for (int i = 0; i < size[0]; i++) {
            int result = (multiplier * nums[i]) + carry;
            nums[i] = result % 10;    // Store the last digit in nums
            carry = result / 10;      // Update carry
        }

        // Handle carry
        while (carry > 0) {
            nums[size[0]] = carry % 10;   // Store the last digit of carry
            size[0]++;                    // Increment size
            carry /= 10;                  // Update carry
        }
    }

    // Method to calculate the factorial
    public static ArrayList<Integer> factorial(int N) {
        int[] nums = new int[10000];  // Create a large array to hold the factorial digits
        nums[0] = 1;                  // Initialize the first element as 1
        int[] size = {1};             // Use an array to hold the size (passed by reference)
        int fact = N;

        // Multiply numbers from 2 to N
        for (int multiplier = 2; multiplier <= fact; multiplier++) {
            multiplier(nums, size, multiplier);
        }

        // Prepare the result by adding digits to the ArrayList
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = size[0] - 1; i >= 0; i--) {
            result.add(nums[i]);
        }

        return result;
    }


}
