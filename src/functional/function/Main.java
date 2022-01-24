package functional.function;

import java.util.List;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        Function<String, Integer> function = String::length;
        System.out.println(function.apply("hello"));

        Function<String, User> nameUserMapper = User::new;
        List<String> names = List.of("Marta", "Jan", "Marek");

        Function<String, String> prefixMapper = name -> "Pan/Pani" + name;

        names.forEach((name) -> System.out.println(
                nameUserMapper
                .compose(prefixMapper)
                .apply(name)));
    }
}
