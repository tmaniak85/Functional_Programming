package lambda.forEach;

import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        List<String> names = List.of("Ania", "Maria", "Sebastian", "Tadeusz");
        names.forEach((name) -> {
            if(name.length() > 5) {
                System.out.println(name);
            }
        });

        Map<Integer, String> names2 = Map.of(1, "Ania", 2, "Maria", 3, "Sebastian", 4, "Tadeusz");
        names2.forEach((index, name) -> System.out.println(index + "-" + name));
        names2.entrySet().forEach((entry) -> System.out.println(entry.getKey() + "-" + entry.getValue()));
    }
}
