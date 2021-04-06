package com.api.spring.producer.vendas.api.repository;

import com.api.spring.producer.vendas.api.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProdutoRepository extends JpaRepository<Produto, Integer> {
}
