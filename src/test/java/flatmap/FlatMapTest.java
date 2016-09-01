package flatmap;

import domain.Developer;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

/**
 * Created by mbrasci on 03/08/2016.
 */
public class FlatMapTest {
    List<Developer> team;

    @Before
    public void setUp() throws Exception {
        team = new ArrayList<>();
        Developer polyglot = new Developer("esoteric");
        polyglot.add("clojure");
        polyglot.add("scala");
        polyglot.add("groovy");
        polyglot.add("go");

        Developer busy = new Developer("pragmatic");
        busy.add("java");
        busy.add("aaa");
        busy.add("javascript");

        Developer duplicateName = new Developer("pragmatic");
        duplicateName.add("java");

        team.add(polyglot);
        team.add(busy);
        team.add(duplicateName);
    }

    @Test
    public void testSimpleMap() {
        List<String> collected = Stream.of("a", "b", "hello") // Stream of String
                .map(String::toUpperCase) // Returns a stream consisting of the results of applying the given function to the elements of this stream.
                .collect(Collectors.toList());

        assertEquals(asList("A", "B", "HELLO"), collected);
    }

    @Test
    public void testflatListOfObjects() throws Exception {
        List<Integer> together = Stream.of(asList(1, 2), asList(3, 4)) // Stream of List<Integer>
                .flatMap(numbers -> numbers.stream())
                .map(integer -> integer + 1)
                .collect(Collectors.toList());

        System.out.println(together);
//        assertEquals(asList(2, 3, 4, 5), together);
    }

    /**
     * Convert list of Developer to a list of Strings
     * @throws Exception
     */
    @Test
    public void testFlatMap() throws Exception {
        List<String> result = team.stream()
                .map(developer -> developer.getLanguages())
                .flatMap(element -> element.stream())
                .sorted()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(result);
    }

    @Test
    public void testFlatMapNames() throws Exception {
        List<String> result = team.stream()
                .map(developer -> developer.getName())
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(result);
    }
}