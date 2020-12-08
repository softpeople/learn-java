package 反射;
//学生类
public class student {
    public String name;
    public int age;

    public student() {
        //公共的无参构造
    }

    private student(String name) {
        System.out.println("录入姓名："+name);
        //私有的有参构造
    }

    public student(int age) {
        System.out.println("录入年龄："+age);
    }

    public student(String name, int age) {
        this.name = name;
        this.age = age;
        //公共的有参构造
    }
}
