package functional.operator;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Main {

    public static void main(String[] args) {

        UnaryOperator<Integer> unaryOperator = number -> number * 2;
        System.out.println(unaryOperator.apply(5));

        BinaryOperator<Integer> binaryOperator = Integer::sum;
        System.out.println(binaryOperator.apply(10,15));
    }
}
