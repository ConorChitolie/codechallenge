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
        return "index";
    }

    @PostMapping("/generate")
    public String generatePassword(
        @RequestParam int passwordLength,
        @RequestParam(defaultValue = "false") boolean numericalCharacters,
        @RequestParam(defaultValue = "false") boolean specialCharacters,
        @RequestParam(defaultValue = "false") boolean upperCaseCharacters,
        @RequestParam(defaultValue = "false") boolean lowerCaseCharacters, Model model) {

        PasswordGenerator passwordGenerator = new PasswordGenerator();
        String password = passwordGenerator.generatePassword(passwordLength, numericalCharacters, specialCharacters, upperCaseCharacters, lowerCaseCharacters);
        model.addAttribute("password", password);
        return "passwordResult";
    }
}


