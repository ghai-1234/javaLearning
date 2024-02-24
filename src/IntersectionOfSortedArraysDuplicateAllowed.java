import java.util.ArrayList;
import java.util.HashSet;

public class IntersectionOfSortedArraysDuplicateAllowed {

   static ArrayList<Integer> result = new ArrayList<>();

    public static void main(String[] args) {
        int a[] = {1,2,5,12,3,6};
        int b[] = {12,3,2,1,3};
        int m = a.length;
        int n = b.length;
        //findIntersectionWithDuplicate(a,b,m,n);
        //findIntersectionWithOutDuplicate(a,b,m,n);
        findIntersectionIfUnsortedArray(a,b,m,n);
    }

    private static void findIntersectionIfUnsortedArray(int[] a, int[] b, int m, int n) {
        HashSet<Integer> set = new HashSet<>();
        for(int c : a) {
            set.add(c);
        }

        for (int c : b) {
            if(set.contains(c)) {
                result.add(c);
                set.remove(c);
            }
        }

        result.forEach(System.out::println);
    }

    private static void findIntersectionWithDuplicate(int[] a, int[] b, int m, int n) {

        int i=0,j=0;
        while(i<m && j < n ) {
            if(a[i] < b[j]) {
                i++;
            }
            else if(b[j] < a[i]) {
                j++;
            }
            else if(a[i] == b[j]) {
                result.add(a[i]);
                i++;j++;
            }
        }

        result.forEach(System.out::println);
    }
    private static void findIntersectionWithOutDuplicate(int[] a, int[] b, int m, int n) {
        int i=0,j=0;
        while(i<m && j < n ) {
                if(i>0 && a[i] == a[i-1]) {
                    i++;
                }
            else if(a[i] < b[j]) {
                i++;
            }
            else if(b[j] < a[i]) {
                j++;
            }
            else if(a[i] == b[j]) {
                result.add(a[i]);
                i++;j++;
            }
        }

        result.forEach(System.out::println);
    }




}
