import java.util.*;
import java.util.stream.Collectors;

public class streamLearning {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int sumEven = list.stream().filter(num -> num % 2 == 0).mapToInt(Integer::intValue).sum();


        List<Integer>  num = Arrays.asList(1, 2, 3, 4, 5,9, 10);
        List squareNum = num.stream().map(x -> x*x*x).collect(Collectors.toList());


        Map<String, Integer> scores = new HashMap<String, Integer>() {{
            put("Alice", 95);
            put("Bob", 88);
            put("Charlie", 75);
        }};

        scores.forEach((sc,pi) -> System.out.println(sc + " " + pi));


    }
}
