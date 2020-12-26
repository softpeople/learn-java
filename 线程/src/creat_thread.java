public class creat_thread {
    public static void main(String[] args) {
        //创建线程对象
        Thread t=new Thread(){
            public void run(){
                //要执行的任务
            }
        };
        //启动线程
        t.start();
        t.stop();
    }
}
