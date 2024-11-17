package dynamicProgramming;

import java.util.ArrayList;
import java.util.List;

public class RecursionOnSubsequences {

    public static void main(String[] args) {
        char [] a = {'g','g','g'};
        int n = a.length;
        List<Character> list = new ArrayList<>();
        printSubsequences(0,a,list);

    }


    private static void printSubsequences(int index, char[] a,  List<Character> list) {

        if (index == a.length) {
            System.out.println(list);
            return;
        }

        //Pick the element
        list.add(a[index]);
        printSubsequences(index+1,a,list);
        //Remove it and change the list to the previous state
        list.remove(list.size()-1);

        //Do not include the element and move forward
        printSubsequences(index+1,a,list);



    }

}
