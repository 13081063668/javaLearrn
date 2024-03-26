package com.zf.boot.config;

import com.zf.boot.bean.Cat;
import com.zf.boot.bean.Dog;
import com.zf.boot.bean.Sheep;
import com.zf.boot.bean.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@EnableConfigurationProperties(Sheep.class)
@Configuration
public class AppConfig2 {
    @ConditionalOnClass(name = "com.alibaba.druid.DruidRuntimeException")
    @Bean
    public Cat cat01(){
        return new Cat();
    }

    @ConditionalOnMissingClass(value = "com.alibaba.druid.DruidRuntimeException")
    @Bean
     public Dog dog01(){
        return new Dog();
    }
    @ConditionalOnBean(name="dog01")
    @Bean
    public User zhangsan(){
        return new User();
    }
    @ConditionalOnMissingBean(name="dog01")
    @Bean
    public User lisi(){
        return new User();
    }
}
