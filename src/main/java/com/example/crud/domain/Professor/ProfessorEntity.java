package com.example.crud.domain.Professor;

import java.sql.Date;

import com.example.crud.domain.pessoa.PessoaEntity;

public class ProfessorEntity extends PessoaEntity{
    private String formacao;
    private String emailInstitucional;

    public  ProfessorEntity(String nome, Date data, Integer matricula, String formacao, String email) {
        super(nome, data, matricula);
        this.formacao = formacao;
        this.emailInstitucional = email;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Formação: " + formacao);
        System.out.println("Email Institucional: " + emailInstitucional);
    }

    @Override
    public void cadastrarDados(String nome, Date dataNascimento, Integer matricula) {
        super.cadastrarDados(nome, dataNascimento, matricula);
    }

    @Override
    public void editarDados(String nome, Date dataNascimento, Integer matricula) {
        super.editarDados(nome, dataNascimento, matricula);
    }
    
}
