package com.management.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.management.service.*")
public class DataManagementStarterApplication {

    public static void main(String[] args) {
        SpringApplication.run(DataManagementStarterApplication.class, args);
    }

}
