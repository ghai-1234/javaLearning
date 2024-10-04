package Arrays;

public class HappyNumber {

    public static boolean isHappy(int n) {
        int slow = n, fast = n;

        do {
            slow = sumOfSquares(slow); // Move slow pointer one step
            fast = sumOfSquares(sumOfSquares(fast)); // Move fast pointer two steps
        } while (slow != fast); // If there's a cycle, they will eventually meet

        return slow == 1; // If slow pointer reaches 1, the number is happy
    }

    private static int sumOfSquares(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int number = 63; // Number to test
        if (isHappy(number)) {
            System.out.println(number + " is a happy number.");
        } else {
            System.out.println(number + " is not a happy number.");
        }
    }
}
