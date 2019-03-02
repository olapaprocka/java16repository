package pl.mpas.advances_programming.comparing;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Comparator;

public class Auto  implements Comparable<Auto>{
    private String marka;
    private String model;
    private int pojemność;
    private int rokProdukcji;
    private String color;
    private LocalDate yearOfProduction;


public void maybeComparing(Comparable<Auto> comparable){
    System.out.println("inside maybeComparing()");
    System.out.println(comparable.compareTo(this)); //do tego zachowaniaw wysyłamy siebie i korzystamy z metody. a gdzie drugi samochód
    }


    public Auto(String marka, String model, int pojemność, int rokProdukcji, String color, LocalDate yearOfProduction) {
        this.marka = marka;
        this.model = model;
        this.pojemność = pojemność;
        this.rokProdukcji = rokProdukcji;
        this.color = color;
        this.yearOfProduction = yearOfProduction;
    }



    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public int getPojemność() {
        return pojemność;
    }

    public int getRokProdukcji() {
        return rokProdukcji;
    }

    public String getColor() {
        return color;
    }

    public LocalDate getYearOfProduction() {
        return yearOfProduction;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", pojemność=" + pojemność +
                ", rokProdukcji=" + rokProdukcji +
                ", color='" + color + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}'+ '\n';
    }

    @Override
    public int compareTo(Auto o) {
        return yearOfProduction.compareTo((o.getYearOfProduction()));
      //  return this.yearOfProduction.getYear() - o.yearOfProduction.getYear();
    }
}
