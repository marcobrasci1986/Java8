package venkat.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

/**
 * Created by MaBa on 18/03/16.
 */
public class MethodReferences {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);


        Integer sum = numbers
                .stream()
                .reduce(0, Integer::sum);

        System.out.println(sum);


        String concat = numbers
                .stream()
                .map(String::valueOf)
//                .reduce("", (carry, str) -> carry.concat(str));
                .reduce("", String::concat);
        System.out.println("Hello, world" +
                "");

        System.out.println(concat);
    }
}
