package com.example.demo.service;

import com.example.demo.model.Produto;
import com.example.demo.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> listaTodos(){
        return produtoRepository.findAll();//select * from produto ...
    }

    public Produto salvarProduto(Produto produto){
        return produtoRepository.save(produto);//insert into protuto ...
    }
}
