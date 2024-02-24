public class RotateArrayBy90DegreesClockwise {

    public static void main(String[] args) {
        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
        int n = a.length;
        rotateArrayBy90Degreees(a,n);
        SetMatrixOnesBetter.print2DMatrix(a,n);

    }

    private static void rotateArrayBy90Degreees(int[][] a, int n) {

        for(int i=0; i< n ; i++){
            for(int j=i; j < n; j++){
                swap(a,i,j);
            }
        }
        for (int i = 0; i < n; i++) {
            reverse(a[i],0,n-1);
        }


    }
    public static void reverse(int arr[],int i,int j) {
        while (i < j) {
            SortAnArrayof0and1.swap(arr, i, j);
            i++;
            j--;
        }
    }
        public static void swap(int[][] arr, int i, int j) {
            int temp = arr[i][j];
            arr[i][j] = arr[j][i];
            arr[j][i] = temp;
        }
    }