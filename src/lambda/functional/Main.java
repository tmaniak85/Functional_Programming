package lambda.functional;

import org.w3c.dom.Text;

public class Main {

    public static void main(String[] args) {

        TextConverter textConverter = (text) -> text.replace(" ", ".");
        String result = textConverter.convert("   Przykładowy text   ");
        System.out.println(result);

        textConverter.displayText();
        String result3 = TextConverter.convertToLowerCase(" DO MALYCH LITER");
        System.out.println(result3);

    }
}
