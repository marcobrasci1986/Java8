package lambda;

import org.junit.Test;

/**
 * Created by MaBa
 */
public class SumBiConsumerTest {


    @Test
    public void name() throws Exception {

        useBiConsumer((x, y) -> {
            System.out.println("The sum is: " + (x + y));
        });


    }


    private void useBiConsumer(SumBiConsumer<Integer, Integer> biConsumer) {
        biConsumer.accept(9,10);
    }
}