package domain;

/**
 * Created by MaBa on 18/03/16.
 */
public class Person {

    private String name;
    private int age;
    private Gender gender;
    private Long salary;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.gender = Gender.MALE;
    }

    public Person(String name, Gender gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    public Person(String name, Gender gender, int age, long salary) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }


}
