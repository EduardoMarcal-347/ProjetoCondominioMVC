package com.apartamento.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.convert.ReadingConverter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class RepositoryApartamento {
    
    @Autowired
    JdbcTemplate db;

    public void gravar(){

    }

}
