package com.turing.sb03.controller;

import com.turing.sb03.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 长沙图灵科技学院
 * @Company www.tulingedu.com
 */
@RestController
public class FredController {

    @Value("${app.name}")
    private String name;

    @Value("${app.age}")
    private Integer age;

    @Autowired
    private Student stu;

    @GetMapping("/fred")
    public String msg(){
        return name+"："+age;
    }

    @GetMapping("/stu")
    public Student stu(){
        return stu;
    }
}
