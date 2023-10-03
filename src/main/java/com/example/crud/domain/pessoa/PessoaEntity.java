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

    public Long getId() {
        return idPessoa;
    }

    public void setId(Long idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNome() {
        return nomeCompleto;
    }

    public void setNome(String nome) {
        this.nomeCompleto = nome;
    }

    public Date getData() {
        return dataNascimento;
    }

    public void setData(Date data) {
        this.dataNascimento = data;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }   
}
