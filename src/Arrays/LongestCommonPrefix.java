package Arrays;

public class LongestCommonPrefix {

    public static void main(String[] args) {
            String[] s = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(s));
    }
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        StringBuilder ans = new StringBuilder();
        int minLen = strs[0].length();

        // Find minimum length string in the array
        for (String x : strs) {
            minLen = Math.min(minLen, x.length());
        }

        // Compare characters for all strings up to minLen
        for (int i = 0; i < minLen; i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) != c) {
                    return ans.toString();
                }
            }
            ans.append(c);
        }

        return ans.toString();
    }
}

//My Way of leetcode doing

/*StringBuilder ans = new StringBuilder("");

int n = strs.length;

int minLen = strs[0].length();

        for(String x : strs) {
int l = x.length();
minLen = Math.min(minLen,l);
        }



int flag ;
    for(int i = 0;i<minLen;i++) {
char c = strs[0].charAt(i);
flag = 1;

        for(int j = 1;j<n;j++) {
        if(strs[j].charAt(i) != c){
flag = 0;
        break;
        }
        }
        if(flag == 1) {
        ans.append(c);
        }
                if(flag == 0) {
        break;
        }
        }
        return ans.toString();
    }

 */

