package com.springmvc.validation.controllers;

import com.springmvc.validation.models.Customer;
import jakarta.validation.Valid;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CustomerController {

    @InitBinder
    public void initBinder(WebDataBinder dataBinder){
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        dataBinder.registerCustomEditor(String.class,stringTrimmerEditor);
    }

    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("customer", new Customer());
        return "customer_form";
    }

    @PostMapping("/process_form")
    public String processForm(
            @Valid @ModelAttribute("customer") Customer customer, BindingResult bindingResult
    ) {
        System.out.println("Binding Results: " + bindingResult);
        System.out.println("Last name : |" + customer.getLastName() + "|");
        if(bindingResult.hasErrors()){
            return "customer_form";
        }else{
            return "customer_confirmation";
        }
    }

}
