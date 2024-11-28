package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {

    public static void main(String[] args) {
        int [] a = {1,5,4,8,-10,34,2,0,9,-9,-1};

        int low=0,high=a.length-1;
        mergeSort(a,low,high);

        Arrays.stream(a).forEach(System.out::println);
    }

    private static void mergeSort(int[] a, int low, int high) {

        if(low == high)
            return;

        int mid = (low+high)/2;
        mergeSort(a,low,mid);
        mergeSort(a,mid+1,high);
        mergeArrays(a,low,mid,high);
    }

    private static void mergeArrays(int[] a, int low, int mid, int high) {
        int left = low;
        int right = mid + 1;
        List<Integer> temp = new ArrayList<>();

        while(left <= mid && right<=high) {
            if(a[left] <= a[right]) {
                temp.add(a[left]);
                left++;
            }
            else {
                temp.add(a[right]);
                right++;
            }
        }

        while(left<=mid) {
            temp.add(a[left]);
            left++;
        }

        while(right<=high) {
            temp.add(a[right]);
            right++;
        }

        for(int i = low;i<=high;i++) {
            a[i] = temp.get(i-low);
        }
    }
}
