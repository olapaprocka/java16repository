package pl.mpas.advances_programming.generic;

import pl.mpas.advances_programming.abstract_class.Animal;

public class MySecondGeneric <T extends Animal> {

    private T object;

    public MySecondGeneric(T object) {
        this.object = object;
    }

    public T getObject() {
        object.eat();
        object.play();
        return object;
    }

    @Override
    public String toString() {
        return "MySecondGeneric{" +
                "object=" + object +
                '}';
    }


}
