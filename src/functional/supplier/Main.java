package functional.supplier;

import java.sql.Time;
import java.time.LocalTime;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

        Supplier<Integer> supplier = () -> 1;
        System.out.println(supplier.get());
        displayUser(LocalTime.now(), createUser());
    }

    public static void displayUser(LocalTime time, Supplier<User> user) {
        if(time.isBefore(LocalTime.of(15, 30))) {
            System.out.println(user.get());
        }
    }

    private static Supplier createUser() {
        return () ->
        {
            User user1 = new User.UserBuilder()
                    .setName("Michał")
                    .createUser();

            User user2 = new User.UserBuilder()
                    .setName("Mateusz")
                    .createUser();

            User targetUser = new User.UserBuilder()
                    .setName("Paweł")
                    .setAge(20)
                    .setRelatives(user1)
                    .setRelatives(user2)
                    .createUser();

            return targetUser;
        };
    }
}
