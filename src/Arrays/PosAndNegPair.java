package Arrays;

import java.util.*;

public class PosAndNegPair {

    public static void main(String[] args) {
       int n = 8;
       long a[ ] = {1, -3, 2, 3, 6, -1, -3, 3,-3};

        ArrayList<Long> list = new ArrayList<>(Arrays.asList(1L, 2L, 3L, 4L, 5L));

       // System.out.println(PosNegPair(a,n));
        System.out.println(list);
    }

    public static List<Long> PosNegPair(long a[], long n) {
        List<Long> b = new ArrayList<>();
        List<Long> d = new ArrayList<>();
        for (long c:a) {
            if(c < 0) {
                b.add(c);
            }
            else {
                d.add(c);
            }

        }
        Collections.sort(b,Collections.reverseOrder());
        Collections.sort(d);
        List<Long> l = new ArrayList<>();


        for (long c:b) {

            if (d.contains(c * -1)) {
                l.add(c);
                l.add(-1 * c);
                d.remove(Long.valueOf(c));

            }

        }

        return  l;
    }
}
