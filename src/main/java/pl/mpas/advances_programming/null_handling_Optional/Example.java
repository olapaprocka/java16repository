package pl.mpas.advances_programming.null_handling_Optional;

import java.util.Optional;

public class Example {

    public static void main(String[] args) {

        Computer fullOne = new Computer(new GraphicsCard(new Chipset("nVidia")));
        Computer withOutVendor = new Computer(new GraphicsCard(new Chipset(null)));
        Computer withOutChipset = new Computer(new GraphicsCard(null));
        Computer withOutGraphicsCard = new Computer(null);
        Computer mebyComputer = null;


    }

    public static String getVendorNameJava8Way(Computer computer) {

       return Optional.ofNullable(computer)
                .flatMap(computer1 -> computer1.getGraphicsCard())
                .flatMap(graphicsCard -> graphicsCard.getChipset())
                .map(chipset -> chipset.getVendorName())
                .orElseGet(() -> "brak");
    }

}
