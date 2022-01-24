package functional.supplier;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String name;
    private Integer age;
    private String address;
    private List<User> relatives = new ArrayList<>();

    public User() {
        System.out.println("Create user");
    }

    public static class UserBuilder {
        User user = new User();

        public UserBuilder setName(String name) {
            user.name = name;
            return this;
        }
        public UserBuilder setAge(Integer age) {
            user.age = age;
            return this;
        }
        public UserBuilder setAddress(String address) {
            user.address = address;
            return this;
        }
        public UserBuilder setRelatives(User relative) {
            user.relatives.add(relative);
            return this;
        }
        public User createUser() {
            return user;
        }
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public List<User> getRelatives() {
        return relatives;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", relatives=" + relatives +
                '}';
    }
}
