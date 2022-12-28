package com.smartcontactmanager.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {
    
    @RequestMapping("/")
    public String home(Model model)
    {
        model.addAttribute("title", "Home - Smart Contact Manager");
        return "home";
    }

    @RequestMapping("/about")
    public String about(Model model)
    {
        model.addAttribute("title", "About - Smart Contact Manager");

        return "about";
    }

    @RequestMapping("/contact")
    public String contact(Model model)
    {
        model.addAttribute("title", "Contact - Smart Contact Manager");

        return "contact";
    }
}
