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
public class CreateMap {

    public static void main(String[] args) {

        List<Person> people = createPerson();

        // Maps with name + age as key, person as value
        Map<String, Person> map = people.stream()
                .collect(Collectors.toMap(
                        person -> person.getName() + " - " + person.getAge(), // key
                        person -> person // value
                ));

        System.out.println(map);


    }

    public static List<Person> createPerson(){
        return Arrays.asList(
                new Person("Sara", Gender.FEMALE, 20),
                new Person("Sara", Gender.FEMALE, 22),
                new Person("Bob", Gender.MALE, 20),
                new Person("Paula", Gender.FEMALE, 32),
                new Person("Paul", Gender.MALE, 32),
                new Person("Jack", Gender.MALE, 2),
                new Person("Jack", Gender.MALE, 72),
                new Person("Jill", Gender.FEMALE, 12)
        );
    }
}
