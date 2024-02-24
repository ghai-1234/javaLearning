import java.util.Arrays;

public class SortAnArrayof0and1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 1, 1, 1,2,2,2,1,1,0,1,1,2,1,0,2,1 ,0,1, 0};
        int n = arr.length;
        sortArray(arr, n);
        Arrays.stream(arr).forEach(e -> System.out.print(e + " "));
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //Sorting array using 3 pointer approach
    private static void sortArray(int[] arr, int n) {

        int low = 0;
        int mid = 0;
        int high = n - 1;

        while (mid <= high) {

            if (arr[mid] == 0) {
                swap(arr, low, mid);
                low++;
                mid++;
            }
           else if (arr[mid] == 1) {
                mid++;
            }
            else if (arr[mid] == 2) {
                swap(arr, mid, high);
                high--;
            }

        }
    }
}
