package LIST集合;

import java.util.ArrayList;
import java.util.List;

public class 泛型 {
    public static void main(String[] args) {
        List<String> a=new ArrayList<String>(); //只能添加字符串类型，jdk5开始有泛型，从jdk7开始，<>中可以不写具体类型
        //a.add(10);   会报错×
        a.add("10"); //正解√

        for(String lis:a)       //遍历，加强for底层是迭代器
        {
            System.out.println(lis);
        }
    }
}
