package com.zf.boot;

import com.zf.boot.bean.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Boot302DemoApplication {

    public static void main(String[] args) {
        var ioc = SpringApplication.run(Boot302DemoApplication.class, args);
//        String[] names = ioc.getBeanDefinitionNames();
//        for(String name: names){
//            System.out.println(name);
//        }
//        var b1 = ioc.getBean("user");
//        var b2 = ioc.getBean("user");
//        System.out.println(b1 == b2);
        for(String s: ioc.getBeanNamesForType(Cat.class)){
            System.out.println(s);
        }
        for(String s: ioc.getBeanNamesForType(Dog.class)){
            System.out.println(s);
        }
        for(String s: ioc.getBeanNamesForType(User.class)){
            System.out.println(s);
        }
        System.out.println(ioc.getBean(Pig.class));
        System.out.println(ioc.getBean(Sheep.class));
    }

}
