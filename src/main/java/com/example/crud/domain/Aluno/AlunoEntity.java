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

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Email: " + email);
        System.out.println("Turma: " + turma);
    }

    @Override
    public void cadastrarDados(String nome, Date dataNascimento, Integer matricula) {
        super.cadastrarDados(nome, dataNascimento, matricula);
        this.email = "";
        this.turma = 0; 
    }

    @Override
    public void editarDados(String nome, Date dataNascimento, Integer matricula) {
        super.editarDados(nome, dataNascimento, matricula);
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
