package com.example.crud.domain.pessoa;

import java.sql.Date;

public class PessoaEntity {
    private Long idPessoa;
    protected String nomeCompleto;
    private Date dataNascimento;
    private Integer matricula;
 
    public PessoaEntity(String nome, Date data, Integer matricula) {
        this.nomeCompleto = nome;
        this.dataNascimento = data;
        this.matricula = matricula;
    }

    public void exibirDados() {
        System.out.println("ID: " + idPessoa);
        System.out.println("Nome: " + nomeCompleto);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Matrícula: " + matricula);
    }

    public void cadastrarDados(String nome, Date dataNascimento, Integer matricula) {
        this.nomeCompleto = nome;
        this.dataNascimento = dataNascimento;
        this.matricula = matricula;
    }

    public void editarDados(String nome, Date dataNascimento, Integer matricula) {
        this.nomeCompleto = nome;
        this.dataNascimento = dataNascimento;
        this.matricula = matricula;
    }
    
}
