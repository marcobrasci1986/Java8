package domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mbrasci on 04/08/2016.
 */
public class Author {

    private String name;
    private Integer age;
    private List<Child> children;

    public Author() {
        this.children = new ArrayList<>();
    }

    public Author(String name, Integer age) {
        this();
        this.name = name;
        this.age = age;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<Child> getChildren() {
        return children;
    }

    public void setChildren(List<Child> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
