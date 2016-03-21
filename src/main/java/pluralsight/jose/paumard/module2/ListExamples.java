package pluralsight.jose.paumard.module2;

import domain.Person;
import mother.PersonMother;

import java.util.Comparator;
import java.util.List;

/**
 * Created by MaBa on 21/03/16.
 */
public class ListExamples {

    public static void main(String[] args) {
        List<Person> people = PersonMother.createPerson2();



        people.removeIf(p -> p.getAge() < 30);
        people.replaceAll(p -> new Person(p.getName().toUpperCase(), p.getAge()));
        people.sort(Comparator.comparing(Person::getAge).reversed());

        people.forEach(System.out::println);


    }
}
