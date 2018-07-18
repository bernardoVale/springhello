package com.github.bvale.helloSpring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String hello(){
        String foo = "bar";
        return "Hello World modafucker!";
    }
}
