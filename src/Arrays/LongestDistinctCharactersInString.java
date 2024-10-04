package Arrays;

public class LongestDistinctCharactersInString {

    public static void main(String[] args) {

        String s = "geeksforgeeks";
        System.out.println(longestSubstrDistinctChars(s));

    }

    static int longestSubstrDistinctChars(String s){
        int ans = 1;
        int n = s.length();

        if(s.isEmpty())
            return 0;

        for (int i = 0; i < n-1 ; i++) {
            StringBuilder b = new StringBuilder("" + s.charAt(i));

            for (int j = i+1; j < n; j++) {

                if(!b.toString().contains((""+s.charAt(j))))
                {
                    b.append(s.charAt(j));
                }
                else {
                    break;
                }
                ans = Math.max(ans,b.length());
            }
        }

return ans;

    }
}
