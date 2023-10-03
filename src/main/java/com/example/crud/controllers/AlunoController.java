package com.example.crud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.crud.domain.Aluno.AlunoEntity;
import com.example.crud.domain.Aluno.RequestAluno;

import jakarta.persistence.EntityNotFoundException;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/aluno")
public class AlunoController {
    @Autowired
    private AlunoRepository repository;
    
    @GetMapping
    public ResponseEntity getAllAlunos(){
        var AllAlunos = repository.findAllByActiveTrue();
        return ResponseEntity.ok(AllAlunos);
    }    

    @PostMapping
    public ResponseEntity registerAluno(@RequestBody @Valid RequestAluno data){
        AlunoEntity newAluno = new AlunoEntity(data);
        repository.save(newAluno);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    @Transactional
    public ResponseEntity updateAluno(@RequestBody @Valid ResquestAluno data){
        Optional<AlunoEntity> optionalAluno = repository.findById(data.idPessoa());
        
        if(optionalAluno.isPresent()){
            AlunoEntity aluno = optionalAluno.get();
            aluno.setNome(null);
            aluno.setMatricula(null);
            aluno.setData(null);
            aluno.setData(null);
            aluno.setTurma(null);
            return ResponseEntity.ok(aluno);
        }else{
            throw new EntityNotFoundException();
        }
    }    
}
