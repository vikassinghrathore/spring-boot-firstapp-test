package com.examples.ij.springbootfirstapptest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootFirstappTestApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext =
                SpringApplication.run(SpringBootFirstappTestApplication.class, args);
        System.out.println("Hello this is conflict file");
        System.out.println("conflict file resolved");

    }

}
