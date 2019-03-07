package pl.mpas.advances_programming.generic;

import java.math.BigDecimal;

public class ClassWithGenericMethod {

    private String maybeName;
    private Double maybeIncome;
    private BigDecimal hugeNumber;

    public ClassWithGenericMethod(String maybeName, Double maybeIncome, BigDecimal hugeNumber) {
        this.maybeName = validateString(maybeName);
        this.maybeIncome = validateDouble(maybeIncome);
        this.hugeNumber = validateAll(hugeNumber);
    }

    private String validateString(String toCheck){
        if (toCheck ==null){

            throw  new RuntimeException("Connot be null!!!");

        }
        return toCheck;
    }

    private Double validateDouble(Double toCheck){
        if (toCheck == null){

            throw  new RuntimeException("Connot be null!!!");

        }
        return toCheck;
    }

//    private BigDecimal validateBigDecimal(BigDecimal toCheck){
//        if (toCheck == null){
//
//            throw  new RuntimeException("Connot be null!!!");
//
//        }
//        return toCheck;
//    }


    private <T> T validateAll (T toCheck){
        if (toCheck == null){

            throw  new RuntimeException("Connot be null!!!");

        }
        return toCheck;
    }



}
