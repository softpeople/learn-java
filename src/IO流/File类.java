package IO流;

import java.io.File;

/*
构造方法:
    File(String pathname)
    File(String parent,String child)
    File(File parent,String child)
成员方法:
   创建功能：（存在就不创建返回false，不存在就创建返回true）
    createNewFile():创建文件
    mkdir()和mkdirs():创建目录
   判断功能：
    isDirectory:判断File对象是否为目录
    isFile():判断File对象是否为文件
    exists():判断File对象是否存在
 */
public class File类 {
    public static void main(String[] args) throws Exception {
        //将D:\yb\1.txt封装成File对象
        //方法1:根据字符串形式的路径获取File对象
        //File a=new File("D:\\yb\\1.txt");
        File a=new File("D:/yb/1.txt");         //地址用一个左斜线或者两个右斜线，IDEA会自动变双右斜线
        System.out.println("file1:"+a);
        //方法2：根据字符串形式的父目录以及子目录创建File对象
        File b=new File("D:/yb","1.txt");
        System.out.println("file2:"+b);
        //方法3：根据父目录对象，以及字符串形式的子目录来获取file对象
        File c=new File("D:/yb");
        File e=new File(c,"1.txt");
        System.out.println("file3:"+e);


        System.out.println("---------------------------------华丽的分割线");


        //在D:/yb下创建一个2.txt
        File f=new File("2.txt");
        boolean tof=f.createNewFile();                          //直接f.createNewFile(); 会报错java.io.IOException，
        System.out.println(tof);                                // 必须对其进行捕获或声明以便抛出
                                                                //解决方法：1.TryCatch  2.throw
        //在D:/yb下创建一个a文件夹（多及目录使用mkdirs创建）
        File g=new File("D:/yb/a");
        tof=g.mkdir();
        System.out.println(tof);
        System.out.println("---------------------------------华丽的分割线");
        System.out.println("测试判断");
        File h=new File("D:/yb/a");
        System.out.println("判断h是不是文件夹"+h.isDirectory());
        System.out.println("判断h是不是文件"+h.isFile());
        System.out.println("判断h是否存在"+h.exists());
    }
}
