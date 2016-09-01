package flatmap;

import domain.Gender;
import domain.Person;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by mbrasci on 03/08/2016.
 */
public class FlatMapSumTest {
    List<Person> team;

    @Before
    public void setUp() throws Exception {
        team = new ArrayList<>();

        team.add(new Person("CEO", Gender.MALE, 60, 5000));
        team.add(new Person("Employee", Gender.MALE, 22, 1200));
        team.add(new Person("HR", Gender.FEMALE, 42, 2500));

    }

    @Test
    public void testCombinedSalary() throws Exception {
        long sum = team.stream()
                .map(person -> person.getSalary()) // stream of Long
                .mapToLong(e -> e)
                .sum();

        long sum2 = team.stream()
                .mapToLong(e -> e.getSalary())
                .sum();

        assertEquals(8700L, sum);
        assertEquals(8700L, sum2);
    }
}