package stream.reduce;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>() {{
            add(new User(1, "Jan", 30, BigDecimal.valueOf(3000.0), List.of("Sport", "Motoryzacja")));
            add(new User(2, "Ola", 20, BigDecimal.valueOf(2800.99), List.of("Film", "Podróże")));
            add(new User(3, "Adam", 25, BigDecimal.valueOf(6000.5), List.of("Informatyka")));
            add(new User(4, "Jan", 50, BigDecimal.valueOf(9000.0), List.of("Malarstwo")));
        }};

        Optional<BigDecimal> reduce = users.stream()
                .map(User::getSalary)
                .reduce(BigDecimal::add);
        System.out.println(reduce.get());
//        powyżej uzyskamy jako wynik sumę wynagrodzeń

        BigDecimal reduce2 = users.stream()
                .map(User::getSalary)
                .reduce(BigDecimal.valueOf(40000), (salary1, salary2) -> salary1.subtract(salary2));
        System.out.println(reduce2);
//        powyżej ustalamy kwotę startową, od której zaczynamy
//        wynik jako BigDecimal, bo nie może to być null, skoro jest kwota startowa

    }
}
