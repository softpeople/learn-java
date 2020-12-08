package 反射;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;

/*
Constructor<T>对象
    构造器对象，属于java.base模块,java.lang.reflect包
通过Class对象获取对象构造器对象
    Class类:
        成员方法:
            public Constructor getConstructor(Class..params);
                    根据参数列表,获取对应的构造器对象(仅限公共构造函数)
            public Constructor getDeclaredConstructor(Class..params);
                    根据参数列表,获取对应的构造器对象(包含私有构造函数)
            public Constructors getConstructors();
                    获取此类所有的构造函数(不包含私有)
    Constructor类:构造器类
        概述：属于java.base模块,java.lang.reflect包
            成员方法:
            public String getName();                获取构造函数名
            public T newInstances(Object...params)  根据此构造函数和指定参数创建对象
 */
public class 反射方式获取构造方法 {
    public static void main(String[] args) throws Exception{
         //需求：通过反射的方式创建：student类型的对象
        //1.获取Student类的字节码文件
            Class a=Class.forName("反射.student");
        //2.根据获得的字节码文件对象，获取指定的构造器对象
            //获取公共的无参构造
            Constructor cun1= a.getConstructor();
            System.out.println(cun1);
            //获取公共的有参构造
            Constructor con2 = a.getConstructor(int.class);     //此方法只能获得公共的构造函数
            System.out.println(con2);
            //获取私有的有参构造
            Constructor con3 = a.getDeclaredConstructor(String.class);
            System.out.println(con3);
            System.out.println(con3.getName());                 //获取构造器的名字
            //根据构造器创建对象
            student him=(student) con2.newInstance(15);
    }
}
