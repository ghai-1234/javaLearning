import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PermutationsOfString {

        public static List<String> permutations(String str) {
            if (str.isEmpty()) {
                return Arrays.asList("");
            }

            List<String> permutations = new ArrayList<>();
            for (int i = 0; i < str.length(); i++) {
                String remainingString = str.substring(0, i) + str.substring(i + 1);
                for (String permutation : permutations(remainingString)) {
                    permutations.add(str.charAt(i) + permutation);
                }
            }

            return permutations;
        }

        public static void main(String[] args) {
            String str = "abcd";
            List<String> permutations = permutations(str);
            //permutations.sort(String::compareTo);
            Collections.sort(permutations);
            for (String s: permutations) {
                System.out.println(s);
            }
        }
    }
