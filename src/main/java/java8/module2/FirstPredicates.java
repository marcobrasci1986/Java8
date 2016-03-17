package java8.module2;

import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Created by MaBa on 17/03/16.
 */
public class FirstPredicates {

    public static void main(String[] args) {

        Stream<String> stream = Stream.of("one", "two", "three", "four", "five");


        Predicate<String> predicateFilter = s -> s.length() > 3;

        Predicate<String> predicateExact = Predicate.isEqual("two");

        Predicate<String> predicateExact2 = Predicate.isEqual("three");


        stream
                .filter(predicateExact.or(predicateExact2))
                .forEach(s -> System.out.println(s));
    }
}
