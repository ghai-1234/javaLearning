package Arrays;

import java.util.ArrayList;
import java.util.List;

public class SpiralTraversalOfArray {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {0, 1, 3 }
        };

        List<Integer> result = spiralOrder(matrix);
        System.out.println("Spiral Order: " + result);
    }

    private static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int rows = matrix.length;
        int cols = matrix[0].length;

        int top = 0,bottom = rows-1,left=0,right = cols-1;

        while (top<=bottom && left<=right) {
            for(int i=left;i<=right;i++) {
                ans.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++) {
                ans.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom) {
                for (int i = right; i >= left; i--) {
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left<=right) {
                for (int i = bottom; i >= top; i--) {
                    ans.add(matrix[i][left]);
                }
                left++;
            }


        }

    return ans;
    }
}
