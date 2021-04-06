package com.spring.consumer.gerador.pedidos.service;

import com.spring.consumer.gerador.pedidos.model.ProdutoVendido;
import com.spring.consumer.gerador.pedidos.model.ValorVendido;
import com.spring.consumer.gerador.pedidos.repository.IProdutoVendido;
import com.spring.consumer.gerador.pedidos.repository.IValorVendido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class VendasService {

    @Autowired
    private IProdutoVendido iProdutoVendido;

    @Autowired
    private IValorVendido iValorVendido;

    public Page<ProdutoVendido> recuperarProdutos(Pageable pageable) {
        return iProdutoVendido.findAll(pageable);
    }

    public Page<ValorVendido> recuperarValores(Pageable pageable) {
        return iValorVendido.findAll(pageable);
    }
}
