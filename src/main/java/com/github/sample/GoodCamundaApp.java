package com.github.sample;

import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableProcessApplication
public class GoodCamundaApp {

    public static void main(String[] args) {
        SpringApplication.run(GoodCamundaApp.class, args);
    }
}
