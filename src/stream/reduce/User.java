package stream.reduce;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

public class User {

    private Integer id;
    private String name;
    private Integer age;
    private BigDecimal salary;
    private List<String> hobbies;


    public User(Integer id, String name, Integer age, BigDecimal salary, List<String> hobbies) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.hobbies = hobbies;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", hobbies=" + hobbies +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) &&
                Objects.equals(name, user.name) &&
                Objects.equals(age, user.age) &&
                Objects.equals(salary, user.salary) &&
                Objects.equals(hobbies, user.hobbies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, salary, hobbies);
    }
}
