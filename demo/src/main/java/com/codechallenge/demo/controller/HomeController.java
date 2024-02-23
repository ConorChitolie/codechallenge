package com.codechallenge.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.codechallenge.demo.model.PasswordGenerator;

@Controller
public class HomeController {

    @GetMapping("/")
    public String showForm() {
        return "passwordForm";
    }

    @PostMapping("/generate")
    public String generatePassword(@RequestParam int length, Model model) {
        PasswordGenerator passwordGenerator = new PasswordGenerator();
        String password = passwordGenerator.generatePassword(length);
        model.addAttribute("password", password);
        return "passwordResult";
    }
}


