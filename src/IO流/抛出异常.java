package IO流;
/*
    异常处理方式二:throws
        抛出异常交给调用者处理
 */
public class 抛出异常 {
    public static void show(){      //不用静态就会报错：无法从静态上下文中引用非静态 乱打的.方法
        System.out.println(10/0);
    }
    public static void main(String[] args) throws Exception{   //使用抛出异常会终止程序

        try {
            show();
        } catch (Exception e) {
            System.out.println("异常");           //程序会继续执行
        }
        System.out.println("try..catch..会继续执行程序");
    }

}
