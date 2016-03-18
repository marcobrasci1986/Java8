package java8.module2;

import domain.Person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * Created by MaBa on 18/03/16.
 */
public class ListFilter {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        persons.add(new Person("John", 30));
        persons.add(new Person("Els", 15));
        persons.add(new Person("Miep", 45));
        persons.add(new Person("Jane", 85));



        Optional<Integer> optional= persons.stream()
                .map(person -> person.getAge()) // returns a stream of int's
                .filter(age -> age > 20)
                .min(Comparator.naturalOrder());

        System.out.println(optional);


        boolean test = persons.stream()
                .map(person -> person.getName())
                .allMatch(s -> s.length() > 3);

        System.out.println(test);
    }

}
