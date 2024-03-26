package com.zf.boot.config;

import com.alibaba.druid.DruidRuntimeException;
import com.zf.boot.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;
@Import(DruidRuntimeException.class)
@Configuration // 这就是配置类
public class AppConfig {
    @Scope("prototype") // 多实例，默认为单例
    @Bean // 代替之前的bean标签，组件在容器中的名字是方法名，可以使用@Bean("anothername")修改名字
    public User user(){
        var user = new User();
        user.setId(1L);
        user.setName("zifei");
        return user;
    }
//    @Bean
//    public DruidRuntimeException fastsqlException(){
//        return new DruidRuntimeException();
//    }
}
