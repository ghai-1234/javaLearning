public class RotateLeftBydPlaces {

    public static void main(String[] args) {

        int a[] = {9, 1, 4, 7, 8, 10, 2, 3, 4};
        int n = a.length;
        int d =2;
        d = d%n;
        int i = 0;

        reverseArray(a,i,i+d-1);
        reverseArray(a,d,n-1);
        reverseArray(a,i,n-1);

        for (int c : a) {

            System.out.print(c + " ");

        }



    }

    static void reverseArray(int a[],int start,int end) {

        int i=start;
        int j = end;
        int temp = 0;

        while (i < j) {
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;j--;
        }


    }

}
