package LIST集合;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*对过程的重复称为迭代
  迭代器是遍历Collection集合的通用方式

  迭代器的常用方法
  E.next（）； 返回迭代的下一个元素对象
  boolean hasnext（）；如果仍有元素可以迭代，则返回true
 */
public class 迭代器 {
    public static void main(String[] args) {
        //通过迭代器遍历list
        //创建list
        List a=new ArrayList<>();
        //添加元素
        a.add("10");
        a.add("11");
        a.add("12");
        a.add("13");

        //遍历集合
        //迭代器的用法
        //1.根据集合对象获取其对象的迭代器
        Iterator b =a.iterator();    //iterator————迭代器
        ListIterator c=a.listIterator();//ListIterator————列表迭代器（list体系独有的遍历方式）
        //2.判断迭代器中是否有元素
        while(b.hasNext())
        {
            String s=(String)b.next();    //向下转型
            if("12".equals(s))                  //if("12"==equals(s))
            {
             /*   b.add("12.5");  */                //这样写会报错，ConcurrentModificationException（并发修改异常）一边遍历还添加
                                                    //必须用列表迭代器
            }
            System.out.println(s);
        }

        while (c.hasNext())
        {
            String s=(String)c.next();
            if ("12".equals(s))
            {
                c.add("12.5");                      //列表迭代器在遍历的同时可以修改添加值，必须用列表迭代器的方法
            }
        }
        System.out.println(a);
    }
}
