package pl.mpas.advances_programming.generic.optional;

import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;

import static javafx.scene.input.KeyCode.T;

public class GenericOptionalTest {
    public static void main(String[] args) {
        Optional<String> maybeMyName = Optional.of("Mariusz");
        System.out.println(checkIfNameMatch("Mariusz", maybeMyName));
        System.out.println(checkIfNameMatch("Maniek", maybeMyName));
        System.out.println(null == null);
//checkIfNameMatch(maybeMyName);
    }

    public static boolean checkIfNameMatch(String name, Optional<String>maybeName){
        Predicate<String> stringTest = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return name.equals(s);
            }
        };

        Predicate<CharSequence> charSequencePredicate = new Predicate<CharSequence>() {
            @Override
            public boolean test(CharSequence charSequence) {
                return name.equals(charSequence);
            }
        };

        System.out.println("Testing...");
        System.out.println("1st: " + maybeName.filter(stringTest));
        System.out.println("1st with char sequence" + maybeName.filter(charSequencePredicate));

        System.out.println("1st: " + maybeName.filter(s->charSequencePredicate.test(s)));//to samo co niżej
        System.out.println("1st:" + maybeName.filter(charSequencePredicate::test)); //to samo co wyżej


        return maybeName.filter(s->s.equals(name)).isPresent(); //tu lambda

        }
    }

