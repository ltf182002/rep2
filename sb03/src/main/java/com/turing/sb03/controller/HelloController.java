package com.turing.sb03.controller;

import com.turing.sb03.Sb03Application;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 长沙图灵科技学院
 * @Company www.tulingedu.com
 */
@RestController
@Slf4j
public class HelloController {
    //获取日志对象（使用slf4j包中的）
//    private Logger log = LoggerFactory.getLogger(Sb03Application.class);

    @GetMapping("/hello")
    public String msg(){
        log.debug("--------HelloController控制器执行了...---------");
        log.info("--------HelloController控制器执行了...---------");
        log.warn("--------HelloController控制器执行了...---------");
        log.error("--------HelloController控制器执行了...---------");
        return "Hello";
    }
}
