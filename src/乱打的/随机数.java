package 乱打的;

import java.util.Random;

public class 随机数 {
    public static void main(String[] args) {
        Random a=new Random();
        String num=Integer.toString(a.nextInt(2000)); //取0到99，包含0，包含99
        System.out.println(num);       //输出快捷键sout
    }
}
