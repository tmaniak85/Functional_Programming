package lambda.reference;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>() {{
            add("Anna");
            add("Adam");
            add("Mateusz");
            add("Ola");
        }};

        names.forEach(System.out::println);
        names.sort(String::compareTo);

        names.forEach(User::new);

    }
}
