package Arrays;

import java.util.ArrayList;

//Find element which appear > N/3 times
public class MajorityElement2 {
    public static void main(String[] args) {
        int nums[] = {1};
        int n = nums.length;
        System.out.println(majorityElement(nums,n));
    }

    private static ArrayList<Integer> majorityElement(int[] nums, int n) {
        ArrayList<Integer> ans = new ArrayList<>();

        int c1 = 0,c2=0;
        int elem1 =Integer.MAX_VALUE,elem2=Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if(c1 == 0 && elem2 != nums[i]) {
                c1 = 1;
                elem1 = nums[i];
            }
            else if(c2 == 0 && elem1 != nums[i]) {
                c2 = 1;
                elem2 = nums[i];
            }
            else if (elem1 == nums[i])
                c1++;
            else if(elem2 == nums[i])
                c2++;
            else {
                c1--;
                c2--;
            }

        }
        int k =0,l=0;
        for (int i = 0; i < n; i++) {
            if(elem1 == nums[i])
                k++;
            else if (elem2 == nums[i])
                l++;

        }
        if(k > n/3)
            ans.add(elem1);
        if(l > n/3)
            ans.add(elem2);

        if(ans.size() == 0)
            ans.add(-1);

        return ans;
    }
}
