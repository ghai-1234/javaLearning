package Arrays;

public class LengthOfLastWord {

    public static void main(String[] args) {

        String s =  "   fly me   to   the moon  ";
        System.out.println(findLengthOfLastWord(s));
    }

    private static int findLengthOfLastWord(String s) {

        s = s.trim();

        int length = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                length++;
            }
            else if (length > 0) {
                break;
            }
        }

        return length;
    }
    /*
    Another 2 approach

    String[] strs = s.trim().split("\\s+");
    return strs[strs.length-1].length();
     */


}
