package com.example.crudpractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class CrudPracticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrudPracticeApplication.class, args);
    }

}
