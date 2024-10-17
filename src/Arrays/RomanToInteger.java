package Arrays;

public class RomanToInteger {

    public static void main(String[] args) {

        String s = "XV";
        //System.out.println(s.indexOf("ekt"));
        System.out.println(romanToInt(s));
//        I             1
//        V             5
//        X             10
//        L             50
//        C             100
//        D             500
//        M             1000

//        I can be placed before V (5) and X (10) to make 4 and 9.
//        X can be placed before L (50) and C (100) to make 40 and 90.
//        C can be placed before D (500) and M (1000) to make 400 and 900.
    }

    public static int romanToInt(String s) {

        int n = s.length();
        int ans = 0;

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            int value = 0;

            switch (c) {
                case 'M': value = 1000; break;
                case 'D': value = 500; break;
                case 'C': value = 100; break;
                case 'L': value = 50; break;
                case 'X': value = 10; break;
                case 'V': value = 5; break;
                case 'I': value = 1; break;
            }

            if (i < n - 1 && (
                    (c == 'C' && (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M')) ||
                            (c == 'X' && (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C')) ||
                            (c == 'I' && (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X'))
            )) {
                ans -= value;
            } else {
                ans += value;
            }
        }

        return ans;


    }
}
