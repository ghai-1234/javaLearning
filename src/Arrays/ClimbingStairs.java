package Arrays;

import java.util.Arrays;

public class ClimbingStairs {
    public static void main(String[] args) {

        int n = 3;
        System.out.println(climbStairs(n));
    }
    public static int climbStairs(int n) {

        int [] a = new int[n+1];
        Arrays.fill(a,-1);
        return helper(a,n);

    }

    static int helper(int[] a,int n){

        if(n == 0 || n==1)
            return 1 ;

        if(a[n] != -1)
            return a[n];

        a[n]= helper(a,n-1) + helper(a,n-2);
        return a[n];

    }
}