package Arrays;

import java.util.ArrayList;

public class CommonElementinThreeArrays {

    public static void main(String[] args) {
       int [] a = {1,2};
       int[] b = {3,3};
        int [] c = {4,6};

        ArrayList<Integer> ans =  findCommon(a,b,c);
        System.out.println(ans);

    }

    private static ArrayList<Integer> findCommon(int[] arr1, int[] arr2, int[] arr3) {
        //My Approach

//        ArrayList<Integer> ans = new ArrayList<>();
//        for(int i=0;i<a.length;i++) {
//            for(int j=0;j<b.length;j++) {
//                if(a[i] == b[j]) {
//                    for(int k=0;k<c.length;k++) {
//                        if(a[i] == c[k] && !ans.contains(a[i])) {
//                            ans.add(a[i]);
//                            break;
//                        }
//                    }
//                }
//            }
//        }
//        if (ans.size() == 0) {
//            ans.add(-1);
//            return ans;
//        }
//
//        return ans;


        //Second Approach
        ArrayList<Integer> result = new ArrayList<>();

        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length && k < arr3.length) {
            if (arr1[i] == arr2[j] && arr2[j] == arr3[k] && !result.contains(arr1[i])) {
                result.add(arr1[i]);
                i++;
                j++;
                k++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr3[k]) {
                j++;
            } else {
                k++;
            }
        }
        if(result.size() == 0) {
            result.add(-1);
            return result;
        }
        return result;
    }
}
