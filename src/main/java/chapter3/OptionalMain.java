package chapter3;

import java.util.Optional;

/**
 * Created by MaBa on 17/03/16.
 */
public class OptionalMain {


    public static void main(String[] args) {
        Optional<Double> result = average(90, 100);
        Optional<Double> empty = average();

        System.out.println(result.get());

        if(empty.isPresent()){
            System.out.println(empty.get());
        }else{
            System.out.println("Value is not present");
        }
    }



    public static Optional<Double> average(int ... scores){
        if(scores.length == 0){
            return Optional.empty();
        }else{
            int sum = 0;

            for (int score : scores) {
                sum += score;
            }

            return Optional.of((double) sum/scores.length);
        }
    }
}
