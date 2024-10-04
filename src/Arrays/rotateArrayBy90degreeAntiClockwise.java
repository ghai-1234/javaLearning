package Arrays;

public class rotateArrayBy90degreeAntiClockwise {

    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int n = a.length;
        rotateArrayBy90Degreees(a, n);
        SetMatrixOnesBetter.print2DMatrix(a, n);

    }

    private static void rotateArrayBy90Degreees(int[][] a, int n) {

        transpose(a, n);
        int q = 0, p = n - 1;
        while (q < p) {
            swapRows(a, q, p);
            q++;
            p--;
        }

    }

    private static void transpose(int[][] a, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                swapElements(a, i, j);
            }
        }
    }

    public static void swapElements(int[][] arr, int i, int j) {
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
    }

    public static void swapRows(int[][] arr, int i, int j) {
        int[] temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}



