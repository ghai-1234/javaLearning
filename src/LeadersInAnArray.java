import java.util.ArrayList;
import java.util.Collections;

public class LeadersInAnArray {

    public static void main(String[] args) {
        int[] arr = {16,17,4,3,5,2};
        int n = arr.length;
        System.out.println((findLeadersInAnArray(arr, n)));
    }

    private static ArrayList<Integer> findLeadersInAnArray(int[] a, int n) {

        ArrayList<Integer> ans = new ArrayList<>();
        //This is the brute force approach
//        int x ;
//        int flag ;
//        for(int i=0;i<n-1;i++) {
//            x = a[i];
//            flag = 1;
//            for (int j = i+1; j < n; j++) {
//                if(a[j] > x) {
//                    flag = 0;
//                    break;
//                }
//            }
//
//            if(flag == 1) {
//                ans.add(x);
//            }
//        }
//        ans.add(a[n-1]);
//        return ans;
//    }

        //This is the optimal approach

        int maxi = Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--) {
            if(a[i] >= maxi) {
                ans.add(a[i]);
                maxi = a[i];
            }
        }

        Collections.sort(ans,Collections.reverseOrder());
        return  ans;
        }
}
