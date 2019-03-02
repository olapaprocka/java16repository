package pl.mpas.advances_programming.comparing;

public class CompareByPojemnosc {

    public static int orderByBrandNextByModelBextByYear (Auto first, Auto second){

        int comparingResult = first.getMarka().compareTo(second.getMarka());

        if (0 != comparingResult){
            return comparingResult;
        }
        comparingResult = first.getModel().compareTo(second.getModel());
        if (0 != comparingResult){
            return comparingResult;
        }
        return
                first.getYearOfProduction().compareTo(second.getYearOfProduction());




    }
}
