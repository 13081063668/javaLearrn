package com.zf.boot303dem01.Controller;


import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//@Slf4j
@RestController
public class HelloController {
//    Logger log = LoggerFactory.getLogger(getClass());
    @GetMapping("/h")
    public String hello(){
        for(int i = 0; i < 1000;i++){
//            log.trace("trace hello");
//            log.debug("debug hello");
//            log.info("info hello");
//            log.warn("warn hello");
//            log.error("error hello");
        }
        return "hello";
    }

}
