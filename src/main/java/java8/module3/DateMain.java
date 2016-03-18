package java8.module3;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.Year;
import java.time.temporal.ChronoUnit;

/**
 * Created by MaBa on 18/03/16.
 */
public class DateMain {

    public static void main(String[] args) {

        LocalDate birthDay = LocalDate.of(1986, Month.APRIL, 22);

        System.out.println(birthDay);

        Period period = Period.between(birthDay, LocalDate.now());

        System.out.println(period.get(ChronoUnit.YEARS) + " years and "+ period.get(ChronoUnit.MONTHS) + " months");
        System.out.println(birthDay.until(LocalDate.now(), ChronoUnit.MONTHS));
    }
}
