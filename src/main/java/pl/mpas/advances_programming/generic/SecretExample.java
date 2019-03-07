package pl.mpas.advances_programming.generic;

import pl.mpas.advances_programming.abstract_class.Cat;
import pl.mpas.advances_programming.abstract_class.Dog;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SecretExample {
    public static void main(String[] args) {
        MySecret dream = new MySecret("hahaha");
        MyBigDecimalSecret incoms = new MyBigDecimalSecret(BigDecimal.ZERO);

        MySecretGeneric integer = new MySecretGeneric(Integer.valueOf(1));
        //MySecretGeneric integer = new MySecretGeneric(1);
        MySecretGeneric anotherDream = new MySecretGeneric("ahaaaaaaaaaa");
        //robimy rzutowanie na getObject
        Integer secretInteger = (Integer) integer.getObject();

        checkMySecret(integer);
        checkMySecret(anotherDream);

/*        List animals = new ArrayList();
        animals.add(new Dog("Azor"));
        animals.add(new Cat("Fifi"));
        checkAnimals(animals);

        MySecondGeneric<String> stringSecret = new MySecondGeneric<>("secret");
        MySecondGeneric<BigDecimal> futureIncome = new MySecondGeneric<>(BigDecimal.valueOf(1_000_000));
        MySecondGeneric <Object>objectSecret2 = new MySecondGeneric<>(new Object());

*/

    }

    public static void checkAnimals(List animals) {
        for (Object animal : animals) {
            if (animal instanceof Dog) {
                System.out.println("Dog");
            } else if (animal instanceof Cat) {
                System.out.println("Cat");
            } else {
                System.out.println("cos");
            }
        }
    }

    public static void checkMySecret(MySecretGeneric secretGeneric) {

        if (secretGeneric.getObject() instanceof Integer) {
            Integer secret = (Integer) secretGeneric.getObject();
            System.out.println("Secret: " + secret);
        }
    }
}
