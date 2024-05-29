package com.gsspro7.securitydemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContentController {

    @GetMapping("/home")
    public String handleHome(){
        System.out.println("Home Loaded");
        return "home";
    }

    @GetMapping("/user/home")
    public String handleUser(){
        return "user";
    }

    @GetMapping("/admin/home")
    public String handleAdmin(){
        return "admin";
    }
}
