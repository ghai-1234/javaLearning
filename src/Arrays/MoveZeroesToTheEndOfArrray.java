package Arrays;


import java.util.Arrays;

import static Arrays.SortAnArrayof0and1.swap;

public class MoveZeroesToTheEndOfArrray {


    public static void main(String[] args) {
        int a[] = {0,1, 1, 2, 0, 0, 5,8,0,9,0};
        moveZeroes(a);
        Arrays.stream(a).forEach(System.out::println);
    }

    private static void moveZeroes(int[] a) {
        int n = a.length;
        int j ;
     for( j = 0;j<n;j++){
         if(a[j] == 0)
             break;

     }
     int i = j +1;

        while(i < n) {
           if(a[i] != 0) {
               swap(a,i,j);
               i++;
               j++;
           }

           else if (a[i] == 0) {
               i++;
           }
        }
    }
}
