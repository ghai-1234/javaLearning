package Arrays;

import java.util.HashMap;

public class WordPattern {


    public static void main(String[] args) {
        String s = "dog cat cat dog";
        String pattern = "abba";
        System.out.println(wordPattern(pattern,s));

    }

    public static boolean wordPattern(String s, String sentence) {

        String[] words = sentence.split("\\s+");

        HashMap<Character,String> map = new HashMap<>();

        if(s.length() != words.length)
            return false;

        int n = s.length();

        for (int i = 0; i < n; i++) {
            if(!map.containsKey(s.charAt(i)) && map.containsValue(words[i])) {
                return false;
            }
            else if (!map.containsKey(s.charAt(i)) ) {
                map.put(s.charAt(i),words[i]);
            }
            else {
                String a = map.get(s.charAt(i));
                if(!a.equals(words[i]))
                    return false;
            }
        }

        return true;



    }
}
