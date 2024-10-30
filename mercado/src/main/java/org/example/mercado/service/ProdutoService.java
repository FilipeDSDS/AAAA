package org.example.mercado.service;

import org.example.mercado.model.Produto;
import org.example.mercado.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> listarProdutos(){
        return produtoRepository.findAll();
    }

    public Produto inserirProduto(Produto produto){
        return produtoRepository.save(produto);
    }
}
