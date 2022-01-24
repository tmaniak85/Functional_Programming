package functional.consumer;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.ObjIntConsumer;


public class Main {

    public static void main(String[] args) {

        Consumer<Integer> consumer = System.out::println;

        Consumer<Integer> secondConsumer = consumer.andThen(number -> {
            for (int i = 0; i < number; i++) {
                System.out.println("hello");
            }
        });

        secondConsumer.accept(4);

        System.out.println("\n-----------------\n");

        BiConsumer<String,Integer> biConsumer = (text, number) -> {
            System.out.println(text + "-" + number);
        };

        biConsumer.accept("Hello", 1);

        System.out.println("\n-----------------\n");

        ObjIntConsumer<String> objIntConsumer = (text, number) -> {
            System.out.println(text + "-" + number);
        };

        objIntConsumer.accept("Hi", 1);

        System.out.println("\n-----------------\n");

        List.of(1, 2, 3, 4).forEach(System.out::println);

        System.out.println("\n-----------------\n");

        Map.of(1, "Tomek", 2, "Ada").
                forEach((x, y) -> System.out.println(x + "-" + y));

        Map<Integer, String> map = new HashMap<>() {{
           put(1, "Tomek");
           put(2, "Ada");
        }};


    }
}
