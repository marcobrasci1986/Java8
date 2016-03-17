package chapter4;

import java.util.function.Predicate;

/**
 * Created by MaBa on 17/03/16.
 */
public class ConcatPredicate {

    public static void main(String[] args) {
        Predicate<String> egg = s ->  s.contains("egg");
        Predicate<String> brown = s ->  s.contains("brown");


        Predicate<String> brownEggs = s ->  s.contains("brown");


        System.out.println(egg.test("egg"));
        System.out.println(egg.test("egg brown"));
        System.out.println(brown.test("banana"));
    }
}
