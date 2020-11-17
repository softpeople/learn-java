package API;

import java.util.Calendar;
import java.util.Date;                            //调包
/*
* 构造方法
* Date（）：构造一个日期对象，当前系统时间，精确到毫秒
* Date（long）：构造一个日期对象，时间为自“1970.1.1的0点”起，至指定参数的毫秒数
* 成员方法
* long getTime():将日期对象转换成对应时间的毫秒数
* static Calendar getInstance():根据当前系统时区和语言环境获取日历对象
* int get(int field):返回给定日历字段的值
* void set(int field,int value):将给定的日历字段设置为指定的值
* */
public class Date和Calendar {
    public static void main(String[] args) {
        Date a=new Date();
        System.out.println(a);
        long c= a.getTime();
        Date b=new Date(c-1000);
        System.out.println(b);
        System.out.println(c);

        //Calendar类
        Calendar e=Calendar.getInstance();  //创建Calendar类型的值,这是抽象的
        System.out.println(e);              //月份从0到11
        int year=e.get(Calendar.YEAR);
        int mouth=e.get(Calendar.MONTH);    //不能在这加一
        int day=e.get(Calendar.DATE);
        System.out.println(year+"."+(mouth+1)+"."+day);

    }
}
