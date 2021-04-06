package com.spring.consumer.gerador.pedidos.repository;

import com.spring.consumer.gerador.pedidos.model.ValorVendido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IValorVendido extends JpaRepository<ValorVendido, Integer> {
}
