package deadcoderising;

import domain.Article;
import mother.ArticleMother;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by MaBa on 29/03/16.
 */
public class ArticleMain {

    public static void main(String[] args) {
        Set<String> collect = ArticleMother.createArticles()
                .stream()
                .flatMap(article -> article.getTags().stream())
                .collect(Collectors.toSet());

        System.out.println(collect);


        IntStream.iterate(0, i -> i + 5).limit(5)
                .forEach(System.out::println);

    }


}
