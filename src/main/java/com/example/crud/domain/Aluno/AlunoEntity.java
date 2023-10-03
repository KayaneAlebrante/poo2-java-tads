package com.example.crud.domain.Aluno;

import java.sql.Date;

import com.example.crud.domain.pessoa.PessoaEntity;

public class AlunoEntity extends PessoaEntity{
    private String email;
    private Integer turma;

    public AlunoEntity(String nome, Date data, Integer matricula, String email, Integer turma) {
        super(nome, data, matricula);
        this.email = email;
        this.turma = turma;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getTurma() {
        return turma;
    }

    public void setTurma(Integer turma) {
        this.turma = turma;
    }
}
