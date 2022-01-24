package stream.finish;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        Stream<Integer> stream = Stream.of(5, 60, 115, 13, 1);
        long elements = stream.count();
        System.out.println(elements);

        System.out.println("\n----------------\n");

        Stream<Integer> stream2 = Stream.of(5, 60, 115, 13, 1);
        Optional<Integer> min = stream2.min(Comparator.naturalOrder());
        System.out.println(min.get());

        System.out.println("\n----------------\n");

        Stream<Integer> stream3 = Stream.of(5, 60, 115, 13, 1);
        Optional<Integer> max = stream3.max(Comparator.naturalOrder());
        System.out.println(max.get());

        System.out.println("\n----------------\n");

        Stream<String> names = Stream.of("Ola", "Anna", "Iza", "Tadeusz");
        Optional<String> first = names.filter(name -> name.length() > 3)
                .findFirst();
//        findFirst() zwraca Optionala
//        findAny zwraca dowlony element spełniający kryteria
        System.out.println(first.get());

        System.out.println("\n----------------\n");

        Stream<String> names2 = Stream.of("Ola", "Anna", "Iza", "Tadeusz");
        boolean flag = names2.anyMatch(name -> name.length() == 3);
//        boolean flag = names2.allMatch(name -> name.contains("a"));
//        czy wszytkie elementu strumienia spełniają warunek
//        boolean flag = names2.noneMatch(name -> name.startsWith("C"));
//        czy żaden element strumienia nie zaczyna się na literę C, jeśli żaden to true
        System.out.println(flag);




    }
}
