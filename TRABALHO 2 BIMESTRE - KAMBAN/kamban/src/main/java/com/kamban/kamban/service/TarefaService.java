package com.kamban.kamban.service;

import com.kamban.kamban.model.Status;
import com.kamban.kamban.model.Tarefa;
import com.kamban.kamban.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TarefaService {
    @Autowired
    private TarefaRepository tarefaRepository;

    public Tarefa Salvar(Tarefa tarefa) {
        return tarefaRepository.save(tarefa);
    }

    public Tarefa Alterar(Integer Id, Tarefa novaTarefa) {
        Tarefa tarefaAtual = tarefaRepository.findById(Id).orElseThrow(()->new RuntimeException("A tarefa não foi encontrada."));
        tarefaAtual.setTitulo(novaTarefa.getTitulo());
        tarefaAtual.setDescricao(novaTarefa.getDescricao());
        tarefaAtual.setDataFinal(novaTarefa.getDataFinal());
        return tarefaRepository.save(tarefaAtual);
    }

    public void Excluir(Integer Id) {
        tarefaRepository.deleteById(Id);
    }

    public Tarefa MoverTarefa(Integer Id) {
        Tarefa tarefaTmp = tarefaRepository.findById(Id).orElseThrow(()->new RuntimeException("A tarefa não foi encontrada."));
        if (tarefaTmp.getStatus() == Status.A_FAZER){
            tarefaTmp.setStatus(Status.EM_PROGRESSO);
        } else if (tarefaTmp.getStatus() == Status.EM_PROGRESSO) {
            tarefaTmp.setStatus(Status.CONCLUIDO);
        }
        return tarefaRepository.save(tarefaTmp);
    }

    public List<Tarefa> ListarTodos() {
        return tarefaRepository.findAll();
    }

    public List<Tarefa> ListarporPrioridade() {
        return tarefaRepository.findByOrderByPrioridadeAsc();
    }

    public List<Tarefa> ListarAtrasados() {
        return tarefaRepository.findAll().stream().filter(tarefa -> tarefa.getDataFinal() != null && tarefa.getDataFinal().isBefore(LocalDate.now()) && tarefa.getStatus() != Status.CONCLUIDO).collect(Collectors.toList());
    }
}
