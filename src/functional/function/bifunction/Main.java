package functional.function.bifunction;

import java.util.Map;
import java.util.function.BiFunction;

public class Main {

    public static void main(String[] args) {

        BiFunction<String, Integer, User> biFunction = User::new;
        Map<String, Integer> nameAgeMap = Map.of("Marta", 28, "Jan", 21, "Marek", 32);

        nameAgeMap.forEach((name, age) -> System.out.println(biFunction.apply(name, age)));
    }
}
