package stream.collection;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        Stream<String> names = Stream.of("Maciej", "Bożena", "Adam", "Marta");
        String[] namesArray = names.toArray(String[]::new);
//        Tworzy tablicę na bazie strumienia
//        Jeśli chcemy mieć tablicę z określonym typem to musimy przekazać konstruktor do toArray

        Stream<String> names2 = Stream.of("Maciej", "Bożena", "Adam", "Marta");
        List<String> collect = names2.collect(Collectors.toList());

        Stream<String> names3 = Stream.of("Maciej", "Bożena", "Adam", "Marta");
        Set<String> set = names3.collect(Collectors.toSet());

//        Jeśli chcemy kontrolować jakiego rodzaju zestaw otrzymujemy, możemy wywołać toCollection
//        przekazując referencję do konstruktora struktury np. TreeSet
        Stream<String> names4 = Stream.of("Maciej", "Bożena", "Adam", "Marta");
        TreeSet<String> result = names4.collect(Collectors.toCollection(TreeSet::new));

//        separator który oddziela elementy strumienia
        Stream<String> names5 = Stream.of("Maciej", "Bożena", "Adam", "Marta");
        String allNames = names5.collect(Collectors.joining(", "));
        System.out.println(allNames);

//        summary statistics
        Stream<String> names6 = Stream.of("Maciej", "Bożena", "Adam", "Marta");
        IntSummaryStatistics summary = names6.collect(Collectors.summarizingInt(name -> name.length()));
        double average = summary.getAverage();
        long sum = summary.getSum();
        int max = summary.getMax();
        System.out.println(max);

//        summary statistics
        Stream<Integer> stream = Stream.of(87, 4, 76, 12);
        IntSummaryStatistics summary2 = stream.collect(Collectors.summarizingInt(number -> number));
        double average2 = summary2.getAverage();
        long sum2 = summary2.getSum();
        int max2 = summary2.getMax();
        System.out.println(max2);




    }
}
