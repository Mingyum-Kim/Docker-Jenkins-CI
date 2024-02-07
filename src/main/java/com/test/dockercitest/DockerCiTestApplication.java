package com.test.dockercitest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class DockerCiTestApplication {
    public static void main(String[] args) {
        SpringApplication.run(DockerCiTestApplication.class, args);
    }
}
