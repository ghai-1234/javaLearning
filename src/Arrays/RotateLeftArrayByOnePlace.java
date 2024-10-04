package Arrays;

public class RotateLeftArrayByOnePlace {

    public static void main(String[] args) {

        int a[] = {9,1,4,7,8,10,2,3,4};
        int n = a.length;
        int p = a[0];
        for(int i=0;i<n-1;i++) {
            a[i] = a[i+1];
        }
        a[n-1] = p;

        for (int c : a) {

            System.out.print(c + " ");

        }

    }


}
