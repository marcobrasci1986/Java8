package pluralsight.jose.paumard.module2;

import domain.City;
import domain.Gender;
import domain.Person;
import mother.PersonMother;

import java.util.*;

/**
 * Created by MaBa on 21/03/16.
 */
public class MapExample {

    public static void main(String[] args) {
        Person p1 = new Person("Sara", Gender.FEMALE, 20);
        Person p2 = new Person("Milla", Gender.FEMALE, 22);
        Person p3 = new Person("Bob", Gender.MALE, 20);
        Person p4 = new Person("Paula", Gender.FEMALE, 32);
        Person p5 = new Person("Paul", Gender.MALE, 32);
        Person p6 = new Person("Jack", Gender.MALE, 2);
        Person p7 = new Person("Jack", Gender.MALE, 72);
        Person p8 = new Person("Jill", Gender.FEMALE, 12);

        City newYork = new City("New York");
        City brussels = new City("Brussels");
        City paris = new City("Paris");


        Map<City, List<Person>> map = new HashMap<>();

        map.putIfAbsent(paris, new ArrayList<>());
        map.get(paris).add(p1);

        map.computeIfAbsent(newYork, city -> new ArrayList<>()).add(p2);
        map.computeIfAbsent(newYork, city -> new ArrayList<>()).add(p3);



        System.out.println("People from paris: " + map.getOrDefault(paris, Collections.EMPTY_LIST));
        System.out.println("People from newYork: " + map.getOrDefault(newYork, Collections.EMPTY_LIST));






    }
}
