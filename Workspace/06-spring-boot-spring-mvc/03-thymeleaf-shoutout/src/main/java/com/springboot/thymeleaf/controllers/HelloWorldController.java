package com.springboot.thymeleaf.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class HelloWorldController {
    @RequestMapping("/")
    public String showForm(){
        return "helloworld-form";
    }

    @RequestMapping("/processForm")
    public String processForm(HttpServletRequest request, Model model){
        String name= request.getParameter("studentName");
        String op= "Yo!"+ name.toUpperCase();
        model.addAttribute("output", op);
        return "processed-form";
    }
}
