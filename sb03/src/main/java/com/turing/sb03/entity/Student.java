package com.turing.sb03.entity;

import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author 长沙图灵科技学院
 * @Company www.tulingedu.com
 */
@Component
@ConfigurationProperties(prefix = "app")
@Data
public class Student {
    private String name;
    private Integer age;
    private String city;
    private String school;
}
