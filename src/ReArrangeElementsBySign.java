import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class ReArrangeElementsBySign {
        public static void main(String[] args) {
            int[] arr = {-15, 30, 43, -18, -38, 38, 36, 78, -22 ,-68 ,16 ,39 ,-41 ,-15, 98, 69 ,-72, -32};
            int n = arr.length;
            reArrangeNumbers(arr, n);
        }

    private static void reArrangeNumbers(int[] a, int n) {

        // code here
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();


        for(int i=0;i<n;i++) {
            if(a[i] >= 0)
                pos.add(a[i]);
            else
                neg.add(a[i]);
        }

        if(pos.size() >= neg.size()) {
            for( int i=0;i<neg.size();i++) {
                a[2*i] = pos.get(i);
                a[2*i+1] = neg.get(i);
            }
          int index = 2*neg.size();
            for (int j = neg.size(); j < pos.size(); j++) {
                    a[index] = pos.get(j);
                    index++;
            }
        }
        else if(pos.size() < neg.size()) {
            for(int i=0;i<pos.size();i++) {
                a[2*i] = pos.get(i);
                a[2*i+1] = neg.get(i);
            }
            int index = 2* pos.size();
            for (int i = pos.size(); i < neg.size(); i++) {
                a[index] = neg.get(i);
                index++;
            }
        }


        Arrays.stream(a).forEach(e -> System.out.print(e + " "));

    }
}
