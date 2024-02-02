package com.akash.springsecuritytesting;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/v1/secure")
public class SecurityController {

    @GetMapping
    public String getWish(){
        return "Hello from getWish";
    }
//    @PostMapping
//    public String postWish(){
//        return "Hello from postWish";
//    }
}
