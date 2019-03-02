package pl.mpas.advances_programming.null_handling_Optional;

import java.util.Optional;

public class Chipset {

    private String vendorName;

    public Chipset(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getVendorName() {
        return vendorName;

    }

    @Override
    public String toString() {
        return "Chipset{" +
                "vendorName='" + vendorName + '\'' +
                '}';
    }
}
