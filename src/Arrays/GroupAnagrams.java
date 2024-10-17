package Arrays;

import java.util.*;
import java.util.stream.Collectors;

public class GroupAnagrams {

    public static void main(String[] args) {
        String[] str = {"",""};
        System.out.println(groupAnagrams(str));
    }

    public static List<List<String>> groupAnagrams(String[] str) {

        HashMap<String,List<String>> map = new HashMap<>();
        for(String x : str) {
            char[] c = x.toCharArray();
            Arrays.sort(c);
            String b = String.valueOf(c);
            map.computeIfAbsent(b, k -> new ArrayList<>()).add(x);

        }
        List<List<String>> result = new ArrayList<>();
        result.addAll(map.values());
        return result;
    }

    /*return new ArrayList<>(map.entrySet()
            .stream()
        .collect(Collectors.groupingBy(
            Map.Entry::getValue,                 // Group by values
                 Collectors.mapping(Map.Entry::getKey, Collectors.toList())  // Collect keys
            )).values());
            */

}
