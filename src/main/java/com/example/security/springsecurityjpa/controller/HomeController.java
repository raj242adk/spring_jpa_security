package com.example.security.springsecurityjpa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String homePage(){
        return "HomePage.html";
    }
    @GetMapping("/login")
    public String login(){
        return "Login.html";
    }
    @GetMapping("/admin")
    public String adminPage(){
        return "Admin.html";
    }
    @GetMapping("/user")
    public String userPage(){
        return "User.html";
    }



}
