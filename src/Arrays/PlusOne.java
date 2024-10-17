package Arrays;

import java.util.Arrays;

public class PlusOne {

    public static void main(String[] args) {
        int[] num = {1,2,3,9,9};
        int[] ans = plusOne(num);

        Arrays.stream(ans).forEach(System.out::println);
    }

    private static int[] plusOne(int[] a) {

        int n = a.length;
        int carry = 1;

        for(int i = n-1;i>=0;i--) {
            int x = a[i] + carry;
            a[i] = x%10;
            carry = x /10;

            if(carry == 0)
                break;
            if(i == 0 && carry !=0) {
                int[] newArr = new int[n + 1];
                newArr[0] = carry;

                System.arraycopy(a,0,newArr,1,n);
                return newArr;
            }
        }
        return a;
    }
}
