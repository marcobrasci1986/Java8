package mother;

import domain.Article;
import domain.Gender;
import domain.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by MaBa on 21/03/16.
 */
public class ArticleMother {


    public static List<Article> createArticles() {
        List<Article> articles = new ArrayList<>();

        articles.add(new Article("Belgium vs Portugal", "John", Arrays.asList("Football", "Willmots", "Ronaldo")));
        articles.add(new Article("Java 8 is cool", "Me", Arrays.asList("Java", "coding", "8")));
        articles.add(new Article("AngularJS 2 is out", "Mark", Arrays.asList("js", "coding", "angular")));
        articles.add(new Article("Java 7 is old news", "John", Arrays.asList("Java","7", "coding")));



        return articles;

    }
}
