package lambda;

/**
 * Created by MaBa
 */
@FunctionalInterface
public interface SumBiConsumer<T,U> {

    void accept(T consumable1, U consumable2);

}
