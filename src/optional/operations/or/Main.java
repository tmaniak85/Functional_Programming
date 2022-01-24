package optional.operations.or;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        String text = "Hello";
        Optional<String> optional = Optional.ofNullable(text);
        Optional<String> optional2 = optional.or(() -> Optional.of("Hi"));
//        .or przyjmuje i zwrcaca Optional
    }
}
