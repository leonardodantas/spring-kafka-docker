package com.spring.consumer.gerador.pedidos.model;

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