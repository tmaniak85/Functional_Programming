package optional.operations.orElseGet;

import java.util.Optional;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

        String text = "hello";

        Optional<String> optional = Optional.ofNullable(text);
        System.out.println(optional.orElseGet(defaultValue()));
//        opóźnione wywołanie, ponieważ Supplier
//        w przypadku !null metoda defaultValue się nie wywoła
    }

    private static Supplier defaultValue() {
        return () -> {
            return "Hi";
        };
    }
}
