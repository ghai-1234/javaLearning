package Arrays;

public class PivotIndex {

    public static void main(String[] args) {
        int a[] = {1,7,3,6,5,6};
        System.out.println(pivotIndex(a));
    }

        public static int pivotIndex(int[] a) {
            int n = a.length;
            int total = 0;
            for(int i = 0;i<n;i++) {
                total+=a[i];
            }

            int lsum = 0;
            int rsum = total - a[0];

            if(lsum == rsum)
                return 0;

            for(int i = 1;i<n;i++) {


                lsum +=a[i-1];
                rsum = total - a[i] - lsum;

                if(lsum == rsum)
                    return i;


            }

            return -1;

        }
    }
