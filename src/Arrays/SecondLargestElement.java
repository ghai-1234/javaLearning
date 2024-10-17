package Arrays;

//import com.sun.deploy.util.ArrayUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class SecondLargestElement {

    public static void main(String[] args) {

        int[] primitiveArray = { -1,-10,-5,4,-2};



        int ans = print2largest(primitiveArray,primitiveArray.length);
        System.out.println(ans);
    }

    static int print2largest(int arr[], int n) {
        // 1 method
//        Integer[] wrapperArray = Arrays.stream(arr)
//                .boxed()
//                .toArray(Integer[]::new);
//
//        TreeSet<Integer> set = new TreeSet<>(Arrays.asList(wrapperArray));
//
//        if (set.size() == 1)
//            return -1;
//
//        List<Integer> list = new ArrayList<>(set);
//        return list.get(list.size()-2);

        // 2 method

        int firstMax,secondMax;
        firstMax = arr[0];
        secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {

            if (arr[i] > firstMax) {
                secondMax  = firstMax;
                firstMax = arr[i];
            }
            else if(arr[i] > secondMax && arr[i]<firstMax) {
                secondMax = arr[i];
            }
        }
        if (secondMax == Integer.MIN_VALUE)
            return -1;

        return secondMax;
    }
}
