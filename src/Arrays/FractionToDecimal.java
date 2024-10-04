package Arrays;//import java.util.Objects;
//
//public class Arrays.FractionToDecimal {
//
//    public static void main(String[] args) {
//        int num = 16;
//        int denominator = 13;
//
//        System.out.println(fractionToDecimal(num,denominator));
//    }
//
//    private static String fractionToDecimal(double num, double denominator) {
//        String ans = "";
//        boolean flag = false;
//        double l = num/denominator;
//        ans = String.valueOf(l);
//        String[] a = ans.split("\\.");
//        if(a[1].equals("0")) {
//            return a[0];
//        }
//        String b = a[1];
//        char[] c = b.toCharArray();
//        for(int i=1;i<c.length;i++) {
//            if(c[i] == c[i-1]) {
//                flag = true;
//            }
//        }
//        if (flag) {
//            b = "{" + c[0] + "}" ;
//        }
//        ans = a[0] + "." + b;
//        return ans;
//    }
//}

import java.util.HashMap;

public class FractionToDecimal {

    public static String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0) {
            return "0";
        }

        StringBuilder result = new StringBuilder();

        // Handle the sign
        result.append(((numerator > 0) ^ (denominator > 0)) ? "-" : "");

        // Convert to long to handle potential overflow
        long num = Math.abs((long) numerator);
        long denom = Math.abs((long) denominator);

        // Append the integral part
        result.append(num / denom);

        // Calculate the remainder
        long remainder = num % denom;
        if (remainder == 0) {
            return result.toString();
        }

        // Append the fractional part
        result.append(".");

        // Use a HashMap to store the remainder and its corresponding index
        HashMap<Long, Integer> remainderMap = new HashMap<>();
        while (remainder != 0) {
            if (remainderMap.containsKey(remainder)) {
                // Encountered a repeating remainder
                int index = remainderMap.get(remainder);
                result.insert(index, "{");
                result.append("}");
                break;
            }

            remainderMap.put(remainder, result.length());
            remainder *= 10;
            result.append(remainder / denom);
            remainder %= denom;
        }

        return result.toString();
    }

    public static void main(String[] args) {
        // Example usage
        int numerator = 16;
        int denominator = 13;
        System.out.println(fractionToDecimal(numerator, denominator)); // Arrays.Output: "0.(6)"
    }
}
