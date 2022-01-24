package stream.filter;

import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<String> names = List.of("Ania", "Ola", "Tomek", "Adam");
        names.stream()
                .filter((name) -> name.contains("a"))
                .forEach(System.out::println);

    }
}
