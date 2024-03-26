package com.zf.boot.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import lombok.Data;

import java.util.Date;
import java.util.List;
@Component
@ConfigurationProperties(prefix = "child")
@Data
public class Child {
    String name;
    Integer age;
    Date birthDay;
    List<String> test;

}
