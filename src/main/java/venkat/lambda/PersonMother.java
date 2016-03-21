package venkat.lambda;

import domain.Gender;
import domain.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by MaBa on 21/03/16.
 */
public class PersonMother {
    public static List<Person> createPerson() {
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

    public static List<Person> createPerson2() {

        Person p1 = new Person("Sara", Gender.FEMALE, 20);
        Person p2 = new Person("Sara", Gender.FEMALE, 22);
        Person p3 = new Person("Bob", Gender.MALE, 20);
        Person p4 = new Person("Paula", Gender.FEMALE, 32);
        Person p5 = new Person("Paul", Gender.MALE, 32);
        Person p6 = new Person("Jack", Gender.MALE, 2);
        Person p7 = new Person("Jack", Gender.MALE, 72);
        Person p8 = new Person("Jill", Gender.FEMALE, 12);

        return new ArrayList(Arrays.asList(p1, p2, p3, p4, p5,p6, p7, p8));

    }
}
