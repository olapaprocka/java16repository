package pl.mpas.advances_programming.comparing;

import pl.mpas.advances_programming.comparing.ref_method.CompareByModel;

import java.time.LocalDate;
import java.util.*;

public class CarExample {
    public static void main(String[] args) {

        List<Auto> autos = Arrays.asList(
                new Auto("Opel", "Astra ", 1700, 2019, "Red", LocalDate.of(2019, 12, 12)),
                new Auto("Opel", "Corsa", 1600, 2018, "Blue", LocalDate.of(2018, 11, 11)),
                new Auto("Opel", "Vectra", 1700, 2015, "White", LocalDate.of(2015, 9, 9)),
                new Auto("Opel", "Yaris", 1200, 2004, "Black", LocalDate.of(2004, 05, 18)),
                new Auto("Hyundai", "SantaFe", 1900, 2019, "Black", LocalDate.of(2019, 3, 4))
        );

        System.out.println("befor first sorting");
        System.out.println(autos);
        System.out.println("after natural ordering");
        Collections.sort(autos);
        System.out.println(autos);


//        Auto auto ToCompare = new Auto("Opel", "Astra ", 1700, 2019, "Red", LocalDate.of(2019, 12, 12));
//        autoToCompare.maybeComparing((Auto o) -> 1);


        Collections.sort(autos, (o1, o2) -> o1.getMarka().compareTo(o2.getMarka()));
        Collections.sort(autos, Comparator.comparing(Auto::getModel)
                .thenComparing(Auto::getMarka));

        System.out.println(autos);

        Collections.sort(autos, (o1, o2) -> o1.getMarka().compareTo(o2.getMarka()));
        Collections.sort(autos, Comparator.comparing(Auto::getYearOfProduction)
                .thenComparing(Auto::getMarka));

        System.out.println(autos);

        System.out.println("After sorting by color....");
        Collections.sort(autos, new CarBrandComparator());
        System.out.println(autos);

        autos.sort(new Comparator<Auto>() {
            @Override
            public int compare(Auto o1, Auto o2) {
                return 0;
            }
        });

        autos.sort((o1, o2) -> o1.getMarka().compareTo(o2.getMarka()));

        CompareByModel anotherModelComparingWay = new CompareByModel();

        autos.sort((autos1, autos2) -> {
            return anotherModelComparingWay.orderByModel(autos1, autos2);
        });

        autos.sort((autos1, autos2) -> anotherModelComparingWay.orderByModel(autos1, autos2));

        autos.sort(anotherModelComparingWay::orderByModel);
        System.out.println("befor");
        autos.sort((o1, o2) -> CompareByPojemnosc.orderByBrandNextByModelBextByYear(o1, o2));
        autos.sort(CompareByPojemnosc :: orderByBrandNextByModelBextByYear);
        System.out.println(autos);

        Collections.sort(autos, Comparator.comparing(Auto::getMarka)
                .thenComparing(Auto::getModel)
                .thenComparing(Auto::getPojemność)
                .thenComparing(Auto::getYearOfProduction));
        System.out.println(autos);
    }




}


