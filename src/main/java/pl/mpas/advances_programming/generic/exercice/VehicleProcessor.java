package pl.mpas.advances_programming.generic.exercice;

import pl.mpas.advances_programming.abstract_class.Animal;

import java.util.ArrayList;
import java.util.List;

public class VehicleProcessor {

//    List<Car> listCars = new ArrayList<>();
//        listCars.add(new Car("Audi",2000));
//        listCars.add(new Car("Opel",2000);
//

        public static void displayVehicle(List<? extends Vehicle> vehicles) {
            vehicles.forEach(System.out::println);
            vehicles.forEach((x-> System.out.println(x)));
            }


    static void addNewCarIntoList (List<? super Vehicle> vehicles) {
        vehicles.add(new Car());
        vehicles.add(new Vehicle() {
        });
    }
            static void rawAdder(List maybeCars){
            maybeCars.add(new Car());

    }
}
