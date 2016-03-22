package venkat2.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by MaBa on 21/03/16.
 */
public class PredicateExample {


    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // total
        Integer total = totalValues(numbers, integer -> true);

        // total even
        Integer even = totalValues(numbers, Util::isEven);

        // total uneven
        Integer uneven = totalValues(numbers, Util::isOdd);


        System.out.println(total);
        System.out.println(even);
        System.out.println(uneven);


    }

    public static Integer totalValues(List<Integer> values, Predicate<Integer> selector){
        // Imperative
//        int result = 0;
//        for (Integer value : values) {
//            if(selector.test(value)){
//                result += value;
//            }
//        }
//        return result;

        return values.stream()
                .filter(selector)
                .reduce(0, Integer::sum);
    }
}
