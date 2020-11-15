import java.util.Scanner;
/* //修饰符 返回值类型 防腐木（参数类型 参数1，参数类型 参数2。。。。）
   {
      方法体
  }*/
public class 方法 {
    public static  int sum(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        Scanner js=new Scanner(System.in);
        System.out.println("输入两个数");
        int i=js.nextInt();
        int j=js.nextInt();

        System.out.println("结果是"+sum(i,j));
    }
}
