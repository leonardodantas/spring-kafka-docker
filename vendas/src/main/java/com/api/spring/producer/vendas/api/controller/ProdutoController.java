package com.api.spring.producer.vendas.api.controller;

import com.api.spring.producer.vendas.api.model.Produto;
import com.api.spring.producer.vendas.api.service.ProdutoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Api(value = "Produtos Controller")
@RestController
@CrossOrigin
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @ApiOperation(value = "Recuperar todos os produtos")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Recuperar toda a lista"),
            @ApiResponse(code = 204, message = "Lista vazia")
    })
    @GetMapping
    public ResponseEntity<?> recuperarProdutos(@PageableDefault(page = 0, size = 20) Pageable pageable){
        Page<Produto> produtos = produtoService.retornarTodos(pageable);
        log.debug("Produtos Recuperados Controller - Producer: " + produtos.toString());
        if (produtos.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(produtos);
    }

}
