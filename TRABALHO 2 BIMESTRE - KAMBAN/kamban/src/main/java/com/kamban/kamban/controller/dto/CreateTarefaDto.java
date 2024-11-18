package com.kamban.kamban.controller.dto;

import java.time.LocalDate;

public record CreateTarefaDto(
        String titulo,
        String descricao,
        LocalDate dataLimite,
        String userId
) {
}
