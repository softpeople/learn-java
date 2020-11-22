package LIST集合;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Collections简介（java.util要调包）
针对集合进行操作的工具类

常用成员方法
sort（list<T>）:根据元素的自然顺序，将指定列表升序排序
max(Collection<T>):返回集合的最大元素
reverse(List<T>):反转LIst集合元素
shuffle(List<T>):使用默认的随机源随机置换指定的列表
 */
public class Collections工具类 {
    public static void main(String[] args) {
        List a=new ArrayList();
        a.add("10");
        a.add("15");
        a.add("17");
        a.add("1");
        System.out.println("操作前的集合"+a);
        System.out.println("集合中的最大元素"+Collections.max(a));
        Collections.sort(a);
        System.out.println("升序排列过的结果为"+a);
        Collections.reverse(a);
        System.out.println("升序倒序过的结果为"+a);
        Collections.shuffle(a);
        System.out.println("随机置换过的结果为"+a);

    }
}
