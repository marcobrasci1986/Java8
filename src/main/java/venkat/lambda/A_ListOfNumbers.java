package venkat.lambda;

import java.util.Arrays;
import java.util.List;

/**
 * Created by MaBa on 18/03/16.
 */
public class A_ListOfNumbers {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // external iterators --> legacy java
//        for(int i = 0; i < numbers.size(); i++){
//            System.out.println(i);
//        }

        // external iterators --> legacy java
//        for (Integer number : numbers) {
//            System.out.println(number);
//        }

        // internal iterators
        numbers.forEach(value -> System.out.println(value));
        numbers.forEach(System.out::println); // method reference syntax
    }
}
