package com.api.spring.producer.vendas.api.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Getter

@Entity
@Table(name = "produtos")
public class Produto {

    @Id
    private int id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "valor_producao")
    private double valorProducao;

    @Column(name = "valor_venda")
    private double valorVenda;

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", valorProducao=" + valorProducao +
                ", valorVenda=" + valorVenda +
                '}';
    }
}
