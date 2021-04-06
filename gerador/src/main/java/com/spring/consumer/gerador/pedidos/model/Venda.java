package com.spring.consumer.gerador.pedidos.model;

import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
public class Venda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    @Column(name = "nome_comprador")
    public String nomeComprador;
    @Column(name = "nome_produto")
    public String nomeProduto;

    @Column(name = "valor_total")
    private double valorTotal;

    @Column(name = "valor_unidade")
    private double valorUnidade;

    @Column(name = "quantidade  ")
    private int quantidade;
}
