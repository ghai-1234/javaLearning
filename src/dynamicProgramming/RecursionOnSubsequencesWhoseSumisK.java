package dynamicProgramming;

import java.util.ArrayList;
import java.util.List;

public class RecursionOnSubsequencesWhoseSumisK {

    public static void main(String[] args) {
        int [] a = {3,1,2,10,4,3,6,7};
        System.out.println(perfectSum(a,a.length,11));

    }

    public static int perfectSum(int arr[],int n, int target)
    {
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        int count = 0;
        printSubsequences(0,arr,list,sum,target,count);
        return count;

    }

    private static void printSubsequences(int index, int[] a,  List<Integer> list,int sum,int target,int count) {

        if (index == a.length) {
            if(sum == target) {
                System.out.println(list);
                ++count;
            }
            return;
        }

        //Pick the element
        list.add(a[index]);
        sum = sum + a[index];
        printSubsequences(index+1,a,list,sum,target,count);
        //Remove it and change the list to the previous state
        list.remove(list.size()-1);
        sum = sum - a[index];

        //Do not include the element and move forward
        printSubsequences(index+1,a,list,sum,target,count);


    }

}
