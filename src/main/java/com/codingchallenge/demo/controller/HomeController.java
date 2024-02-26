package com.codingchallenge.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.codingchallenge.demo.model.PasswordGenerator;

@Controller
public class HomeController {

    @GetMapping("/")
    public String showForm() {
        return "passwordForm";
    }

    @PostMapping("/generate")
    public String generatePassword(@RequestParam int passwordLength, Model model) {
        PasswordGenerator passwordGenerator = new PasswordGenerator();
        String password = passwordGenerator.generatePassword(passwordLength);
        model.addAttribute("password", password);
        return "passwordResult";
    }
}


