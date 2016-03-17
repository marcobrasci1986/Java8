package java8.module2;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Created by MaBa on 17/03/16.
 *
 * Foreach  == final operation (not lazy)
 *
 * Filter == intermediary operation (lazy)
 * Peek == intermediary operation (lazy)
 */
public class IntermediaryAndFinal {

    public static void main(String[] args) {

        Stream<String> stream = Stream.of("one", "two", "three", "four", "five");


        Predicate<String> predicateExact = Predicate.isEqual("two");

        Predicate<String> predicateExact2 = Predicate.isEqual("three");

        ArrayList<String> list = new ArrayList<>();

        stream
                .peek(s -> System.out.println(s))
                .filter(predicateExact.or(predicateExact2))
                .forEach(s -> list.add(s));

        System.out.println("Done");
        System.out.println("Size: " +  list.size());

    }
}
