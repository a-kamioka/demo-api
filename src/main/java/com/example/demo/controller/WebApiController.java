package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
//@RequestMapping("api")
public class WebApiController {

    @RequestMapping("hello")
    private String hello() {
        return "Hello, world!";
    }
}
