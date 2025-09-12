package com.springboot.thymeleaf.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.springboot.thymeleaf.entities.Student;

import java.util.Arrays;
import java.util.List;

@Controller
public class HelloWorldController {
    @Value("${operating}")
    private List<String> operating;

    @GetMapping("/")
    public String processForm(Model model) {

        model.addAttribute("student", new Student());
        model.addAttribute("operating", operating);
        return "student_form";
    }

    @PostMapping("/processed_form")
    public String processForm(@ModelAttribute("student") Student student) {
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());
        System.out.println("Student Country" + student.getCountry());
        System.out.println("Student programming language: " + student.getProgrammingLanguage());
        System.out.println("student os: " + Arrays.toString(student.getOperatingSystem()));

        return "confirmation_form";
    }
}
