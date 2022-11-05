package com.apartamento.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.apartamento.demo.model.Proprietario;

@Repository
public class RepositoryProprietario {
    
    @Autowired
    JdbcTemplate db;
    
    public void gravar(Proprietario proprietario){
        db.update("insert into proprietario(nome, telefone) values(?, ?)",
        proprietario.getNome(), 
        proprietario.getTelefone());
    }

}
