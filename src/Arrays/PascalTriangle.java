package Arrays;

import java.util.ArrayList;

public class PascalTriangle {
    public static void main(String[] args) {
        int n =90;
        System.out.println(findNRowOfPascalTriangle(n));
    }

    private static ArrayList<Long> findNRowOfPascalTriangle(int n) {
        ArrayList<Long> result = new ArrayList<>();
        Long ans = 1L;
        result.add(ans);

        for (int i = 1; i < n; i++) {

            ans = ans * (n-i);
            ans = ans / i;
            result.add(ans);
        }
        return result;
    }
}
