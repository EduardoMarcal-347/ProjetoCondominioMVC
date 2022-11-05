package com.apartamento.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Proprietario {
    
    private String nome, telefone;
    private int idProp;

}
