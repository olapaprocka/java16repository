package pl.mpas.advances_programming.stream;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamExample {

    public static void main(String[] args) {
        List<Item> saturdayItems = Arrays.asList(
                new Item("kino", BigDecimal.valueOf(35.00),
                        Arrays.asList(new Ingredient("paper"))),
                new Item("chlebek", BigDecimal.valueOf(15.00),
                        Arrays.asList(new Ingredient("sugar"), new Ingredient("H2O"))

                ));
        Order saturdayShopping = new Order(saturdayItems);

        List<Item> sundayItems = Arrays.asList(
                new Item("cola", BigDecimal.valueOf(95.00),
                        Arrays.asList(new Ingredient("paper"))),
                new Item("kino", BigDecimal.valueOf(15.00),
                        Arrays.asList(new Ingredient("sugar"), new Ingredient("H2O"))

                ));

        Order sundayShopping = new Order(sundayItems);

        getIngredientsNames(Arrays.asList(sundayShopping, saturdayShopping));

    }

    public static List<String> getIngredientsNames(List<Order> orders) {
      //  IntStream.range(1, 100)  - nie robimy takich
        return  orders.stream()
                .flatMap(order -> order.getMyItems().stream())
                        .flatMap(item -> item.getIngredientsList().stream())
                .map(ingredient -> ingredient.getName())
                .distinct()
                        .collect(Collectors.toList());
    }

    public static BigDecimal getSumaPrice (List<Order> orders){
      return   orders.stream()
                .flatMap(order -> order.getMyItems().stream())
                .map(item -> item.getPrice())
                .reduce(BigDecimal.ZERO, ((bigDecimal, bigDecimal2) -> bigDecimal.add(bigDecimal2)));


    }


}
