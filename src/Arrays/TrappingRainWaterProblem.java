package Arrays;

import java.util.*;
import java.util.stream.Collectors;

public class TrappingRainWaterProblem{

    public static void main(String[] args){
        int[] a = {1,2,3,4,5};
//        Arrays.stream(a).map(x -> x*2).forEach(System.out::println);

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3));
        List<Integer> l = list.stream().map(x->x-1).collect(Collectors.toList());

        HashMap<String,Integer> myMap= new HashMap<String,Integer>();
        myMap.put("oracle",1);
        myMap.put("google",2);
        myMap.put("microsoft",3);

        for(Map.Entry<String,Integer> m:myMap.entrySet()){
            System.out.println(m.getKey());
            System.out.println(m.getValue());
        }

        for(String key: myMap.keySet()){
            Integer value = myMap.get(key);
            System.out.println(key + value);
        }
    }


}
