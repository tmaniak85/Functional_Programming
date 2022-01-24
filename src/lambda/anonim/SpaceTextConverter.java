package lambda.anonim;

public class SpaceTextConverter implements TextConverter {

    @Override
    public String convert(String text) {
        return text.trim();
    }

    @Override
    public void display() {
        System.out.println("Hello from SpaceTextConverter");
    }
}
