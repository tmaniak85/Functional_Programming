package stream.mapStructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>() {{
           add(new User(1, "Jan", 30, List.of("Motoryzacja")));
           add(new User(2, "Ola", 20, List.of("Film", "Podróże")));
           add(new User(3, "Adam", 25, List.of("Informatyka")));
        }};
        Map<Integer, String> collect = users.stream()
                .collect(Collectors.toMap(User::getId, User::getName));

        List<User> users2 = new ArrayList<>() {{
            add(new User(1, "Jan", 30, List.of("Motoryzacja")));
            add(new User(2, "Ola", 20, List.of("Film", "Podróże")));
            add(new User(3, "Adam", 25, List.of("Informatyka")));
        }};
        Map<Integer, User> collect2 = users
                .stream()
                .collect(Collectors.toMap(User::getId, Function.identity()));

        List<User> users3 = new ArrayList<>() {{
            add(new User(1, "Jan", 30, List.of("Motoryzacja")));
            add(new User(2, "Ola", 20, List.of("Film", "Podróże")));
            add(new User(3, "Adam", 25, List.of("Informatyka")));
            add(new User(4, "Jan", 50, List.of("Malarstwo")));
        }};
        Map<String, Integer> collect3 = users3
                .stream()
                .collect(Collectors.toMap(
                        User::getName,
                        User::getAge,
                        (oldValue, newValue) -> newValue + oldValue));
//        przeciążona wersja metody toMap, czyli która wartość ma być wzięta pod uwagę w przypadku
//        duplikatów kluczy

        collect3.forEach((x, y) -> System.out.println(x + "-" + y));

        System.out.println("\n------------\n");

        List<User> users4 = new ArrayList<>() {{
            add(new User(1, "Jan", 30, List.of("Motoryzacja")));
            add(new User(2, "Ola", 20, List.of("Film", "Podróże")));
            add(new User(3, "Adam", 25, List.of("Informatyka")));
            add(new User(4, "Jan", 50, List.of("Malarstwo")));
        }};
        Map<String, List<String>> collect4 = users4.stream()
                .collect(Collectors.toMap(
                        User::getName,
                        User::getHobbies,
                        (oldValue, newValue) ->
                                Stream.concat(oldValue.stream(), newValue.stream()).collect(Collectors.toList())));

        collect4.forEach((k, v) -> System.out.println(k + "-" + v));
//        powyżej kluczami są yżtkownicy
//        wyświetla ich zainteresowania
//        w przypadku duplikatów zainteresowania są "dodawane"

        System.out.println("\n------------\n");

        List<User> users5 = new ArrayList<>() {{
            add(new User(1, "Jan", 30, List.of("Motoryzacja")));
            add(new User(2, "Ola", 20, List.of("Film", "Podróże")));
            add(new User(3, "Adam", 25, List.of("Informatyka")));
            add(new User(4, "Jan", 50, List.of("Malarstwo")));
        }};
        TreeMap<String, List<String>> collect5 = users4.stream()
                .collect(Collectors.toMap(
                        User::getName,
                        User::getHobbies,
                        (oldValue, newValue) ->
                                Stream.concat(oldValue.stream(), newValue.stream()).collect(Collectors.toList()),
                        TreeMap::new));

        collect4.forEach((k, v) -> System.out.println(k + "-" + v));
//        powyżej toMap z 4 parametrami
//        4 parametr dostarcza konstruktor
//        dzięki temu całośc zapisana jest jako TreeMap










    }
}
