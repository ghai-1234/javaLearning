package Arrays;

import java.util.*;

public class nonrepeatingCharacterString {

    static TreeSet<String> distinctSubString(String P, int N)
    {
        // Hashmap to store all subStrings
        TreeSet<String> S = new TreeSet<String>();

        // Iterate over all the subStrings
        for (int i = 0; i < N; ++i) {

            // Boolean array to maintain all
            // characters encountered so far
            boolean []freq = new boolean[26];
            // Variable to maintain the
            // subString till current position
            String s = "";

            for (int j = i; j < N; ++j) {

                // Get the position of the
                // character in the String
                int pos = P.charAt(j) - 'a';

                // Check if the character is
                // encountred
                if (freq[pos] == true)
                    break;

                freq[pos] = true;

                // Add the current character
                // to the subString
                s += P.charAt(j);

                // Insert subString in Hashmap
                S.add(s);
            }
        }
        class pair  {
            long first, second;
            public pair(long first, long second)
            {
                this.first = first;
                this.second = second;
            }

            public pair() {

            }
        }
        long[] a = null;
        long[] b = null;
        int x = 9;
        Arrays.sort(a);
        ArrayList<Long> list = new ArrayList<>();
        ArrayList<pair> ans = new ArrayList<>();
        pair p = new pair();
        long n = 0L;
        long m = 0L;

        for(int i = 0; i<n; i++) {
            list.add(a[i]);
        }


        for(int i=0;i<m;i++) {
            if(list.contains(x-b[i])) {
                p.first = x-b[i];
                p.second = b[i];
                ans.add(p);
            }
        }


        for (int i = 0; i < N; i++) {
            String elem = String.valueOf(P.charAt(i));
            if(S.contains(elem)) {
                S.remove(elem);

                P.contains(String.valueOf(P.charAt(i)));
            }
        }

        return S;
    }

    // Driver code
    public static void main(String[] args)
    {
        String S = "abab";
        int N = S.length();

        System.out.print(distinctSubString(S, N));
    }
}
