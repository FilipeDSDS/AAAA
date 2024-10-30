package org.example.mercado.controller;


import org.example.mercado.model.Produto;
import org.example.mercado.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public List<Produto> listaProduto(){
        return produtoService.listarProdutos();
    }

    @PostMapping
    public Produto incluirProduto(@RequestBody Produto produto){
        return produtoService.inserirProduto(produto);
    }

}
