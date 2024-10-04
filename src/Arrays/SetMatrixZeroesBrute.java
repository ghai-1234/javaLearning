package Arrays;

public class SetMatrixZeroesBrute {

    public static void main(String[] args) {
        int[][] a = {{1, 1, 1, 1,}, {1, 0, 0, 1}, {1, 1, 0, 1}, {1, 1, 1, 1, 1}};
        int n = a.length;
        setMatrixzeroes(a, n);
        removeMinusOne(a,n);
        print2DMatrix(a,n);

    }

    private static void removeMinusOne(int[][] a, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
               if(a[i][j] == -1) {
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

    private static void setMatrixzeroes(int[][] a, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] == 0) {
                    markRow(a, i,n);
                    markCol(a,j,n);
                }
            }
        }
    }

    private static void markCol(int[][] a, int j, int n) {
        for (int l = 0; l < n; l++) {
            a[l][j] = -1;
        }
    }

    private static void markRow(int[][] a, int i,int n) {

        for (int l = 0; l < n; l++) {
            a[i][l] = -1;
        }
    }
}
