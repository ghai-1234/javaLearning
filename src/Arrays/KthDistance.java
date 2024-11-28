package Arrays;

import java.util.HashMap;

public class KthDistance {

    public static void main(String[] args) {
        int a[] = {1, 2, 3,1,4,5};
        int n = a.length;
        int k = 3;
        System.out.println(isDuplicatePresentOptimal(a,n,k));
    }

    //Brute force this can be optimised as well by doing a[i] == a[p] instead of using
    // map here
    private static boolean isDuplicatePresent(int[] a, int n, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();


        for (int i = 0; i < n; i++) {
            for (int p = i; p <= i + k; p++) {
                if (p < n) {
                    if (map.containsKey(a[p]))
                        return true;
                    else {
                        map.put(a[p], p);
                    }

                }
            }
            map.clear();
        }
        return false;
    }
    private static boolean isDuplicatePresentOptimal(int[] a, int n, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
                if(map.containsKey(a[i])) {
                    int val = map.get(a[i]);
                    if((i-val) <= k)
                        return true;
                }
                else {
                    map.put(a[i],i);
                }
        }
        return false;
    }

    }
