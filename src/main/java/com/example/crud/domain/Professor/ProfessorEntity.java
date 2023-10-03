package com.example.crud.domain.Professor;

import java.sql.Date;

import com.example.crud.domain.pessoa.PessoaEntity;

public class ProfessorEntity extends PessoaEntity{
    private String formacao;
    private String  emailInstitucional;

    public  ProfessorEntity(String nome, Date data, Integer matricula, String formacao, String email) {
        super(nome, data, matricula);
        this.formacao = formacao;
        this.emailInstitucional = email;
    }    
}
