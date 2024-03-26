package com.zf.boot.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Component
@ConfigurationProperties(prefix = "person")
@Data
public class Person {
    String name;
    Integer age;
    Date birthDay;
    Boolean like;
    Child child;
    List<Dog> dogs;
    Map<String, Cat> cats;
}
