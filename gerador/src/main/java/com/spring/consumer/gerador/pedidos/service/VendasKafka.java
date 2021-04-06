package com.spring.consumer.gerador.pedidos.service;

import com.spring.consumer.gerador.pedidos.model.ProdutoVendido;
import com.spring.consumer.gerador.pedidos.model.ValorVendido;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


@Slf4j
@RequiredArgsConstructor
@Service
public class VendasKafka {

    @Value("${topic.name.valor")
    private String topicValor;

    @Value("${topic.name.produto")
    private String topicProduto;

    @Autowired
    private ProdutoVendidoService produtoVendidoService;

    @Autowired
    private ValorVendidoService valorVendidoService;

    @KafkaListener(topics = "${topic.name.valor}", groupId = "group_id")
    public void consumeValor(ConsumerRecord<String, String> payload){
        ValorVendido valorVendido = new ValorVendido();
        valorVendido.setValorVendido(Double.parseDouble(payload.value()));
        valorVendidoService.salvar(valorVendido);

    }

    @KafkaListener(topics = "${topic.name.produto}", groupId = "group_id")
    public void consumeProduto(ConsumerRecord<String, String> payload){
        ProdutoVendido produtoVendido = new ProdutoVendido();
        produtoVendido.setProdutoVendido(payload.value());
        produtoVendidoService.salvar(produtoVendido);
    }
}
