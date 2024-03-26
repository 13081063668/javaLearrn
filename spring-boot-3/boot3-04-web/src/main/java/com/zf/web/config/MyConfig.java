package com.zf.web.config;

import com.zf.web.component.MyYamlHttpMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.CacheControl;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;
import java.util.concurrent.TimeUnit;

//@Configuration // 这是一个配置类
//public class MyConfig implements WebMvcConfigurer {
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        // 保留之前的配置
//        WebMvcConfigurer.super.addResourceHandlers(registry);
//        // 自己的自定义配置
//        registry.addResourceHandler("/static/**")
//                .addResourceLocations("classpath:/a/","classpath:/b/")
//                .setCacheControl(CacheControl.maxAge(1180, TimeUnit.SECONDS));
//    }
//}
@Configuration // 这是一个配置类
public class MyConfig {
    @Bean
    public WebMvcConfigurer webMvcConfigurer(){
        return new WebMvcConfigurer() {
            @Override
            public void addResourceHandlers(ResourceHandlerRegistry registry) {
                // 保留之前的配置
                WebMvcConfigurer.super.addResourceHandlers(registry);
                // 自己的自定义配置
                registry.addResourceHandler("/static/**")
                        .addResourceLocations("classpath:/a/","classpath:/b/")
                        .setCacheControl(CacheControl.maxAge(1180, TimeUnit.SECONDS));
            }
            @Override // 消息转换器 对象 转 yaml
            public void configureMessageConverters(List<HttpMessageConverter<?>> converters){
                converters.add(new MyYamlHttpMessageConverter());
            }
        };
    }

}