import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class TwoSumProblem {

    public static void main(String[] args) {
        int[] arr = {23,4,6,5,6,7};
        int n = arr.length;
        int targetSum = 28;
        boolean ans = doesExistAnySum(arr,n,targetSum);
        System.out.println(ans);
    }

    private static boolean doesExistAnySum(int[] a, int n, int targetSum) {

        //This is the brute force approach
//        boolean ans = false;
//
//        for(int i=0;i<n-1;i++) {
//            for(int j=i+1;j<n;j++) {
//                if(a[i] + a[j] == targetSum) {
//                    ans = true;
//                    break;
//                }
//            }
//        }
//        return ans;
//    }

    //Now trying optimal approach using hashing

//        boolean ans = false;
//
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for (int i = 0; i < n; i++) {
//                if(!map.containsKey(targetSum-a[i])) {
//                    map.put(a[i],i);
//                }
//
//                else  {
//                    ans = true;
//                    break;
//                }
//        }
//            return ans;
//        }

        //Now not using any other extra data structure , solving this using two pointers
        boolean b = false;
        int i=0;
        int j=n-1;
        Arrays.sort(a);
        while (j> i) {

            if(a[i] + a[j] == targetSum) {
                b = true;
                break;
            }
            else if (a[i] + a[j] > targetSum) {
                j--;
            }
            else if (a[i] + a[j] < targetSum) {
                i++;
            }
        }
        return b;
    }
}
