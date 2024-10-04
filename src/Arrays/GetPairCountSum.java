package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GetPairCountSum {

    public static void main(String[] args) {
        int arr[] = {1,5,7,1};
        int k = 6;
        int n = arr.length;
        System.out.println(getPairCount(arr,n,k));
    }

    public static int getPairCount(int arr[],int n , int k) {
        int count = 0;
        Map<Integer,Integer> freqMap = new HashMap<>();
        for(int i=0;i<n;i++) {
            int comp = k - arr[i];

            if(freqMap.containsKey(comp)) {
                count+=freqMap.get(comp);
            }

            freqMap.put(arr[i], freqMap.getOrDefault(arr[i],0) + 1);
        }
        return count;
    }


}
