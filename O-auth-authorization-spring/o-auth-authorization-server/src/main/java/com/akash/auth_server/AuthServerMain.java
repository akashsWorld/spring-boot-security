package com.akash.auth_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.core.userdetails.UserDetailsService;

@SpringBootApplication
public class AuthServerMain {
    public static void main(String[] args) {

        SpringApplication.run(AuthServerMain.class,args);
    }
}