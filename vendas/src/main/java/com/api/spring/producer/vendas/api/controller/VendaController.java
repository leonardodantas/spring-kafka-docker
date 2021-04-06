package com.api.spring.producer.vendas.api.controller;


import com.api.spring.producer.vendas.api.model.VendaRequest;
import com.api.spring.producer.vendas.api.model.VendaResponse;
import com.api.spring.producer.vendas.api.service.VendaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@Slf4j
@Api(value = "Venda Controller")
@RestController
@CrossOrigin
@RequestMapping("/venda")
public class VendaController {

    @Autowired
    private VendaService vendaService;

    @ApiOperation(value = "Criar nova venda")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Nova venda criada com sucesso"),
            @ApiResponse(code = 409, message = "Produto não existe na base de dados")
    })
    @PostMapping
    public ResponseEntity<?> criarNovaVenda(@RequestBody VendaRequest vendaRequest){
        log.info("VendaRequest Controller: " + vendaRequest.toString());
        VendaResponse vendaResponse = vendaService.criarNovaVenda(vendaRequest);
        log.info("VendaResponse Controller: " + vendaResponse.toString());
        if (Objects.isNull(vendaResponse.getProduto())) {
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }
        return new ResponseEntity<>(vendaResponse, HttpStatus.CREATED);
    }
}
