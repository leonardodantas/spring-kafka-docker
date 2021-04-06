package com.spring.consumer.gerador.pedidos.service;

import com.spring.consumer.gerador.pedidos.repository.IProdutoVendido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoVendidoService {

    @Autowired
    private IProdutoVendido iProdutoVendido;

    public void salvar(com.spring.consumer.gerador.pedidos.model.ProdutoVendido produtoVendido){
        iProdutoVendido.save(produtoVendido);
    }
}
