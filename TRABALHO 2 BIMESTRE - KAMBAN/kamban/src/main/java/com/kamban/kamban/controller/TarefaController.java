package com.kamban.kamban.controller;

import com.kamban.kamban.model.Tarefa;
import com.kamban.kamban.service.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/kambam")
public class TarefaController {

    @Autowired
    private TarefaService tarefaService;

    @GetMapping
    public List<Tarefa> listar() {
        return tarefaService.ListarTodos();
    }

    @PostMapping
    public Tarefa criarTarefa (@RequestBody Tarefa tarefa) {
        return tarefaService.Salvar(tarefa);
    }

    @PutMapping ("/{id}")
    public Tarefa atualizarTarefa (@PathVariable Integer id, @RequestBody Tarefa tarefa) {
        return tarefaService.Alterar(id, tarefa);
    }

    @PutMapping ("/{id}/move")
    public Tarefa moveTarefa (@PathVariable Integer id) {
        return tarefaService.MoverTarefa(id);
    }

    @DeleteMapping ("/{id}")
    public void removerTarefa (@PathVariable Integer id) {
        tarefaService.Excluir(id);
    }

    @GetMapping ("/listarAtrasadas")
    public List<Tarefa> listarAtrasadas () {
        return tarefaService.ListarAtrasados();
    }

    @GetMapping ("/listarPrioridade")
    public List<Tarefa> listarPrioridade () {
        return tarefaService.ListarporPrioridade();
    }
}
