package com.akash.springsecuritytesting;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.httpBasic;

import org.springframework.context.annotation.Import;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@WebMvcTest
@Import(SpringSecurityConfig.class) /* Bring the security configuration made on the app to testClass to perform same as original application. */
public class SecurityControllerTest {


    @Autowired
    MockMvc mockMvc;

    private final String USER_NAME = "user";
    private final String USER_PASSWORD = "password";

    @Test
    void getRequestTest() throws Exception {
        mockMvc.perform(get("/api/v1/secure")
                .with(httpBasic(USER_NAME,USER_PASSWORD)))
                .andExpect(status().is2xxSuccessful());
    }
    @Test
    void postRequestTest() throws Exception {
        mockMvc.perform(post("/api/v1/secure")
                        .with(httpBasic(USER_NAME,USER_PASSWORD))
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().is2xxSuccessful());
    }
}


