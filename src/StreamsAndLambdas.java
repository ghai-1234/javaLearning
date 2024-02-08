import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsAndLambdas {

    public static void main(String[] args) {


        List<Double> list = Collections.singletonList(1.0);
       Double sum = list.stream().mapToDouble(Double::doubleValue).sum();

        System.out.println(sum);

       }
}
