package javaCode.chapter06;

public class ThisDetail {
    public static void main(String[] args) {
        ThDetail t = new ThDetail();
        t.f3();

    }
}

class ThDetail{
    String name;
    int age;
    /**
     * 访问构造器中使用this，可以调用构造函数，但是只能放置再第一条语句
     */
    public ThDetail(){
        this("jack", 28);
        System.out.println("无参构造器");
    }
    public ThDetail(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("有参构造器");
    }
    public void f1(){
        System.out.println("f1()方法....");
    }
    public void f2(){
        this.f1();
        System.out.println("f2()方法....");
    }
    public void f3(){
        f1();
        f2();
        System.out.println("f3()方法....");
    }
}