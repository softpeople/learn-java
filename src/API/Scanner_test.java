package API;
import java.util.Scanner;
public class Scanner_test {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int c=0;
        if(a.hasNextInt())  //返回bool，判断是否有下一个int，Int可改
        c=a.nextInt();         //返回整数，Int可改

        System.out.println(c);
    }
}
