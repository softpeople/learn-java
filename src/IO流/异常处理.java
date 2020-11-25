package IO流;
/*
Java中的异常
顶层父类:Throwable
    子类：Error（错误，不需要我们处理）
    子类：Exception（异常，这才是我们常说的异常）

    JVM默认的处理方式：
        在控制台中打印异常信息，并终止程序。
     处理方法：
        方法一：捕获 自己处理。 try..catch..finally
        格式
            try{
                //尝试执行的代码(可能会出现问题的代码)
            }
            catch(Exception e){
                //出现问题后的解决方案
            }
            finally{
                //写在这里的代码正常情况下一定会执行，一般是用来释放资源的
            }
        方法二：抛出，交给调用者处理.   throws
 */
public class 异常处理 {
    public static void main(String[] args) {
        try {
            //尝试要执行的代码
            int a=10/0;
            System.out.println(a);
        } catch (Exception e) {
            //出现问题后的解决方案
            e.printStackTrace();
        }
    }
}
