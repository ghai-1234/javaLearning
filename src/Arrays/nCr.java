package Arrays;

public class nCr {

    public static void main(String[] args) {
        int n = 69;
        int r = 43;
        System.out.println(findNCR(n,r));
    }

    private static int findNCR(int n, int r) {
        int ans = 1;
        for (int i = 0; i < r; i++) {
            ans = ans * (n-i);
            ans = ans / (i+1);

        }
        return ans;

    }
}
