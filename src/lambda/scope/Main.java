package lambda.scope;

import java.util.List;

public class Main {

    public static void main(String[] args) {
/*
        int first = 0;
        Comparator<String> comparator = (first,second) -> first.compareToIgnoreCase(second);
        */
        repeatText(5, "Hello");
/*
        for (int i = 0; i <= 5; i++) {
            execute(() -> System.out.println(i));
//        } źle bo wartość i się zmienia, więc nie jest efektywnie finalna
            */
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        for(Integer number : numbers) {
            execute(() -> System.out.println((number)));
        }
//        powyżej dobrze, bo za każdą iteracją tworzona jest nowa zmienna number
    }

    private static void execute(Runnable runnable) {
        runnable.run();
    }

    private static void repeatText(int number, String text) {
        Runnable r = () -> {
            for (int i = 0; i <= number; i++) {
                System.out.println(text);
            }
        };
        r.run();
    }
}
