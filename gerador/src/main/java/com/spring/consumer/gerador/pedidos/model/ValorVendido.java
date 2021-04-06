package com.spring.consumer.gerador.pedidos.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@Entity
@Getter
@Table(name = "valor_vendido")
public class ValorVendido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Setter
    @Column(name = "valor_vendido")
    private double valorVendido;
}
