package com.blingbling.boot1805;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.blingbling.boot1805")
public class Boot1805Application {

    public static void main(String[] args) {
        SpringApplication.run(Boot1805Application.class, args);
    }
}
