package LIST集合;

import java.util.ArrayList;
import java.util.List;

public class 加强for遍历 {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add("我带你妈打");
        list.add("我带你妈打");
        list.add("我带你妈打");
        list.add("我带你妈打");
        //遍历集合
        for(Object obj:list){
       //for（var name：要遍历的数组或对象）
            System.out.println(obj);
        }
        //快捷方式iter
        for (Object o : list) {
            //object是集合中的元素，其本身应该是integer类型的
            System.out.println(o);
        }
    }
}
