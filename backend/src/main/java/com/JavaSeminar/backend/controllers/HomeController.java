package com.JavaSeminar.backend.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("features", Arrays.asList("AAAAAAAAAAAAAAAA","BBBBBBBBBBB","CCCCCCCCCCCCCC"));
        return "index";
    }
}
