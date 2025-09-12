package com.springboot.thymeleaf.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.springboot.thymeleaf.entities.Student;

@Controller
public class HelloWorldController {

    @GetMapping("/")
    public String processForm(Model model){

        model.addAttribute("student", new Student());
        return "student_form";
    }
    @PostMapping("/processed_form")
    public String processForm(@ModelAttribute("student") Student student){
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());
        System.out.println("Student Country" + student.getCountry());
        return "confirmation_form";
    }
}
