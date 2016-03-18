package java8.module3;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

/**
 * Created by MaBa on 18/03/16.
 */
public class DateAdjuster {


    public static void main(String[] args) {
        LocalDate now = LocalDate.now();

        LocalDate nextSunday = now.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
        System.out.println("Next sundag is: " + nextSunday);

    }
}
