package javaCode.chapter06;

public class Homework09 {
    public static void main(String[] args) {
        
    }
}
class Music{
    String name;
    double times;
    public Music(String name, double times){
        this.name = name;
        this.times = times;
    }
    public void play(){
        System.out.println("正在播放... " + this.name);
    }
    public void getInfo(){
        System.out.println("歌曲名称： " + this.name);
        System.out.println("播放时常： " + this.times);

    }
}