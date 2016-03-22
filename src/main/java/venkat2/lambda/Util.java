package venkat2.lambda;

import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 * Created by MaBa on 21/03/16.
 */
public class Util {

    public static Boolean isEven(Integer value){
        return value % 2 == 0;
    }

    public static Boolean isOdd(Integer value){
        return !isEven(value);
    }
}
