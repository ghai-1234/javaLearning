package Arrays;

public class SetMatrixOnesBetter {
        public static void main(String[] args) {
            int[][] a = {{1, 0},{0,0}};
            int n = a.length;
            markallAsZero(a);
            print2DMatrix(a,n);

        }

        private static void markallAsZero(int[][] a) {
            int n = a.length;
            int m = a[0].length;
            int row[] = new int[n];
            int col[] = new int[m];

            for(int i=0;i<n;i++) {
                for (int j = 0; j < n; j++) {
                    if(a[i][j] == 1) {
                        row[i] = -1;
                        col[j] = -1;
                    }

                }
            }
            for(int i=0;i<n;i++) {
                for (int j = 0; j < n; j++) {

                    if(row[i] == -1 || col[j] == -1) {
                        a[i][j] = 1;
                    }
                }
            }


        }

        public static void print2DMatrix(int[][] a, int n) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println(" ");
            }
        }
    }

