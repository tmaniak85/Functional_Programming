package stream.primitive;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        IntStream stream = IntStream.of(1, 5, 9, 10);
        stream.forEach(System.out::println);

        System.out.println("\n----------\n");

        int[] array = new int[]{1, 4, 7, 9};
        IntStream stream1 = Arrays.stream(array);
        stream1.forEach(System.out::println);

        System.out.println("\n----------\n");

        IntStream stream2 = IntStream.range(1, 10);
//        generowanie streamów w zakresie
        stream2.forEach(System.out::println);

        System.out.println("\n----------\n");

        List<User> users = new ArrayList<>() {{
            add(new User(1, "Jan", 30, BigDecimal.valueOf(3000.0), List.of("Sport", "Motoryzacja")));
            add(new User(2, "Ola", 20, BigDecimal.valueOf(2800.99), List.of("Film", "Podróże")));
            add(new User(3, "Adam", 25, BigDecimal.valueOf(6000.5), List.of("Informatyka")));
            add(new User(4, "Jan", 50, BigDecimal.valueOf(9000.0), List.of("Malarstwo")));
        }};

        IntStream stream3 = users.stream().mapToInt(user -> user.getName().length());
//        utworzenie strumienia z długością imion
        stream3.forEach(System.out::println);

        System.out.println("\n----------\n");

        List<User> users2 = new ArrayList<>() {{
            add(new User(1, "Jan", 30, BigDecimal.valueOf(3000.0), List.of("Sport", "Motoryzacja")));
            add(new User(2, "Ola", 20, BigDecimal.valueOf(2800.99), List.of("Film", "Podróże")));
            add(new User(3, "Adam", 25, BigDecimal.valueOf(6000.5), List.of("Informatyka")));
            add(new User(4, "Jan", 50, BigDecimal.valueOf(9000.0), List.of("Malarstwo")));
        }};

        Stream<Integer> stream4 = users2.stream().mapToInt(user -> user.getName().length()).boxed();
//        utworzenie strumienia z długością imion i boxing
        stream4.forEach(System.out::println);





    }
}
