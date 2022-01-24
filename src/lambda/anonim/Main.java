package lambda.anonim;

public class Main {

    public static void main(String[] args) {

        TextConverter spaceTextConverter = new SpaceTextConverter();
        String result = spaceTextConverter.convert("   Przykładowy text ");
        spaceTextConverter.display();
        System.out.println(result );

        TextConverter textConverter = new TextConverter() {
            @Override
            public String convert(String text) {
                return text.replace(" ", ".");
            }

            @Override
            public void display() {
                System.out.println("Hello from textConverter");
            }
        };
        String result2 = textConverter.convert("   Przykładowy text   ");
        System.out.println(result2);
        textConverter.display();
    }

}
