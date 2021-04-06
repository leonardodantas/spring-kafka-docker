package com.spring.consumer.gerador.pedidos.controller;

import com.spring.consumer.gerador.pedidos.model.ProdutoVendido;
import com.spring.consumer.gerador.pedidos.model.ValorVendido;
import com.spring.consumer.gerador.pedidos.model.Venda;
import com.spring.consumer.gerador.pedidos.service.VendasService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@ApiOperation("Vendas Controller")
@RestController
@RequestMapping("/vendas")
public class VendaController {

    @Autowired
    private VendasService vendasService;

    @ApiOperation(value = "Recuperar todos os produtos")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Recuperar toda a lista"),
            @ApiResponse(code = 204, message = "Lista vazia")
    })
    @GetMapping("/produtos")
    public ResponseEntity<?> recuperarProdutos(Pageable pageable){
        Page<ProdutoVendido> vendas = vendasService.recuperarProdutos(pageable);
        if(vendas.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(vendas);
    }


    @ApiOperation(value = "Recuperar todos os valores")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Recuperar toda a lista"),
            @ApiResponse(code = 204, message = "Lista vazia")
    })
    @GetMapping("/vendas")
    public ResponseEntity<?> recuperarValores(Pageable pageable){
        Page<ValorVendido> vendas = vendasService.recuperarValores(pageable);
        if(vendas.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(vendas);
    }

}
