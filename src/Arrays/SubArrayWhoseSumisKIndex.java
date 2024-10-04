package Arrays;

import java.util.ArrayList;
import java.util.HashMap;

public class SubArrayWhoseSumisKIndex {

    public static void main(String[] args) {
        int[] arr = {1,2,3,7,5};
        int n = arr.length;
        int targetSum = 12;
        System.out.println(subarraywhosesumisK(arr,n,targetSum));
    }

    private static ArrayList<Integer> subarraywhosesumisK(int[] arr, int n, int s) {

        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        int j=Integer.MIN_VALUE,i;
        for (i = 0; i < n; i++) {

            sum += arr[i];

            if (map.containsKey(sum-s)) {
                j = map.get(sum-s);
                break;
            }
            if(!map.containsKey(sum)) {
                map.put(sum,i);
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        if(j == Integer.MIN_VALUE) {
            ans.add(-1);
            return ans;
        }

        ans.add(j+2);
        ans.add(i+1);

        return ans;
    }
}
