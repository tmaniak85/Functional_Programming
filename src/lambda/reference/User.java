package lambda.reference;

public class User {

    String name;

    public User(String name) {
        this.name = name;
        System.out.println("Uzytkownik " + name + " został stworzony");
    }
}
