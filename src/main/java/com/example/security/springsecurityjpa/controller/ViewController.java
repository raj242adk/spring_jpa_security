package com.example.security.springsecurityjpa.controller;

import com.example.security.springsecurityjpa.entity.User;
import com.example.security.springsecurityjpa.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ViewController {

    @Autowired
    UserRepo userRepo;

    @GetMapping("/register")
    public String RegisterUser(){
        return "Register.html";
    }
    @PostMapping("/register")
    public String RegisteredUser(@ModelAttribute User user){
        userRepo.save(user);
        return "redirect:/register";
    }

}
