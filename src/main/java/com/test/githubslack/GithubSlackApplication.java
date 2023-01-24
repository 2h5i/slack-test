package com.test.githubslack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GithubSlackApplication {

    public static void main(String[] args) {
        SpringApplication.run(GithubSlackApplication.class, args);
        System.out.println("Test");
    }

}
