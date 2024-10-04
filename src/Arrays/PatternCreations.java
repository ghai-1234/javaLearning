package Arrays;

public class PatternCreations {


    public static void main(String[] args) {

        int  n = 5;
        //createPattern(n);
        createPyramid(n);
    }


    private static void createPyramid(int n) {
        for (int i=0;i<n;i++) {
            //first space
            for(int m=0;m<i;m++) {
                System.out.print(" ");
            }
            //second star
            for (int k = 2*n-1-2*i;k>0;k--) {
                System.out.print("*");
            }
            //third space
            for(int m=0;m<i;m++) {
                System.out.print(" ");
            }
            System.out.println("");
        }
    }

    static void createPattern(int n) {
        for (int i = 1;i<=n;i++) {
            for (int j=1;j<=n-i+1;j++) {
                System.out.print(j);
            }
            System.out.println("");
        }

    }
}
