package LIST集合;

import java.util.*;

/*
Map集合
特点：双列集合，元素由键值对（Entry）构成
            key——value
            key不可以重复，value可以重复
应用：
    Map<T1,T2> map=new HashMap<>();
    T1:表示键的数据类型
    T2:表示值的数据类型
成员方法:
    V put(K key,V value);  添加元素（键值对的形式）
    V get(Object key)      根据键获取其对应值
    Set<K> KeySet();       获取所有键的集合
 */
public class map集合 {
    public static void main(String[] args) {
        Map<Integer,student> map=new HashMap<>();
        student s1=new student("嘿嘿",12);
        student s2=new student("诶嘿",13);
        student s3=new student("嘿咻",14);
        student s4=new student("嘿咻",14);
        //往map中添加三个对象并输出
        map.put(1,s1);
        map.put(2,s2);
        map.put(3,s3);
        map.put(4,s4);
        System.out.println(map);
        System.out.println(map.get(2));

        //遍历步骤
          //方法1
            //1.获取所有键的集合：KeySet（）
            Set<Integer> keys = map.keySet();
            //2.遍历所有的键，获取每一个键
                //获取迭代器对象
            Iterator<Integer> it = keys.iterator();
            while (it.hasNext())
            {
                //如果有值就获取
                Integer key=it.next();
                //根据键获取值(内容设定的student)
                student value = map.get(key);
                System.out.println("key:"+key+"    value:  "+value);
            }
        System.out.println("——————————————————");
          //方法2
            //1.获取所有键的集合
        Set<Integer> integers = map.keySet();
        for (Integer a : integers)
        {
            System.out.println("key:"+a+"    value:  "+map.get(a));
        }
       
    }
}
