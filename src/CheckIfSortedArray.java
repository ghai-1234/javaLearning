import java.util.HashSet;
import java.util.Set;

public class CheckIfSortedArray {

    public static void main(String[] args) {

        int arr[] = {1,2,3,31,4,5};
        boolean b = true;

        for (int i=1;i<arr.length;i++) {
            if(arr[i] < arr[i-1]) {
                b = false;
                break;
            }
        }
        System.out.println(b);
    }
}
