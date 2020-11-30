package IO流;

import java.io.FileReader;
import java.io.Reader;

/*
    字符流：按字符读写数据的IO流
            Reader：字符输入流的顶层抽象类
              Reader类中的方法：
                int read();   读一个字符：返回对应该字符的ASCII码，读不到返回—1
            FileReader类的构造方法：
                public FileReader(String pathname); 根据传入的字符串形式的路径，获取字符输入流对象
 */
public class 字符流读写 {
    public static void main(String[] args) throws Exception{
        //创建字符流读文件对象(Reader要导包)
        Reader a=new FileReader("D:/yb/1.txt");
      /*
        int fis=a.read();
        System.out.println(fis);
        int sec=a.read();
        System.out.println(sec);    //每读一次会往后一个字符
       */
        //优化上述读数据方法,因为不知道循环次数，所以用while
        int ch=0;//用来接收读取的字符
        while ((ch=a.read())!=-1){
            System.out.println(ch);
        }
        a.close();//释放资源,节约资源提高效率
    }
}
