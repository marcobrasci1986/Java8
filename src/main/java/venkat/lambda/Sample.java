package venkat.lambda;

/**
 * Created by MaBa on 18/03/16.
 */
public class Sample {

    public static void main(String[] args) {
        Thread thread = new Thread(() -> System.out.println("In another thread"));

        System.out.println("Main thread");

        thread.start();
    }
}
