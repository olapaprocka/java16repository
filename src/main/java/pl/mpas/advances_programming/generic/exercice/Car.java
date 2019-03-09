package pl.mpas.advances_programming.generic.exercice;

public class Car implements Vehicle {

    private String carName;
    private Integer YearProduction;

    public Car() {
        this.carName = carName;
        Integer yearProduction = null;
        YearProduction = yearProduction;
    }

    public String getCarName() {
        return carName;
    }

    public Integer getYearProduction() {
        return YearProduction;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                ", YearProduction=" + YearProduction +
                '}';
    }
}
