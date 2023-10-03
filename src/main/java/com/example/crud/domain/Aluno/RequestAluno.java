package com.example.crud.domain.Aluno;

import java.sql.Date;
import jakarta.validation.constraints.NotBlank;

public record RequestAluno(
    @NotBlank
    String nomeCompleto,

    @NotBlank
    Date dataNascimento,

    @NotBlank
    Integer matrícula,

    @NotBlank
    String email,

    @NotBlank
    Integer turma
){}
