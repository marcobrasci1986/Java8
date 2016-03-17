package java8.module1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by MaBa on 17/03/16.
 */
public class ComparatorLambda {

    public static void main(String[] args) {
//        Comparator<String> comparator = new Comparator<String>() {
//            @Override
//            public int compare(String s1, String s2) {
//                return Integer.compare(s1.length(), s2.length());
//            }
//        };

        Comparator<String> comparator = (String s1, String s2) ->
                Integer.compare(s1.length(), s2.length());

        print(comparator);


    }

    /**
     * Lambda expression passed as a parameter
     * @param comparator
     */
    public static void print(Comparator<String> comparator){
        List<String> list = Arrays.asList("marco", "ben", "longword");
        Collections.sort(list, comparator);

        for (String s : list) {
            System.out.println(s);
        }
    }

}
