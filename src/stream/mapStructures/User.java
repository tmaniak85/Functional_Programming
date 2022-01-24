package stream.mapStructures;

import java.util.List;
import java.util.Objects;

public class User {

    private Integer id;
    private String name;
    private Integer age;
    private List<String> hobbies;

    public User(Integer id, String name, Integer age, List<String> hobbies) {
        this.id = id;
        this.name = name;
        this.age = age;
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

    public List<String> getHobbies() {
        return hobbies;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) &&
                Objects.equals(name, user.name) &&
                Objects.equals(age, user.age) &&
                Objects.equals(hobbies, user.hobbies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, hobbies);
    }


}
