import java.util.Stack;

public class ReverseWordwithdelimiter {

    public static void main(String[] args) {
        String str = "i.like.this.program.very.much";

        String ans = "";
        Stack s = new Stack();
        for (int i = str.length() - 1; i >= 0; i--) {

            if (i == 0) {
                s.push(str.charAt(i));
                ans = popOut(ans, s,i);
            } else if (str.charAt(i) != '.') {
                s.push(str.charAt(i));
            } else if (str.charAt(i) == '.') {
                ans = popOut(ans, s,i);
            }
        }
        System.out.println("Answer " + ans);
    }

    public static String popOut(String ans,Stack s, int i ) {
        while (!s.isEmpty()) {
            ans = ans.concat(String.valueOf(s.pop()));
        }
        if(i!=0)
         ans =  ans.concat(".");
        return ans;
    }
}
