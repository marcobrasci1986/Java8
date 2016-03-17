package chapter4;

/**
 * Created by MaBa on 17/03/16.
 */
public class GorillaFamily {
    String walk = "walk";

    void everyonePlay(boolean baby){
        String approach = "amble";

        play(() -> walk);
        play(() -> baby ?  "baby true" : "baby false");
        play(() -> approach);
    }

    void play(Gorilla g){
        System.out.println(g.move());
    }

    public static void main(String[] args) {
        GorillaFamily gorillaFamily = new GorillaFamily();
        gorillaFamily.everyonePlay(true);
    }
}
