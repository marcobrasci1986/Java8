package chapter3;

import java.util.function.Predicate;

/**
 * Created by MaBa on 17/03/16.
 */
public class PredicateMain {

    public static void main(String[] args) {
        String matchingString = "abc";

        //Predicate<String> predicateStartsWith = matchingString::startsWith;
        Predicate<String> predicateStartsWith = s -> s.startsWith(matchingString);


        System.out.println(predicateStartsWith.test("marco"));
        System.out.println(predicateStartsWith.test("abcdefg"));


        Predicate<String> lengthGreaterThan5  = (s) -> (s.length() > 5);

        System.out.println(lengthGreaterThan5.test("java2s.com "));
        System.out.println(lengthGreaterThan5.test("abc"));

    }
}
