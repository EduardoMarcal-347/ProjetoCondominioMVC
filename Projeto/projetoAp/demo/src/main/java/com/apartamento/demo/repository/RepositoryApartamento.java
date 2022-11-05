package com.apartamento.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.convert.ReadingConverter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.apartamento.demo.model.Apartamento;

@Repository
public class RepositoryApartamento {
    
    @Autowired
    JdbcTemplate db;

    public void gravar(Apartamento apartamento){
        db.update("insert into apartamento(nro_porta, qtd_quartos, tipo_ocup) values(?, ?, ?)",
            apartamento.getNrPorta(),
            apartamento.getQtdQuartos(),
            apartamento.getTipo()
        );
    }

}
