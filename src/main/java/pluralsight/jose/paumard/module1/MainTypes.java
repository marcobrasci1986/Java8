package pluralsight.jose.paumard.module1;

import domain.Person;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Created by MaBa on 21/03/16.
 */
public class MainTypes {

    public static void main(String[] args) {

        /**
         * Consumer
         */
        Consumer<Person> personConsumer = p1 -> System.out.println(p1);
        personConsumer.accept(new Person("Marco", 29));

        /**
         * Supplier
         */
        Supplier<Person> personSupplier = () -> new Person("mark", 52);
        System.out.println(personSupplier.get());

        /**
         * Function
         */
        Function<Person, Integer> ageMapper = person -> person.getAge();
        System.out.println(ageMapper.apply(new Person("Lilly", 98)));


    }
}
