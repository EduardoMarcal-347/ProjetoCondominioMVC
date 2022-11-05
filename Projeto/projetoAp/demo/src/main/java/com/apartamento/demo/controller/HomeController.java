package com.apartamento.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeController {
    
    @GetMapping("/home")
    public String Home(){
        return "index";
    }

}
