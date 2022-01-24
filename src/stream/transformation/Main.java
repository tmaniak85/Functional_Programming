package stream.transformation;

import java.util.Comparator;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        Stream<String> names1 = Stream.of("Ania", "Marek", "Ola");
        Stream<String> names2 = Stream.of("Franek", "Wojtek", "Ola");
        Stream.concat(names1, names2).forEach(System.out::println);
//        łączy dwa strumienie

        System.out.println("\n--------------\n");

        Stream.generate(Math::random)
                .limit(10)
//                ogranicza do dziesięciu wyników
                .forEach(System.out::println);

        System.out.println("\n--------------\n");

        Stream<String> names3 = Stream.of("Ania", "Marek", "Ola");
        Stream<String> names4 = Stream.of("Franek", "Wojtek", "Ola");

        Stream.concat(names3, names4)
                .skip(2)
//                pomija dwa pierwsze
                .forEach(System.out::println);

        System.out.println("\n--------------\n");

        Stream<String> names5 = Stream.of("Ania", "Marek", "Ola");
        Stream<String> names6 = Stream.of("Franek", "Wojtek", "Ola");

        Stream.concat(names5, names6)
                .distinct()
//                pomija powtórzenia
                .forEach(System.out::println);

        System.out.println("\n--------------\n");

        Stream<String> names7 = Stream.of("Ania", "Marek", "Ola");
        Stream<String> names8 = Stream.of("Franek", "Wojtek", "Ola");

        Stream.concat(names7, names8)
                .distinct()
                .sorted(Comparator.comparing(String::length))
//                sortuje ze względu na długość Stringa
                .forEach(System.out::println);

        System.out.println("\n--------------\n");

        Stream<String> names9 = Stream.of("Ania", "Marek", "Ola");
        Stream<String> names10 = Stream.of("Franek", "Wojtek", "Ola");

        Stream.concat(names9, names10)
                .distinct()
                .peek(System.out::println)
//                peek zwraca takie same elementy jak strumień oryginalny, ale dodatkowo na każdym elemencie wywołuje funkcję
//                dzięki peek możemy zobaczyć na przykład jak wygląda strumień przed sortowniem
                .sorted(Comparator.comparing(String::length))
//                sortuje ze względu na długość Stringa
                .forEachOrdered(System.out::println);
//        gwarancja poprawnej kolejności, ponieważ zwykłe forEach tego nie gwarantuje
    }
}
