package functional.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Jan", 40, 5000.50));
        employees.add(new Employee("Adam", 30, 3900.20));
        employees.add(new Employee("Adam", 30, 2800));
        employees.add(new Employee("Adam", 22, 3800.99));
        employees.add(new Employee("Monika", 35, 9000));
        employees.add(null);

        Comparator<Employee> comparator = Comparator
                .comparing(Employee::getName)
                .thenComparing(Employee::getAge)
                .thenComparingDouble(Employee::getSalary)
                .reversed();
        employees.sort(Comparator.nullsLast(comparator));
        employees.forEach(System.out::println);

    }


}
