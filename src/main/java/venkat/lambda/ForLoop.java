package venkat.lambda;

import java.util.Arrays;
import java.util.List;

/**
 * Created by MaBa on 18/03/16.
 */
public class ForLoop {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);


        int total = 0;

        for (Integer number : numbers) {
            if (number % 2 == 0) {
                total += number * 2;
            }
        } // 4 + 8 + 12 + 16 + 20

        System.out.println(total);


        /**
         * Simple pass through.
         * Pipeline, function composition
         */
        int totalStream = numbers
                .stream() // given a collection
                .filter(number -> number % 2 == 0) // only give me the even numbers
                .mapToInt(number -> number * 2) // for every even number, double it and map it to an int
                .sum();

        System.out.println(totalStream);
    }
}
