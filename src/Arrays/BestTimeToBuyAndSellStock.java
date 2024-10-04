package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {


        int a[] = {7, 1, 5, 3, 6, 4};
        int n = a.length;

        int sum;
        int ans = 0;


        //brute approach
//        for (int i = 0; i < n-1; i++) {
//            for (int j = i+1; j < n; j++) {
//                sum = a[j] - a[i];
//                ans = Math.max(ans,sum);
//            }
//        }

        //optimal approach using DP
        int cost ;
        int min = a[0];
        int profit = 0;

        for (int i = 0; i < n; i++) {
            cost = a[i] - min;
            profit = Math.max(cost,profit);
            min = Math.min(a[i],min);

        }


        System.out.println(profit);

//
//      List<Character> ab = new ArrayList<>();
//        String ransomNote = "aa";
//        String magazine = "aab";
//
//        for(int i=0;i<ransomNote.length();i++) {
//            ab.add(ransomNote.charAt(i));
//        }
//
//        for(int i=magazine.length()-1;i>=0;i--) {
//            char c = magazine.charAt(i);
//            if(ab.contains(c)) {
//                ab.remove(Character.valueOf(c));
//            }
//        }
//
//        System.out.println(ab.isEmpty());

    }

}
