package chapter3;


import org.junit.Before;
import org.junit.Test;

import java.nio.file.DirectoryStream;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by MaBa on 17/03/16.
 */
public class PredicateMainTest {

    String matchingString = "abc";

    private Predicate<String> predicateStartsWith;
    private Predicate<String> predicateGreaterThan5;
    private Predicate<String> predicateIsEmpty;

    @Before
    public void setUp() throws Exception {
        //predicateStartsWith = s -> matchingString.startsWith(s);
        predicateStartsWith = matchingString::startsWith;
        predicateGreaterThan5 = (s) -> (s.length() > 5);

        predicateIsEmpty = String::isEmpty;
    }

    @Test
    public void testGreaterThanTrue() throws Exception {
        boolean result = predicateGreaterThan5.test("more than 5 chars");
        assertTrue(result);
    }

    @Test
    public void testGreaterThenFalse() throws Exception {
        boolean result = predicateGreaterThan5.test("aze");
        assertFalse(result);
    }

    @Test
    public void testStartWithFalse() throws Exception {
        boolean result = predicateStartsWith.test("marco");
        assertFalse(result);
    }

    @Test
    public void testStartWithTrue() throws Exception {
        boolean result = predicateStartsWith.test("a");
        assertTrue(result);
    }

    @Test
    public void testIsEmptyTrue() throws Exception {
        boolean result = predicateIsEmpty.test("");
        assertTrue(result);
    }

    @Test
    public void testIsEmptyFalse() throws Exception {
        boolean result = predicateIsEmpty.test("marco");
        assertFalse(result);
    }


}