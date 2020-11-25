package LIST集合;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//1.特点：不可重复、无序
public class Set集合的特点 {
    public static void main(String[] args) {
        //创建集合对象
        Set<student> a=new HashSet<>();
        //创建元素对象
        student s1=new student("嘿嘿",12);
        student s2=new student("诶嘿",13);
        student s3=new student("嘿咻",14);
        student s4=new student("嘿咻",14);
        //将集合对象添加到元素对象中
        a.add(s1);
        a.add(s2);
        a.add(s3);
        a.add(s4);
        /*
        为什么set集合没有"去重"(唯一性)
                因为set保证唯一性依赖：equal（）和hashcode（）两个方法
                你没有在student类中重写这两个方法，默认调用 的是object类中的这两个方法

                解决方案：
                        在student类中重写equal（）和hashcode（）
         */
        System.out.println(a);


        //通过迭代器遍历set集合
        Iterator<student> iterator = a.iterator();

    }
}
