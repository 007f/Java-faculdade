package com.kamban.kamban.controller;

import com.kamban.kamban.model.Role;
import com.kamban.kamban.model.Tarefa;
import com.kamban.kamban.repository.TarefaRepository;
import com.kamban.kamban.repository.UsuarioRepository;
import com.kamban.kamban.service.TarefaService;
import com.kamban.kamban.controller.dto.CreateTarefaDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/kambam")
public class TarefaController {
    private final TarefaRepository tarefaRepository;
    private final UsuarioRepository userRepository;

    public TarefaController(TarefaRepository tarefaRepository, UsuarioRepository userRepository) {
        this.tarefaRepository = tarefaRepository;
        this.userRepository = userRepository;
    }

    @Autowired
    private TarefaService tarefaService;

    @GetMapping
    public List<Tarefa> listar() {
        return tarefaService.ListarTodos();
    }

    @PostMapping
    public ResponseEntity<Void> criarTarefa(@RequestBody CreateTarefaDto dto,
                                            JwtAuthenticationToken token){
        UUID userId = UUID.fromString(token.getName());
        var user = userRepository.findById(userId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Usuário não encontrado"));
        var tarefa = new Tarefa();
        tarefa.setTitulo(dto.titulo());
        tarefa.setDescricao(dto.descricao());
        tarefa.setDataFinal(dto.dataLimite());
        tarefa.setUser(user);
        tarefaService.Salvar(tarefa);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    /*@PostMapping
    public Tarefa criarTarefa (@RequestBody Tarefa tarefa) {
        return tarefaService.Salvar(tarefa);
    }*/

    @PutMapping ("/{id}")
    public Tarefa atualizarTarefa (@PathVariable Integer id, @RequestBody Tarefa tarefa) {
        return tarefaService.Alterar(id, tarefa);
    }

    @PutMapping ("/{id}/move")
    public Tarefa moveTarefa (@PathVariable Integer id) {
        return tarefaService.MoverTarefa(id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTarefa(@PathVariable("id") Integer tarefaId,
                                             JwtAuthenticationToken token){
        var user = userRepository.findById(UUID.fromString(token.getName()))
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND,"Usuário não encontrado"));

        var tarefa = tarefaRepository.findById(tarefaId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,"Tarefa não encontrada"));
        var isAdmin = user.getRoles().stream()
                .anyMatch(role -> role.getName().equalsIgnoreCase(Role.Values.ADMIN.name()));

        if(isAdmin || tarefa.getUser().getUserId().equals(user.getUserId())) {
            tarefaService.Excluir(tarefaId);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
        }
    }

    /*@DeleteMapping ("/{id}")
    public void removerTarefa (@PathVariable Integer id) {
        tarefaService.Excluir(id);
    }*/

    @GetMapping ("/listarAtrasadas")
    public List<Tarefa> listarAtrasadas () {
        return tarefaService.ListarAtrasados();
    }

    @GetMapping ("/listarPrioridade")
    public List<Tarefa> listarPrioridade () {
        return tarefaService.ListarporPrioridade();
    }
}
