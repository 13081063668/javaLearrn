package javaCode.chapter06;

public class Method {
    public static void main(String[] args) {
        Person1 p1 = new Person1(18, "Tom");
        p1.say();
        p1.cal01();
        p1.cal02(10);
        System.out.println("n1 + n2 = " + p1.getSum(1, 2));
    }
}
class Person1{
    int age;
    String name;
    Person1(int age, String name){
        this.age = age;
        this.name = name;
        }
    void say(){
        System.out.println(name + "想做一个好人");
    }
    void cal01(){
        int sum = (1 + 1000) * 1000 / 2;
        System.out.println("cal01 结果为" + sum);
    }
    void cal02(int n){
        if(n < 1){
            System.out.println("请输入大于等于1的值");
            return ;
        }
        int sum = (1 + n) * n / 2;
        System.out.println("cal02 结果为" + sum);
    }
    public int getSum(int n1, int n2){
        return n1 + n2;
    }
}
