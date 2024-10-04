package Arrays;

public class minimumNumberOfJumps {

    public static void main(String[] args) {

        int A[] = {1, 2, 0, 3, 0, 0};
        int n = A.length;
        System.out.println(minimumNumberOfJumps(A,n));

    }

    static int minimumNumberOfJumps(int[] a,int n){

        int maxR = a[0];
        int jump = 1;
        int step = a[0];


        if(n == 1)
            return 0;

        if(a[0] == 0)
            return -1;

        else {

            for(int i = 1;i<n;i++) {
                if(i == n-1) {
                    return jump;
                }

                maxR = Math.max(maxR,i+a[i]);
                step--;
                if(step == 0 )
                {
                    jump++;
                    if(i >= maxR) {
                        return -1;
                    }
                    step = maxR - i;
                }

            }

        }
        return jump;
    }

}
