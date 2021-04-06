package com.api.spring.producer.vendas.api.service;

import com.api.spring.producer.vendas.api.model.Produto;
import com.api.spring.producer.vendas.api.repository.IProdutoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ProdutoService {

    @Autowired
    private IProdutoRepository iProdutoRepository;

    public Page<Produto> retornarTodos(Pageable pageable){
        Page<Produto> produtos = iProdutoRepository.findAll(pageable);
        log.debug("Produtos Recuperados Service - Producer: " + produtos.getContent().toString());
        return produtos;
    }
}
