package Arrays;

import java.util.Arrays;

//Majority element is an element which appears more than N/2 times
//Also known asn Moore's voting algorithm
public class MajorityElement {

    public static void main(String[] args) {
        int[] arr = {15};
        int n = arr.length;
        int ans = majorityElement(arr, n);
        System.out.println(ans);
    }

    private static int majorityElement(int[] arr, int n) {

        int count = 0;
        int element = 0;

        for (int i = 0; i < n; i++) {

            if(count == 0) {
                count = 1;
                element = arr[i];
            }

            else if (arr[i] == element) {
                count++;
            }
           else if(arr[i] != element) {
                count--;
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] == element)
                ans++;
        }
        if(ans > n/2)
            return element;

        return -1;

    }
}
