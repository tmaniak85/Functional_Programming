package stream.map;

import java.util.List;

public class Student {

    private String name;
    private Long index;
    private List<String> lectures;

    public Student(String name, Long index, List<String> lectures) {
        this.name = name;
        this.index = index;
        this.lectures = lectures;
    }

    public String getName() {
        return name;
    }

    public Long getIndex() {
        return index;
    }

    public List<String> getLectures() {
        return lectures;
    }
}
