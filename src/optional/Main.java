package optional;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        String text = null;
        if(text != null) {
            System.out.println(text);
        }

        Optional<String> empty = Optional.empty();
//        Optional<String> optional = Optional.of(text);
        Optional<String> optional = Optional.ofNullable(text);
        System.out.println(optional.isPresent());
        System.out.println(optional.isEmpty());
//        isEmpty wprowadzone w Java 11

        if(optional.isPresent()) {
            System.out.println(optional.get());
        }

    }
}
