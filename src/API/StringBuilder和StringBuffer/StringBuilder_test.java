package API.StringBuilder和StringBuffer;
/*
 * 构造方法
 * StringBuilder（）：构造一个空的StringBuilder容器
 * StringBuilder（string）：构造一个空的StringBuilder容器,并添加指定字符串
 * 成员方法
 * StringBuilder append（） 将任意数据添加到StringBuilder容器中，返回自身
 * string ToString（） 将当前StringBuilder容器转换为字符串
 */
public class StringBuilder_test {         //java.lang下的类，可不调用包
    public static void main(String[] args) {
        StringBuilder a=new StringBuilder();               //创建容器
        StringBuilder b=new StringBuilder("就这就这");       //创建容器,把string转成StringBuilder
        a.append("wdnmd");                                 //添加到容器中
        System.out.println(a);
        a.append("，我柜子动了");
        System.out.println(a);
        System.out.println(b);
    }
}
