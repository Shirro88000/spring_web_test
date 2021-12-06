package com.rshiripov.spring_web_test.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    @RequestMapping("/")
    public String showPage() {
        return "page";
    }

    @RequestMapping("/test")
    public String showTestPage() {
        return "page2";
    }

}
