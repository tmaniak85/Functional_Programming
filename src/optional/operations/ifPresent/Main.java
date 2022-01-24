package optional.operations.ifPresent;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        String text = "Hello";

        Optional<String> optional = Optional.of(text);
        optional.ifPresent(System.out::println);
    }
}
