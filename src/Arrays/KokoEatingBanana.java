package Arrays;

import java.util.Arrays;

public class KokoEatingBanana {
    public static void main(String[] args) {
        int a[] = {30,11,23,4,20};
        int h = 6;
        System.out.println(minEatingSpeed(a,h));
    }

    public static int minEatingSpeed(int[] piles, int h) {

        Arrays.sort(piles);

        int n = piles.length;

        int low = 1;
        int high = piles[n-1];
        int result = 0;

        while(low<=high) {
            int mid = (low+high) / 2;
            if(canEat(piles,mid,h)) {
                result = mid;
                high = mid - 1;

            }
            else {
                low = mid + 1;
            }
        }
        return result;
}

    private static boolean canEat(int[] piles, int mid, int h) {
        int totalHour = 0;
        for (int c : piles) {
            totalHour += Math.ceil((double)c/mid);
        }

        return totalHour<=h;

    }
    }
