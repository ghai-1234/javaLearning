package Arrays;

public class ValidPalindrome {

    public static void main(String[] args) {
        String s = "ab_a";
        System.out.println(validPalindrome(s));

    }

    private static boolean validPalindrome(String s) {
        s =s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
       // return s;
       return checkPalindrome(s);
    }

    private static boolean checkPalindrome(String s) {

        int n = s.length();
        int i = 0;
        int j = n-1;
        while(i <j ){
            if(s.charAt(i) != s.charAt(j))
            {
                return false;
            }
            else {
                i++;
                j--;
            }
        }
        return true;
    }
}
