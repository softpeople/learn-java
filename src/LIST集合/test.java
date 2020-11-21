package LIST集合;
import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        //创建集合
        List list=new ArrayList();
        //创建元素对象
        student d1=new student("aa",12);
        student d2=new student("bb",13);
        student d3=new student("cc",14);
        student d4=new student("dd",15);
        //将元素添加到集合对象中
        list.add(d1);
        list.add(d2);   //按顺序
        list.add(d3);
        list.add(d3);   //可重复
        list.add(d4);
        System.out.println(list);
        System.out.println("索引为2的元素是："+list.get(2));
        System.out.println("list长度为"+list.size());
    }
}
