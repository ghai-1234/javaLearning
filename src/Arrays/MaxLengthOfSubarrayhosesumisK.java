package Arrays;

import java.util.HashMap;

//This is for both positive and negatives
public class MaxLengthOfSubarrayhosesumisK {

    public static void main(String[] args) {
        int[] arr = {1,4,-2,5,6,-1,-1,-1,4};
        int n = arr.length;
        int targetSum = 3;
        int ans = findMaxLengthSubArraySumisK(arr,n,targetSum);
        System.out.println(ans);
    }

    private static int findMaxLengthSubArraySumisK(int[] a, int n, int k) {
        int sum = 0;
        int maxLen = 0;
        int len = 0;
        int rem = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0  ; i < n; i++) {

            sum += a[i];

            if(sum == k) {
                maxLen = i+1;
            }
            rem = sum-k;
            if(map.containsKey(rem)) {
                len = map.get(rem);
                maxLen = Math.max(maxLen,i-len);
            }
            if (!map.containsKey(sum)) {
                map.put(sum, i);
           }
        }
        return maxLen;
    }
}
