package dynamicProgramming;

import java.util.Arrays;

public class FibonnaciSeries {

    public static void main(String[] args) {
        int n =4;
        System.out.println(fibonacci(n));
    }

    private static int fibonacci(int n) {
        //using recursion

        /*
        if(n<=1)
            return n;

        return fibonacci(n-1) + fibonacci(n-2);

         */

        //using memoization

       /* if(n<=1)
            return n;

        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);

        if(dp[n]!=-1){
            return dp[n];
        }
        dp[n] = fibonacci(n-1) + fibonacci(n-2);


        return dp[n];

        */

        //using tabulation
        int[] dp = new int[n+1];

        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n ; i++) {
        dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];

    }
}
