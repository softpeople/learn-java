package IO流;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
/*
按单个字符写入：
    Writer a=new FileWrite("文件目的地");
    int zi='字';
    a.write(zi);
按字符数组写入
    Writer a=new FileWrite("文件目的地");
    char[] chs={'a','b','c'};
    a.write(chs,起始位置,结束位置)      位置可不写
按字符流写数据：
    Writer a=new FileWrite("文件目的地");
    a.write("写入的内容");
异常处理：
    throws IOException
关闭资源
    a.close();
 */

public class 写入 {
    public static void main(String[] args)throws IOException {
        Writer a=new FileWriter("D:/yb/1.txt");
        //写入会先清空内容
        a.write("wdnmd");
        //释放资源(不释放资源文件中就没有东西)
        a.close();
    }
}
