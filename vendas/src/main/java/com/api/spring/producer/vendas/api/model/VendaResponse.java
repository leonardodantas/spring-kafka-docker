package com.api.spring.producer.vendas.api.model;

import lombok.Getter;

public class VendaResponse {

    @Getter
    private Produto produto;
    private String nomeComprador;
    private int quantidadeComprada;
    private double valorTotal;

    public VendaResponse(){}

    public VendaResponse(Produto produto, VendaRequest vendaRequest) {
        this.produto = produto;
        this.nomeComprador = vendaRequest.getNomeComprador();
        this.quantidadeComprada = vendaRequest.getQuantidadeComprada();
        this.valorTotal = this.produto.getValorVenda() * vendaRequest.getQuantidadeComprada();
    }

    public String getValorProducao(){
        return String.valueOf(this.produto.getValorProducao());
    }

    public String getNomeProduto(){
        return produto.getNome();
    }

    @Override
    public String toString() {
        return "VendaResponse{" +
                "produto=" + produto +
                ", nomeComprador='" + nomeComprador + '\'' +
                ", quantidadeComprada=" + quantidadeComprada +
                ", valorTotal=" + valorTotal +
                '}';
    }
}
