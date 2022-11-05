package com.apartamento.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.apartamento.demo.model.Apartamento;
import com.apartamento.demo.repository.RepositoryApartamento;

@Controller
public class HomeApartamento {
    
    @Autowired
    RepositoryApartamento repository;


    @GetMapping("/cadastrarApto")
    public String cadastrarApto (Model model){
        model.addAttribute("apartamento", new Apartamento());
        return "cadastroApto";
    }

    @PostMapping("/cadastrarApto")
    public String novoApto(Apartamento apartamento){
        repository.gravar(apartamento);
        return "index";
    }

    @GetMapping("/infoApto")
    public String infoApto (){
        return "infoApto";
    }

}
