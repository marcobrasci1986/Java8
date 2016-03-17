package chapter2;

import java.util.function.Predicate;

/**
 * Created by MaBa on 17/03/16.
 */
public class FindMatchingAnimals {

    private static void print(Animal animal, Predicate<Animal> checkTrait){
        if(checkTrait.test(animal)){
            System.out.println(animal);
        }
    }

    public static void main(String[] args) {
        Animal fish = new Animal("fish", false, true);
        Animal kangaroo = new Animal("kangaroo", true, false);

        print (fish, (Animal animal) -> animal.isCanHop());
        print (kangaroo, bla -> bla.isCanHop());



        print (fish, (Animal animal) -> { return animal.isCanSwim(); });
        print (kangaroo, (Animal animal) -> { return animal.isCanSwim(); });


    }
}
