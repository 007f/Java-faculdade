package com.kamban.kamban.controller.dto;

import com.kamban.kamban.model.Prioridade;

import java.time.LocalDate;

public record CreateTarefaDto(
        String titulo,
        String descricao,
        LocalDate dataFinal,
        Prioridade prioridade,
        String userId
) {
}
