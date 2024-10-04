package Arrays;

public class SearchInRotatedSortedArray {

    public static void main(String[] args) {

        int[] arr = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int target = 10;
        System.out.println(searchInRotatedSortedArray(arr,target));

    }
    static long searchInRotatedSortedArray(int[] a, int target) {

        int n = a.length;
        int low = 0;
        int high = n - 1;

        while(low <= high) {
            int mid = (low + high) / 2;

            if(a[mid] == target)
                return mid;


            //Left is sorted
            if(a[low] <= a[mid]) {
                if(a[low] <= target && target <= a[mid]) {
                    high = mid - 1;
                }
                else {
                    low = mid + 1;
                }
            }

            //Right is sorted
            else {
                if(a[mid] <= target && target <= a[high]) {
                    low = mid + 1;
                }
                else {
                    high = mid - 1;
                }

            }
        }
    return -1;
    }
}
