package com.apartamento.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.apartamento.demo.model.Proprietario;
import com.apartamento.demo.repository.RepositoryProprietario;

@Controller
public class HomeProprietario {

    @Autowired
    RepositoryProprietario repository;

    
    @GetMapping("/cadastrarProp")
    public String cadastrarProprietario(){
        return "cadastroProp";
    }

    @GetMapping("/infoProp")
    public String infoProp(){
        return "infoProp";
    }
    
    @PostMapping("/cadastrarProp")
    public String novoProp (Proprietario proprietario){
        repository.gravar(proprietario);
        return "index";
    }

}
