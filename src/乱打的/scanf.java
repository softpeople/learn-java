package 乱打的;

import java.lang.module.FindException;
import java.util.InputMismatchException;
import java.util.Scanner;
public class scanf {
    public static void main(String[] args) {
        Scanner jieshou=new Scanner(System.in);
        try {

            int a=jieshou.nextInt();
            System.out.println("输入一个int类型的数");
            System.out.println("接受到"+a);
        }
        catch (InputMismatchException e)
        {
            System.out.println("输入一个int类型的数");

        }

    }
}
