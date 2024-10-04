package Arrays;

public class MaxProductSubArray {

    public static void main(String[] args) {

        int[] arr = {0,0,-5,0,0};
        System.out.println(maxProduct(arr));

    }
    static long maxProduct(int[] a) {
        long ans = a[0];

        int n = a.length;
        long leftProduct = 1;
        long rightProduct = 1;
        for (int i = 0; i < n; i++)
        {

            leftProduct = leftProduct == 0 ? 1 : leftProduct;
            rightProduct = rightProduct == 0 ? 1 : rightProduct;

            leftProduct *= a[i];
            rightProduct *= a[n-1-i];



            ans = Math.max(ans,Math.max(leftProduct,rightProduct));
        }
    return ans;
    }
}
