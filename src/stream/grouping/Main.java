package stream.grouping;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>() {{
            add(new User(1, "Jan", 30, List.of("Motoryzacja")));
            add(new User(2, "Ola", 20, List.of("Film", "Podróże")));
            add(new User(3, "Adam", 25, List.of("Informatyka")));
            add(new User(4, "Jan", 50, List.of("Malarstwo")));
        }};

        Map<String, List<User>> collect = users
                .stream()
                .collect(Collectors.groupingBy(User::getName));

        collect.forEach((k, v) -> System.out.println(k + "-" + v));

        System.out.println("\n------------------\n");

        List<User> users2 = new ArrayList<>() {{
            add(new User(1, "Jan", 30, List.of("Motoryzacja")));
            add(new User(2, "Ola", 20, List.of("Film", "Podróże")));
            add(new User(3, "Adam", 25, List.of("Informatyka")));
            add(new User(4, "Jan", 50, List.of("Malarstwo")));
        }};

        Map<Boolean, List<User>> collect2 = users
                .stream()
                .collect(Collectors.partitioningBy(user -> user.getAge() > 25));

        collect2.forEach((k, v) -> System.out.println(k + "-" + v));

        System.out.println("\n------------------\n");

        List<User> users3 = new ArrayList<>() {{
            add(new User(1, "Jan", 30, List.of("Motoryzacja")));
            add(new User(2, "Ola", 20, List.of("Film", "Podróże")));
            add(new User(3, "Adam", 25, List.of("Informatyka")));
            add(new User(4, "Jan", 50, List.of("Malarstwo")));
            add(new User(3, "Adam", 26, List.of("Informatyka")));
        }};

        Map<String, Set<User>> collect3 = users3
                .stream()
                .collect(Collectors.groupingBy(User::getName, Collectors.toSet()));

        collect3.forEach((k, v) -> System.out.println(k + "-" + v));
//        powyżej przeciążony groupingBy zmienia dane wyjścowe w Set, czyli jeśli name się powtórzy to tylko jedna
//        jedna wartość będzie zaciągnięta

        System.out.println("\n------------------\n");

        List<User> users4 = new ArrayList<>() {{
            add(new User(1, "Jan", 30, List.of("Motoryzacja")));
            add(new User(2, "Ola", 20, List.of("Film", "Podróże")));
            add(new User(3, "Adam", 25, List.of("Informatyka")));
            add(new User(4, "Jan", 50, List.of("Malarstwo")));
            add(new User(3, "Adam", 26, List.of("Informatyka")));
        }};

        Map<String, Long> collect4 = users4
                .stream()
                .collect(Collectors.groupingBy(User::getName, Collectors.counting()));

        collect4.forEach((k, v) -> System.out.println(k + "-" + v));
//        powyżej counting() wyświetla ilość wyników dla klucza
//        może też być np. Collectors.summingInt(User::getAge) co sumuje wiek dla danego klucza

        System.out.println("\n------------------\n");

        List<User> users5 = new ArrayList<>() {{
            add(new User(1, "Jan", 30, List.of("Sport", "Motoryzacja")));
            add(new User(2, "Ola", 20, List.of("Film", "Podróże")));
            add(new User(3, "Adam", 25, List.of("Informatyka")));
            add(new User(4, "Jan", 50, List.of("Malarstwo")));
            add(new User(3, "Adam", 26, List.of("Informatyka")));
        }};

        Map<String, Optional<User>> collect5 = users5
                .stream()
                .collect(Collectors.groupingBy(User::getName, Collectors.minBy((user1, user2) -> user1.getAge().compareTo(user2.getAge()))));

        collect5.forEach((k, v) -> System.out.println(k + "-" + v.get()));
//        dla zdublowanego klucza wyświetla tego młodszego

        System.out.println("\n------------------\n");

        List<User> users6 = new ArrayList<>() {{
            add(new User(1, "Jan", 30, List.of("Sport", "Motoryzacja")));
            add(new User(2, "Ola", 20, List.of("Film", "Podróże")));
            add(new User(3, "Adam", 25, List.of("Informatyka")));
            add(new User(4, "Jan", 50, List.of("Malarstwo")));
            add(new User(3, "Adam", 26, List.of("Informatyka")));
        }};

        Map<String, List<Integer>> collect6 = users6
                .stream()
                .collect(Collectors.groupingBy(User::getName,
                        Collectors.mapping(User::getAge, Collectors.toList())));

        collect6.forEach((k, v) -> System.out.println(k + "-" + v));
//        powyżej Collectors.mapping(User::getAge, Collectors.toList())
//        tworzy mapę, gdzie wartością jest lista poszczególnych wartości wiek dla danego klucza

        System.out.println("\n------------------\n");

        List<User> users7 = new ArrayList<>() {{
            add(new User(1, "Jan", 30, List.of("Sport", "Motoryzacja")));
            add(new User(2, "Ola", 20, List.of("Film", "Podróże")));
            add(new User(3, "Adam", 25, List.of("Informatyka")));
            add(new User(4, "Jan", 50, List.of("Malarstwo")));
            add(new User(3, "Adam", 26, List.of("Informatyka")));
        }};

        Map<String, IntSummaryStatistics> collect7 = users7
                .stream()
                .collect(Collectors.groupingBy(User::getName,
                        Collectors.summarizingInt(User::getAge)));

        collect7.forEach((k, v) -> System.out.println(k + "-" + v.getAverage()));




    }


}
