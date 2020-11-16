class cat{
    String sound="喵喵喵？";
    String c;
    void say(){
        System.out.println(c+"说"+sound);
    }
    public cat(String a)
    {
        this.c=a;
    }
}
public class 构造函数 {
    public static void main(String[] args) {
        cat a=new cat("黑");
        a.say();
    }
}
