package 反射;
/*
获取class对象(字节码对象文件)的三种方式
    1.Object类的getClass()方法
        Class cls= 对象名.getClass();
    2.类的静态属性
        Class cls= 类名.class();
    3.Class类的静态方法
        Class cls= Class.forName("类的正名");
        正名:包名+类名

    ps:一个源文件(.java文件)对应一个字节码文件对象(.class)
 */
public class reflectDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        //获取Class对象
        //方式1.
        student a=new student();
        Class clsa1=a.getClass();

        //方法2.
        Class clsa2=student.class;

        //方法3.
        Class clsa3=Class.forName("反射.student");    //防止瞎写，要抛出ClassNotFoundException
        System.out.println(clsa1);
        System.out.println(clsa2);
        System.out.println(clsa3);                   //三种方法获得的字节码对象是一样的
    }
}
