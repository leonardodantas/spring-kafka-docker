package com.spring.consumer.gerador.pedidos.repository;

import com.spring.consumer.gerador.pedidos.model.ProdutoVendido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProdutoVendido extends JpaRepository<ProdutoVendido, Integer> {
}
