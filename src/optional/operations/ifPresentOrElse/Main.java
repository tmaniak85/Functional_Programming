package optional.operations.ifPresentOrElse;

import java.util.Optional;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {

        String text = null;
        Optional<String> optional = Optional.ofNullable(text);
        optional.ifPresentOrElse(succeess(), failure());

    }

    private static Consumer<String> succeess() {
        return System.out::println;
    }

    private static Runnable failure() {
        return () -> System.out.println("Optional is empty");
    }


}

