package com.zf.boot;

import com.zf.boot.bean.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBoot程序的主入口
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        var ioc = SpringApplication.run(MainApplication.class, args);
        Person person = ioc.getBean(Person.class);
        System.out.println("person:" + person);
    }
}
