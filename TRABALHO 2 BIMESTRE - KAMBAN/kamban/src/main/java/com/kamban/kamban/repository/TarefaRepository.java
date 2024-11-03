package com.kamban.kamban.repository;

import com.kamban.kamban.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TarefaRepository extends JpaRepository <Tarefa, Integer> {
    List<Tarefa> findByOrderByPrioridadeAsc();
}
