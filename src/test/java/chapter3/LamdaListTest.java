package chapter3;


import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by MaBa on 17/03/16.
 */
public class LamdaListTest {


    @Test
    public void testList() throws Exception {
        List<String> list = new ArrayList<>();

        list.add("Magician");
        list.add("Assistant");

        System.out.println(list);
        list.removeIf(s -> s.startsWith("A"));
        System.out.println(list);

    }

    @Test
    public void testReplaceAll() throws Exception {
        List<Integer> list = Arrays.asList(1,2,3);
        list.replaceAll(x -> x*2);

        System.out.println(list);
    }

    @Test
    public void testPrintList() throws Exception {
        List<Integer> list = Arrays.asList(1,2,3);

        list.forEach(System.out::println);

    }
}