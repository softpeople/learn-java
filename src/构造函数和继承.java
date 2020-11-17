class cat{
    String sound="喵喵喵？";
    String c;
    void say(){
        System.out.println(c+"说"+sound);
    }
    public cat(String a)                 //Alt+insert快捷创建构造函数
    {
        this.c=a;
    }

    public cat() {                      //无参构造函数，构造函数的重载
    }
}

class whitcat extends cat               //用extends继承
{
    String c="妙";
    public whitcat(){

    }

    public whitcat(String a) {
        super(a);                       //super可以不写，默认

    }

    @Override
    void say() {
        System.out.println(c+"说"+sound);
    }
}
public class 构造函数和继承 {
    public static void main(String[] args) {
        cat a=new cat("黑");
        a.say();
        cat b=new whitcat();
        b.say();
    }
}
