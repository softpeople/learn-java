package IO流;

import java.io.*;
import java.util.Iterator;

/*
从A中读取，写入B中
释放资源
 */
public class 拷贝 {
    public static void main(String[] args) throws IOException {
        Reader a=new FileReader("D:/yb/1.txt");
        Writer c=new FileWriter("D:/yb/2.txt");         //如果文件不存在，会自动创建
        int len;
        while ((len=a.read())!=-1)
        {
            c.write(len);
        }

        a.close();
        c.close();
    }
}
