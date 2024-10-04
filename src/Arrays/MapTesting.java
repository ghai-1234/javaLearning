package Arrays;

import java.util.*;

public class MapTesting {

    static int print2largest(int arr[], int n) {

        if(n==1)
            return -1;

        Arrays.sort(arr);
        int i;
        int secondLargest ;
        for(i=n-1;i>0;i--) {
            if(arr[i] == arr[i-1]) {
                i--;
            }
            break;
        }
        secondLargest = arr[i-1];

        return secondLargest;

    }

    public static void main(String[] args) {
        int nums[] = {5,10,10};
        int n = nums.length;
        int b ;
       b =  print2largest(nums,n);
            System.out.println(b);
    }
}

