package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class BlogController {
    @GetMapping("/blog")
        public String blogMain(Model model){
            return "blog-main";
        }
}
