package pl.mpas.advances_programming.abstract_class;

public class AnimalExample {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        zoo.handleAnimal(new Animal("Azor") {
            @Override
            public void eat() {
                System.out.println("Eating....");
            }

            @Override
            public void play() {

            }
        });

        Animal mabyCat = null;
        new Animal("cat") {
            @Override
            public void eat() {

            }

            @Override
            public void play() {
                System.out.println("game");
            }

            public void miauuu() {

            }}.miauuu();


        }

    }
