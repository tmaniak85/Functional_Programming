package lambda.functional;

@FunctionalInterface
public interface TextConverter {

    String convert(String text);
    default void displayText() {
        System.out.println("Hello from functional interface");
    }
    static String convertToLowerCase(String text) {
        return text.toLowerCase();
    }
}
