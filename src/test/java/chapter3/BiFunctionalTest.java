package chapter3;


import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by MaBa on 17/03/16.
 */
public class BiFunctionalTest {


    @Test
    public void testBifunctional1() throws Exception {
        BiFunction<String, String, String> stringConcat = String::concat;


        String result = stringConcat.apply("first string ", "second string");

        assertEquals("first string second string", result);

    }
}