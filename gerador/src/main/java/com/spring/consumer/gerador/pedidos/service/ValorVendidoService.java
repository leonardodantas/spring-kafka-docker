package com.spring.consumer.gerador.pedidos.service;

import com.spring.consumer.gerador.pedidos.model.ValorVendido;
import com.spring.consumer.gerador.pedidos.repository.IValorVendido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ValorVendidoService {

    @Autowired
    private IValorVendido iValorVendido;

    public void salvar(ValorVendido valorVendido){
        iValorVendido.save(valorVendido);
    }
}
