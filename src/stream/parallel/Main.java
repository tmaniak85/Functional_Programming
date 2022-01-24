package stream.parallel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

//        List<Integer> list = List.of(1, 2, 5, 10);
//        list.parallelStream();
//        Stream.of(1, 2, 4, 6).parallel();

//        poniżej utworzenie strumienia od 1 do 100
//        wypełnienie listy każdą parzystą liczbą

        List<Integer> list = new ArrayList<>();
        int sum = IntStream.range(0, 100).parallel().filter(v -> v % 2 == 0).sum();
//        IntStream.range(0, 100).parallel().filter(v -> v % 2 == 0).forEach(list::add);

        System.out.println(sum);

//        strumienie równoległe nie są tak często używane
//        tylko gdy mamy problem z wydajnością i tylko na dużych zbiorach danych

    }
}
