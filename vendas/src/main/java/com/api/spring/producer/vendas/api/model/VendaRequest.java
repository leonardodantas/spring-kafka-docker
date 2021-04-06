package com.api.spring.producer.vendas.api.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class VendaRequest {

    private int produtoId;
    private String nomeComprador;
    private int quantidadeComprada;

    @Override
    public String toString() {
        return "VendaRequest{" +
                "produtoId=" + produtoId +
                ", nomeComprador='" + nomeComprador + '\'' +
                ", quantidadeComprada=" + quantidadeComprada +
                '}';
    }
}
