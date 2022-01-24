package optional.operations.orElseThrow;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        String text = "hello";
        Optional<String> optional = Optional.ofNullable(text);
        String word = optional.orElseThrow(IllegalArgumentException::new);
        System.out.println(word);
    }
}
