public class SetMatrixZeroesBetter {
    public static void main(String[] args) {
        int[][] a = {{0, 1},{1,1}};
        int n = a.length;
        markallAsOne(a);
        print2DMatrix(a,n);

    }

    private static void markallAsOne(int[][] a) {
        int n = a.length;
        int m = a[0].length;
        int row[] = new int[n];
        int col[] = new int[m];

        for(int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                if(a[i][j] == 0) {
                    row[i] = 1;
                    col[j] = 1;
                }

            }
        }
        for(int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {

                    if(row[i] == 1 || col[j] == 1) {
                        a[i][j] = 0;
                    }
            }
        }


    }

    private static void print2DMatrix(int[][] a, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
