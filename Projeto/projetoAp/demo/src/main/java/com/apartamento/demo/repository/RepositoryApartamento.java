package com.apartamento.demo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.apartamento.demo.model.Apartamento;
import com.apartamento.demo.model.Proprietario;

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

    public List<Apartamento> lista(){
        return db.query("select * from apartamento a, proprietario p where a.id_prop = p.id_prop", 
            (linha, contador) -> {
                Apartamento apto = new Apartamento();
                Proprietario prop = new Proprietario();
                apto.setId(linha.getInt("id_Ap"));
                apto.setNrPorta(linha.getInt("nrPorta"));
                apto.setQtdQuartos(linha.getInt("qtdQuartos"));
                apto.setTipo(linha.getString("tipo"));
                prop.setIdProp(linha.getInt("idProp"));
                prop.setNome(linha.getString("nome"));
                prop.setTelefone(linha.getString("telefone"));
                return apto;
            }
        );


    }

    

}
