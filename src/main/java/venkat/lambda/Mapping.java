package venkat.lambda;

import java.util.Arrays;
import java.util.List;

/**
 * Created by MaBa on 18/03/16.
 */
public class Mapping {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);


        numbers
                .stream()
                .map(String::valueOf) // method reference -> static method
                .forEach(System.out::println);
    }
}
