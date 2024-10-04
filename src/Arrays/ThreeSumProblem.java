package Arrays;

import java.util.*;

public class ThreeSumProblem {

    //Problem to find three numbers in an array whose sum is 0
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        int n = arr.length;
        int targetSum = 0;
        Set<int[]> ans = (findThreeSum(arr,n,targetSum));
        for (int[] c : ans) {
            for (int i = 0; i < c.length; i++) {
                System.out.print(c[i] + " ");
            };
            System.out.println("");
        }
    }

    private static Set<Integer[]> findThreeSum(int[] a, int n, int targetSum) {

        //First method is brute force. Run three loops and find if a[i] + a[j] + a[k] = 0


        //Second method is using hashing
        HashMap<Integer,Integer> map = new HashMap();
        Set<Integer[]> s = new HashSet<>();

        for (int i = 0; i < n-1; i++) {

            for (int j = i+1; j < n; j++) {

                if(!map.containsKey(-(a[i]+a[j]))) {
                    map.put(a[j],j);
                }
                else {
                    int k = map.get(-(a[i]+a[j]));
                    List l = new ArrayList(){
                        {a[i],a[j],a[k]};
                    Arrays.sort(subArray);
                    s.add(subArray);
                }

            }

        }
        return s;

    }
}
