package Arrays;

//Maximum subarray sum
public class KadaneAlgorithm {

    public static void main(String[] args) {
        int[] arr = {1,2,3,7,5};
        int n = arr.length;
        long ans = findMaximumSubarraySum(arr, n);
        System.out.println(ans);
    }

    private static long findMaximumSubarraySum(int[] arr, int n) {

        int sum = 0;
        long maxi = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            sum += arr[i];


            if(sum > maxi)
            maxi = sum;

            if(sum < 0)
                sum = 0;
        }

        return maxi;

    }
}
