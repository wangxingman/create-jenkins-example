package com.example.jenkinsmaven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsMavenApplication {

    public static void main(String[] args) {
        SpringApplication.run(JenkinsMavenApplication.class, args);
    }
    @GetMapping("/")
    public String  createExample() {
        return   "123131范1231德123131萨2313131发三份";
    }

}
