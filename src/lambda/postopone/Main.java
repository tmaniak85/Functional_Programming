package lambda.postopone;

import java.util.function.Consumer;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {
            executeForEvenNumber(i, (text) -> System.out.println("Liczba jest parzysta: " + text));
        }

    }

    private static void executeForEvenNumber(int number, Consumer action) {
        if(number % 2 == 0) {
            action.accept(number);
        }
    }

}
