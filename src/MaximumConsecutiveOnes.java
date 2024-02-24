import java.util.Arrays;
import java.util.stream.Collectors;

public class MaximumConsecutiveOnes {

    public static void main(String[] args) {
        int a[] = {1,1,0,0,1,0,1,1,1};
        int n = a.length;
        Arrays.stream(a).boxed().collect(Collectors.groupingBy(i ->1,Collectors.counting()));

       int count = 0;
       int max = 0;

        for (int i = 0; i < n; i++) {
            if(a[i] == 1) {
                count++;
                if(count > max) {
                    max = count;
                }
            }
            else if(a[i] != 1) {

                count = 0;

            }
        }
        System.out.println(max);
    }

}
