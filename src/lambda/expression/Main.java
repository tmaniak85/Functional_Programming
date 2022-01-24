package lambda.expression;

import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        Runnable run1 = () -> {
            for (int i = 0; i <= 10; i++) {
                if(i%2 == 0) {
                    System.out.println(i);
                }
            }
        };

        run1.run();

        Comparator<String> comparator = (text1, text2) -> text1.length() - text2.length();
        System.out.println(comparator.compare("text", "text2"));

    }
}
