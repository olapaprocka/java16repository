package pl.mpas.advances_programming.generic.exercice;

import java.util.ArrayList;
import java.util.List;

public class VehicleExample {

    public static void main(String[] args) {
        List<Plane> vehicles = new ArrayList<>();
        List<Vehicle> maybeCar = new ArrayList<>();

        VehicleProcessor.addNewCarIntoList(maybeCar);
        VehicleProcessor.displayVehicle(vehicles);

        VehicleProcessor.rawAdder(vehicles);


        }
    }
