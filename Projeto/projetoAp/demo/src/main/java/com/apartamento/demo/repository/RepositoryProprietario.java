package com.apartamento.demo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.apartamento.demo.model.Apartamento;
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

    public List<Proprietario> lista(){
        Proprietario prop = new Proprietario();
        List<Proprietario> listaProp = (List<Proprietario>) db.query("select p.id as id, p.nome as nome, p.telefone as telefone from proprietario p", 
                (linha, contador)->{
                    prop.setIdProp(linha.getInt("id"));
                    prop.setNome("nome");
                    prop.setTelefone("telefone");
                    return prop;
            }
        );
            return listaProp;
    }

}
