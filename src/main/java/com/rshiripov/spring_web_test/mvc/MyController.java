package com.rshiripov.spring_web_test.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/")
    public String showPage() {
        return "Hello";
    }

    @GetMapping("/test")
    public String showTestPage() {
        return "Test";
    }

}
