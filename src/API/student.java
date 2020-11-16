package API;

import java.util.Objects;

public class student {
    private String name;
    private  int age;
    private int score;

    public student() {                      //快速创建构造函数，右键Generate→constructor→选参数
    }

    public student(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override                               //快速重新方法，右键Generate→选方法
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        student student = (student) o;
        return age == student.age &&
                score == student.score &&
                name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, score);
    }
}
