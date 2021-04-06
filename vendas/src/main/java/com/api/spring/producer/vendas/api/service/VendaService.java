package com.api.spring.producer.vendas.api.service;

import com.api.spring.producer.vendas.api.model.Produto;
import com.api.spring.producer.vendas.api.model.VendaRequest;
import com.api.spring.producer.vendas.api.model.VendaResponse;
import com.api.spring.producer.vendas.api.repository.IProdutoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Slf4j
@Service
public class VendaService {

    @Value("${topic.name.valor}")
    private String valorVenda;

    @Value("${topic.name.produto}")
    private String nomeProduto;

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    private IProdutoRepository iProdutoRepository;

    public VendaResponse criarNovaVenda(VendaRequest vendaRequest) {
        log.info("VendaRequest Service: " + vendaRequest.toString());
        Optional<Produto> produto = iProdutoRepository.findById(vendaRequest.getProdutoId());
        log.info("Produto Service: " + produto.get().toString());

        if (!produto.isPresent()) {
            return new VendaResponse();
        }

        VendaResponse vendaResponse = new VendaResponse(produto.get(), vendaRequest);

        log.info("VendaResponse ValorProducao Service: " + vendaResponse.getValorProducao());

        kafkaTemplate.send(valorVenda, vendaResponse.getValorProducao());

        kafkaTemplate.send(nomeProduto, vendaResponse.getNomeProduto());

        return vendaResponse;
    }
}
