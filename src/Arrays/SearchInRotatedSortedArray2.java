package Arrays;

public class SearchInRotatedSortedArray2 {

    public static void main(String[] args) {

        int[] arr = {3,1,2,3,3,3,3};
        int target = 2;
        System.out.println(searchInRotatedSortedArray(arr,target));

    }
    static boolean searchInRotatedSortedArray(int[] a, int target) {

        int n = a.length;
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if(a[mid] == target) {
                return true;
            }

            //left sorted

             if ( (a[low] == a[mid]) && (a[mid] == a[high])) {
                low++;
                high--;
            }

            if(a[low] <= a[mid]) {
                if(a[low] <= target && target <= a[mid]) {
                    high = mid - 1;
                }
                else {
                    low = mid + 1;
                }
            }

            //right sorted
            else {
                if(a[mid] <= target && target <= a[high]) {
                    low = mid + 1;
                }
                else {
                    high = mid - 1;
                }
            }



        }
        return false;
    }
}
