package functional.predicate;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        Predicate<String> fiveCharsWordPredicate = (text) -> text.length() > 5;
        Predicate<String> aContainsPredicate = (text) -> text.toLowerCase().contains("a");
        System.out.println(fiveCharsWordPredicate.test("java"));
        System.out.println(aContainsPredicate
                .and(fiveCharsWordPredicate)
                .negate()
//                neguje całość
                .test("javaaaaaaa"));

        BiPredicate<String, Integer> checkBiPredicate = (text, number) ->
                text.contains("@") && number > 100;

        System.out.println(checkBiPredicate.test("@1", 101));
    }
}
