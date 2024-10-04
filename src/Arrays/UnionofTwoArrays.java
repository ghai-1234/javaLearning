package Arrays;

import java.util.ArrayList;

public class UnionofTwoArrays {

    public static void main(String[] args) {

        int a[] = {0,1,1,2,3,7,10,12,13,13,15};
        int b[] = {1, 2, 4, 6,8,8,10,11,12,14};
        int m = a.length;
        int n = b.length;
        unionofTwoArrays(a,b,m,n);

    }

    private static void unionofTwoArrays(int[] a, int[] b, int m, int n) {
        int i=0;int j = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        while(i < m && j < n ) {
            if(a[i] <= b[j])  {
                if(!ans.contains(a[i])) {
                    ans.add(a[i]);
                }
                i++;
            }
            else if(a[i] > b[j]) {
                if(!ans.contains(b[j])) {
                    ans.add(b[j]);
                }
                j++;
            }
       }
        while (j < n && !ans.contains(b[j]) ) {
            ans.add(b[j]);
            j++;
        }
        while(i<m)  {
            if(!ans.contains(a[i])) {
                ans.add(a[i]);
            }
            i++;
        }
        while(j<n)  {
            if(!ans.contains(b[j])) {
                ans.add(b[j]);
            }
            j++;
        }
        ans.forEach(element -> System.out.print(element + " "));
    }
}
