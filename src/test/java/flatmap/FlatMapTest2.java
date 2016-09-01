package flatmap;

import domain.Author;
import domain.Book;
import domain.Child;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toSet;

/**
 * Created by mbrasci on 03/08/2016.
 */
public class FlatMapTest2 {
    private List<Book> library = new ArrayList<>();

    private Author danBrown;
    private Author jamesRollins;
    private Author michaelCritchton;

    @Before
    public void setUp() throws Exception {

        danBrown = new Author("Dan Brown", 45);
        danBrown.getChildren().add(new Child("marry"));
        danBrown.getChildren().add(new Child("john"));


        jamesRollins = new Author("James Rollins", 53);
        jamesRollins.getChildren().add(new Child("nancy"));
        jamesRollins.getChildren().add(new Child("john"));

        michaelCritchton = new Author("Michael Critchton", 73);
        michaelCritchton.getChildren().add(new Child("marry"));
        michaelCritchton.getChildren().add(new Child("mark"));

        library.add(new Book("State of Fear", michaelCritchton));
        library.add(new Book("Jurassic Park", michaelCritchton));
        library.add(new Book("Da Vinci", danBrown));
        library.add(new Book("Bernini", danBrown));
        library.add(new Book("The Last Oracle", jamesRollins));
        library.add(new Book("Sand Storm", jamesRollins));

    }

    /**
     * Converteer een lijst van object naar een lijst van een ander type
     * <p>
     * map -> input is a single object
     */
    @Test
    public void testMap() {

        List<String> authors = library.stream()
                .map(book -> book.getAuthor()) // work with a stream of Authors
                .filter(author -> author.getAge() > 50)
                .map(Author::getName) // we only want the name of the Author, returns stream of Strings
                .map(String::toUpperCase) // returns a Stream of strings
                .limit(10)
                .collect(Collectors.toList());

        System.out.println(authors);
    }

    /**
     * flatMap -> input is a stream
     */
    @Test
    public void testFlatMap() {

        Set<Child> children = library.stream()
                .flatMap(book -> book.getAuthor().getChildren().stream()) // work with a stream of Authors
                .limit(10)
                .distinct()
                .collect(toSet());

        System.out.println(children);
    }

}