package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

//This is for both positive and negatives
public class MaxLengthOfSubarrayindexes {

    public static void main(String[] args) {
        int[] arr = {26 ,144, 125, 24, 173, 62 ,182, 4, 33, 106, 194, 126, 32, 93, 143, 23, 87, 65, 101, 188, 161, 14, 175, 71 ,171,36, 34, 112, 161 ,97, 68, 86 ,151, 141 ,95 ,96, 25, 20, 126, 177, 95, 59, 103, 172, 67, 79, 194, 52, 85, 19, 65, 120, 153, 1, 88, 61, 127, 11, 158, 171 ,116, 177, 28, 44, 159, 165, 110, 83, 87, 166, 88, 178, 75, 26, 28, 30 ,129, 24, 121, 103, 163, 124, 197, 138, 62, 196, 126, 65, 61, 3, 117, 31, 127, 12, 172, 12, 148, 154, 121, 191};
        int n = arr.length;

        ArrayList<Integer> m = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.toCollection(ArrayList::new));


        int targetSum = 528;
        System.out.println(findMaxLengthSubArraySumisK(arr,n,targetSum));
    }

    private static ArrayList<Integer> findMaxLengthSubArraySumisK(int[] nums, int n, int k) {
        int start = 0;
        int end = 0;
        int maxLen = 0;
        int maxStart = -1;

        int sum = 0;

        while (end < nums.length) {
            sum += nums[end];
            while (sum > k) {
                sum -= nums[start];
                start++;
            }
            if (sum == k && (end - start + 1) > maxLen) {
                maxLen = end - start + 1;
                maxStart = start;
            }
            end++;
        }
        int maxEnd = maxStart + maxLen - 1;
        ArrayList<Integer> ans = new ArrayList<>();
        if (maxLen == 0) {
            ans.add(-1);
        } else {
            ans.add(++maxStart);
            ans.add(++maxEnd);
        }
        return ans;
    }
}
