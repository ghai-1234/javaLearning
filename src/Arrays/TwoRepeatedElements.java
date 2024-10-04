package Arrays;

import java.util.ArrayList;
import java.util.HashMap;

public class TwoRepeatedElements {

    public static void main(String[] args) {

        int arr[] = {3, 2, 1, 3, 1, 4};
        System.out.println(twoRepeatedElements(arr));

    }

    static int[] twoRepeatedElements(int[] a){
        int n = a.length;
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Boolean> map = new HashMap<>();
        for (int i = 0; i <n ; i++) {

            //not found
            if(!map.getOrDefault(a[i],false)) {
                map.put(a[i],true);
            }
            else {
                list.add(a[i]);
            }

        }

        int[] primitiveArray = list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
return primitiveArray;
    }
}
