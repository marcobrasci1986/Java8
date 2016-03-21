package venkat.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Created by MaBa on 18/03/16.
 */
public class Test {

    private static int unitsOfWork = 0;

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 5, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);


        int result = 0;
        for (Integer number : numbers) {
            if (number > 3 && number % 2 == 0) {
                result = number * 2;
                break;
            }
        }
        System.out.println(result);

////////////////////////////////////////////////////

        Optional<Integer> optional = numbers.stream()
                .filter(Test::isGT3)
                .filter(Test::isEven)
                .map(Test::doubleIt)
                .findFirst();

        System.out.println(optional);
        System.out.println("Units of work: " + unitsOfWork);

    }

    private static boolean isGT3(Integer integer) {
        unitsOfWork++;
        System.out.println("Greater than 3 : " + integer);
        return integer > 3;
    }

    private static boolean isEven(Integer integer) {
        unitsOfWork++;
        System.out.println("Is even : " + integer);
        return integer % 2 == 0;
    }

    private static Integer doubleIt(Integer integer) {
        unitsOfWork++;
        System.out.println("Double it: " + integer*2);
        return integer * 2;
    }
}
