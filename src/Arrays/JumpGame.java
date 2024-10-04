package Arrays;

public class JumpGame {

    public static void main(String[] args) {

       int A[] = {1, 0,2, 0, 3, 0, 0};
       int n = A.length;
        System.out.println(canReach(A,n));

    }
    static int canReach(int[] a, int n) {

        int reachable = 0;
        for(int i=0;i<n;i++) {
            if(reachable < i) {
                return 0;
            }

            reachable = Math.max(reachable,i+a[i]);
        }

        return 1;

        // code here
    }
}
