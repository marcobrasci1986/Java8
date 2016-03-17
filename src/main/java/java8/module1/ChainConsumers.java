package java8.module1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by MaBa on 17/03/16.
 */
public class ChainConsumers {

    public static void main(String[] args) {
        List<String> strings =
                Arrays.asList("one", "two", "three", "four", "five");


        List<String> result = new ArrayList<>();

        Consumer<String> consumer = s -> System.out.println(s);
        Consumer<String> consumer2 = s -> result.add(s);

        strings.forEach(consumer.andThen(consumer2));

        System.out.println(result);
    }
}
