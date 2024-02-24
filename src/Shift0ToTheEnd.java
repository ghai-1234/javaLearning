public class Shift0ToTheEnd {
    public static void main(String[] args) {

        int a[] = {9, 1, 0, 12, 3, 4, 7, 0, 10, 0, 0, 4};
        int n = a.length;
        int temp;
        int i = 0, j = -1;
        for (i = 0; i < n; i++) {
            if (a[i] == 0) {
                j = i;
                break;
            }
        }

        if (j != -1) {
            for (i = j+1; i < n; i++) {


                if (a[i] != 0) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                    j++;
                }

            }
            for (int c : a) {
                System.out.print(c + " ");
            }
        }
    }

}

