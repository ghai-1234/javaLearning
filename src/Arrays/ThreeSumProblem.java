package Arrays;

import java.util.*;

public class ThreeSumProblem {

    //Problem to find three numbers in an array whose sum is 0
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        int n = arr.length;
        int targetSum = 0;
        ArrayList<List> ans = findThreeSum(arr,n,targetSum);
        //System.out.println(ans.size());
        for (List c : ans) {
            for (int i = 0; i < c.size(); i++) {
                System.out.print(c.get(i) + " ");
            };
            System.out.println("");
        }
    }

    private static ArrayList<List> findThreeSum(int[] a, int n, int targetSum) {

        //First method is brute force. Run three loops and find if a[i] + a[j] + a[k] = 0


        //Second method is using hashing
//        HashMap<Integer,Integer> map = new HashMap();
//        Set<List> s = new HashSet<>();
//
//        for (int i = 0; i < n-1; i++) {
//
//            for (int j = i+1; j < n; j++) {
//
//                if(!map.containsKey(-(a[i]+a[j]))) {
//                    map.put(a[j],j);
//                }
//                else {
//                    int k = map.get(-(a[i]+a[j]));
//                    List l = new ArrayList();
//                    l.add(a[i]);
//                    l.add(a[j]);
//                    l.add(a[k]);
//                    Collections.sort(l);
//                    s.add(l);
//                }
//
//            }
//
//        }
//        return s;


        //Third way using three pointer approach

        int i = 0;

        ArrayList<List> ans = new ArrayList<>();

        Arrays.sort(a);
        for ( i = 0; i < n-1; i++) {

            if(i>0 && a[i]==a[i-1])
                continue;
            int j = i+1;
           int k= n-1;

            while(j < k) {
                int sum = a[i] + a[j] + a[k];

                  if (sum > 0) {
                   k--;
                }
                 else if (sum < 0) {
                    j++;
                }
                else  {
                    List c = new ArrayList();
                    c.add(a[i]);
                    c.add(a[j]);
                    c.add(a[k]);

                    ans.add(c);
                    j++;
                    k--;
                    while (j<k && a[j] == a[j-1]) {
                        j++;
                    }
                      while (j<k && a[k] == a[k+1]) {
                          k--;
                      }
                }
            }
        }
        return ans;
    }



    }
