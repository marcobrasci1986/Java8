package mother;

import domain.City;
import domain.Gender;
import domain.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by MaBa on 21/03/16.
 */
public class CityMother {


    public static List<Person> createCities() {

        City c1 = new City("New York");
        City c2 = new City("Brussels");
        City c3 = new City("Paris");

        return new ArrayList(Arrays.asList(c1,c2,c3));

    }
}
