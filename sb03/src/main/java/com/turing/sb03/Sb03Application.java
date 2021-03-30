package com.turing.sb03;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@PropertySource("classpath:myconfig.properties")
public class Sb03Application {

    public static void main(String[] args) {
        SpringApplication.run(Sb03Application.class, args);
    }

}
