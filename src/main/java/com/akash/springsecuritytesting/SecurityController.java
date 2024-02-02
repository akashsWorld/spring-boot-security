package com.akash.springsecuritytesting;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/v1/secure")
public class SecurityController {

    @GetMapping
    public ResponseEntity<String> getWish(){
        return ResponseEntity.status(HttpStatus.OK).body("Hello from getWish");
    }

/*    Spring security only allows GET request not the POST requests, and provide a by default CSRF() protection.
    so we have to manually disable it to configure the httpSecurity by our self.
    Because if the application totally work on Rest endpoint then it is a unusable thing. */
    @PostMapping
    public ResponseEntity<String> postWish(){
        return ResponseEntity.status(HttpStatus.OK).body("Hello from postWish");
    }
}
