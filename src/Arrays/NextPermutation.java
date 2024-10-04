package Arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NextPermutation {

    public static void main(String[] args) {
        int[] arr = {2,1,5,4,3,0,0};
        int n = arr.length;
        System.out.println((findNextPermutation(arr, n)));
    }

    public static void reverse(int arr[],int i,int j) {
        while (i<j) {
            SortAnArrayof0and1.swap(arr,i,j);
            i++;
            j--;
        }
    }
    private static List<Integer> findNextPermutation(int[] a, int n) {
        int index = -1;
        for(int i=n-2;i>=0;i--) {
            if(a[i] < a[i+1] ) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            reverse(a, 0,n-1);
            return Arrays.stream(a).boxed().collect(Collectors.toList());
        }

        for (int i = n-1 ; i >=index; i--) {
            if(a[i] > a[index]) {
                SortAnArrayof0and1.swap(a,i,index);
                break;
            }
        }
        reverse(a,index+1,n-1);
        return Arrays.stream(a).boxed().collect(Collectors.toList());
    }
}
