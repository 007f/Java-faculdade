package com.example.demo.repository;

import com.example.demo.model.Orcamento;
import com.example.demo.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrcamentoRepository  extends JpaRepository<Orcamento, Integer> {

}