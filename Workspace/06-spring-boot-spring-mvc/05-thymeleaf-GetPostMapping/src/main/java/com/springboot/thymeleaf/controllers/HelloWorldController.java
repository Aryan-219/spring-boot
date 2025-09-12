package com.springboot.thymeleaf.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
    @GetMapping("/showForm")
    public String showForm(){
        return "helloworld-form";
    }

    @PostMapping("/processForm")
    public String processForm(@RequestParam("studentName")String studentName, Model model){

        String op= "Yo!"+ studentName.toUpperCase();
        model.addAttribute("output", op);
        return "processed-form";
    }
}
