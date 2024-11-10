package Arrays;

public class SqrtWithoutAnyFunction {

    public static void main(String[] args) {
        int x = 2;
        System.out.println(findSqrt(x));
    }

    private static int findSqrt(int x) {

        if(x == 0 || x == 1)
            return x;

        int start = 0, end = x;
        int ans = 0;

        while (start<=end){
            int mid = start + (end-start)/2;

            if(mid<=x/mid) {
                ans = mid;
                start = mid + 1;
            }
            else {
                end  = mid - 1;
            }
        }
        return ans;
    }
}
