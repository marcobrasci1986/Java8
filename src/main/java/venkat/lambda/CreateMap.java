package venkat.lambda;

import domain.Person;
import mother.PersonMother;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by MaBa on 18/03/16.
 */
public class CreateMap {

    public static void main(String[] args) {

        List<Person> people = PersonMother.createPerson();

        // Maps with name + age as key, person as value
        Map<String, Person> map = people.stream()
                .collect(Collectors.toMap(
                        person -> person.getName() + " - " + person.getAge(), // key
                        person -> person // value
                ));

        System.out.println(map);


    }


}
