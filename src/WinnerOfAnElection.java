import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class WinnerOfAnElection {

    public static void main(String[] args) {
        String arr[] = {"john", "johnny", "jackie", "johnny", "john",
                "jackie", "jamie", "jamie", "john", "johnny", "jamie",
                "johnny", "john"};
        String b[] = {"and","bla","cla"};
        int n = arr.length;
        String[] ans = winner(b,n);
        for (String s :  ans) {
            System.out.println(s);
        }
    }

    public static String[] winner(String arr[], int n) {
        // add your code
        Map<String, Integer> map = new TreeMap<>();
        for (String s : arr) {
                map.put(s, map.getOrDefault(s, 0) + 1);
        }
        String[] ans = new String[2];
        int max = 0;
        String person = "";
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (max < entry.getValue()) {
                max = entry.getValue();
                person = entry.getKey();
            }
        }
        ans[0] = person;
        ans[1] = String.valueOf(max);

        return ans;

    }
}
