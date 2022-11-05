package com.apartamento.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.apartamento.demo.repository.RepositoryApartamento;

@Controller
public class HomeApartamento {
    
    @Autowired
    RepositoryApartamento repository;


    @GetMapping("/cadastrarApto")
    public String cadastrarApto (){
        return "cadastroApto";
    }

    @GetMapping("/infoApto")
    public String infoApto (){
        return "infoApto";
    }

}
