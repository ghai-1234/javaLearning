package Arrays;

public class ExcelSheet {
    public static void main(String[] args) {

        String s = "ZYA";
       // System.out.println('Y'-'A' + 1);
       System.out.println(titleToNumber(s));

    }

    public static int titleToNumber(String a) {
        int n = a.length();
        char[] c = a.toCharArray();
        int ans = 0;
        for(int i = 0;i<c.length;i++) {
            int num = c[i] - 'A' + 1;
            ans = ans*26 + num;
        }
        return ans;
    }

}
