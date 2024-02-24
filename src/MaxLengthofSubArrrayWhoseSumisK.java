//This is for positives and Zeroes
public class MaxLengthofSubArrrayWhoseSumisK {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,1,3,3};
        int n = arr.length;
        int targetSum = 6;
        int ans = findMaxLengthSubArraySumisK(arr,n,targetSum);
        System.out.println(ans);
    }

    private static int findMaxLengthSubArraySumisK(int[] a, int n, int targetSum) {
        int i=0;
        int j=0;
        int sum = a[0];
        int maxLen =0;
        while(j<n) {

            while (i<=j && sum > targetSum) {
                sum -= a[i];
                i++;
            }
            if(sum == targetSum) {
                maxLen = Math.max(maxLen,(j-i+1));
            }
            j++;
            if(j < n) {
                sum += a[j];
            }
        }

        return maxLen;
    }

}
