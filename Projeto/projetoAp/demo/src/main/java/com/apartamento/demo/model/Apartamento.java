package com.apartamento.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Apartamento {
    
    private int id, nrPorta, qtdQuartos;
    private String tipo;
    private Proprietario proprietario;

}
