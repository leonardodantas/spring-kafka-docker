package com.spring.consumer.gerador.pedidos.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@Entity
@Getter
@Table(name = "produto_vendido")
public class ProdutoVendido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Setter
    @Column(name = "produto_vendido")
    private String produtoVendido;
}
