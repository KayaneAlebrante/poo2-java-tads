package com.example.crud.domain.Professor;

import java.sql.Date;

import jakarta.validation.constraints.NotBlank;

public record RequestProfessor(
    @NotBlank
    String nomeCompleto,

    @NotBlank
    Date dataNascimento,

    @NotBlank
    Integer matrícula,

    @NotBlank
    String emailInstritucional,

    @NotBlank
    String formacao
){}
