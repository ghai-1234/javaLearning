package Arrays;

import java.util.*;

public class IsomorphicStrings {

    public static void main(String[] args) {
        String s1 = "bbbaaaba";
        String s2 = "aaabbbba";
        System.out.println(isIsomorphic(s1,s2));
    }

    private static boolean isIsomorphic(String s1, String s2) {

        if(s1.length() != s2.length())
            return false;

        HashMap<Character,Integer> m1 = new LinkedHashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            m1.put(s1.charAt(i),m1.getOrDefault(s1.charAt(i),0)+1);
        }

        HashMap<Character,Integer> m2 = new HashMap<>();
        for (int i = 0; i < s2.length(); i++) {
            m2.put(s2.charAt(i),m2.getOrDefault(s2.charAt(i),0)+1);
        }

        Set set1 = m1.keySet();
        Set set2 = m2.keySet();
        List ar1 = new ArrayList(set1);
        List ar2 = new ArrayList(set2);


        if(m1.values().size() != m2.values().size())
            return false;
        for(int i=0;i<m1.values().size();i++) {
            if( (m1.get(i) != m2.get(i)) && (ar1.get(i) == ar2.get(i)) ) {
                return false;
            } else if ( (m1.get(i) == m2.get(i)) && (ar1.get(i) == ar2.get(i)) ) {
                return false;

            }
        }
            return true;
    }
}
