package javaCode.chapter06;

public class Homework03{
    public static void main(String[] args) {
        Book b1 = new Book(120, "布鲁克林有棵树");
        Book b2 = new Book(1650, "国学");
        b1.updatePrice();
        System.out.println(b1.price);
        b2.updatePrice();
        System.out.println(b2.price);

    }
}
class Book{
    int price;
    String name;
    public Book(int price, String name){
        this.price = price;
        this.name = name;
    }
    public void updatePrice(){
        if(this.price > 150){
            this.price = 150;
        }else if(this.price > 100){
            this.price = 100;
        }
    }
}
