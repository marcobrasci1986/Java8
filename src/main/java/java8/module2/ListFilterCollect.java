package java8.module2;

import domain.Person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Created by MaBa on 18/03/16.
 */
public class ListFilterCollect {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        persons.add(new Person("John", 30));
        persons.add(new Person("Els", 15));
        persons.add(new Person("Miep", 45));
        persons.add(new Person("Jane", 85));



        String result = persons.stream()
                .filter(person -> person.getAge() > 20)
                .map(Person::getName)
                .collect(
                        Collectors.joining(", ")
                );

        System.out.println(result);

    }

}
