package java8.module2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Created by MaBa on 18/03/16.
 */
public class ReductionExample {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList();

        Optional<Integer> listCount = list.stream().reduce(Integer::max);

        System.out.println("Count: " + listCount);
    }
}
