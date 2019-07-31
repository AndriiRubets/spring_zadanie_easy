package com.javagda21.spring_zadanie_easy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/index")
    public String getIndexPage() {
        return "navigator";
    }

    @GetMapping("/")
    public String getIndexPageRedirect() {
        return "redirect:/index";
    }
}
