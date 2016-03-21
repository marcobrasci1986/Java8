package venkat.lambda;

import domain.Gender;
import domain.Person;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by MaBa on 18/03/16.
 */
public class CreateMapGrouping {

    public static void main(String[] args) {

        List<Person> people = PersonMother.createPerson();


        Map<String, List<Person>> collect = people.stream()
                .collect(Collectors.groupingBy(Person::getName));


        System.out.println(collect);


        Map<String, List<Integer>> collectAge = people.stream()
                .collect(Collectors.groupingBy(Person::getName, // key
                        Collectors.mapping(Person::getAge, Collectors.toList()))); // value


        System.out.println(collectAge);

    }



}
